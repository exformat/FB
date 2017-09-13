package md5;

/**
 * Created by Exformat on 13.09.17.
 */
public class Main {

    public static void main(String[] args) {

        String filePatch = "";
        String oldMD5 = "05bab4f70220f875981663d9b8688529";

        MD5Checksum md5Checksum = new MD5Checksum();


        //метод md5checksum() принимает в качестве аргументов путь к файлу и старую версию хеш суммы
        //если хеш суммы сошлись возвращает true
        //если хеш суммы не сошлись возвращает false
        boolean md5 = md5Checksum.md5checksum(filePatch,oldMD5);

        if (md5){

            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
    }
}
