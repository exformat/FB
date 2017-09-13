
public class Property {

    private static String os;
    private static String  version;
    private static String architecture;
    private static String userName;
    private static String userHome;
    private static String userDir;

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        Property.os = os;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        Property.version = version;
    }

    public String getArchitecture() {
        return architecture;
    }

    public void setArchitecture(String architecture) {
        Property.architecture = architecture;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        Property.userName = userName;
    }

    public String getUserHome() {
        return userHome;
    }

    public void setUserHome(String userHome) {
        Property.userHome = userHome;
    }

    public String getUserDir() {
        return userDir;
    }

    public void setUserDir(String userDir) {
        Property.userDir = userDir;
    }
}
