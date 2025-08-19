package Recursion.adityaVerma;

public class P09_TowerOfHanoi {
     public int towerOfHanoi(int n, int from, int to, int aux) {
        // code here
        //base case
        if(n==0) return 0;
        // hyposthesis
        int moveSourceToAux=towerOfHanoi(n-1,from,aux,to);
        // induction
        int moveAuxTodis=towerOfHanoi(n-1,aux,to,from);
        return 1+moveSourceToAux+moveAuxTodis;
        
    }
}
