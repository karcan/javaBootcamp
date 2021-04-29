package homework;

import homework.model.Student;
import homework.service.StudentManager;

public class Main {

	public static void main(String[] args) {
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(new Student(1,"Ahmet","Mehmet","email","u","password"));
	}
}
