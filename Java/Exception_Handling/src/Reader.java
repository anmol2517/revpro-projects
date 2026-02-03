import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {

        try{
            FileReader fr = new FileReader("C:\\Users\\ianmo\\OneDrive\\Documents\\Tech\\Code Craft\\Code\\Java\\Exception_Handling\\src\\sample.txt");

            System.out.println("Program Started!");

            BufferedReader br = new BufferedReader(fr);

            System.out.println(br.readLine());

            br.close();
            fr.close();
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
