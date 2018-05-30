package codingpractice;

public class RemoveJunk {

	public static void main(String[] args) {
		String sTemp = "%!@# Test *&) Junk !@# 123 &^%";
		
		sTemp = sTemp.replaceAll("[^a-zA-Z0-9\\s+]", "");
		System.out.println(sTemp);

	}

}
