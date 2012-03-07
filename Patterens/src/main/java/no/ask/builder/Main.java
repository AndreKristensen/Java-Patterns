package no.ask.builder;

public class Main {
	
	public static void main(String[] args) {
		Pizza pizza = new Pizza.Builder(10).bacon(true).pepperoni(true).build();
		
		System.out.println(pizza);
	}
}
