package com.question.fleetmanager;

public class Main {

public static void main(String[] args) {
		
	Vehicle[] vehicle = {new Vehicle("RX100",12000),new Vehicle("BMW",1400),new Vehicle("LAND ROVER",34100),new Vehicle("SUV",1000),new Vehicle("SUDAN",750000),new Vehicle("Belorow",14000)};
		
	
	Vehicle reslut[] = merge(vehicle,0,vehicle.length-1);
		
		//display
		for(Vehicle s : reslut) {
			System.out.println("\nTime: "+s.vehicleName);
			System.out.println("Amount: "+s.mileage);
		}
	}
	
	//merge
	public static Vehicle[] merge(Vehicle sale[], int l, int r) {
		if(l>=r) {
			return new Vehicle[] {sale[r]};
		}
		int mid = (l+r)/2;
		Vehicle left[] = merge(sale,l,mid);
		Vehicle right[] = merge(sale,mid+1,r);
		
		return mergeSort(left,right);
	}
	
	//merge array
	public static Vehicle[] mergeSort(Vehicle left[], Vehicle right[]) {
		int n1 = left.length;
		int n2 = right.length;
		
		Vehicle result[] = new Vehicle[n1+n2];

		int i=0,j=0,k=0;
		
		while(i<n1 && j<n2) {
			if(left[i].mileage<=right[j].mileage) {
				result[k++] = left[i++];
			}else {
				result[k++] = right[j++];
			}
		}
		
		while(i<n1) {
			result[k++] = left[i++];
		}
		
		while(j<n2) {
			result[k++] = right[j++];
		}
		return result;
	}
}
