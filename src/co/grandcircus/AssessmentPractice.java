package co.grandcircus; //companies website backwards, common package naming scheme for the sake of not causing magic problems on the internet

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class AssessmentPractice {

	public static void main(String[] args) {
	

	}



	public static Map<Integer, String> espanol() {
		
		Map<Integer,String> map = new HashMap<>();
		
		map.put(1, "Uno");
		map.put(2, "Dos");
		map.put(3, "Tres");
		
		return map;
	}
	
	public static int lift(List list) {  //must be a simpler way
		
		List<String> list2 = new ArrayList<>();
		String u = "";
		
		for (int i=0; i < list.size(); i++) {
			u = (String) list.get(i);
			u = u.toUpperCase();
			list.remove(i);
			list.add(i, u);
		}
		return list.size();
	}
	
	public static boolean takeItAway(Map<String, String> map, String key) {
		
		boolean itsThere = map.containsKey(key);

		map.remove(key);
		
		return itsThere;
		
	}
	
	public static Set listToSet (List<String> list) {
		
		Set<String> set = new TreeSet<>();
		
		for (int i = 0; i < list.size(); i ++)
			set.add(list.get(i));
		
		return set;
	}
	
	public static int howFarApart (List list, String first, String second) {
		int howFarApart = 0;
		int firstLocation;
		int secondLocation;
		
		
		firstLocation = list.indexOf(first);
		secondLocation = list.indexOf(second);
		
		if ((firstLocation < 0) || (secondLocation <0)) {
			throw new IllegalArgumentException();
		}
		
		howFarApart = (secondLocation-firstLocation);

		
		return howFarApart;
	}
	
	public static Double makeADifference (double[] arr, int a, int b) {
		
		if ((a >= arr.length) || (b >= arr.length)) {
			return 0.0;
		} else if ((a < 0) || (b < 0)) {
			return 0.0;
		}
		
		double c = (arr[a] - arr[b]);
				
		return c;
	}



	public static Set<Integer> neverTellMeTheOdds(int[] nums) {
		
		Set<Integer> nums2 = new TreeSet<>();
		
		for(int i = 0; i < nums.length; i++) {
			if ((nums[i]%2) == 0 ) {
				nums2.add(nums[i]);
			}
		} return nums2;
	}



	public static int fleeZero(int[] nums) {
		int counter = 0;
		
		for (int i = 0 ; i < nums.length; i++) {
			if (nums[i] > 0) {
				nums[i] = (nums[i] + 1);
				counter++;
			} else if (nums[i] < 0) {
				nums[i] = (nums[i] -1);
			}
		} return counter;
	} 
	
	
	
	

}
