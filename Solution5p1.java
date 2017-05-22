package test;

public class Solution5p1 {
	static long parity(long num){
		num ^= num >> 32;
		num ^= num >> 16;
		num ^= num >> 8;
		num ^= num >> 4;
		num ^= num >> 2;
		num ^= num >> 1;
		return num & 1;
	}
}
