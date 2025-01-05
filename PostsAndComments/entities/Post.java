package entities;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
	private Instant moment;
	private String title;
	private String content;
	private Integer likes = 0;
	private List<Comment> comments = new ArrayList<>();
	private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
	
	public Post() {
	}

	public Post(Instant moment, String title, String content) {
		this.moment = moment;
		this.title = title;
		this.content = content;
	}

	public Instant getMoment() {
		return moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}
	
	public void addComment(String commentText) {
		Comment comment = new Comment(commentText);
		comments.add(comment);
	}
	
	public void addLike() {
		this.likes++;
	}
	
	public void showComments() {
		for(Comment c : this.comments) {
			System.out.println(c.getText());
		}
		
	}

	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(title + "\n");
		sb.append(likes + " likes - ");
		sb.append(fmt.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		
		for(Comment c : comments) {
			sb.append(c.getText());
		}
		
		return sb.toString();
	}
}
