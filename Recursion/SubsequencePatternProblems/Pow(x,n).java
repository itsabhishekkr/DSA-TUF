package Recursion.SubsequencePatternProblems;

// TC= log(N)
// use recursion
class Solution {
    private double pow(double x, long N) {
        if(N==0){
            return 1.0;
        }
        if(N%2==1){
            return x*pow(x,N-1);
        }else{
            return pow(x*x,N/2);
        }

    }

    public double myPow(double x, int n) {
        long N = n; // use long to avoid overflow
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        return pow(x, N);
    }
}


// // TC= log(N)
// class Solution {
//     private double pow(double x, long N) {
//         double ans=1;
//         while(N > 0){
//             if(N%2==1){
//                 ans=ans*x;
//                 N-=1;
//             }else{
//                 x=x*x;
//                 N=N/2;
//             }
//         }
//         return ans;
//     }

//     public double myPow(double x, int n) {
//         long N = n; // use long to avoid overflow
//         if (N < 0) {
//             x = 1 / x;
//             N = -N;
//         }
//         return pow(x, N);
//     }
// }


// class Solution {
//     public double myPow(double x, int n) {
//         double ans=1;
//         long N=n;
//         if(n < 0){
//             N=-1*(N);
//             x=(1/x);
//         }
//         for(long i=1;i<=N;i++){
//             ans*=x;
//         }
//         return ans;
//     }
// }