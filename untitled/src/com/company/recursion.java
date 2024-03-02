package com.company;

public class recursion {
    public static  void conquer(int arr,int startindex,int endindex,int mid){
        int merged[] = new int[endindex -startindex+1];
        int idx1= startindex;
        int idx2=mid+1;
        int x =0;
        while (idx1<=mid &&idx2<=endindex){
            if (arr [idx1]<= arr [idx2]){
                merged[x++]=arr[idx1++];
            }
            else {
                merged[x++]=arr[idx2++];
            }
        }
        while(idx1<=mid){
            merged[x++]=arr[idx1++];
        }
        while (idx2<=endindex){
            merged[x++]=arr[idx2++];
        }
    }


    public static  void divide(int arr,int startindex,int endindex){
if (startindex<=endindex){
    return;
}
      int  mid =startindex+(startindex-endindex)/2;
          divide(arr,startindex,mid);
          divide(arr,mid+1,endindex );
    }

    public static void main(String[] args) {
        int [] arr={2,5,6,8,1,0};
        int n =arr.length;
    }
    
}
