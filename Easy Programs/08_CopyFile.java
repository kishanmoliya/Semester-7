// W.A.P. that copies itself in another file called code.txt.
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile{
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("CopyFile.java");
            FileOutputStream fos = new FileOutputStream("File.txt");
            int a = fis.read();
            while(a != -1){
                fos.write(a);
                a = fis.read();
            }
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}