/**
 *
 */
package LoopToReadFile;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


/**
 * @author elvis
 *
 */
public class LoopToReadFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException{
		// TODO Auto-generated method stub
		System.out.println(findAverage("1 2 3 4 5"));

		//System.out.println(findAverageFromFile("filename"));

    //   File file = new File("batman.txt");

		//System.out.println(file.getAbsolutePath());
		//System.out.println(file.getName());


	}


	public static double findAverage(String text) {

		Scanner scan = new Scanner(text);
		double value = 0;
		int numCount = 0;

		while(scan.hasNextInt()) {
			numCount++;
			value += scan.nextInt();
		}
		scan.close();
		return value /numCount;
	}

	public static double findAverageFromFile(String filename) throws FileNotFoundException {

		File f = new File(filename);
		Scanner scan = new Scanner(f);

		double value = 0;
		int numCount = 0;

		while(scan.hasNextInt()) {
			numCount++;
			value += scan.nextInt();
		}

		scan.close();
		return value /numCount;
	}



}
