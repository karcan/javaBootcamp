package homework;

import java.util.Date;

import homework.model.Lecture;
import homework.model.Student;
import homework.model.User;
import homework.service.LectureService;
import homework.service.StudentService;

public class Main {

	public static void main(String[] args) {
		
		studentTest();
		System.out.println("");
		lectureTest();

		
	}
	
	private static void studentTest() {

		StudentService studentService = new StudentService();
		
		Student student1 = new Student(1,"Karcan","Özbal","karcanozbal@outlook.com.tr","karcan","deneme12345");
		Student student2 = new Student(2,"Ömer","Acar","acar.0mer@hotmail.com","omer","deneme12345");
		Student student3 = new Student(3,"Uğur","Yıldız","","ugur","deneme12345");
		Student student4 = new Student(4,"Pinar","Darıcı","","pinar","deneme12345");
		
		

		// single adding method. 
		studentService.add(student1);
		
		// multiple adding method.
		Student[] students = {student2,student3,student4};
		studentService.add(students);
		
		// business rule testing for student name length.
		System.out.println("");
		Student student5 = new Student(5,"Haşim Ahmet Abdulbaki Buğra Bahadır","Nebioğulları","","hasim","deneme12345");
		studentService.add(student5);
		
		// update student before get all list 
		student4.name = "Pınar";
		studentService.update(student4);
		
		// delete student before get all list
		studentService.delete(student3);

		
		// get all students list. 
		System.out.println("");
		System.out.println("|id|name|surname|");
		System.out.println("|---|---|---|");
		for (Student student : studentService.getAll()) {
			System.out.println("|" + student.id + "|" + student.name + "|" + student.surname + "|");
		} 
		
		// get student by id;
		System.out.println("Get student by id : " + studentService.getById(2).name);
	}
	
	private static void lectureTest() {
		LectureService lectureService = new LectureService();
		
		Lecture lecture1 = new Lecture(1,1,"Ders 1",new Date());
		Lecture lecture2 = new Lecture(2,1,"Ders 2",new Date());
		Lecture lecture3 = new Lecture(3,1,"Ders 3",new Date());
		Lecture lecture4 = new Lecture(4,1,"Ders 4",new Date());
		Lecture lecture5 = new Lecture(5,1,"Ders 5",new Date());
		
		// single adding method.
		lectureService.add(lecture1);
		
		// multiple adding method.
		Lecture[] lectures = {lecture2,lecture3,lecture4,lecture5};
		lectureService.add(lectures);
		
		// get all lecture list.
		System.out.println("");
		System.out.println("|id|courseId|name|date|");
		System.out.println("|---|---|---|---|");
		for (Lecture lecture : lectureService.getAll()) {
			System.out.println("|"+ lecture.id + "|" + lecture.courseId + "|" + lecture.name + "|" + lecture.date + "|");
		}
		
		// get lectures by id.
		Lecture lectureById = lectureService.getById(2);
		System.out.println("");
		System.out.println("|id|courseId|name|date|");
		System.out.println("|---|---|---|---|");
		System.out.println("|"+ lectureById.id + "|" + lectureById.courseId + "|" + lectureById.name + "|" + lectureById.date + "|");

		
		// get lectures by courseId.
		System.out.println("");
		System.out.println("|id|courseId|name|date|");
		System.out.println("|---|---|---|---|");
		for (Lecture lecture : lectureService.getAllByCourseId(1)) {
			System.out.println("|"+ lecture.id + "|" + lecture.courseId + "|" + lecture.name + "|" + lecture.date + "|");
		}
	}
}