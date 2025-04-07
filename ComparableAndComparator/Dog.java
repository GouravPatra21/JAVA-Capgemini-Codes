package ComparableAndComparator;
import java.util.Arrays;
public class Dog implements Comparable{
	String name;
	String breed;
	int age;
	public Dog(String name,String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	public String toString() {
		return name +" "+ breed +" "+ age;
	}
	public int compareTo(Object o) {
		Dog d = (Dog)o;
		if(this.name.compareTo(d.name) != 0) {
		return this.name.compareTo(d.name);
		}
		if((this.age - d.age) != 0) {
			return this.age-d.age;
		}
		return 0;
	}
//	public static void compareBasedOnBreed(Dog d1, Dog d2) {
//		CompareByBreed cbreed = new CompareByBreed();
//		if(cbreed.compare(d2, d1) > 0) {
//			
//		}
//		
//	}
	public static void main(String[] args) {
		Dog[] arr = new Dog[3];
		Dog d1 = new Dog("Anirban","Kestopur r labrador", 14);
		Dog d2 = new Dog("Koustav","Krishnanagar r german shepherd", 12);
		Dog d3 = new Dog("Debayan","NewTown r Alsichian", 13);
		arr[0] = d1;
		arr[1] = d2;
		arr[2] = d3;
		CompareByBreed cbreed = new CompareByBreed();
		Arrays.sort(arr, cbreed);
		for (Dog d: arr) {
			System.out.println(d);
		}
		
	}

}
