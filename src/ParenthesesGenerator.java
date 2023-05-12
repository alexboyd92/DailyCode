package src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/* Given a number (n) pairs of pratheses generate all combination of well formed parentheses. */
public class ParenthesesGenerator {
    /* Only add an open parenthesis if open<n
       Only add a close parenthesis if closed <open
       Is well formed if and only if open is equal to closed is equal to number of pair of parentheses
    * */
    public List<String> generate(int n) {
        List<String>result=new ArrayList<>();
        backtrack("",0,0,result,n);
        return result;
    }
    public void backtrack(String s,int open,int close,List<String>result,int n){
        if(open==n && close==n){
            result.add(s);
        }
        if(open<n){//allowed to put close
            backtrack(s+"(",open+1,close,result,n);
        }
        if(close<open){
            backtrack(s+")",open,close+1,result,n);
        }
    }
    public static void getResult(){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter how many pairs of parentheses there are");
        int n = userInput.nextInt();
        userInput.close();
        // Create a new ParenthesesGenerator named generate
        ParenthesesGenerator generate = new ParenthesesGenerator();
        // call it with the input stored in n and then print the result
        System.out.println(Arrays.toString( generate.generate(n).toArray()));
    }
    
}