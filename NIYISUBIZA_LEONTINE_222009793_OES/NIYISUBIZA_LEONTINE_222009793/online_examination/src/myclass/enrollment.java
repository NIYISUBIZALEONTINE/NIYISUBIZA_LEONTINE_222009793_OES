package myclass;

public class enrollment {
	private int id;
	private char user;
	private char course;
	public enrollment(int id, char user, char course) {
		super();
		this.id = id;
		this.user = user;
		this.course = course;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getUser() {
		return user;
	}
	public void setUser(char user) {
		this.user = user;
	}
	public char getCourse() {
		return course;
	}
	public void setCourse(char course) {
		this.course = course;
	}

	

	}


