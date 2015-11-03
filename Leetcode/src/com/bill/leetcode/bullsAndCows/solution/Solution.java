package com.bill.leetcode.bullsAndCows.solution;

public class Solution {
    
	public static String getHint(String secret, String guess) {
	    int a=0,b=0;
	    //创建一个可以放置10个数字的桶
	    int[] digits=new int[10];
	    for(int i=0;i<secret.length();i++){
	    	//当同位数字相等时，a++
	        if(secret.charAt(i)==guess.charAt(i)) a++;
	        else{
	        	//将元素进桶，secret+1，guess-1，如果元素进桶后，使桶的值为0，则b++
	            if(++digits[secret.charAt(i)-'0']<=0) b++;
	            if(--digits[guess.charAt(i)-'0']>=0) b++;
	        }
	    }
	    return a+"A"+b+"B";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char x = 0;
		System.out.print(x);
		System.out.print(getHint("1807","7810"));
	}

}
