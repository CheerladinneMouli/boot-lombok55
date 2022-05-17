package ai.jobiak.lombok;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ai.jobiak.lombok.model.Customer;
import ai.jobiak.lombok.model.Product;

@SpringBootApplication
public class BootLombok55Application implements CommandLineRunner {

	public static void main(String[] args) 
	{
		SpringApplication.run(BootLombok55Application.class, args);
	}
	@Override
	public void run(String...args) throws Exception
	{
		
		Product p = Product.builder()
				.productId(101)
				.description("Coke")
				.price(25.00)
				.build();
		System.out.println(p);
		Customer c =new Customer();
		c.setCustId(1);
		c.setName("John Doe");
		c.setBalance(2000);
		
		System.out.println(c.getBalance());
		System.out.println(c.getName());
		System.out.println(c.getCustId());
		
		System.out.println(c);
		
		Customer c2 =new Customer(2,"Triveni",4000);		
		System.out.println(c2);
		boolean result = c.equals(c2);
		System.out.println(result);
		
		Customer c3 = new Customer(3,"Govindh",6000);
		System.out.println(c3);
		
		result = c3.equals(c2);
		System.out.println(result);
	}

}