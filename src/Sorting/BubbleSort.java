package Sorting;

import java.util.Arrays;

public class BubbleSort {
	public void sortColors(int[] nums) {
        int n = nums.length -1;
        int temp = 0;
        for(int i =0 ;i < n; i++){
            for(int j = 0; j < n; j++){
                if(nums[j] > nums[j+1]){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
            
        }
        
    }
	public static void main(String[] args) {
		BubbleSort b1 = new BubbleSort();
		int nums[] = {2,0,2,1,1,0};
		b1.sortColors(nums);
		System.out.println("After sorting array elements are : ");  
		System.out.println(Arrays.toString(nums));
	}

}
