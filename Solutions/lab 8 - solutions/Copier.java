import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Copier{
	public static void main(String[] args) {
		String source;
		File sourceFile;
		Scanner keyboard = new Scanner(System.in);
		
		do{
			
			try{
				System.out.print("Enter source file name: ");
				source = keyboard.next();
				sourceFile = new File(source);
				Scanner sourceReader = new Scanner(sourceFile);
				sourceReader.close();
				break;
			}catch(FileNotFoundException e){
				System.out.println("File not found");
			}
		}while(true);
	}
}