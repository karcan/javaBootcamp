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
}
