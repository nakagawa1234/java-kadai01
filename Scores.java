import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
class Scores {
    public static void main(String[] args){

        try(BufferedReader reader = Files.newBufferedReader( 
            Paths.get(".","scores.csv"))) {

            String line;
            while ((line = reader.readLine()) != null) {
            System.out.println(line);
            
            }

            System.out.println();
            
        } catch (IOException e) { 
                e.printStackTrace();
        }
    }
}