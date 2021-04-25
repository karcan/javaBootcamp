package homework.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import homework.constants.Messages;
import homework.models.Instructor;

public class InstructorService {
	
	List<Instructor> _instructors;
	
	public InstructorService() {
		this._instructors = new ArrayList<Instructor>();
	}
	
	public void add(Instructor instructor) {
		
		this._instructors.add(instructor);
		System.out.println(instructor.name + " " + Messages.Added);
	}
	public void update(Instructor instructor) {
		
		int instructorIndex = this._instructors.indexOf(instructor);
		
		this._instructors.set(instructorIndex, instructor);
		System.out.println(instructor.name + " " + Messages.Updated);
	}
	public void delete(Instructor instructor) {
		
		int instructorIndex = this._instructors.indexOf(instructor);
		
		this._instructors.remove(instructorIndex);
		System.out.println(instructor.name + " " + Messages.Updated);
	}
	public List<Instructor> getAll() {
		return this._instructors;
	}
	public Instructor getById(int id) {
		return this._instructors.stream().filter(u -> u.id == id).findFirst().get();
	}
}
