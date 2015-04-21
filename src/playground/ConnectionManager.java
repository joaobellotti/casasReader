package playground;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionManager {

	
	static DataSource ds = null;
	private String m_databaseURL = "jdbc:as400://ZEUS";
	
	
	
	public Connection getConnection() {

		
		String a_userId = "MPUBJB";
		String a_passWord="counterp";
		
		
		
        // This method is useful for creating a new Connection

        Connection con=null;

        try
        {
            ApplicationProps l_appProps = ApplicationProps.getInstance();

            //If connection pooling is enabled then the below code will get executed

            if(l_appProps.CONNECTIONPOOLING.trim().equals("Y"))
            {
                try
                {
                    if(ds == null)
                    {
                        Hashtable l_env = new Hashtable();

                        l_env.put(Context.INITIAL_CONTEXT_FACTORY, l_appProps.CONTEXTFACTORY);

                        Context ctx = new InitialContext(l_env);

                        ds = (javax.sql.DataSource) ctx.lookup("java:comp/env/"+l_appProps.DATASOURCE);

                        ctx.close();
                    }

                    con = ds.getConnection();

                    con.setAutoCommit(true);
                    con.setTransactionIsolation(0);
                    //con.setHoldability(2);
                }
                catch(SQLException sqle)
                {
                    System.out.println("sqle:"+sqle.toString());
                }
                catch(NamingException ne)
                {
                    System.out.println(ne.toString());
                }
                catch(Exception e)
                {
                    System.out.println("Exception:"+e.toString());
                }
            }
            else
            {
                //If connection pooling is not enabled then the below code will get executed

                Class.forName("com.ibm.as400.access.AS400JDBCDriver");

                try
                {
                    com.ibm.as400.access.Trace.setTraceOn(false);
                    com.ibm.as400.access.Trace.setTraceErrorOn(false);
                    com.ibm.as400.access.Trace.setTraceInformationOn(false);
                    com.ibm.as400.access.Trace.setTraceDatastreamOn(false);
                    com.ibm.as400.access.Trace.setTraceDiagnosticOn(false);
                    com.ibm.as400.access.Trace.setTraceWarningOn(false);

                    java.util.Properties props = new java.util.Properties();

                    props.put("user",a_userId);

                    props.put("password",a_passWord);

                   // props.put("defaultRowPrefetch",new Integer(m_noOfRows).toString());

                    props.put("defaultBatchValue","5");

                    con=DriverManager.getConnection(m_databaseURL , props);
                }
                catch(Exception e)
                {
                    con=DriverManager.getConnection(m_databaseURL+";translate binary=true", a_userId, a_passWord);
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception is in Connection Manager:"+e.toString());

            try
            {
                con=DriverManager.getConnection(m_databaseURL, a_userId, a_passWord);
            }
            catch(SQLException sqle)
            {
                System.out.println("SQLException in connection manager:"+sqle.toString());
            }

            System.out.println("Exception in connection manager:"+e.toString());
        }

        return con;
    }
	
	
	
	
	
	
}
