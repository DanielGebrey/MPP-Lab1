package Assi8.prob5;

import lesson7Solutions.Prob1.partB.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		list.forEach(new MyConsumer());	//(s -> System.out.println(s.toUpperCase())

	}
	
	static class MyConsumer implements Consumer<String> {
		public void accept(String s) {
			System.out.println(s.toUpperCase());
		}
	}
}

class EmployeeInfo{
	static enum sortedMethod {BYNAME,BYPRICE};
	boolean ignorCase = false;
	public void setIgnorCase(boolean b){
		ignorCase = b;
	}
	public void sort(List<Employee> emps,sortedMethod method){
		Collections.sort(emps,(x, y)->
		{
			if(method.equals(sortedMethod.BYNAME)){
				return x.getName().compareTo(y.getName());
			}
			else
				return Double.compare(x.getSalary(), y.getSalary());
		});
	}
}
