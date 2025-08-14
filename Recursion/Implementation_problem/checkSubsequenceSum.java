package Recursion.Implementation_problem;

class Solution {
    private boolean kthcheckSubsequenceSum(int idx,int[] nums,int k ,int sum){
        if(idx == nums.length){
            return sum==k;
        }
        return kthcheckSubsequenceSum(idx+1,nums,k ,sum+nums[idx]) || kthcheckSubsequenceSum(idx+1,nums,k ,sum);
    }
    public boolean checkSubsequenceSum(int[] nums, int k) {
        //your code goes here
        int sum=0;
        return kthcheckSubsequenceSum(0,nums,k,sum);
    }
}