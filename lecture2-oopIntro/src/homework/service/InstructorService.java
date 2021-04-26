package homework.service;

import java.util.ArrayList;
import java.util.List;

import homework.constant.Message;
import homework.model.Instructor;

public class InstructorService {
	
	private List<Instructor> _instructors;
	
	public InstructorService() { 
		this._instructors = new ArrayList<Instructor>();
	}
	
	public void add(Instructor instructor) {
		
		this._instructors.add(instructor);
		System.out.println(instructor.name + " " + Message.Added);
	}
	
	public void update(Instructor instructor) {
		
		int instructorIndex = this._instructors.indexOf(instructor);
		
		this._instructors.set(instructorIndex, instructor);
		System.out.println(instructor.name + " " + Message.Updated);
	}
	
	public void delete(Instructor instructor) {
		
		int instructorIndex = this._instructors.indexOf(instructor);
		
		this._instructors.remove(instructorIndex);
		System.out.println(instructor.name + " " + Message.Updated);
	}
	
	public Instructor getById(int id) {
		return this._instructors.stream().filter(u -> u.id == id).findFirst().get();
	}
	
	public List<Instructor> getAll() {
		return this._instructors;
	}
	
}
