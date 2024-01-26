package Arrays.Part2.Questions;

public class Q1 {

    public static boolean duplicateElements(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 2, 3, 4, 1 };
        System.out.println(duplicateElements(nums));
    }
}
