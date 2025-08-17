package Recursion.FAQs_Medium;

import java.util.ArrayList;
import java.util.List;

public class PB_03SubsetsI {
    private void subSet(int idx,int[] nums,List<Integer>ans,int sum){
        if(idx==nums.length){
            ans.add(sum);
            return;
        }
        subSet(idx+1,nums,ans,sum+nums[idx]);
        subSet(idx+1,nums,ans,sum);
    }
    public List<Integer> subsetSums(int[] nums) {
        //your code goes here
        List<Integer>ans=new ArrayList<>();
        subSet(0,nums,ans,0);
        return ans;
    }
}

// class Solution {
//     private void subSet(int idx,int[] nums,List<Integer>temp,List<Integer>ans,int sum){
//         if(idx==nums.length){
//             ans.add(sum);
//             return;
//         }
//         temp.add(nums[idx]);
//         subSet(idx+1,nums,temp,ans,sum+nums[idx]);
//         temp.remove(temp.size()-1);
//         subSet(idx+1,nums,temp,ans,sum);
//     }
//     public List<Integer> subsetSums(int[] nums) {
//         //your code goes here
//         List<Integer>ans=new ArrayList<>();
//         List<Integer>temp=new ArrayList<>();
//         subSet(0,nums,temp,ans,0);
//         return ans;
//     }