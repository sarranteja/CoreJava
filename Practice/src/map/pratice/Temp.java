package map.pratice;

public class Temp {
	
	public String temp(){
		return "temp";
	}
	
	@Override
	public void finalize(){
		System.out.println("finalize method is called");
	}

}
