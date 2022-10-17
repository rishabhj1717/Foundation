package LargestNumber;

import java.util.Arrays;
import java.util.Comparator;

/*
 * I have referred to this from gfg.
 */

public class LargestNumber {
    private class LargerNumberComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            String order1 = a + b;
            String order2 = b + a;
           return order2.compareTo(order1);
        }
    }

    public String largestNumber(int[] nums) {
        // Get input integers as strings.
        String[] intStrings = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            intStrings[i] = String.valueOf(nums[i]);
        }

        // Sort strings according to custom comparator.
        Arrays.sort(intStrings, new LargerNumberComparator());

        // If, after being sorted, the largest number is `0`, the entire number
        // is zero.
        if (intStrings[0].equals("0")) {
            return "0";
        }

        // Build largest number from sorted array.
        String largestNumberStr = new String();
        for (String numAsStr : intStrings) {
            largestNumberStr += numAsStr;
        }

        return largestNumberStr;
    }

    public static void main(String[] args) {
        LargestNumber obj = new LargestNumber();
        int[] arr = new int[]{2,5,10};
        System.out.println(obj.largestNumber(arr));

        arr = new int[]{2, 30, 56};
        System.out.println(obj.largestNumber(arr));
    }
}