package Sorting;

public class MergeSort {
	public static void conquer(int arr[], int start, int end, int mid) {
		int merged[] = new int[end - start + 1];
		int idx1 = start, idx2 = mid + 1, x = 0;
		while(idx1 <= mid && idx2 <= end) {
			if(arr[idx1] <= arr[idx2]) {
				merged[x++] = arr[idx1++];
			}else {
				merged[x++] = arr[idx2++];
			}
		}
		
		while(idx1 <= mid) {
			merged[x++] = arr[idx1++];
		}
		
		while(idx2 <= end) {
			merged[x++] = arr[idx2++];
		}
		
		for(int i=0, j = start; i<merged.length;i++, j++) {
			
			arr[j] = merged[i];
		}
	}
	public static void devide(int arr[], int start, int end) {
		if(start<end) {
			int mid = start + (end-start) /2;
			devide(arr,start,mid);
			devide(arr,mid+1,end);
			conquer(arr, start, end, mid);
		}
		
	}
		
	public static void main(String[] args) {
		int arr[] = {6,3,9,5,2,8};
		int start = 0,end = arr.length-1;
		devide(arr,start,end);
		for(int i = 0; i < arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();

	}

}
