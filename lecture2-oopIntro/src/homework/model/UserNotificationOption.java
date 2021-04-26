package homework.model;

public class UserNotificationOption {

	public UserNotificationOption() {} 
	
	public UserNotificationOption(int id, boolean myCommentsReplied, boolean commentsWhereIComment, boolean informationAndPromotion) {
		this.id = id;
		this.myCommentsReplied = myCommentsReplied;
		this.commentsWhereIComment = commentsWhereIComment;
		this.informationAndPromotion = informationAndPromotion;
	}
	
	public int id;
	public boolean myCommentsReplied;
	public boolean commentsWhereIComment;
	public boolean informationAndPromotion;
	
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
