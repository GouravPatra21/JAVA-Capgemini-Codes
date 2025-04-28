package HashMap_Day23;

public class HasMapImplementation {
	int size = 16;
	Entry[] buckets = new Entry[16];
	
	private int getBucketIndex(int key) {
		return Math.abs(Integer.hashCode(key))%size;
	}
	public void put(int key, int value) {
		Entry node = new Entry(key, value);
		int index = getBucketIndex(key);
		System.out.println("The entry is added at index: " +index);
		Entry current = buckets[index];
		
		while (current != null) {
			if(current.key == key) {
				current.value = value;
				return;
			}
			current = current.next;
		}
		node.next = buckets[index];
		buckets[index] = node;
	}
	public int getValue(int key) {
		int index = getBucketIndex(key);
		Entry current = buckets[index];
		while (current != null) {
			if(current.key == key) {
				return current.value;
			}
			current = current.next;
		}
		throw new RuntimeException("Key" + key + " nit found");
	}
	public void delete(int key) {
		int index = getBucketIndex(key);
		Entry current = buckets[index];
		Entry prev = null;
		while (current != null) {
			if (current.key == key) {
				if (prev == null) {
					prev = current;
					buckets[index] = current.next;
					prev.next = null;
				}
				else {
					prev.next = current.next;
				}
				System.out.println("key " + key + " deleted");
				return;
			}
			prev = current;
			current = current.next;
		}
		
	}
	public void display() {
		for(int i = 0; i < size; i++) {
			Entry current = buckets[i];
			if(current != null ) {
				System.out.println("Buckets " + i + ":");
				while(current != null) {
					System.out.println(current.key + " => " + current.value);
					current = current.next;
				}
				System.out.println();
			}
		}
	}
	public static void main(String[] args) {
		HasMapImplementation map = new HasMapImplementation();
		map.put(10, 1);
		map.put(20, 5);
		map.put(30, 8);
		map.put(40, 9);
		map.display();
		System.out.println(map.getValue(20));
		map.delete(10);
		map.display();
	}

}
