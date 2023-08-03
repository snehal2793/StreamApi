package stream;
import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;  

public class StreamPractice {

	
	List<Integer> stringList = Arrays.asList(1,12, 13, 15, 14, 12, 1);
	Long  count=stringList.stream().count();
	Integer max=stringList.stream().max(Comparator.comparingInt(Integer::valueOf)).get();
    
    
  Optional< Integer> max1=stringList.stream().max((i,j)->i.compareTo(j));
  
  Optional<Integer> min=stringList.stream().min((i,j)-> i.compareTo(j));
Integer min1=stringList.stream().min(Comparator.comparingInt(Integer::valueOf)).get();


List<Integer> distinctList=stringList.stream().
                            distinct().collect(Collectors.toList());

//stringList.stream().distinct().forEach(System.out::println);

    List<Entry<Integer, Long>> list=   stringList.stream().collect(Collectors.
    		groupingBy(Function.identity(),Collectors.counting()))
       .entrySet().stream().filter(i->i.getValue()>2).collect(Collectors.toList());
	

}
