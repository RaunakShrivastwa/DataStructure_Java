package com.Shorting;

import java.util.Scanner;

class doShort{

    Scanner obj=new Scanner(System.in);
    public void Create_Array(){
       int n;
        System.out.println("Enter The Size of Array(/int)");
        n=obj.nextInt();
        int [] array=new int[n];
        System.out.println("Enter The Array Element:-");
        for(int i=0;i<n;i++){
            array[i]=obj.nextInt();
        }
        System.out.println("Array Element Before Shorting:-");
        for(int i=0;i<n;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
       Shorting(array);

    }
    public void Shorting(int[] array){
       int temp;
       for(int i=0;i<array.length;i++){
           for(int j=i+1;j<array.length;j++){
               if(array[i]>array[j]){
                   temp=array[j];
                   array[j]=array[i];
                   array[i]=temp;
               }
           }
       }
        System.out.println("Now Shorted Array");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
}

public class InsertionSort {

    public static void main(String[] args) {
       doShort d=new doShort();
       d.Create_Array();

    }
}