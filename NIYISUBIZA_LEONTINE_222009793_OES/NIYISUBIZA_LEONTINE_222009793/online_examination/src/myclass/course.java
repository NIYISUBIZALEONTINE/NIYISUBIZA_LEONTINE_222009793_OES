package myclass;

public class course {
	private int id;
	private char name;
	private char teacher;
	public course(int id, char name, char teacher) {
		super();
		this.id = id;
		this.name = name;
		this.teacher = teacher;
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
	public char getTeacher() {
		return teacher;
	}
	public void setTeacher(char teacher) {
		this.teacher = teacher;
	}

	

}
