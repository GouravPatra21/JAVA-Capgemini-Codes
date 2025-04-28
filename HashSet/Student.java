package HashSet;

import java.util.Objects;

public class Student {
	String name;
	int id;
	
	Student(int id, String name) {
		this.name = name;
		this.id = id;
	}
	public String toString() {
		return this.id + " " + this.name;
	}
	public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student other = (Student) o;
        return this.id == other.id && Objects.equals(this.name, other.name);
    }
	public int hashCode() {
		return Objects.hash(id, name);
	}


}
