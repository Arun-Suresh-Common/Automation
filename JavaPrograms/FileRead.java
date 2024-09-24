
import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File file = new File("filename.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String st;
            while ((st = br.readLine()) != null) {
                System.out.println(st);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
