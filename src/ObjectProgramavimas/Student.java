package ObjectProgramavimas;

public class Student {
	private String name = "";
	private String lastName = "";
	private String classs = "";
	private int[] grade = null;
	private int[] attendance = null;
	

	public Student () {
		grade = new int[0];
		attendance = new int[0];
	}
	public Student(String name, String lastName, String classs, int[] newGrade, int[] newAttendance) {
		this.name = name;
		this.lastName =lastName;
		
	}
}
