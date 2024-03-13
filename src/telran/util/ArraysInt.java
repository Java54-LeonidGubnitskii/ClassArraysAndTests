package telran.util;

import java.util.Arrays;

public class ArraysInt {
	public static int[] addNumber(int[] array, int number) {
		int[] arrayCopy=Arrays.copyOf(array,array.length+1);
		arrayCopy[arrayCopy.length-1]=number;
		return arrayCopy;
	}
	public static int[] insertNumber(int[] array, int index, int number) {
	    int[] arrayCopy = Arrays.copyOf(array, array.length + 1);
	    System.arraycopy(arrayCopy, index, arrayCopy, index + 1, array.length - index);
	    arrayCopy[index] = number;
	    return arrayCopy;
	}
public static int[] removeNumber(int[] array,int index) {
	 int[] arrayCopy = Arrays.copyOf(array, array.length -1);
	 System.arraycopy(array, index+1, arrayCopy, index, array.length - index-1);
	 return arrayCopy;
}
public static int[] insertSorted(int[] sortedArray, int number) {
	int[] arrayCopy = Arrays.copyOf(sortedArray,sortedArray.length + 1);
	arrayCopy[arrayCopy.length-1]=number;
	Arrays.sort(arrayCopy);
    return arrayCopy;
}
public static int[] arraySort(int[] array) {
	int[] sortedArray = Arrays.copyOf(array, array.length + 1);
	Arrays.sort(sortedArray);
	return  sortedArray;
}
} 

