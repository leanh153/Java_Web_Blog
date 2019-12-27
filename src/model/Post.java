package model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "posts")
public class Post implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "title", length = 500)
	private String title;

	@Column(name = "topic", columnDefinition = "Text")
	private String topic;

	@Column(name = "content", columnDefinition = "Text")
	private String content;

	@Column(name = "author", length = 30)
	private String author;

	@Column(name = "isRelease")
	private boolean  isRelease;

	@Column(name = "postTime", insertable = false, updatable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date postTime;

	public Post() {
		super();
		this.id = -1;
		this.title = "";
		this.topic = "";
		this.content = "";
		this.isRelease = false;
	}

	public Post(long id, String title, String topic, String content, boolean isRelease) {
		super();
		this.id = id;
		this.title = title;
		this.topic = topic;
		this.content = content;
		this.isRelease = isRelease;
	}

	public Post(String title, String topic, String content, String author, boolean isRelease) {
		super();
		this.title = title;
		this.topic = topic;
		this.content = content;
		this.author = author;
		this.isRelease = isRelease;
	}

	public Post(long id) {
		// TODO Auto-generated constructor stub
		super();
		this.id=id;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean getIsRelease() {
		return isRelease;
	}

	public void setRelease(boolean isRelease) {
		this.isRelease = isRelease;
	}

	public Date getPostTime() {
		return postTime;
	}

	public void setPostTime(Date postTime) {
		this.postTime = postTime;
	}

}
