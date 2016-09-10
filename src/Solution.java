/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Abhinandan
 */
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int N = keyboard.nextInt();
        System.out.println(lexicalOrder(N));
    }
    
    public static List<Integer> lexicalOrder(int N) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=1;i<=9;i++){
            dfs(list,i,N);
        }
        
        return list;    
    }
    
    public static boolean dfs(ArrayList<Integer> list,int cur,int N){
        if(cur > N)
            return true;
        
        list.add(cur);
        
        for(int i=0;i<=9;i++){
            cur = (cur*10)+i;
            boolean exceeded = dfs(list,cur,N);
            cur /= 10;
            if(exceeded)
                break;
        }
        
        return false;
    }
}
