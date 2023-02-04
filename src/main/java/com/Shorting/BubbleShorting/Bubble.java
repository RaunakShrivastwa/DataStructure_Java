package com.Shorting.BubbleShorting;

public class Bubble {
    public static void main(String[] args) {
        int a[]={2,3,5,8,1};
        int temp;
        int i;
        boolean flag=true;
        System.out.println("Before the sorting:-");
        for( i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        for( i=0;i<a.length;i++){
            for(int j=a.length-1;j>i;j--){
                if(a[j]<a[j-1]){
                    temp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                    flag=false;
                }
            }
            if(flag){
                System.out.println("Already Shorted:-");
                break;
            }
        }
       if(!flag){
           System.out.println("After Sorting");
           for(int j=0;j<a.length;j++){
               System.out.print(a[j]+" ");
           }
       }
    }
}
