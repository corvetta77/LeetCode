package org.example;

public class RemoveElement {

    public static void main(String[] args) {
        RemoveElement vp = new RemoveElement();
        System.out.println(vp.removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println(vp.removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
        System.out.println(vp.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));

    }

    public int removeElement(int[] nums, int val) {
        var count = 0;
        for (int i=0; i < nums.length; i++) {
            if (nums[i]!=val) {
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }

    public int removeDuplicates(int[] nums) {
        var uni = 0;
        for (int i=0; i < nums.length; i++) {
            if ((i < nums.length-1) && (nums[i]==nums[i+1] || nums[i+1]<nums[i])) {
                continue;
            }
            nums[uni]=nums[i];
            uni++;
        }
        return uni;
    }

    public int removeDuplicates_atMostTwiceAppearence(int[] nums) {
        var uni = 0;
        for (int i=0; i < nums.length; i++) {
            if ((i < nums.length-1) && (nums[i]==nums[i+1] || nums[i+1]<nums[i])) {
                continue;
            }
            nums[uni]=nums[i];
            uni++;
        }
        return uni;
    }
}
