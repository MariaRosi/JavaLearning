package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortObjListWithComparable {

	public static void main(String[] args) {
		
		List<Laptop> listLaptop = new ArrayList<Laptop>();
		
		Laptop laptopObj1 = new Laptop(60000,"Dell",16);
		Laptop laptopObj2 = new Laptop(90000,"Apple",8);
		Laptop laptopObj3 = new Laptop(80000,"HP",12);
		
		listLaptop.add(laptopObj1);
		listLaptop.add(laptopObj2);
		listLaptop.add(laptopObj3);
		
		Collections.sort(listLaptop);

		for (Laptop eachLaptop : listLaptop) {
			System.out.println(eachLaptop);
		}

	}

}

class Laptop implements Comparable<Laptop>{
	
	int iPrice;
	String sBrand;
	int iRam;
	
	public Laptop(int iPrice, String sBrand, int iRam) {
		this.iPrice = iPrice;
		this.sBrand = sBrand;
		this.iRam = iRam;
	}

	public int getiPrice() {
		return iPrice;
	}

	public void setiPrice(int iPrice) {
		this.iPrice = iPrice;
	}

	public String getsBrand() {
		return sBrand;
	}

	public void setsBrand(String sBrand) {
		this.sBrand = sBrand;
	}

	public int getiRam() {
		return iRam;
	}

	public void setiRam(int iRam) {
		this.iRam = iRam;
	}

	@Override
	public String toString() {
		return "Laptop{Price = "+iPrice+" , Brand = "+sBrand+" and Ram = "+iRam+"}";
	}

	@Override
	public int compareTo(Laptop paramLaptop) {
		
		int iRet = 0;
		
		if(this.getiPrice() > paramLaptop.getiPrice()) {
			iRet = 1;
		} else if (this.getiPrice() < paramLaptop.getiPrice()) {
			iRet = -1;
		}
		return iRet;
	}
	
	
	
	
}
