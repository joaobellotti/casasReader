package playground;


public class SystemProps
{
    public String SYSTEMNAME=new String("");
    public String LOCATION=new String("");
    public String DRIVERNAME=new String("");
    public String URL=new String("");
    public String EMASPROGLIB=new String("");
    public String EMASDATALIB=new String("");
    public String MAESTROPROGLIB=new String("");
    public String MAESTRODATALIB=new String("");
    public String DEFAULTSYSTEM=new String("");
    public String DEFAULTSYSTEMNAME = "";
    public String DATEFORMAT=new String("");
    public String SQLDATEFORMAT=new String("");
    public String DATESEPARATOR=new String("");
    public String DATASOURCE=new String("");
    public String CONTEXTFACTORY=new String("");
    public String STYLESHEET=new String("");
    public String IMAGEPATH=new String("");
    public String PATH= new String("");
    public String SYSTEMTYPE=new String("");
    public String DEBUGMODE=new String("");
    public String IMAGEPATH_PRINT=new String("");
    public String STYLESHEET_PRINT=new String("");
    public String INSTALLATION=new String("");
    public String ENGLISHUSAGE=new String("");

    public int AUDITINTERVAL= 0;

    public String DBUSER = new String("");
    public String DBPASSWORD = new String("");

    public int RowNum = 0;
    public String UserID = " ";
    public String UserType = " ";
    public String FirstName = " ";
    public String MiddleName = " ";
    public String LastName = " ";
    public String Department = " ";
    public String Telephone = " ";
    public String Extension = " ";
    public String eMail = " ";
    public String Group1 = " ";
    public String Group2 = " ";
    public String Group3 = " ";
    public String Group4 = " ";
    public String Administrator = " ";
    public String InitOption = " ";
    public String QuickOption = " ";
    public String UserTerr = "  ";
    public String Lang = "  ";
    public String InitialScreen = " ";
    public String MenuFlag = " ";
    public String UserLevel = " ";
    public String HoverText = " ";

    private String MDH_DBDRIVER    = " ";
    private String MDH_DBURL        = " ";
    private String MDH_DBUSER        = " ";
    private String MDH_DBPASSWORD    = " ";
    /**
    * @return the rECORDMASTER_DBDRIVER
    */
    public String getMDHDBDRIVER() {
        return MDH_DBDRIVER;
    }
    /**
    * @param rECORDMASTERDBDRIVER the rECORDMASTER_DBDRIVER to set
    */
    public void setMDHDBDRIVER(String rECORDMASTERDBDRIVER) {
        MDH_DBDRIVER = rECORDMASTERDBDRIVER;
    }
    /**
    * @return the rECORDMASTER_DBURL
    */
    public String getMDHDBURL() {
        return MDH_DBURL;
    }
    /**
    * @param rECORDMASTERDBURL the rECORDMASTER_DBURL to set
    */
    public void setMDHDBURL(String rECORDMASTERDBURL) {
        MDH_DBURL = rECORDMASTERDBURL;
    }
    /**
    * @return the rECORDMASTER_DBUSER
    */
    public String getMDHDBUSER() {
        return MDH_DBUSER;
    }
    /**
    * @param rECORDMASTERDBUSER the rECORDMASTER_DBUSER to set
    */
    public void setMDHDBUSER(String rECORDMASTERDBUSER) {
        MDH_DBUSER = rECORDMASTERDBUSER;
    }
    /**
    * @return the rECORDMASTER_DBPASSWORD
    */
    public String getMDHDBPASSWORD() {
        return MDH_DBPASSWORD;
    }
    /**
    * @param rECORDMASTERDBPASSWORD the rECORDMASTER_DBPASSWORD to set
    */
    public void setMDHDBPASSWORD(String rECORDMASTERDBPASSWORD) {
        MDH_DBPASSWORD = rECORDMASTERDBPASSWORD;
    }

    public boolean isMultiSystem()
    {
        return SYSTEMTYPE != null &&  SYSTEMTYPE.trim().equals("M");
    }

}
