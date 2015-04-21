package playground;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBCheck {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		try{
			ConnectionManager conManager = new ConnectionManager();
			System.out.println("Connecting...");
			con =  conManager.getConnection();
			System.out.println("Connected!");
			PreparedStatement ps = con.prepareStatement("select tab.TABLE_NAME, SUBSTR(tab.COLUMN_NAME,locate('_',tab.COLUMN_NAME)+1),count(1) from ( "
					+ "SELECT TABLE_NAME, COLUMN_NAME, ORDINAL_POSITION FROM QSYS2.COLUMNS WHERE TABLE_SCHEMA = 'M400DEVF' "
					+ " ) tab group by tab.TABLE_NAME, SUBSTR(tab.COLUMN_NAME,locate('_',tab.COLUMN_NAME)+1) having count(1) > 1");
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				System.out.println(rs.getString(1) + "  -  " + rs.getString(2));
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			con.close();
		}
		
		
	}

}
