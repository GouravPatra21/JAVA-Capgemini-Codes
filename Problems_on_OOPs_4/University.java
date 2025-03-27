package Problems_on_OOPs_4;

public class University {
	private Person[] people;
	static int count;
	public University(int size) {
		this.people = new Person[size];
	}
	public void addPerson(Person p) {
		if(count < people.length) {
			people[count++] = p;
			System.out.println("Person added");
		}
	}
	public void showPeople() {
		for(int i = 0; i < count; i++) {
			Person p = people[i];
			System.out.println("Pesron's Displayed");
			
		}
	}
	
	

}
