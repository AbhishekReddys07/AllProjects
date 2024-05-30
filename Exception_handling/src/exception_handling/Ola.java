package exception_handling;

import java.util.Scanner;

public class Ola {
  static void ola(int p) throws passengerexception{
	  if(p<=4){
		  System.out.println("Your Ride is Booked");
	  }
	  else if(p==5){
		  System.out.println("Request the Cab Driver for a Ride");
	  }
	  
	  else{
		  throw new passengerexception("Your not Eligible for booking a Ride");
	  }
  }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of Passenger Travleing in a Cab");
		int num=sc.nextInt();
		sc.close();
		try{
		ola(num);
		}
		catch(passengerexception e){
			System.out.println(e.getmsg());
		}
	}
}
