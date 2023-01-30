package practice.codingBat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordsFront {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(copyEvens(new int[]{3, 2, 4, 5, 8}, 2)));
    }
//    public List wordsWithoutList(String[] words, int len) {
//        List<String> list = new ArrayList<String>();
//        for (String s:words) {
//            if (s.length()!=len){
//                list.add(s);
//            }
//        }
//        return list;
//    }
//public static int[] copyEvens(int[] nums, int count) {
//        int j = 0;
//    int [] arr = new int[count];
//    for (int i=0;i<nums.length;i++){
//        if(nums[i]%2==0) {
//          arr[j]=nums[i];
//          j++;
//        }
//        if (j==count)
//            return arr;
//
//    }
////    System.out.println(Arrays.toString(arr));
//
//    return nums;
//
//}

    public int scoresSpecial(int[] a, int[] b) {
        return scoresSpecial2(a) + scoresSpecial2(b);
    }
    public int scoresSpecial2(int[] nums){
        int maxi = 0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]%10==0 && nums[i]>maxi) {
                maxi=nums[i];
            }
        }
        return maxi;
    }
}

