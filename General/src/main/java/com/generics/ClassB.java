package com.generics;

import com.model.CollegeSDO_2;
import com.model.StudentSDO_2;

public class ClassB extends ClassC<StudentSDO_2, CollegeSDO_2> {

	public static void main(String[] args) {
		StudentSDO_2 studentSDO_2 = new StudentSDO_2();
		CollegeSDO_2 collegeSDO_2=new CollegeSDO_2(1,"sss",6);
				
		studentSDO_2.setName("student1!!");
		System.out.println("from stud 1:" + "\t" + studentSDO_2.getName());
	}

}
