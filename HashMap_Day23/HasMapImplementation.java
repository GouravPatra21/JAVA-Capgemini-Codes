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
	public static void main(String[] args) {
		HasMapImplementation map = new HasMapImplementation();
		map.put(10, 1);
		map.put(20, 5);
	}

}
