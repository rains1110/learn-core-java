package flowcontrol;

import java.util.ArrayList;
import java.util.List;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
User user1=new User(1,"user1","city1");
User user2=new User(2,"user2","city2");
User user3=new User(3,"user3","city3");
User user4=new User(4,"user4","city4");
User user5 = new User();
user5.setId(0);
user5.setName("user5");
user5.setCity("jammu");


List<User>list=new ArrayList<User>();
list.add(user1);
list.add(user2);
list.add(user3);
list.add(user4);
System.out.println(list);
for(User user:list) {
	System.out.println(user);
}

	}

}
class User{
	private int id;
	private String name;
	private String city;
	public User() {}
	public User(int id, String name, String city) {
		
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
}