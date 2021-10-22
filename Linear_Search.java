package com.company;

import java.util.Random;
import java.util.Scanner;

public class Linear_Search {
    public static boolean isPresent(int []arr,int element){
        for (int j : arr) {
            if (j == element)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        System.out.print("Enter the size of the array : ");
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=rd.nextInt(100000);
        }
        System.out.print("Enter the elements to search : ");
        int element=sc.nextInt();
        long start=System.nanoTime();
        if(isPresent(arr,element)){
            System.out.println("Element found in the array !!!!!!!!!!!!!!!");
        }else{
            System.out.println("Element not found in the array !!!!!!!!!!!!");
        }
        long end=System.nanoTime();
        long time=end-start;
        System.out.println("The total time for searching the element is : "+time/1000000.0+" ms");
    }
}