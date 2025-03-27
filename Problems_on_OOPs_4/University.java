package Problems_on_OOPs_4;

public class University {
	private Person[] people;
	private int count;
	public University(int size) {
		this.people = new Person[size];
		this.count = 0;
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
			p.displayInfo();
			if(p instanceof Student) {
				((Student)p).studentGrade();
			} else if(p instanceof Professor) {
				((Professor)p).designation();
			}
			System.out.println();
			
		}
	}
	
	

}
