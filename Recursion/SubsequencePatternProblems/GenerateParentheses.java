package Recursion.SubsequencePatternProblems;

class Solution {
    private void generate(int open,int close,int size,String current, List<String>result){
        // base case 
        if(open == size && close == size ){
            result.add(current);
            return;
        }
        // close call
        if(open < size){
            generate(open+1,close,size,current+'(',result);
        }
        if(open > close){
            generate(open,close+1,size,current+')',result);
        }
    }
    public List<String> generateParenthesis(int n) {
        //your code goes here
        List<String>result=new ArrayList<>();
        generate(0,0,n,"",result);
        return result;
    }
}