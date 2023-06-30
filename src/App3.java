import java.util.ArrayList;
import java.util.Arrays;

public class App3 {

	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		list.add(new Employee(105,"Amit","Sales",56000));
		list.add(new Employee(102,"Rahul","Marketing",51000));
		list.add(new Employee(101,"Imran","Account",59000));
		list.add(new Employee(104,"Suman","HR",80000));
		list.add(new Employee(108,"Kapil","Sales",70000));
		list.add(new Employee(107,"Manoj","Sales",80000));
		list.add(new Employee(103,"Abhay","Marketing",71000));
		
		for(Employee emp :list)
		{
			if(emp.getDeprtment().equals("Sales"))
				System.out.println(emp);
		}
	}
}
		

