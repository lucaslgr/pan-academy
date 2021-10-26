import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFile {
    public static void main(String[] args)  {
        String path1 = "/home/lucaslgr/projects/pan-academy/modulo-java/aula14-app-java-input-out/src/arquivo.txt";
        File arquivo1 = new File(path1);

        try {
            Scanner sc = new Scanner(arquivo1);
            while(sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Testando com arquivo grande
        String path2 = "/home/lucaslgr/projects/pan-academy/modulo-java/aula14-app-java-input-out/src/arquivo-grande.txt";
        File arquivo2 = new File(path2);

        try {
            Scanner sc = new Scanner(arquivo2);
            while(sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
