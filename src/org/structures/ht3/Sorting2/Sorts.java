package org.structures.ht3.Sorting2;

import java.util.ArrayList;


public class Sorts {

	public static void mergeSort(Comparable[] a) {
		Comparable[] tmp = new Comparable[a.length];
		mergeSort(a, tmp, 0, a.length - 1);
	}

	private static void mergeSort(Comparable[] a, Comparable[] tmp, int left, int right) {
		if (left < right) {
			int center = (left + right) / 2;
			mergeSort(a, tmp, left, center);
			mergeSort(a, tmp, center + 1, right);
			merge(a, tmp, left, center + 1, right);
		}
	}

	private static void merge(Comparable[] a, Comparable[] tmp, int left, int right, int rightEnd) {

		int leftEnd = right - 1;
		int k = left;
		int num = rightEnd - left + 1;

		while (left <= leftEnd && right <= rightEnd)
			if (a[left].compareTo(a[right]) <= 0)
				tmp[k++] = a[left++];
			else
				tmp[k++] = a[right++];

		while (left <= leftEnd)
			tmp[k++] = a[left++];

		while (right <= rightEnd)
			tmp[k++] = a[right++];
		for (int i = 0; i < num; i++, rightEnd--)
			a[rightEnd] = tmp[rightEnd];
	}

	public static void qSort(Comparable[] arr, int a, int b) {
		if (a < b) {
			int i = a, j = b;
			Comparable x = arr[(i + j) / 2];

			do {
				while (arr[i].compareTo(x) < 0) i++;
				while (x.compareTo(arr[j]) < 0) j--;

				if (i <= j) {
					Comparable tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
					i++;
					j--;
				}

			} while (i <= j);

			qSort(arr, a, j);
			qSort(arr, i, b);
		}
	}
}
