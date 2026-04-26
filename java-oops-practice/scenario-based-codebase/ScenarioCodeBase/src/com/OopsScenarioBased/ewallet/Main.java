package com.OopsScenarioBased.ewallet;

public class Main {

	public static void main(String[] args) {
		User alice = new User("allu", new PersonalWallet(500.0, 50.0)); 
        User shop = new User("ramu", new BusinessWallet(10000.0, 0.0));

        System.out.println("Alice Balance before: $" + alice.getWallet().getBalance());
        
        ((Transferrable) alice.getWallet()).transferTo(shop, 200.0);

        System.out.println("allu Balance after: $" + alice.getWallet().getBalance());
        System.out.println("ramu Balance: $" + shop.getWallet().getBalance());

        alice.getWallet().viewHistory();
	}
}
