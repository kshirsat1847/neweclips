package com.StepDefination;

import java.util.Arrays;
import java.util.Map;import io.cucumber.java.sl.In;

class Solution {
   
    
    public static void main(String[] args ) {
    	int arr[]= {10,20,30};
    	String str="";
    	for(int i=0;i<arr.length;i++) {
    		str=str+arr[i];
    	}
    	
    	for(int i=0;i<arr.length;i++) {
    		for(int j=0;j<arr.length;j++) {
    			System.out.println(str.substring(i,j));
    		}
    	}
    	
    }
}