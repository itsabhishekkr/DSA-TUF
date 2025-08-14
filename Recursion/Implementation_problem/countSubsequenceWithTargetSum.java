package Recursion.Implementation_problem;

class Solution {
    private void kthcountSubsequenceWithTargetSum(int idx,int[] nums,int k,int sum,int[] ans){
        if(idx==nums.length){
            if(sum==k){
                ans[0]+=1;
            }
            return;
        }
        kthcountSubsequenceWithTargetSum(idx+1,nums,k,sum+nums[idx],ans);
        kthcountSubsequenceWithTargetSum(idx+1,nums,k,sum,ans);
    }
    public int countSubsequenceWithTargetSum(int[] nums, int k) {
        //your code goes here
        int[] ans=new int[1];
        ans[0]=0;
        kthcountSubsequenceWithTargetSum(0,nums,k,0,ans);
        return ans[0];
    }
}
