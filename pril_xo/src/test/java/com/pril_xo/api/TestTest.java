package com.pril_xo.api;

import org.junit.Test;


public class TestTest {

    @Test
    public void quickSort(){

        int[] arr = {65, 6, 7, 45, 32, 55, 789, 1, 2, 7};

        for(int i = 0;i<arr.length-1;i++){
            int k = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[k]){
                    k=j;
                }
            }
            if(i != k){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;

            }

        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}