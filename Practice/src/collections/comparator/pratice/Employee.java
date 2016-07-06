package collections.comparator.pratice;

public class Employee {
	
	private String name;
	private Double sal;
	
	
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){
		return this.name + ""+ this.sal;
		
	}

}
