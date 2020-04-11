package entities;

public class OrderItem_ex1 {
	
	private Integer quantity;
	private Double price;
	
	private Product_ex1 product;
	
	public OrderItem_ex1() {
	}
		
	public OrderItem_ex1(Integer quantity, Double price, Product_ex1 product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product_ex1 getProduct() {
		return product;
	}

	public void setProduct(Product_ex1 product) {
		this.product = product;
	}

	public double subTotal() {
		return price * quantity; 
	}
	
	public String toString() {
		return product.getName()
		     + ", $"
		     + String.format("%.2f", price)
		     + ", Quantity: "
		     + quantity
		     + ", Subtotal: $"
		     + String.format("%.2f", subTotal());
	}
}
