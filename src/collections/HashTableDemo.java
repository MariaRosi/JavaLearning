package collections;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Temp,String> ht = new Hashtable<>();
		
		ht.put(new Temp(5),"A");
		ht.put(new Temp(2),"B");
		ht.put(new Temp(6),"C");
		ht.put(new Temp(15),"D");
		ht.put(new Temp(13),"E");
		ht.put(new Temp(16),"F");

		System.out.println(ht);
	}

}

class Temp {

	int i;
	
	public Temp(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return i+"";
	}
	
	public int hashCode() {
		
		return i;
	}
	
	
	
}