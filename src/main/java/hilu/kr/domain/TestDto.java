package hilu.kr.domain;

public class TestDto {
	private String 	name;
	private int		age;
	private float	tall;
	
	public void setName(String iName) {
		this.name = iName;
	}
	
	public void setAge(int iAge) {
		this.age = iAge;
	}
	
	public void setTall(float iTall) {
		this.tall = iTall;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public float getTall() {
		return this.tall;
	}
	
	public String toString() {
		String msg = "";
		msg += "|=======| " + this.name + "\n";
		msg += "| Name	| " + this.name + "\n";
		msg += "| Age	| " + this.age 	+ "\n";
		msg += "| Tall	| " + this.tall + "\n";
		msg += "|=======| " + this.name + "\n";
		return msg;
	}
}
