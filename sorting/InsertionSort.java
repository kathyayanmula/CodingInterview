package sorting;

import java.util.ArrayList;

/**
 * Created by mkg on 24/04/16.
 */
public class InsertionSort {

    public void sort(ArrayList<Integer> a){
        int j = 0;
        for (int i = 1; i < a.size();i++){
            int tmp = a.get(i);
            j = i - 1;
            while( j >= 0 && a.get(j) > tmp){
                a.set(j+1,a.get(j));
                j--;
            }
            a.set(j+1,tmp);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        InsertionSort test = new InsertionSort();

        ArrayList<Integer> input = new ArrayList<Integer>();
        for(int i =7; i > 0; i--){
            input.add(i);
        }
        System.out.println(input);
        test.sort(input);
        System.out.println(input);
    }

}

