package homework.service;

import java.util.ArrayList;
import java.util.List;

import homework.constant.Message;
import homework.constant.Validation;
import homework.model.Student;

public class StudentService {
	
	private List<Student> _students;
	
	public StudentService() { 
		this._students = new ArrayList<Student>();
	}
	
	public void add(Student student) {
		
		if(!this.checkNameLength(student)) {
			System.out.println("\"" + student.name + "\" " + Validation.nameLengthExceeded);
			return;
		}
		
		this._students.add(student);
		System.out.println(student.name + " " + Message.Added);
	}
	
	public void add(Student[] students) {
		for (Student student : students) {
			this.add(student);
		}
	}
	
	public void update(Student student) {
		
		if(!this.checkNameLength(student)) {
			System.out.println("\"" + student.name + "\" " + Validation.nameLengthExceeded);
			return;
		}
		
		int userIndex = this._students.indexOf(student);
		
		this._students.set(userIndex, student);
		System.out.println(student.name + " " + Message.Updated);
	}
	
	public void delete (Student student) {
		
		int userIndex = this._students.indexOf(student);
		
		this._students.remove(userIndex);
		System.out.println(student.name + " " + Message.Deleted);
	}
	
	public Student getById (int id) {
		
		return _students.stream().filter(u -> u.id == id).findFirst().get();
	}

	public List<Student> getAll(){
		
		return _students;
	}
	
	private boolean checkNameLength(Student user) {
		
		if(user.name.length() > 25) {
			return false;
		}
		
		return true;
	}
}
