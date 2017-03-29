package message;

import java.util.Date;
import java.util.GregorianCalendar;

class Employee {
	private String name;
	private double salary;
	private Date hireDay;
	public Employee(String name,double salary,int year,int month,int day){
		this.name=name;
		this.salary=salary;
		GregorianCalendar calendar=new GregorianCalendar(year,month,day);
		hireDay=calendar.getTime();
	}
	public String getname(){
		return this.name;
	}
	public double getsalary(){
		return this.salary;
	}
	public Date gethireDay(){
		return this.hireDay;
	}
	public void raiseSalary(double byPercent){
		double raise=salary * byPercent /100;
		salary +=raise;
	}

}
