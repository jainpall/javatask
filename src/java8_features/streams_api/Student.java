package java8_features.streams_api;

public class Student {
	private Integer sid;
	private String sName;
	private String location;
	public Student(Integer sid, String sName, String location) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.location = location;
	}
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "sid=" + sid + ", sName=" + sName + ", location=" + location + "\n";
	}
}

