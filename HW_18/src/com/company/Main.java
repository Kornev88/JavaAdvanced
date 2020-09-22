package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import static com.company.UsersArray.findSameUsers;
import static com.company.UsersArray.findUser;

public class Main {

    public static void main(String[] args) {
	// write your code here

        User[] userArray = new User[]{

                new User("Ira","Login1", "pass1"),
                new User("Galya","Login2", "pass2"),
                new User("Lena","Login3", "pass3"),
                new User("Masha","Login4", "pass4"),
                new User("Ira","Login1", "pass1"),
                new User("Ira","Login1", "pass1")};


                User user1 = new User("Galya","Login2","pass2");
                User user2 = new User("Lena","Login3","pass3");
                user1.helloUser("Login2","pass2",userArray);


        System.out.println("userArray has the same user: "+ findSameUsers(userArray));
        System.out.println("Index of user is: "+findUser(user1,userArray));
        System.out.println("Index of user is: " + findUser(user2,userArray));
    }


}
