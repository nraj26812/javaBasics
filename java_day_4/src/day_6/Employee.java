package day_6;

public class Employee {

private String name;
private int id;
static String companyName="TNS";
Employee(String name,int id){
	this.name=name;
	this.id=id;
}
@Override
public String toString() {
	return "Employee [name=" + name + ", id=" + id + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()+ ", toString()=" + super.toString() + "]";
}

}
