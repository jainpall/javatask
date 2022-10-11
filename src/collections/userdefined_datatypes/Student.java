package collections.userdefined_datatypes;

import java.util.Objects;

public class Student {
	private Integer sid;
	private String sName;
	private String location;
	public Student(Integer sid, String sName , String location) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.location = location;
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(location, sName, sid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(location, other.location) && Objects.equals(sName, other.sName)
				&& Objects.equals(sid, other.sid);
	}
		
		@Override
		public String toString() {
			return "sid=" + sid + ", sName=" + sName + ", location=" + location;
	}
	
	

}
