package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortObjListWithComparator {

	public static void main(String[] args) {
		
		List<Student> listStudent = new ArrayList<Student>();
		
		listStudent.add(new Student(90,1));
		listStudent.add(new Student(40,2));
		listStudent.add(new Student(85,3));
		listStudent.add(new Student(68,4));
		listStudent.add(new Student(95,5));
		
		
		Collections.sort(listStudent, (s1,s2)->
		{
			return s1.marks>s2.marks?1:s1.marks<s2.marks?-1:0;
		});
		
		
		for(Student eachStud : listStudent) {
			System.out.println(eachStud);
		}


	}

}

class Student {
	int marks;
	int rollNo;
	
	public Student(int marks, int rollNo) {
		this.marks = marks;
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student{Roll No = "+rollNo+" and Marks = "+marks+"}";
	}
	
	

}
