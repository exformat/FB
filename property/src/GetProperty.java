

class GetProperty {


    //считываем данные из системных файлов и отправляем в класс Property.
    public void setProperty(){

        Property property = new Property();

        property.setOs(getOSName());
        property.setVersion(getOSVersion());
        property.setArchitecture(getOSArch());
        property.setUserName(getOSUserName());
        property.setUserHome(getOSUserHome());
        property.setUserDir(getOSUserDir());
    }


    //вытаскиваем значения по одельности.
    //потому что, я не знаю, так захотел.
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
        return System.getProperty("os.version");
    }

    private String getOSArch(){

        return System.getProperty("os.arch");
    }

    private String getOSUserName(){

        return System.getProperty("user.name");
    }

    private String getOSUserHome(){

        return System.getProperty("user.home");
    }

    private String getOSUserDir(){

        return System.getProperty("user.dir");
    }
}
