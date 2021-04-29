package homework.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import homework.constant.Message;
import homework.dto.LectureDto;
import homework.model.Course;
import homework.model.Lecture;

public class LectureService {
	
	private List<Lecture> _lectures;
	private CourseService _courseService;
	
	public LectureService() { 
		this._lectures =  new ArrayList<Lecture>();
		this._courseService = new CourseService();
	}
	
	public void add(Lecture lecture) {
		
		this._lectures.add(lecture);
		System.out.println(lecture.getName() + " " + Message.Added);
	}
	
	public void add(Lecture[] lectures) {
		for (Lecture lecture : lectures) {
			this.add(lecture);
		}
	}
	
	public void update(Lecture lecture) {
		
		int lectureIndex = this._lectures.indexOf(lecture);
		
		this._lectures.set(lectureIndex, lecture);
		System.out.println(lecture.getName() + " " + Message.Updated);
	}
	
	public void delete(Lecture lecture) {
		
		int lectureIndex = this._lectures.indexOf(lecture);
		
		this._lectures.remove(lectureIndex);
		System.out.println(lecture.getName() + " " + Message.Deleted);
	}
	
	public List<LectureDto> getLectureDto() {
		return _lectures.stream().map(l -> {
			Course course = this._courseService.getById(l.getCourseId());		
			return new LectureDto(
					l.getId(), 
					course.getName(), 
					l.getName(), 
					l.getDate()
					);
		}).collect(Collectors.toList());
	}
	
	public Lecture getById(int id) {
		return _lectures.stream().filter(l -> l.getId() == id).findFirst().get();
	}
	
	public List<Lecture>  getAll() {
		return _lectures;
	}
	
	public List<Lecture>  getAllByCourseId(int courseId) {
		return _lectures.stream().filter(l -> l.getCourseId() == courseId).collect(Collectors.toList());
	}
	

}
