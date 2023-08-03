package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {

	public static void main(String args[])
	{
		List<Integer> arraylist=Arrays.asList(5,2,8,9,1,6);
		
	List<Integer> sortedList =	arraylist.stream().sorted().collect(Collectors.toList());
	List<Integer> revrseSortedList =	arraylist.stream().sorted(Comparator.reverseOrder())
			.collect(Collectors.toList());
	
	List<Integer> naturalSortedList =	arraylist.stream().sorted(Comparator.naturalOrder())
			                            .collect(Collectors.toList());

	}
}
