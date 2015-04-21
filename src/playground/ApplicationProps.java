
package playground;

public class ApplicationProps {

 // The instance of our singleton object
    private static ApplicationProps appPropsInstance;

    public String  m_propFileLocation       = "";

    public String  SYSTEMNAME               = new String("");
    public String  LOCATION                 = new String("");
    public String  DRIVERNAME               = new String("");
    public String  URL                      = new String("");
    public String  EMASPROGLIB              = new String("");
    public String  EMASDATALIB              = new String("");
    public String  MAESTROPROGLIB           = new String("");
    public String  MAESTRODATALIB           = new String("");
    public String  DEFAULTSYSTEM            = new String("");
    public String  DEFAULTSYSTEMNAME        = "";
    public String  DATEFORMAT               = new String("");
    public String  SQLDATEFORMAT            = new String("");
    public String  DATESEPARATOR            = new String("");
    public String  DATASOURCE               = new String("");
    public String  CONTEXTFACTORY           = new String("");
    public String  STYLESHEET               = new String("");
    public String  IMAGEPATH                = new String("");
    public String  PATH                     = new String("");
    public String  SYSTEMTYPE               = new String("");
    public String  IMAGEPATH_PRINT          = new String("");
    public String  STYLESHEET_PRINT         = new String("");
    public String  INSTALLATION             = new String("");
    public String  ENGLISHUSAGE             = new String("");
    public String  UPLOADDIRECTORY          = new String("");
    public String  SMTPPORT                 = new String("");

    public String  DEBUGMODE                = new String("");

    public int     RowNum                   = 0;
    public String  DBUSER                   = new String("");
    public String  DBPASSWORD               = new String("");
    public String  APPUSER                  = new String("");
    public String  LICENSEKEY               = new String("");
    public String  INTERFACELIBRARY         = new String("");
    public boolean ENCODED                  = false;
    public String  APPLICATIONURL           = new String("");
    public int     AUDITINTERVAL            = 0;
    public String  OPTIONSFILE              = new String("");
    public String  UPLOADVIEWPATH           = new String("");
    public String  PROFORMASERVERPATH       = new String("");
    public String  SONYIND                  = new String("");

    public String  SMTPHOST                 = new String("");
    public String  MAILUSER                 = new String("");
    public String  MAILPASSWORD             = new String("");
    public String  MAILTEMPLATEDIRECTORY    = new String("");
    public String  ATTACHMENTTEMPLATE       = new String("");
    public String  IDWATTACHMENTDIRECTORY   = new String("");

    public String  ATTACHMENTLINK           = new String("");

    public String  EXPORTLIBRARY            = new String("");
    public String  SMTPSERVER               = new String("");

    public String  DATABASEINSTALLATION     = new String("");
    public String  ALLOBJAUTHORITY          = new String("");
    public String  JOBQUEUE                 = new String("");
    public String  ROOTDIRECTORY            = new String("");
    public String  ROOTVIEWPATH             = new String("");
    public String  ROOT400PATH              = new String("");
    public String  ATTACHMENTDIRECTORY      = new String("");
    public String  ATTACHMENTVIEWPATH       = new String("");

    public String  ATTACHMENTLOCATION       = new String("");
    public String  ATTACHMENT400PATH        = new String("");

    public String  MRWPATH                  = new String("");

    public String  ESDEMAILFROM             = new String("");
    public String  ESDEMAILBCC              = new String("");
    public String  ESDFTPADDR               = new String("");
    public String  ESDFTPDIR                = new String("");
    public String  ESDFTPUSERID             = new String("");
    public String  ESDFTPPWORD              = new String("");

    public String  CONNECTIONPOOLING        = new String("");
    public String  LOGFILEPATH              = new String("");
    public String  REPORTSERVER             = new String("");
    public String  DATAWAREHOUSELIBRARY     = new String("");

    // Record Master
    public String  MDH_DBDRIVER             = new String("");
    public String  MDH_DBURL                = new String("");
    public String  MDH_DBUSER               = new String("");
    public String  MDH_DBPASSWORD           = new String("");

    // (same as SameAsRootViewPath)

    public String  INCOMEANALYSISVIEWPATH   = new String("");

    // (Same as RootDirectory)

    public String  INCOMEANALYSISDIRECTORY  = new String("");

    // (Same as Root400Path)

    public String  INCOMEANALYSIS400PATH    = new String("");

    // Same as PROFORMASERVERPATH

    public String  INCOMEANALYSISSERVERPATH = new String("");

    // Batch report and collation batch settings
    public String  BATCHREPORTSPERREQUEST   = new String("");
    public String  CLIENTSPERCOLLATIONBATCH = new String("");
    public String  PAGESUNTILCOLLATIONSPLIT = new String("");

    public String  SUPPORT_EMAIL            = "";
    public String  ADDITIONAL_LIBS          = "";


    /**
     * Private constructor, singleton classes may not be instantiated.
     */
    private ApplicationProps() {
    }

    public SystemProps getuserProps(ApplicationProps a_appProps)
    {
        SystemProps l_sysprops = new SystemProps();

        l_sysprops.CONTEXTFACTORY   = a_appProps.CONTEXTFACTORY;
        l_sysprops.DATASOURCE       = a_appProps.DATASOURCE;
        l_sysprops.DATEFORMAT       = a_appProps.DATEFORMAT;
        l_sysprops.DATESEPARATOR    = a_appProps.DATESEPARATOR;
        l_sysprops.DEFAULTSYSTEM    = a_appProps.DEFAULTSYSTEM;
        l_sysprops.DEFAULTSYSTEMNAME= a_appProps.DEFAULTSYSTEMNAME;
        l_sysprops.DRIVERNAME       = a_appProps.DRIVERNAME;
        l_sysprops.EMASDATALIB      = a_appProps.EMASDATALIB;
        l_sysprops.EMASPROGLIB      = a_appProps.EMASPROGLIB;
        l_sysprops.ENGLISHUSAGE     = a_appProps.ENGLISHUSAGE;
        l_sysprops.IMAGEPATH        = a_appProps.IMAGEPATH;
        l_sysprops.IMAGEPATH_PRINT  = a_appProps.IMAGEPATH_PRINT;
        l_sysprops.INSTALLATION     = a_appProps.INSTALLATION;
        l_sysprops.LOCATION         = a_appProps.LOCATION;
        l_sysprops.MAESTRODATALIB   = a_appProps.MAESTRODATALIB;
        l_sysprops.MAESTROPROGLIB   = a_appProps.MAESTROPROGLIB;
        l_sysprops.PATH             = a_appProps.PATH;
        l_sysprops.STYLESHEET       = a_appProps.STYLESHEET;
        l_sysprops.STYLESHEET_PRINT = a_appProps.STYLESHEET_PRINT;
        l_sysprops.SYSTEMNAME       = a_appProps.SYSTEMNAME;
        l_sysprops.SYSTEMTYPE       = a_appProps.SYSTEMTYPE;
        l_sysprops.DEBUGMODE        = a_appProps.DEBUGMODE;
        l_sysprops.URL              = a_appProps.URL;
        l_sysprops.DBUSER           = a_appProps.DBUSER;
        l_sysprops.DBPASSWORD       = a_appProps.DBPASSWORD;
        l_sysprops.AUDITINTERVAL    = a_appProps.AUDITINTERVAL * 60;
        l_sysprops.SQLDATEFORMAT    = a_appProps.SQLDATEFORMAT;

        //Record Master
        l_sysprops.setMDHDBDRIVER(a_appProps.getMDHDBDRIVER());
        l_sysprops.setMDHDBURL(a_appProps.getMDHDBURL());
        l_sysprops.setMDHDBUSER(a_appProps.getMDHDBUSER());
        l_sysprops.setMDHDBPASSWORD(a_appProps.getMDHDBPASSWORD());

        return l_sysprops;
    }

    /* Method is synchronized to be thread safe. */
    public static synchronized ApplicationProps getInstance()
    {
        if (appPropsInstance == null)
            appPropsInstance = new ApplicationProps();
        return appPropsInstance;
    }

    /* Overriding clone() prevents more than one instance of this object existing. */
    public Object clone()
    throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    /**
    * @return
    */
    public String getAPPLICATIONURL() {
        return APPLICATIONURL;
    }

    /**
    * @return
    */
    public String getAPPUSER() {
        return APPUSER;
    }

    /**
    * @return
    */
    public String getIDWATTACHMENTDIRECTORY() {
        return IDWATTACHMENTDIRECTORY;
    }

    /**
    * @return
    */
    public String getATTACHMENTLINK() {
        return ATTACHMENTLINK;
    }

    /**
    * @return
    */
    public String getATTACHMENTTEMPLATE() {
        return ATTACHMENTTEMPLATE;
    }

    /**
    * @return
    */
    public int getAUDITINTERVAL() {
        return AUDITINTERVAL;
    }

    /**
    * @return
    */
    public String getCONTEXTFACTORY() {
        return CONTEXTFACTORY;
    }

    /**
    * @return
    */
    public String getDATASOURCE() {
        return DATASOURCE;
    }

    /**
    * @return
    */
    public String getDATEFORMAT() {
        return DATEFORMAT;
    }

    /**
    * @return
    */
    public String getDATESEPARATOR() {
        return DATESEPARATOR;
    }

    /**
    * @return
    */
    public String getDBPASSWORD() {
        return DBPASSWORD;
    }

    /**
    * @return
    */
    public String getDBUSER() {
        return DBUSER;
    }

    /**
    * @return
    */
    public String getDEFAULTSYSTEM() {
        return DEFAULTSYSTEM;
    }


    public String getDEFAULTSYSTEMNAME() {
        return DEFAULTSYSTEMNAME;
    }

    public String getDATAWAREHOUSELIBRARY()
    {
        return DATAWAREHOUSELIBRARY;
    }

    /**
    * @return
    */
    public String getDRIVERNAME() {
        return DRIVERNAME;
    }

    /**
    * @return
    */
    public String getEMASDATALIB() {
        return EMASDATALIB;
    }

    /**
    * @return
    */
    public String getEMASPROGLIB() {
        return EMASPROGLIB;
    }

    /**
    * @return
    */
    public boolean isENCODED() {
        return ENCODED;
    }

    /**
    * @return
    */
    public String getENGLISHUSAGE() {
        return ENGLISHUSAGE;
    }

    /**
    * @return
    */
    public String getEXPORTLIBRARY() {
        return EXPORTLIBRARY;
    }

    /**
    * @return
    */
    public String getIMAGEPATH() {
        return IMAGEPATH;
    }

    /**
    * @return
    */
    public String getIMAGEPATH_PRINT() {
        return IMAGEPATH_PRINT;
    }

    /**
    * @return
    */
    public String getINSTALLATION() {
        return INSTALLATION;
    }


    /**
    * @return
    */
    public String getINTERFACELIBRARY() {
        return INTERFACELIBRARY;
    }

    /**
    * @return
    */
    public String getLICENSEKEY() {
        return LICENSEKEY;
    }

    /**
    * @return
    */
    public String getLOCATION() {
        return LOCATION;
    }

    /**
    * @return
    */
    public String getMAESTRODATALIB() {
        return MAESTRODATALIB;
    }

    /**
    * @return
    */
    public String getMAESTROPROGLIB() {
        return MAESTROPROGLIB;
    }

    /**
    * @return
    */
    public String getMAILPASSWORD() {
        return MAILPASSWORD;
    }

    /**
    * @return
    */
    public String getMAILTEMPLATEDIRECTORY() {
        return MAILTEMPLATEDIRECTORY;
    }

    /**
    * @return
    */
    public String getMAILUSER() {
        return MAILUSER;
    }

    /**
    * @return
    */
    public String getOPTIONSFILE() {
        return OPTIONSFILE;
    }

    /**
    * @return
    */
    public String getPATH() {
        return PATH;
    }

    /**
    * @return
    */
    public String getUPLOADVIEWPATH() {
        return UPLOADVIEWPATH;
    }

    /**
    * @return
    */
    public String getPROFORMASERVERPATH() {
        return PROFORMASERVERPATH;
    }

    /**
    * @return
    */
    public int getRowNum() {
        return RowNum;
    }

    /**
    * @return
    */
    public String getSMTPHOST() {
        return SMTPHOST;
    }

    /**
    * @return
    */
    public String getSMTPSERVER() {
        return SMTPSERVER;
    }

    /**
    * @return
    */
    public String getSONYIND() {
        return SONYIND;
    }

    /**
    * @return
    */
    public String getSQLDATEFORMAT() {
        return SQLDATEFORMAT;
    }

    /**
    * @return
    */
    public String getSTYLESHEET() {
        return STYLESHEET;
    }

    /**
    * @return
    */
    public String getSTYLESHEET_PRINT() {
        return STYLESHEET_PRINT;
    }

    /**
    * @return
    */
    public String getSYSTEMNAME() {
        return SYSTEMNAME;
    }

    /**
    * @return
    */
    public String getSYSTEMTYPE() {
        return SYSTEMTYPE;
    }
    public String getDEBUGMODE() {
        return DEBUGMODE;
    }

    /**
    * @return
    */
    public String getUPLOADDIRECTORY() {
        return UPLOADDIRECTORY;
    }

    /**
    * @return
    */
    public String getURL() {
        return URL;
    }

    /**
    * @return
    */
    public String getCONNECTIONPOOLING() {
        return CONNECTIONPOOLING;
    }

    /**
    * @param string
    */

    public void setDATAWAREHOUSELIBRARY(String string) {
        DATAWAREHOUSELIBRARY = string;
    }

    public void setAPPLICATIONURL(String string) {
        APPLICATIONURL = string;
    }

    /**
    * @param string
    */
    public void setAPPUSER(String string) {
        APPUSER = string;
    }

    /**
    * @param string
    */
    public void setIDWATTACHMENTDIRECTORY(String string) {
        IDWATTACHMENTDIRECTORY = string;
    }

    /**
    * @param string
    */
    public void setATTACHMENTLINK(String string) {
        ATTACHMENTLINK = string;
    }

    /**
    * @param string
    */
    public void setATTACHMENTLOCATION(String string) {
        ATTACHMENTLOCATION = string;
    }

    public String getATTACHMENTLOCATION()
    {
        return ATTACHMENTLOCATION;
    }

    /**
    * @param string
    */
    public void setATTACHMENT400PATH(String string) {
        ATTACHMENT400PATH = string;
    }

    public String getATTACHMENT400PATH()
    {
        return ATTACHMENT400PATH;
    }

    /**
    * @param string
    */
    public void setATTACHMENTTEMPLATE(String string) {
        ATTACHMENTTEMPLATE = string;
    }

    /**
    * @param i
    */
    public void setAUDITINTERVAL(int i) {
        AUDITINTERVAL = i;
    }

    /**
    * @param string
    */
    public void setCONTEXTFACTORY(String string) {
        CONTEXTFACTORY = string;
    }

    /**
    * @param string
    */
    public void setDATASOURCE(String string) {
        DATASOURCE = string;
    }

    /**
    * @param string
    */
    public void setDATEFORMAT(String string) {
        DATEFORMAT = string;
    }

    /**
    * @param string
    */
    public void setDATESEPARATOR(String string) {
        DATESEPARATOR = string;
    }

    /**
    * @param string
    */
    public void setDBPASSWORD(String string) {
        DBPASSWORD = string;
    }

    /**
    * @param string
    */
    public void setDBUSER(String string) {
        DBUSER = string;
    }

    /**
    * @param string
    */
    public void setDEFAULTSYSTEM(String string) {
        DEFAULTSYSTEM = string;
    }


    public void setDEFAULTSYSTEMNAME(String a_defaultSystemBame) {
        DEFAULTSYSTEMNAME = a_defaultSystemBame;
    }

    /**
    * @param string
    */
    public void setDRIVERNAME(String string) {
        DRIVERNAME = string;
    }

    /**
    * @param string
    */
    public void setEMASDATALIB(String string) {
        EMASDATALIB = string;
    }

    /**
    * @param string
    */
    public void setEMASPROGLIB(String string) {
        EMASPROGLIB = string;
    }

    /**
    * @param b
    */
    public void setENCODED(boolean b) {
        ENCODED = b;
    }

    /**
    * @param string
    */
    public void setENGLISHUSAGE(String string) {
        ENGLISHUSAGE = string;
    }

    /**
    * @param string
    */
    public void setEXPORTLIBRARY(String string) {
        EXPORTLIBRARY = string;
    }

    /**
    * @param string
    */
    public void setIMAGEPATH(String string) {
        IMAGEPATH = string;
    }

    /**
    * @param string
    */
    public void setIMAGEPATH_PRINT(String string) {
        IMAGEPATH_PRINT = string;
    }

    /**
    * @param string
    */
    public void setINSTALLATION(String string) {
        INSTALLATION = string;
    }


    /**
    * @param string
    */
    public void setINTERFACELIBRARY(String string) {
        INTERFACELIBRARY = string;
    }

    /**
    * @param string
    */
    public void setLICENSEKEY(String string) {
        LICENSEKEY = string;
    }

    /**
    * @param string
    */
    public void setLOCATION(String string) {
        LOCATION = string;
    }

    /**
    * @param string
    */
    public void setMAESTRODATALIB(String string) {
        MAESTRODATALIB = string;
    }

    /**
    * @param string
    */
    public void setMAESTROPROGLIB(String string) {
        MAESTROPROGLIB = string;
    }

    /**
    * @param string
    */
    public void setMAILPASSWORD(String string) {
        MAILPASSWORD = string;
    }

    /**
    * @param string
    */
    public void setMAILTEMPLATEDIRECTORY(String string) {
        MAILTEMPLATEDIRECTORY = string;
    }

    /**
    * @param string
    */
    public void setMAILUSER(String string) {
        MAILUSER = string;
    }

    /**
    * @param string
    */
    public void setOPTIONSFILE(String string) {
        OPTIONSFILE = string;
    }

    /**
    * @param string
    */
    public void setPATH(String string) {
        PATH = string;
    }

    /**
    * @param string
    */
    public void setUPLOADVIEWPATH(String string) {
        UPLOADVIEWPATH = string;
    }

    /**
    * @param string
    */
    public void setPROFORMASERVERPATH(String string) {
        PROFORMASERVERPATH = string;
    }

    /**
    * @param i
    */
    public void setRowNum(int i) {
        RowNum = i;
    }

    /**
    * @param string
    */
    public void setSMTPHOST(String string) {
        SMTPHOST = string;
    }

    /**
    * @param string
    */
    public void setSMTPSERVER(String string) {
        SMTPSERVER = string;
    }

    /**
    * @param string
    */
    public void setSONYIND(String string) {
        SONYIND = string;
    }

    /**
    * @param string
    */
    public void setSQLDATEFORMAT(String string) {
        SQLDATEFORMAT = string;
    }

    /**
    * @param string
    */
    public void setSTYLESHEET(String string) {
        STYLESHEET = string;
    }

    /**
    * @param string
    */
    public void setSTYLESHEET_PRINT(String string) {
        STYLESHEET_PRINT = string;
    }

    /**
    * @param string
    */
    public void setSYSTEMNAME(String string) {
        SYSTEMNAME = string;
    }

    /**
    * @param string
    */
    public void setSYSTEMTYPE(String string) {
        SYSTEMTYPE = string;
    }
    public void setDEBUGMODE(String string) {
        DEBUGMODE = string;
    }

    /**
    * @param string
    */
    public void setUPLOADDIRECTORY(String string) {
        UPLOADDIRECTORY = string;
    }

    /**
    * @param string
    */
    public void setURL(String string) {
        URL = string;
    }

    public String getPropFileLocation()
    {
        return m_propFileLocation;
    }

    public void setPropFileLocation(String string)
    {
        m_propFileLocation = string;
    }
    public String getATTACHMENTDIRECTORY()
    {
        return ATTACHMENTDIRECTORY;
    }

    public void setATTACHMENTDIRECTORY(String string)
    {
        ATTACHMENTDIRECTORY = string;
    }

    public String getATTACHMENTVIEWPATH()
    {
        return ATTACHMENTVIEWPATH;
    }

    public void setATTACHMENTVIEWPATH(String string)
    {
        ATTACHMENTVIEWPATH = string;
    }

    public String getMRWPATH()
    {
        return MRWPATH;
    }

    public void setMRWPATH(String string)
    {
        MRWPATH = string;
    }

    public String getESDEMAILFROM()
    {
        return ESDEMAILFROM;
    }

    public void setESDEMAILFROM(String string)
    {
        ESDEMAILFROM = string;
    }

    public String getESDEMAILBCC()
    {
        return ESDEMAILBCC;
    }

    public void setESDEMAILBCC(String string)
    {
        ESDEMAILBCC = string;
    }

    public String getESDFTPADDR()
    {
        return ESDFTPADDR;
    }

    public void setESDFTPADDR(String string)
    {
        ESDFTPADDR = string;
    }

    public String getESDFTPDIR()
    {
        return ESDFTPDIR;
    }

    public void setESDFTPDIR(String string)
    {
        ESDFTPDIR = string;
    }

    public String getESDFTPUSERID()
    {
        return ESDFTPUSERID;
    }

    public void setESDFTPUSERID(String string)
    {
        ESDFTPUSERID = string;
    }

    public String getESDFTPPWORD()
    {
        return ESDFTPPWORD;
    }

    public void setESDFTPPWORD(String string)
    {
        ESDFTPPWORD = string;
    }

    public String getROOTVIEWPATH()
    {
        return ROOTVIEWPATH;
    }

    public void setROOTVIEWPATH(String string)
    {
        ROOTVIEWPATH = string;
    }

    public String getROOT400PATH()
    {
        return ROOT400PATH;
    }

    public void setROOT400PATH(String string)
    {
        ROOT400PATH = string;
    }

    public void setCONNECTIONPOOLING(String string)
    {
        CONNECTIONPOOLING = string;
    }

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

    public String getBATCHREPORTSPERREQUEST()
    {
        return BATCHREPORTSPERREQUEST;
    }

    public void setBATCHREPORTSPERREQUEST(String batchreportsperrequest)
    {
        BATCHREPORTSPERREQUEST = batchreportsperrequest;
    }

    public String getCLIENTSPERCOLLATIONBATCH()
    {
        return CLIENTSPERCOLLATIONBATCH;
    }

    public void setCLIENTSPERCOLLATIONBATCH(String clientspercollationbatch)
    {
        CLIENTSPERCOLLATIONBATCH = clientspercollationbatch;
    }

    public String getPAGESUNTILCOLLATIONSPLIT()
    {
        return PAGESUNTILCOLLATIONSPLIT;
    }

    public void setPAGESUNTILCOLLATIONSPLIT(String pagesuntilcollationsplit)
    {
        PAGESUNTILCOLLATIONSPLIT = pagesuntilcollationsplit;
    }

    public String getRelativeRootPath()
    {
        if ("AS400".equalsIgnoreCase(this.getLOCATION()))
        {
            return ROOTDIRECTORY;
        }

        return ROOTVIEWPATH;
    }


    public String getSUPPORT_EMAIL()
    {

        return SUPPORT_EMAIL;
    }


    /**
     * @param a_SUPPORT_EMAIL the SUPPORT_EMAIL to set
     */
    public void setSUPPORT_EMAIL(String a_SUPPORT_EMAIL)
    {

        SUPPORT_EMAIL = a_SUPPORT_EMAIL;
    }

    public String getADDITIONAL_LIBS()
    {

        return ADDITIONAL_LIBS;
    }


    public void setADDITIONAL_LIBS(String a_value)
    {

        ADDITIONAL_LIBS = a_value;
    }

}
