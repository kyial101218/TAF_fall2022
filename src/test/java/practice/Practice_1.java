package practice;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class Practice_1 {
//    int [] nums = {5,11,3,6,8,1};

    public static void main(String[] args) {
        int[] nums = {5, 11, 3, 6, 8, 1};
        sortArrays(nums);
    }

    public static int[] sortArrays(int [] nums1) {
        for(int i=0;i<nums1.length;i++){
           for(int j=0;j<nums1.length;j++){
               if(nums1[i] < nums1[j]) {
                   int temp = nums1[i];
                   nums1[i] = nums1[j];
                   nums1[j] = temp;
               }
            }
        }
        System.out.println(Arrays.toString(nums1));
        return nums1;
    }

    @Test
    public void sortedArrayTest(){
        int[] arr = {1,5,11,3,6,0,8};
        sortArrays(arr);
        for (int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                Assert.fail();
            } else {
                Assert.assertTrue(true);
            }
        }
    }

    @Test
    public void sortedArrayTest2(){
        int[] nums = {5, 11, 3, 6, 8, 1};
        int[] nums1 = sortArrays(nums);
        Assert.assertEquals(nums,nums1);
    }


}
