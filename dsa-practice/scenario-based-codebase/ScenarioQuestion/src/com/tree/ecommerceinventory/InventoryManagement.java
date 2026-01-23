package com.tree.ecommerceinventory;

public class InventoryManagement {
	Product root;
	
	//add product
	public void addProduct(String name, String skuNumber, double price) {
		Product newProduct = new Product(name,skuNumber,price);
		root = insert(root,newProduct);
	}
	
	private Product insert(Product root, Product newProduct) {
		if(root==null) {
			root = newProduct;
			System.out.println("Added Product.");
			return root;
		}
		if(root.getSkuNumber().compareToIgnoreCase(newProduct.getSkuNumber())>0) {
			root.setLeft(insert(root.getLeft(),newProduct));
		}
		else if(newProduct.getSkuNumber().compareToIgnoreCase(root.getSkuNumber())>0) {
			root.setRight(insert(root.getRight(),newProduct));
		}
		return root;
	}
	
	//view all product
	public void viewAllProducts() {
		Product temp = root;
		view(temp);
	}
	private void view(Product curr) {
		if(curr==null) {
			return;
		}
		view(curr.getLeft());
		System.out.println(curr.toString());
		view(curr.getRight());
	}
	
	//update price
	public void updatePrice(String skuNumber, double price) {
		Product temp = root;
		update(temp,skuNumber,price);
	}
	private void update(Product curr, String skuNumber, double price) {
		if(curr==null) {
			return;
		}
		if(curr.getSkuNumber().equalsIgnoreCase(skuNumber)) {
			curr.setPrice(price);
		}
		update(curr.getLeft(),skuNumber,price);
		update(curr.getRight(),skuNumber,price);
	}
}
