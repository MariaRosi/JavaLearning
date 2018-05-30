package concurrent.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWArrayListRemoveNotSupported {

	public static void main(String[] args) {

		String sTempValue ;
		
		List<String> list = new CopyOnWriteArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		
		Iterator<String> itr = list.iterator();
		
		list.remove("D");//For normal AL ConcurrentModificationException //For COWAL no exception
		
		while(itr.hasNext()) {
			sTempValue = (String)itr.next();
			if("D".equals(sTempValue)) {
				itr.remove();//java.lang.UnsupportedOperationException //For normal AL no exception
			}
		}
		System.out.println(list);

	}

}
