// This is Gerp, a new Grep tool written
// in Java. Gerp.java is the main file
// of this project.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Gerp {
    public static void main(String[] args) {
        // make sure there is enough arguments provided
        if (args.length < 2) {
            System.err.println("Error: not enough args");
            System.err.println("Usage: gerp [search terms] [filename]");
            System.exit(1);
        }

        Stream<String> file = null;

        // now lets open a file!
        try {
            file = Files.lines(Paths.get(args[1]));
        } catch (IOException e) {
            System.out.println("Error: File does not exist.");
            System.exit(1);
        }

        Object[] fileContentIncrements = file.toArray();
        
        for (int i = 0; i < fileContentIncrements.length; i++) {
            System.out.println((i + 1) + ": " + fileContentIncrements[i]);
        }
    }
}
