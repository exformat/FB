

class GetProperty {

    public void setProperty(){

        Property property = new Property();

        property.setOs(getOSName());
        property.setVersion(getOSVersion());
        property.setArchitecture(getOSArch());
        property.setUserName(getOSUserName());
        property.setUserHome(getOSUserHome());
        property.setUserDir(getOSUserDir());
    }


    private boolean isWindows(){

        String os = System.getProperty("os.name").toLowerCase();
        //windows
        return (os.contains( "win" ));

    }

    private boolean isMac(){

        String os = System.getProperty("os.name").toLowerCase();
        //Mac
        return (os.contains("mac"));

    }

    private boolean isUnix (){

        String os = System.getProperty("os.name").toLowerCase();
        //linux or unix
        return (os.contains("nix") || os.contains("nux"));

    }


    private String getOSName(){

        String os;

        if(isWindows()){
            os = "windows";
        }
        else
        if(isMac()){
            os = "macintosh";
        }
        else
        if(isUnix ()){
            os = "unix";
        }
        else{
            os = "unknown";
        }

        return os;
    }

    private String getOSVersion() {
        String os = System.getProperty("os.version");
        return os;
    }

    private String getOSArch(){

        String os = System.getProperty("os.arch");

        return os;
    }

    private String getOSUserName(){

        String os = System.getProperty("user.name");
        return os;
    }

    private String getOSUserHome(){

        String os = System.getProperty("user.home");

        return os;
    }

    private String getOSUserDir(){

        String os = System.getProperty("user.dir");

        return os;
    }
}
