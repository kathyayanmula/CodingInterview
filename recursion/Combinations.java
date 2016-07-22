package recursion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Combinations {
	
	public <T> ArrayList<ArrayList<T>> getCombinations(ArrayList<T> input){
		ArrayList<ArrayList<T>> result = new ArrayList<ArrayList<T>>();
		ArrayList<T> temp = new ArrayList<T>();
		writeCombinations(input, result, 0, temp);
		
//		Collections.sort(result, new Comparator<ArrayList<T>>() {
//	        @Override
//	        public int compare(ArrayList<T> a, ArrayList<T> b) {
//	            int an = a.size();
//	            int bn = b.size();
//	            for (int i = 0; i < Math.min(an, bn); i++) {
//	                int cmp = Integer.compare(a.get(i), b.get(i));
//	                if (cmp != 0)
//	                    return cmp;
//	            }
//	            return Integer.compare(a.size(), b.size());
//	        }
//	    });
		
		return result;
	}
	
	public <T> void writeCombinations(ArrayList<T> input, ArrayList<ArrayList<T>> result, int start, ArrayList<T> temp){
		if(start == input.size()){
			result.add(new ArrayList<T>(temp));
			return;
		}
		
		writeCombinations(input, result, start+1, temp);
		temp.add(input.get(start));
		writeCombinations(input, result, start+1, temp);
		temp.remove(temp.size() - 1);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> input = new ArrayList<>();
		ArrayList<String> stringInput = new ArrayList<>();
		stringInput.add("a");stringInput.add("a"); stringInput.add("c");
<<<<<<< HEAD
		for(int i = 1; i < 4; i++)
			input.add(i);
		Combinations test = new Combinations();
		for(ArrayList<Integer> list: test.getCombinations(input))
			System.out.println(list);
//		for(ArrayList<String> list: test.getCombinations(stringInput))
//			System.out.println(list);
=======
		for(int i = 1; i < 5; i++)
			input.add(i);
		Combinations test = new Combinations();
//		for(ArrayList<Integer> list: test.getCombinations(input))
//			System.out.println(list);
		for(ArrayList<String> list: test.getCombinations(stringInput))
			System.out.println(list);
>>>>>>> 1a488dda4e60c597a8ed368c8ab560aa87173cef
		
	}

}
