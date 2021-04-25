package homework.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import homework.constants.Messages;
import homework.models.Lecture;

public class LectureService {
	
	private List<Lecture> _lectures = new ArrayList<Lecture>();
	
	public void add(Lecture course) {
		
		this._lectures.add(course);
		System.out.println(course.name + " " + Messages.Added);
	}
	
	public void add(Lecture[] lectures) {
		for (Lecture lecture : lectures) {
			this.add(lecture);
		}
	}
	
	public void update(Lecture course) {
		System.out.println(course.name + " " + Messages.Updated);
	}
	
	public void delete(Lecture course) {
		System.out.println(course.name + " " + Messages.Deleted);
	}
	
	public List<Lecture>  getAll() {
		return _lectures;
	}
	
	public List<Lecture>  getAllByCourseId(int courseId) {
		return _lectures.stream().filter(l -> l.courseId == courseId).collect(Collectors.toList());
	}
	
	public List<Lecture>  getAllById(int id) {
		return _lectures.stream().filter(l -> l.id == id).collect(Collectors.toList());
	}

}
