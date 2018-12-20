package com.retail.task;

public class BillImplementation 
{
	static Product product = new Product();
	//Here We will get the product type from the database basesd on mobile number, will call a rest service for that.
	static String productType=product.getProductType();
	public static void main(String[] args) 
	{
		User user = new User();
		String userType= user.getUserType();
		//Here We will get the userType from the database basesd on mobile number, will call a rest service for that.
		while (productType !="groceries") 
		{
			switch (userType) 
			{
			case "employee":
				double e_disInPercentage = 30;
				double e_productPrice = 265;
				double e_totalBillAfterDiscount = BillImplementation.getAmountAfterDiscount(e_disInPercentage,
						e_productPrice);
				System.out.println("Total bill of user after 30% discount is : " + e_totalBillAfterDiscount);
				System.out.println("Now user is eligible for $5 discount for each $100");
				int e_reminder= (int) (e_totalBillAfterDiscount%10);
				double e_netBillDiscount= 5 * e_reminder;
				double e_totalPayableBill = e_totalBillAfterDiscount - e_netBillDiscount;
				System.out.println("Total payable bill is : "+e_totalPayableBill);

			case "affiliate":
				double a_disInPercentage = 10;
				double a_productPrice = 310;
				double a_totalBillAfterDiscount = BillImplementation.getAmountAfterDiscount(a_disInPercentage,
						a_productPrice);
				System.out.println("Total bill of user after 10% discount is : " + a_totalBillAfterDiscount);
				System.out.println("Now user is eligible for $5 discount for each $100");
				int a_reminder= (int) (a_totalBillAfterDiscount%10);
				double a_netBillDiscount= 5 * a_reminder;
				double a_totalPayableBill = a_totalBillAfterDiscount - a_netBillDiscount;
				System.out.println("Total payable bill is : "+a_totalPayableBill);
				

			case "customerAboveTwoYear":
				double c_disInPercentage = 5;
				double c_productPrice = 310;
				double c_totalBillAfterDiscount = BillImplementation.getAmountAfterDiscount(c_disInPercentage,
						c_productPrice);
				System.out.println("Total bill of user after 5% discount is : " + c_totalBillAfterDiscount);
				System.out.println("Now user is eligible for $5 discount for each $100");
				int c_reminder= (int) (c_totalBillAfterDiscount%10);
				double c_netBillDiscount= 5 * c_reminder;
				double c_totalPayableBill = c_totalBillAfterDiscount - c_netBillDiscount;
				System.out.println("Total payable bill is : "+c_totalPayableBill);
			}
		}
	}
	public static double getAmountAfterDiscount(double  discount,double productPrice)
	{
		discount = (productPrice * discount)/100;
		double amount = 100-discount;
		System.out.println("amount after discount="+amount); 
		return amount;
	}
}
