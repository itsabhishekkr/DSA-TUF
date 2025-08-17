package Recursion.FAQs_Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PB_04SubsetsII {
     private int upperBound(int[] nums,int idx){
        int val=nums[idx];
        int ans=nums.length;
        int start=idx,end=nums.length-1;
        while(start <= end){
            int mid=start+(end-start)/2;
            if(nums[mid] > val){
                ans=mid;
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return ans;
    }
    private void subSets(int idx,int[] nums,List<Integer>temp,List<List<Integer>>ans){
        if(idx==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(nums[idx]);
        subSets(idx+1,nums,temp,ans);
        temp.remove(temp.size()-1);
        int next=upperBound(nums,idx);
        subSets(next,nums,temp,ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        //your code goes here
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        Arrays.sort(nums);
        subSets(0,nums,temp,ans);
        return ans;
    }
}
