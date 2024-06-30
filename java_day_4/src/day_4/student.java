package day_4;

public class student {
	private int sid;
	private String sname;
	private String city;
	public void setSid(int sid)
	{
		this.sid=sid;
	}
	

	public int getSid() {
		return sid;
	}


	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "student [sid=" + sid + ", sname=" + sname + ", city=" + city + "]";
	}
	
}