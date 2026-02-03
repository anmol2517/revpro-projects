import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Read {
    public static void main(String[] args) throws FileNotFoundException,IOException {

        FileReader frr = new FileReader("C:\\Users\\ianmo\\OneDrive\\Documents\\Tech\\Code Craft\\Code\\Java\\Exception_Handling\\src\\star.txt");

        BufferedReader br = new BufferedReader(frr);

        System.out.println(br.readLine());
    }
}

