package homework.model;

public class InstructorNotificationOption extends UserNotificationOption {
	
	public InstructorNotificationOption() {} 
	
	public InstructorNotificationOption(int id, boolean myCommentsReplied, boolean commentsWhereIComment, boolean informationAndPromotion, boolean commentsMyLectures) {
		super(id, myCommentsReplied, commentsWhereIComment, informationAndPromotion);
		this.setCommentsMyLectures(commentsMyLectures);
	}
	
	private boolean commentsMyLectures;

	public boolean isCommentsMyLectures() {
		return commentsMyLectures;
	}

	public void setCommentsMyLectures(boolean commentsMyLectures) {
		this.commentsMyLectures = commentsMyLectures;
	}
	
	
}
