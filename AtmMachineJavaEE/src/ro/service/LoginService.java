package ro.service;

import java.util.ArrayList;

public class LoginService {
	public static ArrayList<User> users = new ArrayList<User>();
	public static int count;
	
	public void initUsers(){
	User u = new User();
	u.setUserName("John");
	u.setPassword("1234");
	u.setEmailAddress("john@gmail.com");
	
	User u2 = new User();
	u2.setUserName("Jane");
	u2.setPassword("0000");
	u2.setEmailAddress("jane@yahoo.com");
	users.add(u);
	users.add(u2);
	
	}
	
	public boolean validate(String userName, String password, ArrayList<User> u) {

	boolean isFound = false;
		
		for (User client : u) {

			if ((userName.equalsIgnoreCase(client.getUserName())) && (password.equalsIgnoreCase(client.getPassword()))) {
				//System.out.println("V-ati autentificat cu succes: " + client.toString());
				isFound = true;
				
				break;
			}
			count++;
		}//end for
		if(!isFound)
		System.out.println("user not found!!");
	
	
		return isFound;
	}


	
}
