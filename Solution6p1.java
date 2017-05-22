package test;

public class Solution6p1 {
	static void sort(int[] flags){
		int current = 0;
		
		int end = flags.length - 1;
		int mid = 0;
		while (current <= end){
			while (flags[current] == 1 && current <= end){
				current++;
			}
			while (flags[current] == 0 && current <= end){
				swap(flags, current, mid);
				current++;
				mid++;
			}
			while (flags[current] == 2 && current <= end){
				swap(flags, current, end);
				end--;
			}
		}
	}
	static void swap(int[] nums, int i, int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
