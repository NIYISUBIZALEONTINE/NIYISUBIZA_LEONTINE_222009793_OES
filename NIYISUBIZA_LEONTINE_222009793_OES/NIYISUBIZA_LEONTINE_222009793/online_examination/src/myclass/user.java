package myclass;

public class user {
	private int id;
	private char fname;
	private char lname;
	private char password;
	private char email;
	private char role;
	public user(int id, char fname, char lname, char password, char email, char role) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.password = password;
		this.email = email;
		this.role = role;
	
	}
	
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public char getFname() {
		return fname;
	}
	public void setFname(char fname) {
		this.fname = fname;
	}
	public char getLname() {
		return lname;
	}
	public void setLname(char lname) {
		this.lname = lname;
	}
	public char getPassword() {
		return password;
	}
	public void setPassword(char password) {
		this.password = password;
	}
	public char getEmail() {
		return email;
	}
	public void setEmail(char email) {
		this.email = email;
	}
	public char getRole() {
		return role;
	}
	public void setRole(char role) {
		this.role = role;
	}