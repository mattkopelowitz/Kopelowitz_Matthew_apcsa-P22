//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
		
		NumberShifter test = new NumberShifter();
		int[] array = test.makeLucky7Array(50);
		System.out.println(Arrays.toString(array));
		test.shiftEm(array);
		System.out.println(Arrays.toString(array));
	}
}



