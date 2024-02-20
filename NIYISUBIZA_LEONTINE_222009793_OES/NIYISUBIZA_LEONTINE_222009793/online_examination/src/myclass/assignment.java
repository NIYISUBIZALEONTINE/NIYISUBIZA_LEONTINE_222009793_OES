package myclass;

public class assignment {
	private int id;
	private char name;
	private char course;
	private char title;
	private char deadline;
	private int maximumscore;
	public assignment(int id, char name, char course, char title, char deadline, int maximumscore) {
		super();
		this.id = id;
		this.name = name;
		this.course = course;
		this.title = title;
		this.deadline = deadline;
		this.maximumscore = maximumscore;
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
	public char getTitle() {
		return title;
	}
	public void setTitle(char title) {
		this.title = title;
	}
	public char getDeadline() {
		return deadline;
	}
	public void setDeadline(char deadline) {
		this.deadline = deadline;
	}
	public int getMaximumscore() {
		return maximumscore;
	}
	public void setMaximumscore(int maximumscore) {
		this.maximumscore = maximumscore;
	}

	

}
