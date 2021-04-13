import java.util.Iterator;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import javax.swing.JOptionPane;

public class MergeSort {
	
	
	public static void main(String[] args) {
		Random r = new Random();
		//int[] valores = r.ints(10,20,40).toArray();
		int[] valores = {100,2,30,4,9,3,8,9,120,3,0};
		
		print(valores, 0, valores.length);
		valores = mergeSort(valores);	
		print(valores, 0, valores.length);
		
		
	}

	private static void print(int[] valores, int left, int right) {
		System.out.println("----");
		for (int i = left; i < right; i++) {
			System.out.print(valores[i] + " ");			
		}
		System.out.println();
		System.out.println("Soma dos valores=" + IntStream.of(valores).sum());
	}

	private static int[] mergeSort(int[] valores) {
		return doMergeSort(valores, 0, valores.length);
	}

	private static int[] doMergeSort(int[] valores, int left, int right) {
		//print(valores, left, right);
		//System.out.println(left + "  " + right);
		if (valores.length == 0) {
			return new int[] {};
		}
		if (right-left == 1) {
			return new int[] {valores[left]};
		}	
		int mid = (right + left) / 2;
		int[] leftValues = doMergeSort(valores, left, mid);
		int[] rightValues = doMergeSort(valores, mid, right);
		
		int[] mergedValues = merge(leftValues, rightValues);		
			
		return mergedValues;		
	}

	private static int[] merge(int[] leftValues, int[] rightValues) {
		int[] mergedValues = new int[leftValues.length+rightValues.length];			
		int nextL = 0;
		int nextR = 0;
		int nextMerged = 0;
		while (nextL < leftValues.length || nextR < rightValues.length) {
			
			while (nextL < leftValues.length && (nextR >= rightValues.length || leftValues[nextL] <= rightValues[nextR])) {
				mergedValues[nextMerged] = leftValues[nextL];
				nextL++;
				nextMerged++;
			}
			while (nextR < rightValues.length && (nextL >= leftValues.length || rightValues[nextR] < leftValues[nextL]) ) {
				mergedValues[nextMerged] = rightValues[nextR];
				nextR++;
				nextMerged++;
			}
		}
		return mergedValues;
	}
	

}
