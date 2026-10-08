// This is Gerp, a new Grep tool written
// in Java. Gerp.java is the main file
// of this project.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Gerp {
    public static void main(String[] args) {
        // make sure there is enough arguments provided
        if (args.length < 2) {
            System.err.println("Error: not enough args");
            System.err.println("Usage: gerp [search terms] [filename]");
            System.exit(1);
        }

        // now lets open a file!
        Path toSearchIn = Path.of(args[1]);

        String out = null;
        
        try {
            out = Files.readString(toSearchIn);
        } catch (IOException e) {
            System.err.println("Error: file not found");
            System.exit(1);
        }

        // for now, since we are not searching, just print the file contents
        System.out.print(out);
    }
}
