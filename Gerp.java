// This is Gerp, a new Grep tool written
// in Java. Gerp.java is the main file
// of this project.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Gerp {
    public static void main(String[] args) {
        // first, lets parse and print args
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument #" + i + " is " + args[i]); 
        }

        // now lets open a file!
        Path toSearchIn = Path.of(args[1]);

        String out = null;
        
        try {
            out = Files.readString(toSearchIn);
        } catch (IOException e) {
            System.err.println(e);
            System.exit(-1);
        }

        // for now, since we are not searching, just print the file contents
        System.out.print(out);
    }
}
