package binarySearch;

public class Sqrt {
	
	public boolean sqrt(int a){
		if(a < 2)
			return true;
		int start = 0;
		int end = a;
		int mid = 0;
		while(start <= end){
			mid = (start+end)/2;
			//if(mid == a/mid && a%mid == 0)
			if(mid == a/mid)
				return true;
			if(mid <= a/mid)
				start = mid+1;
			else
				end = mid - 1;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sqrt test = new Sqrt();
		System.out.println(test.sqrt(81));
		System.out.println(test.sqrt(25));
	}

}
