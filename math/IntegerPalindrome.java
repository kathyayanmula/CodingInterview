package math;

public class IntegerPalindrome {

	public boolean isPalindrome(int a) {
		    if(a<0)
		        return false;
		    if(a >= 0 && a < 10){
		       return true;
		    }
		    /*int j = 0;
		    String compare = Integer.toString(a);
		    int k = compare.length() - 1;
		    while(j <= compare.length()/2){
		        System.out.println("char "+compare.substring(j,j+1));
		        System.out.println("num " + Integer.toString(a%10));
		        if(compare.charAt(j) != compare.charAt(k))
		            return false;
		        a = a/10;
		        j++;
		        k--;
		    }
		    return true;*/
		    
		    int rev = 0;
			 int div = 0;
			 int num = a;
			 while(num > 0){
			     div = num%10;
			     //System.out.println(div);
			     rev = rev*10+div;
			     System.out.println(rev);
			     num=num/10;
			     //System.out.println(num);
			 }
			 if(rev == a)
			    return true;
			 return false;
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			IntegerPalindrome test = new IntegerPalindrome();
			String a = "a";
			System.out.println(Integer.MAX_VALUE);
			System.out.println(String.valueOf((char)86));
			System.out.println(Character.getNumericValue('Z'));
			//System.out.println(test.isPalindrome(1146467285));

		}
	}

