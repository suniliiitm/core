package com.sp.solid;

 class AccountService {
	AccountRepository ar= new AccountRepository();
	NotificationService ns= new NotificationService();
	public void openAccount() {
		System.out.println("File internal details");
		
		ar.saveAccountDetails();
		ns.sendMsgService();
	}
	

}
class AccountRepository{
	public void saveAccountDetails() {
		System.out.println("save account details in db");
	}
}
class NotificationService{
	public void sendMsgService(){
		System.out.println("send msg on your phone");
	}
}
//Sigle Responsibility  Principle(A class should have one and only one reason to change)
class SolidPrinsiple{
	public static void main(String[] args) {
		AccountService as=new AccountService();
		as.openAccount();
	}
}