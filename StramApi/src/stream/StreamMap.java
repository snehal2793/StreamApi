package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
	
	public static void main(String[] args) {
		
	List<Integer> stringList = Arrays.asList(1,12, 13, 15, 14, 12, 1);

	List<Integer> list=stringList.stream().map(i->i*2).collect(Collectors.toList());
	
	list.forEach(System.out::println);
	stringList.stream().mapToDouble(i->i+0.5).forEach(System.out::println);
	
	
	
	
	}
	
}
