package com.hh.algorithm.array.sort;

import org.junit.Test;


/**
 * 插入排序
 */
public class InsertSort {

    @Test
    public void testInsertSort() {
        int[] arr = new int[]{1,24,11,21,4};
        System.out.println(System.currentTimeMillis());
        int[] arrayData = getArrayData(arr);
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < arrayData.length; i++) {
            System.out.print(arrayData[i] + " ");
        }

    }


    private int[] getArrayData(int[] array) {
        for(int i=1;i<array.length;i++){	//假设第一位是有序的，从数组的第二位开始排序
            int temp = array[i];	//temp为即将要排序的数值
            int j = i-1;	//j为已经排好序的数组的最后一位
            for(;j>=0 && array[j]>temp;j--){	//将temp与已经排好序的数组进行比较，大的数放在已排好序的数组后面
                array[j+1] = array[j];
            }
            array[j+1] = temp;	//j--，小的数往前面放
        }
        return array;
    }

}
