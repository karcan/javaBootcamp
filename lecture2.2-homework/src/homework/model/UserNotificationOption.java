package homework.model;

public class UserNotificationOption {
	
	private int id;
	private boolean myCommentsReplied;
	private boolean commentsWhereIComment;
	private boolean informationAndPromotion;

	public UserNotificationOption() {} 
	
	public UserNotificationOption(int id, boolean myCommentsReplied, boolean commentsWhereIComment, boolean informationAndPromotion) {
		this.setId(id);
		this.setMyCommentsReplied(myCommentsReplied);
		this.setCommentsWhereIComment(commentsWhereIComment);
		this.setInformationAndPromotion(informationAndPromotion);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id; 
	}

	public boolean isMyCommentsReplied() {
		return myCommentsReplied;
	}

	public void setMyCommentsReplied(boolean myCommentsReplied) {
		this.myCommentsReplied = myCommentsReplied;
	}

	public boolean isCommentsWhereIComment() {
		return commentsWhereIComment;
	}

	public void setCommentsWhereIComment(boolean commentsWhereIComment) {
		this.commentsWhereIComment = commentsWhereIComment;
	}

	public boolean isInformationAndPromotion() {
		return informationAndPromotion;
	}

	public void setInformationAndPromotion(boolean informationAndPromotion) {
		this.informationAndPromotion = informationAndPromotion;
	}
	
	
}
