/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.stream.Stream;
    
class CountEntriesRecur {
    public static void main(String []args) throws IOException {
         try(Stream<Path> entries = 
              Files.walk(Paths.get("."), 4, FileVisitOption.FOLLOW_LINKS)) {
                    long numOfEntries = entries.count();
                System.out.printf("Found %d entries in the current path", numOfEntries);
        }
    }
}

