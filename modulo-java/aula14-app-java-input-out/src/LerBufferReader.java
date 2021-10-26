import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerBufferReader {
    public static void main(String[] args) {

        try {
            FileReader in = new FileReader("/home/lucaslgr/projects/pan-academy/modulo-java/aula14-app-java-input-out/src/arquivo-grande.txt");
            BufferedReader br = new BufferedReader(in);
            String text = br.readLine();

            while(text != null) {
                System.out.println(text);
                text = br.readLine();
            }

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
