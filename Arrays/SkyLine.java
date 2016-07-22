package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import recursion.Combinations;

public class SkyLine {
	
	public ArrayList<ArrayList<Integer>> getSkyLine(ArrayList<Building> buildings){
		List<ArrayList<Integer>> result = new ArrayList<>();
		List<ArrayList<Integer>> heights = new ArrayList<>();
		
		for(Building building: buildings){
			heights.add(new ArrayList<Integer>(){{add(building.left); add(-building.right);}});
			heights.add(new ArrayList<Integer>(){{add(building.height); add(building.right);}});
		}
		
		Collections.sort(heights, new Comparator<ArrayList<Integer>>(){
			public int compare(ArrayList<Integer> l1, ArrayList<Integer> l2){
				if(l1.get(0) != l2.get(0))
					return l1.get(0) - l2.get(0);
				return l1.get(1) - l2.get(1);
		}});
		
		
		
		return result;	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Building> buildings = new ArrayList<>();
		buildings.add(new Building(1,11,5));buildings.add(new Building(2,6,7));buildings.add(new Building(3,13,9));buildings.add(new Building(12,7,16));
		buildings.add(new Building(14,3,25));buildings.add(new Building(19,18,22));buildings.add(new Building(23,13,29));buildings.add(new Building(24,4,28));
		
		SkyLine test = new SkyLine();
		

	}

}

class Building{
	int left;
	int height;
	int right;
	
	public Building(int left, int height, int right){
		this.left = left;
		this.height = height;
		this.right = right;
	}
}

class SkyLineHeight{
	int left;
	int height;
	
	public SkyLineHeight(int left, int height){
		this.left = left;
		this.height = height;
	}
}