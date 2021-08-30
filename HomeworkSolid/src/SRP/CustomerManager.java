package SRP;

public class CustomerManager {
	
public void transactionalOperation() {
		
	
		insert();
		update();
	}
	
	public void insert() {
		MyContext context = new MyContext();
		context.insert();
	}
	
	public void update() {
		MyContext context = new MyContext();
		context.update();
	}

}
