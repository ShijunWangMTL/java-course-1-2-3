
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class NewsWriteDemo
{
    public static void main(String[] args) throws FileNotFoundException
    {
        // Declare variables
        String filename;
        String name = "";
        String news = "";
        String htmlStart = "<html>\n<head>\n</head>\n<body>\n" +
                           " \t <center>\n\t </center>\n\t <hr />";
        String htmlContent = "";
        String htmlEnd = "\t <hr/>\n</body>\n</html>";

        // Prompt user to enter information
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = keyboard.nextLine();
        filename = name + ".html";

        System.out.print("Enter the most important news you heard today: ");
        news = keyboard.nextLine();
        htmlContent = "\t " + news;

        // Create an object of PrintWriter class and open the file
        PrintWriter newsWriter = new PrintWriter(filename);

        // Write data to the file
        newsWriter.println(htmlStart + "\n" + htmlContent + "\n" + htmlEnd);

        // Close the file
        newsWriter.close();

    } // end main method
} // end class
