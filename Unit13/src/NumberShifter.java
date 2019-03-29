//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] list = new int[size];
		for (int i = 0; i < size; i++) {
			int randNum = (int)(Math.random() * 10);
			list[i] = randNum;
		}
		return list;
	}
	
	public static void shiftEm(int[] array)
	{
		int counter = 0;
		
		for (int j = 0; j < array.length; j++) {
			if (array[j] == 7) {
				int temp = array[j];
				array[j] = array[counter];
				array[counter] = temp;
				counter++;
			}
			
		}
	
	}
	
	
	
}