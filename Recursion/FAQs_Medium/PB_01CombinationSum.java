package Recursion.FAQs_Medium;

class PB_01CombinationSum {
    private void combinations(int idx,int[] candidates,int target,List<Integer>temp,List<List<Integer>>ans,int sum){
        if(target==sum){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(sum > target){
            return;
        }
        if(sum < target && candidates.length==idx){
            return;
        }

        temp.add(candidates[idx]);
        combinations(idx,candidates,target,temp,ans,sum+candidates[idx]);
        temp.remove(temp.size()-1);
        combinations(idx+1,candidates,target,temp,ans,sum);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        //your code goes here
        List<List<Integer>>ans= new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        combinations(0,candidates,target,temp,ans,0);
        return ans;
    }
}
