package Recursion.SubsequencePatternProblems;

class Solution {
    public void totalPowerSet(int idx,int[] nums,List<Integer>tempAns,List<List<Integer>>ans){
        if(idx==nums.length){
            ans.add(new ArrayList<>(tempAns));//copy of tempAns 
            return;
        }
        tempAns.add(nums[idx]);
        totalPowerSet(idx+1,nums,tempAns,ans);
        tempAns.remove(tempAns.size()-1);
        totalPowerSet(idx+1,nums,tempAns,ans);
    }
    public List<List<Integer>> powerSet(int[] nums) {
        //your code goes here
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>tempAns=new ArrayList<>();
        totalPowerSet(0,nums,tempAns,ans);
        return ans;
    }
}