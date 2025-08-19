package Recursion.adityaVerma;
//https://leetcode.com/problems/k-th-symbol-in-grammar/
public class P08_kthGrammar {
        public int kthGrammar(int n, int k) {
        if(n==1 && k==1) return 0;
        if(k > Math.pow(2,n-2)){
            if(kthGrammar(n-1,k-(int)(Math.pow(2,n-2)))==1){
                return 0;
            }
            return 1;
        }
        else{
            return kthGrammar(n-1,k);
        }
    }
}
