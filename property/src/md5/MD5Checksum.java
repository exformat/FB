package md5;

import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

public class MD5Checksum {

    public static byte[] createChecksum(String filename) throws Exception {

        InputStream fis =  new FileInputStream(filename);

        byte[] buffer = new byte[1024];
        MessageDigest complete = MessageDigest.getInstance("MD5");
        int numRead;

        do {
            numRead = fis.read(buffer);
            if (numRead > 0) {
                complete.update(buffer, 0, numRead);
            }
        } while (numRead != -1);

        fis.close();
        return complete.digest();
    }

    // see this How-to for a faster way to convert
    // a byte array to a HEX string
    public static String getMD5Checksum(String filename) throws Exception {

        byte[] b = createChecksum(filename);

        StringBuilder result = new StringBuilder();

        for (byte aB : b) {
            result.append(Integer.toString((aB & 0xff) + 0x100, 16).substring(1));
        }

        return result.toString();
    }

    public static void main(String args[]) {

        String filePach;

        try {


        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Boolean md5checksum(String filePach, String getMD5checksum){


    }
}
