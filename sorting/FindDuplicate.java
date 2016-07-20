package sorting;

public class FindDuplicate {

	static int findDuplicateFromPermutation(int[] intArr) {
	    
//        int[] bitArray = new int[10];
//        for(int i = 0; i < intArray.length; i++){
//            if(bitArray[intArray[i]] > 0)
//                return intArray[i];
//            else
//                bitArray[intArray[i]] = 1;
//        }
//        return -1;
		//constant space complexity, linear time complexity 
		int temp = 0;
        int position = 0;
        for(int i = 0; i < intArr.length; i++){
            while(intArr[i] != i+1){
                temp = intArr[i];
                position = temp - 1;
                if(intArr[i] == intArr[position])
                    return temp;
                intArr[i] = intArr[position];
                intArr[position] = temp;
            }
        }
        return -1;

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
