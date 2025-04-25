package jp.co.aforce.sample;

public class EmployeeOverride {
	class Employee{
		Integer numberId;	
	
	
	public Employee(Integer numberId) {
		this.numberId=numberId;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (obj instanceof Person) {
	        Person other = (Person) obj;
	        return this.numberId.equals(other.numberId) ;
	    }
	    return false;
	}

}
