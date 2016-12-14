/*------------------------------------------------------------------------------
 * Oracle Certified Professional Java SE 8 Programmer Exam 1Z0-809 
 * A Comprehensive OCPJP 8 Certification Guide
 * by SG Ganesh, Hari Kiran and Tushar Sharma
------------------------------------------------------------------------------*/

import java.time.Instant;

public class UsingInstant {
    public static void main(String args[]){
        // prints the current timestamp with UTC as time zone
        Instant currTimeStamp = Instant.now();
        System.out.println("Instant timestamp is: "+ currTimeStamp);
                                
        // prints the number of seconds as Unix timestamp from epoch time
        System.out.println("Number of seconds elapsed: " + currTimeStamp.getEpochSecond());

        // prints the Unix timestamp in milliseconds
        System.out.println("Number of milliseconds elapsed: " + currTimeStamp.toEpochMilli());
    }
}
