package com.Shorting.SelectionShorting;


public class Selection {
    public static void main(String[] args) {
        int temp;
        int count;
        boolean flag=true;
        int a[]={1,0,4,3,2};
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                count=j;
                if(a[i]>a[j]){
                    flag=false;
                    temp=a[j];
                    for(int l=j-1;l>=i;l--){
                        a[count]=a[l];
                        count--;
                    }
                    a[i]=temp;
                }

            }
        }
        System.out.println("list:-");
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
