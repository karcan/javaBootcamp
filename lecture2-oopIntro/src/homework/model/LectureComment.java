package homework.model;

import java.util.Date;

public class LectureComment {
	
	public LectureComment() {} 
	
	public LectureComment(int id, int lectureId, int userId, Date date, Integer parentId) {
		this.setId(userId);
		this.setLectureId(lectureId);
		this.setUserId(userId);
		this.setDate(date);
		this.setParentId(parentId);
	}

	public int id;
	public int lectureId;
	public int userId;
	public Date date;
	public Integer parentId;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLectureId() {
		return lectureId;
	}

	public void setLectureId(int lectureId) {
		this.lectureId = lectureId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	
	
	
}
