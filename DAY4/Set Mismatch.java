class Solution {
    public int[] findErrorNums(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int duplicate = -1;

        for (int n : nums) {
            if (s.contains(n)) {
                duplicate = n;
            }
            s.add(n);
        }

        int missing = -1;

        for (int i = 1; i <= nums.length; i++) {
            if (!s.contains(i)) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }
}
