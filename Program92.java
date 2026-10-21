public class Program92 {

    public static  int[] twosum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {

        

        int[] nums = {1, 8, 4, 7, 6};

        int[] result = twosum(nums, 12);

        System.out.println(result[0] + " " + result[1]);
    }
}