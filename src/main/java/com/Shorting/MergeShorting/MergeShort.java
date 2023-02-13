package com.Shorting.MergeShorting;

public class MergeShort {
    public void display(int [] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        MergeShort m=new MergeShort();
        int a[]={0,2,4,6};
        int b[]={1,3,5,7};
        int c[]=new int[a.length+b.length];
        int size=a.length-1;

        System.out.println("First Array:-");
        m.display(a);
        System.out.println();
        System.out.println("Second Array");
        m.display(b);
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
        }
        System.out.println();

        System.out.println("Main Array:-");
        m.display(c);

        System.out.println();
        for(int i=0;i<b.length;i++){
            for(int j=0;j<c.length;j++){
                if(b[i]<c[j]){
                    for(int k=size;k>=j;k--){
                        System.out.print(k+" ");
                        c[k+1]=c[k];
                    }
                    System.out.println();
                    size++;

                    c[j]=b[i];
                     break;

                }
            }
        }
        c[size+1]=b[b.length-1];
        System.out.println("Main Array:-");
        m.display(c);


    }
}
