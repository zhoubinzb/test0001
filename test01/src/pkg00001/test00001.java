package pkg00001;

import java.math.BigDecimal;



class User {
	

	private Long id;
	private String code;
    private String name;

    public User() {
    }
    
    public User(Long id, String code, String name) {
    	
    	this.id = id;
    	this.name = name;
    	this.code = code;
    }

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}
}

public class test00001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User u1 = new User();
		System.out.println("class name=" + u1.getClass().toString());
		
		BigDecimal aa = new BigDecimal(1000);
		BigDecimal bb = new BigDecimal(600);
		
		
		BigDecimal nn = (aa.negate().add(bb).compareTo(new BigDecimal(0))==1?aa:bb);
		
		System.out.println("aa=" + aa);
		System.out.println("aa.negate=" + aa.negate());
		System.out.println("bb=" + bb);
		System.out.println("nn=" + nn);
		
		for(int i=1;i<=10;i++){
			if(i==6){
				continue;
			}
			else {
				System.out.println("i=" + i);
			}
		}
		System.out.println("dev1 edit test");

	}

}
