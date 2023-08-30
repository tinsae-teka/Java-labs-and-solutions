/**
 * File: Grades.java
 *
 * Prints a table with a list of at least 5 students 
 * together with their grades earned
 */
public class Grades {

   /**
    * main prints the list
    */
   public static void main (String[] args) {
      
      // Notice how we have to write to back slashes in order to print one
      // This is because back slash is an escape character
      System.out.println ("\t///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
      System.out.println ("\t\t== Student Points ==");
      System.out.println ("\t///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
      System.out.println ("\tName\t\tLab\tBonus\tTotal");
      System.out.println ("\t----\t\t---\t-----\t-----");

      // while using + for string concatenation and addition in the same line we have to 
      // use brackets otherwise the numbers will be casted to string and the addition won't work
      System.out.println ("\tYohannes\t" + 43 + "\t" + 7 + "\t" + (43 + 7));
      System.out.println ("\tFeven\t\t" + 50 + "\t" + 8 + "\t" + (50 + 8));
      System.out.println ("\tTomas\t\t" + 39 + "\t" + 10 + "\t" + (39 + 10));
      System.out.println ("\tDawit\t\t" + 41 + "\t" + 9 + "\t" + (41 + 9));
      System.out.println ();
   }
}
