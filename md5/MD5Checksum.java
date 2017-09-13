package md5;

import java.io.FileInputStream;
import java.io.InputStream;
import java.security.MessageDigest;

public class MD5Checksum {


    //метод md5checksum() принимает в качестве аргументов путь к файлу и старую версию хеш суммы
    //если хеш суммы сошлись возвращает true
    //если хеш суммы не сошлись возвращает false
    public boolean md5checksum(String filePatch, String getOldMD5checksum){

        String newMD5checksum = null;

        try {
            newMD5checksum = getMD5Checksum(filePatch);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return getOldMD5checksum.equals(newMD5checksum);
    }

    //большая часть честно спижжена из интернетов...
    //после малость переделана.

    private String getMD5Checksum(String filePatch) throws Exception {

        byte[] b = createChecksum(filePatch);

        StringBuilder result = new StringBuilder();

        for (byte aB : b) {
            result.append(Integer.toString((aB & 0xff) + 0x100, 16).substring(1));
        }

        return result.toString();
    }
    private byte[] createChecksum(String filePatch) throws Exception {

        InputStream fis =  new FileInputStream(filePatch);

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
}
