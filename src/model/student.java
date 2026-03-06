package model;

public class student {
	private long stID;
	private String name;
	private String surname;
	public static long counter=1;
	
	public String getName() {
		return name;
	}
	public long getstId() {
		return stID;
		
	}
	public String getSurname() {
		return surname;
	}
	public void setName(String intputName) {
		if(intputName.matches("[A-Z]{1}[a-z]{2,40}")) {
			name=intputName;
		}
		else {
			name="test name";
		}
	}
	public void setSurname(String intputSurname) {
		if(intputSurname.matches("[A-Z]{1}[a-z]{2,40}")) {
			surname=intputSurname;
		}
		else {
			surname="test name";
		}
	}
	public void setstID() {
		stID=counter;
		counter= counter+1;
	}
	
	public student() {
		setName("Talivaldis");
		setSurname("Karklins");
		setstID();
	}
	public student (String intputName, String intputSurname) {
		setName(intputName);
		setSurname(intputSurname);
		setstID();
	}
	public String toString() {
		String result = stID+"."+" "+name+ " " + surname+ " ";
		return result;
	}
}
