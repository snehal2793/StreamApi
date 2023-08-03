package stream;

public class Employee {
public  double salary;
 public String name;
 public int age;
 public String department;
 
public Employee(double salary, String name, int age, String department) {
	super();
	this.salary = salary;
	this.name = name;
	this.age = age;
	this.department = department;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
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
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public String toString() {
	return "Employee [salary=" + salary + ", name=" + name + ", age=" + age + ", department=" + department + "]";
}

 
}
