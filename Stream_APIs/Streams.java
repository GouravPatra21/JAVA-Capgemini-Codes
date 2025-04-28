package Stream_APIs;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Optional;


public class Streams {
	public static void main(String[] args) {
//		ArrayList<Integer> ar = new ArrayList<>();
//		ar.add(10);
//		ar.add(25);
//		ar.add(13);
		List<Integer> list = Arrays.asList(2,3,1,2,5,8,7,4,3,1);
		new ArrayList();
		System.out.println(list);
		
//		Stream s = list.stream();
//		Stream s2 = s.distinct();
//		s2.forEach(n -> System.out.println(n));
		
		list.stream().distinct().forEach(n -> System.out.print(n));
		System.out.println();
		Integer x = null;
		Optional<Integer> o = Optional.ofNullable(x);
		System.out.print(o.isPresent());
		
		//min
		Optional<Integer> optional = list.stream().distinct().min((o1,o2) -> o1-o2);
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}
		
		//max
		Integer i = list.stream().max((o1,o2) -> o1-o2).get();
		System.out.println(i);
		
		System.out.println("------------------------------------------------");
		//sorted()
		list.stream().sorted().forEach(n -> System.out.print(n + " "));
		//sorted(Comparator)
		list.stream().sorted((o1,o2) -> o1 - o2).forEach(n -> System.out.print(n + " "));
		//map(function)
		System.out.println();
		list.stream().distinct().sorted().map(n -> n*n).forEach(n -> System.out.print(n + " "));
		
		//filter predicate
		System.out.println();
		list.stream().distinct().filter(n -> n%2 == 0).forEach(n -> System.out.print(n + " "));
		//toList()
		System.out.println();
		List<Integer> li = list.stream().distinct().filter(n -> n%2 == 0).toList();
		System.out.println(li);
		System.out.println("-----------------------");
		
		Stream s = Stream.of(1,4,7,3,"Demo",98.6);
		s.forEach(n -> System.out.print(n));
		System.out.println(5);
		System.out.println("-----------------------");
		//find first
		Optional<Integer> op = list.stream().findFirst();
		System.out.println(op.get());
		
		//find any()
		System.out.println(list.stream().findAny().get());
		
		//count()
		System.out.println(list.stream().count());
		//concat(Stream,Stream)
		List<String> strings = Arrays.asList("Hello","Demo","Hi");
		List<Integer> num = Arrays.asList(1,2,3);
		
		Stream s1 = strings.stream();
		Stream s2 = num.stream();
		
		Stream.concat(s1, s2).forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		//allMatch(Predicate)
		System.out.println(list.stream().distinct().allMatch(n -> n%2 == 0));
		
		//anyMatch(Predicate)
		System.out.println(list.stream().distinct().anyMatch(n -> n%2 == 0));
		
	}
}
