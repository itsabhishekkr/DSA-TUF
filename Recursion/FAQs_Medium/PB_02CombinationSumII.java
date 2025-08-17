package Recursion.FAQs_Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PB_02CombinationSumII {
    private int upperBound(int idx,int[] candidates){
        int start=idx,end=candidates.length-1;
        int val=candidates[start];
        int ans=candidates.length;
        while(start <= end){
            int mid=start+(end-start)/2;
            if(candidates[mid] > val){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    private void combinations(int idx,int[] candidates,int target,List<Integer>temp, List<List<Integer>>ans,int sum){
        if(sum > target) return;   // pruning
        if(idx==candidates.length){
            if(sum == target) ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(candidates[idx]);
        combinations(idx+1,candidates,target,temp,ans,sum+candidates[idx]);
        temp.remove(temp.size()-1);
         // skip all duplicates at once
        int next = upperBound(idx, candidates);
        combinations(next, candidates, target, temp, ans, sum);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        //your code goes here
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        Arrays.sort(candidates);
        combinations(0,candidates,target,temp,ans,0);
        return ans;
    }
}
