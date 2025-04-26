package inventario;

public class Product {
	private int itemNumber; // unique value for identification
	private String name;  // name of the product
	private int qtdInStock; // quantity in stock
	private double price; // price of the product
	private boolean active = true; // status of the product
	// construct method
	public Product() {}

	public Product(int number, String name, int qtd, double price)
	{
		this.itemNumber = number;
		this.name = name;
		this.qtdInStock = qtd;
		this.price = price;
		
	}

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQtdInStock() {
		return qtdInStock;
	}

	public void setQtdInStock(int qtdInStock) {
		this.qtdInStock = qtdInStock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public double getInventoryValue()
	{
		return this.price * this.qtdInStock;
		
	}
	
	public String toString()
	{
		return "\nItem Number: " + this.itemNumber
				+ "\nNome: " + this.name
				+ "\nQuantidade do estoque: " + this.qtdInStock
				+ "\nPreço: " + this.price
				+ "\nValor do estoque: " + this.getInventoryValue()
				+ "\nStatus: " + (this.active? "Ativo" : "Descontinuado"); //Operador Ternário
		
	}
	
	
}
