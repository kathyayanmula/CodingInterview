package dynamicProgramming;

public class MaxProduct {
	
	int maximumProd = Integer.MIN_VALUE;
	public int maxProd(int[] a, int index, int prod){
		
		if(index >= a.length)
			return 1;
		if(prod > maximumProd)
				maximumProd = prod;
		if(prod*a[index] < prod)
			return 1;
		
		return Math.max(maxProd(a,index+1, prod), maxProd(a,index+1, prod*a[index]));		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,3,-2,4};
		MaxProduct test = new MaxProduct();
		System.out.println(test.maxProd(a, 0, 1));
		System.out.println(test.maximumProd);
	}

}
