import java.io.*;
import java.util.Scanner;

public class crud {

    public static void createFile() throws IOException
    {
        String fileContent = "Hello Learner !! Estamos na aula de DSP.";

        FileWriter fileWriter = new FileWriter("src/main/resources/samplefile.txt");
        fileWriter.write(fileContent);
        fileWriter.close();
    }

    public static void readFile() throws IOException {
        Scanner in = new Scanner(new FileReader("src/main/resources/samplefile.txt"));
        while (in.hasNextLine()) {
            System.out.println(in.nextLine());
        }
    }
}
