package com.Shorting.countShorting;

public class CountShort {
    public int MaxElement(int[] a){
        int max=a[0];
        for(int i=0;i<a.length-1;i++){
            if(max<a[i+1]){
                max=a[i+1];
            }
        }
        return max;
    }
    public int[] PositionArray(int[] a){
        int count=a[0];
        for(int i=0;i<a.length;i++){
            a[i]=a[i]+count;
            count=a[i];
        }

        return a;
    }
    public int[] findPosition(int [] a,int [] position){
        int [] list=new int[a.length];
        for(int i=a.length-1;i>=0;i--){
            int temp=a[i];
            position[temp]=position[temp]-1;
            list[position[temp]]=temp;
        }
        return list;
    }
    public void displayArray(int [] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public int[] countArray(int [] a,int [] countArray){
        for(int i=0;i<countArray.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[j]==i){
                    if(i!=0){
                        countArray[i]=countArray[i]+1;
                    }
                }
            }
        }
        return countArray;
    }
    public static void main(String[] args) {
        CountShort c=new CountShort();
       int a[]={1,3,2,3,4,1,6,4,3};
       int max;
        System.out.println("Array Before Shorting:-");
        c.displayArray(a);
        max=c.MaxElement(a);
        System.out.println("max element:- "+max);
//        creating new array for the counting the elements;
        int countArray[]=new int[max+1];
        countArray=c.countArray(a,countArray);

        System.out.println("CountArray :-");
        c.displayArray(countArray);

//        Creating Position Array:-
        countArray=c.PositionArray(countArray);
        System.out.println("Position Array:- ");
        c.displayArray(countArray);

//        Finding Array Position for Shorting
        a=c.findPosition(a,countArray);
        System.out.println("Shorted List yet:");
        c.displayArray(a);




    }

}
