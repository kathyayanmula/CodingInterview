package sorting;

import java.util.ArrayList;

/**
 * Created by mkg on 23/04/16.
 */
public class QuickSorter {

    public void quickSort(ArrayList<Integer> a){
        quickSort(a,0,a.size()-1);
    }

    public void quickSort(ArrayList<Integer> a, int start, int end){
        if(start < end) {
            int pivotIndex = partition(a, start, end);
            System.out.println(pivotIndex);
            quickSort(a, start, pivotIndex - 1);
            quickSort(a, pivotIndex + 1, end);
        }
    }

    public int partition(ArrayList<Integer> a, int start, int end){
        int pivot = a.get(end);
        int i = start;
        for(int j = start; j <= end - 1; j++){
            if(a.get(j) <= pivot){
                int temp = a.get(j);
                a.set(j,a.get(i));
                a.set(i,temp);
                i++;
            }
        }
        //exchanging the last and ith element
        a.set(end,a.get(i));
        a.set(i,pivot);

        return i;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        QuickSorter test = new QuickSorter();

        ArrayList<Integer> input = new ArrayList<Integer>();
        for(int i =7; i > 0; i--){
            input.add(i);
        }
        System.out.println(input);
        test.quickSort(input);
        System.out.println(input);
    }

}
