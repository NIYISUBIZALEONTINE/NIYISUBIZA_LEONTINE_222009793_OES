package myclass;

public class grade {
	private int id;
	private char user;
	private char assignment;
	private char exam;
	public grade(int id, char user, char assignment, char exam) {
		super();
		this.id = id;
		this.user = user;
		this.assignment = assignment;
		this.exam = exam;
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
	public char getAssignment() {
		return assignment;
	}
	public void setAssignment(char assignment) {
		this.assignment = assignment;
	}
	public char getExam() {
		return exam;
	}
	public void setExam(char exam) {
		this.exam = exam;
	}

	

	}


