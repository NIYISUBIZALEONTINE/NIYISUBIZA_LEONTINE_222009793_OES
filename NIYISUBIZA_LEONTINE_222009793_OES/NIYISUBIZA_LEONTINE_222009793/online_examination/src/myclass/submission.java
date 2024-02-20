package myclass;

public class submission {
	private int id;
	private char user;
	private char assigment;
	private char exam;
	private char submissiontime;
	private int score;
	public submission(int id, char user, char assigment, char exam, char submissiontime, int score) {
		super();
		this.id = id;
		this.user = user;
		this.assigment = assigment;
		this.exam = exam;
		this.submissiontime = submissiontime;
		this.score = score;
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
	public char getAssigment() {
		return assigment;
	}
	public void setAssigment(char assigment) {
		this.assigment = assigment;
	}
	public char getExam() {
		return exam;
	}
	public void setExam(char exam) {
		this.exam = exam;
	}
	public char getSubmissiontime() {
		return submissiontime;
	}
	public void setSubmissiontime(char submissiontime) {
		this.submissiontime = submissiontime;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	

	}


