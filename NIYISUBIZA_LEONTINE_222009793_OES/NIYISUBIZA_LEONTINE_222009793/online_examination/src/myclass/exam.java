package myclass;

public class exam {
	private int id;
	private char name;
	private char course;
	private char startime;
	private char endtime;
	private char title;
	public exam(int id, char name, char course, char startime, char endtime, char title) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.startime = startime;
		this.endtime = endtime;
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getName() {
		return name;
	}
	public void setName(char name) {
		this.name = name;
	}
	public char getCourse() {
		return course;
	}
	public void setCourse(char course) {
		this.course = course;
	}
	public char getStartime() {
		return startime;
	}
	public void setStartime(char startime) {
		this.startime = startime;
	}
	public char getEndtime() {
		return endtime;
	}
	public void setEndtime(char endtime) {
		this.endtime = endtime;
	}
	public char getTitle() {
		return title;
	}
	public void setTitle(char title) {
		this.title = title;
	}

	
	}


