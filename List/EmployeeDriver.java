package List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
public class EmployeeDriver {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList();
		employees.add(new Employee(10, "Rohit"));
		employees.add(new Employee(2, "Naveen"));
		employees.add(new Employee(3, "Danish"));
		System.out.println(employees);
		for(Employee e: employees) {
			System.out.println(e);
		}
		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(50);
		al.add(30);
		al.add(20);
		al.add(90);
		//ConcurrentModificationException is created for manipulating over the iterating arrayList
		//So break is used to avoid this exception after manipulating the arrayList
//		for(int i : al) { 
//			if(i == 30) {
//				Integer x = i;
//				al.remove(x);
//				break;//In Collections for each loop should not be used for any kind of modifications It should be used only for accessing If you are using you should use break statement in the loop to modify such as add or delete elements
//			}
//			
//		}
		
		//we will get an error if not we declare it as
        //integer type lest it wilkl be stored as integer object
     //to remove concurrent modification exception., when cannot remove an element pr modify it fromn an arraylist 
	//and even if we want to modify 
	//it we will have to use with a break in the loop to acccess modify or remove using a for or anyother type of looop
	//concurrentmodifiaction is created for manipulation the arraylist
	//break is used to avoid is after manipulating the arraylist we are no more iterating over the collection
	//it is advisory to use iterator interface
  //a1 had an object of primitive type yet its converted into no primitive type, 
    //and it is unboxed back tp primitive tyupe for each is used to access the elements and not remove it
		
		// Iterator 
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			int x = itr.next();
			if(x == 30) {
				itr.remove();
			}
		}
		
		System.out.println(al);
		System.out.println("------------------------------------");
		//Sorting based on Id using Comparable
		Collections.sort(employees);
		System.out.println(employees);
		System.out.println("-------------------------------------");
		//Sorting based on Name using Comparator
		CompareByName comparatorObject = new CompareByName();
		Collections.sort(employees, comparatorObject);
		System.out.println(employees);
		System.out.println("-----------------------------------------");
		
//		Iterator<Employee> iterator = employees.iterator();
//		while(iterator.hasNext()) {
//			Employee e = iterator.next();
//			if(e.name.equals("Naveen")) {
//				iterator.remove();
//			}
//		}
//		System.out.println(employees);
		
		System.out.println("---------------------------------------------");
		
		ArrayList<Integer> a2 = new ArrayList<>();
		// Cannot sort generic data type
		a2.add(10);
		a2.add(11);
		a2.add(8);
		a2.add(5);
		System.out.println(a2);
		Collections.sort(a2);
		
		System.out.println("---------------------------------------------");
		
		//ListIterator
		ListIterator list = al.listIterator();
		while(list.hasNext()) {
			System.out.println("Index:" + list.nextIndex() + "  " + "Element" + list.next());
		} //Since the pointer is already at lastindex so we are commenting it out 
		
		//resetting the cursor back to the previous position
		while(list.hasPrevious()) {
			list.previous();
		}
		
		System.out.println("-----------------------------------------------");
		while(list.hasNext()) {
			int index = list.nextIndex();
			if(index == 1) {
				list.add(60);
			}
			int element = (Integer)list.next();
			
			if(element == 50) {
				list.set(100);
			}
			System.out.println("Index:" + index + "  " + "Element" + element);
		}
		System.out.println(al);
		System.out.println("------------------------------------------------");
		
   }

}
