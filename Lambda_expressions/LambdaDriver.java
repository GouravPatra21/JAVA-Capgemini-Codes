package Lambda_expressions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class LambdaDriver {
	public static void main(String[] args) {
		LambdaDemo l1 = () -> System.out.println("Hello");
		l1.print();
		Demo d1 = () -> System.out.println("Hello");
		d1.print();
		Demo2 d2 = () -> System.out.println("Hello");
		d2.greet();
		Demo3 d3 = (x,y) -> {
			if(x>y) {
				return x;
			}
			else {
				return y;
			}
		};
		System.out.println(d3.check(10, 20));
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		System.out.println(list);
		Comparator<Integer> comparator = (o1,o2) -> o2-o1;
		Collections.sort(list,comparator);
		System.out.println(list);
	}

}
