import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//
public class Program28 {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "product1"));
		list.add(new Product(2, "product2"));

		List<Integer> list2 = list.stream().filter(i -> i.getProductId() != 2).map(i -> i.getProductId())
				.collect(Collectors.toList());
		//covert list to hashmap where productId = key and productName = value
		
		Map<Integer, String> hmap = list.stream().collect(Collectors.toMap(Product::getProductId, Product::getProductName));
		
		
		
		System.out.println(list2);

	}
}

class Product {
	int productId;
	String productName;

	public Product(int productId, String productName) {
		super();
		this.productId = productId;
		this.productName = productName;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

}
