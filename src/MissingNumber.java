import java.util.Arrays;

public class MissingNumber {

    public static int missingNumber1(int[] nums) {

        Arrays.sort(nums);
        int expected = 0;

        for(int i = 0; i < nums.length; i++) {
            if (expected != nums[i]) {
                break;
            }
            expected++;
        }
        return expected;

    }


    public static int missingNumber2(int[] nums) {
        int n = nums.length;
        int sum = n * (n + 1) / 2;
        int sum2 = 0;
        for (int i : nums) {
            sum2 += 1;
        }

        return sum - sum2;
    }
}
