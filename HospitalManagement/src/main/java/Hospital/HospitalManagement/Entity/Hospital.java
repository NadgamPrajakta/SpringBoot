package Hospital.HospitalManagement.Entity;

public class Hospital {

    String hospitalName;
    String location;
    String regNo;

    public Hospital(String hospitalName, String location, String regNo) {
    	
        this.hospitalName = hospitalName;
        this.location = location;
        this.regNo = regNo;
    }

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

   
}
