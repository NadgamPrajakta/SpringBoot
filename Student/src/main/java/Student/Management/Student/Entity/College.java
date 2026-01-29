package Student.Management.Student.Entity;

public class College {
	
	String CollegeName;
	String university;
	String code;
	
	public College(String collegeName, String university, String code) {
		
		super();
		CollegeName = collegeName;
		this.university = university;
		this.code = code;
	}

	public String getCollegeName() {
		return CollegeName;
	}

	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}	

}
