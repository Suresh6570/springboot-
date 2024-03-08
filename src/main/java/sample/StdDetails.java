package sample;

public class StdDetails {
	 private String name;
	 private int age;
	 private long phoneNo;
	 private float weight;
	 private int height;
	public StdDetails(String name, int age, long phoneNo, float weight, int height) {
		super();
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.weight = weight;
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
		 
	
	
}