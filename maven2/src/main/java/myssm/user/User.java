package myssm.user;

public class User {
private String name;
private int id;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "User [name=" + name + ", id=" + id + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
}
