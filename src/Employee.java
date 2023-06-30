
public class Employee {
	private int eid;
	private String name;
	private String deprtment;
	private int Salary;
	
	

	public Employee(int eid, String name, String deprtment, int salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.deprtment = deprtment;
		Salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDeprtment() {
		return deprtment;
	}

	public void setDeprtment(String deprtment) {
		this.deprtment = deprtment;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", deprtment=" + deprtment + ", Salary=" + Salary + "]";
	}

	
}
