package com.question.flashdealz;

public class Main {

	public static void main(String[] args) {
		Product[] products = {new Product("Shirt",10), new Product("Laptop",12), new Product("Laptop",12), new Product("Phone",20), new Product("Bag",5)};
		
		quickSort(products,0,products.length-1);
		
		//display
		for(Product p : products) {
			System.out.println("\nProduct Name: "+p.name);
			System.out.println("Product Discount: "+p.percentage);
		}
	}
	
	//quick sort
	public static void quickSort(Product product[], int start, int end) {
		if(start>=end) {
			return;
		}
		double pivot = product[end].percentage;
		int j = 0;
		int i = start-1;
		
		while(j<end) {
			if(product[j].percentage<=pivot) {
				i+=1;
				Product temp = product[i];
				product[i] = product[j];
				product[j] = temp;
			}
			j+=1;
		}
		i+=1;
		Product temp = product[i];
		product[i] = product[j];
		product[j] = temp;
		quickSort(product,i+1,end);
		quickSort(product,start,i-1);
	}
}