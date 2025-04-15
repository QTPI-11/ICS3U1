import java.util.HashSet;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Dictionary {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        HashSet<String> dictionaryWords = new HashSet<String>();
        BufferedReader inputStream = null;
        String line = null;

        try {
            inputStream = new BufferedReader(new FileReader("dictionary.txt"));
            while ((line = inputStream.readLine()) != null) {
                dictionaryWords.add(line);
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Error opening file");
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }

        System.out.println("Type a sentence in english for me please.");
        StringTokenizer st = new StringTokenizer(keyboard.nextLine(), " ");
        keyboard.close();

        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            System.out.println(word + " " + (dictionaryWords.contains(word.toLowerCase()) ? "<valid>" : "<invalid>"));
        }
    }
} //done