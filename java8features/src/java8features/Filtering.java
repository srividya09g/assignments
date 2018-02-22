package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.function.Predicate;

public class Filtering {
	public static void main(String[] args) {
		List<Integer> nums= new ArrayList<Integer>();	
		nums.add(2);
		nums.add(9);
		nums.add(10);
		nums.add(3);
		List<Integer> filtered = new ArrayList<Integer>();
		for(Integer i: nums){
			if(i%2==0){
				filtered.add(i);
			}
		}
		System.out.println(filtered);
		Predicate<Integer> even = (x) -> (x%2==0);
		List<Integer> filtered2 = nums.stream().filter(even).collect(Collectors.toList());
		System.out.println(filtered2);
	}

}
