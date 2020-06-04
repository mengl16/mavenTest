package com.calculate;

/**二分查找
 * @ClassName BinarySearch
 * @Description TODO
 * @Author Administrator
 * @Date 2019/6/14 10:13
 * Version 1.0
 **/
public class BinarySearch {
    public static int binarySearch(int element ,int [] arrays){
        if(arrays.length==0){
            return -1;
        }
        int length =arrays.length;
        int left =0;
        int right=length-1;
        int mid=0;
        int i=-1;
        while(left<=right){
            mid=(left+right)/2;
            if(arrays[mid]>element){
                right=mid-1;
            }else if(arrays[mid]==element) {
                i=mid;
                break;
            }else{
                left=mid+1;
            }
        }
        return i;
    }

    public static int binarySearch(int element ,int [] arrays,int low,int high){
        if(arrays.length==0){
            return -1;
        }
        if(low>high){
            return -1;
        }
        int left =low;
        int right=high;
        int i=-1;
        int  mid=(left+right)/2;
        if(arrays[mid]>element){
            right=mid-1;
        }else if(arrays[mid]==element) {
            i=mid;
        }else{
            left=mid+1;
        }
        if(i<0){
            int j = binarySearch(element,arrays,left,right);
            i=j;
        }
        return i;

    }
    public static void main(String[] args) {
        int [] a ={};
        int [] b ={1,2,10,30,40,45,45,50,60};
//        System.out.println(binarySearch(2,a));
        System.out.println(binarySearch(45,b));
        System.out.println(binarySearch(20,b,0,b.length-1));
    }

}