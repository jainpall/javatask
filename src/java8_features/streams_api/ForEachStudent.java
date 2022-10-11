package java8_features.streams_api;

import java.util.Arrays;
import java.util.List;

class Learner{
	private int sid;
	private String sName;
	private String location;
	public Learner(int sid, String sName, String location) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.location = location;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
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
		return "id=" + sid + ", sName=" + sName + ", location=" + location;
	}
}

public class ForEachStudent {

	public static void main(String[] args) {
		List<Learner> learnerList = Arrays.asList(
				new Learner(123, "Bharathy", "Chennai"),
				new Learner(13, "Aswin", "Trichy"),
				new Learner(23, "Bala", "Mumbai"),
				new Learner(12, "Karthik", "Delhi"),
				new Learner(1123, "Ajay", "Trichy"),
				new Learner(1223, "Vikram", "Madurai")
				);
		
		learnerList.stream().map(l -> {
			if(l.getsName().length()<=5) {
				return l.getsName()+" Natwest";
			}
			return l.getsName();
		}).forEach(System.out::println);
	}

}



