package com.StepDefination;

//import java.util.HashMap;
//import java.util.TreeMap;
//
//class Solution123{
//    //Function to count the frequency of all elements from 1 to N in the array.
//    
//	
//	public static void printarr(int arr[]) {
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//	}
//    
//    public static void frequencyCount(int arr[], int N, int P)
//    {
//     
//     
//     
//    // array caintains element for 1 to P
//    //size of array = N;
//     
//     HashMap<Integer,Integer> h = new HashMap<>();
//     
//     for(int i=0;i<arr.length;i++){
//         
//         if(h.containsKey(arr[i])){
//             
//             h.put(arr[i],h.get(arr[i])+1);
//         }
//         else{
//             h.put(arr[i],1);
//         }
//     }
//     
//     
//     for(int i=0;i<N;i++){
//        if(h.containsKey(i+1)){
//            arr[i]=h.get(i+1);
//        }
//        else{
//            arr[i]=0;
//        }
//     }
//     
//    }
//    
//    public static void demo(int nums[]) {
//    	  
//        TreeMap<Integer,Integer> h = new TreeMap<>();
//        
//        for(int i=0;i<nums.length;i++){
//            if(!h.containsKey(nums[i])){
//                h.put(nums[i],1);
//            }
//            else{
//                h.put(nums[i],h.get(nums[i]));
//            }
//        }
//        System.out.println(h);
//        
//    }
//    
//    
//    
//    
//    
//    
//    public static void main(String[] args ) {
//    	        //N = 5
//    			int arr[] = {1,2,2,2,2,2, 3, 2, 3, 5};
//    			//P = 5
//    			demo(arr);
//    }
//}

import java.util.*;

public class Solution123{
    
    public static int max(int arr[],int i,int k){
        int max=arr[0];
        for(int j=i;j<=i+k;j++){
            if(max<arr[j]){
                max=arr[j];
            }
            
        }
        return max;
    }
    public static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {  
        ArrayList<Integer> a = new ArrayList<>();
       for(int i=0;i<arr.length-(k-1);i++){
           a.add(max(arr,i,k-1));
       }
       return a;
    }
	public static void main(String[] args) {
	
	    int arr[] = { 1 ,2, 3, 1, 4, 5, 2 ,3 ,6};
	    System.out.println(max_of_subarrays(arr,9,3));
	}
}
