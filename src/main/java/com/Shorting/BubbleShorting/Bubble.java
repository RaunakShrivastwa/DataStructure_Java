package com.Shorting.BubbleShorting;

public class Bubble {
    public static void main(String[] args) {
        int a[]={8,3,5,2,9};
        int temp;
        System.out.println("Before the sorting:-");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<a.length;i++){
            for(int j=a.length-1;j>i;j--){
                if(a[j]<a[j-1]){
                    temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("After the sorting:-");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
