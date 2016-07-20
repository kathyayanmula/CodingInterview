package recursion;

import java.util.Scanner;

public class ReplaceWildCard {
	StringBuilder result = new StringBuilder();
    public String wildCard(String input){
        wildCard(input.toCharArray(), 0);
        return result.toString().substring(0,result.length() -2);
    }
    
    public void wildCard(char[] input, int index){
        if(index == input.length){
            //System.out.print(String.valueOf(input) + ", ");
            result.append(String.valueOf(input) + ", ");
            return;   
        }
        
        if(input[index] == '?'){
            input[index] = '0';
            wildCard(input, index + 1);
            
            input[index] = '1';
            wildCard(input, index + 1);
            
            input[index] = '?';
        }
        
        else{
            wildCard(input, index + 1);
        }
        
    }
     
    
public static void main(String args[] ) throws Exception {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
	ReplaceWildCard sol = new ReplaceWildCard();
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    sc.close();
    System.out.println(sol.wildCard(input));
}
}
