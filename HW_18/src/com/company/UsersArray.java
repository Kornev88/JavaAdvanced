package com.company;

public class UsersArray {

    public static boolean findSameUsers(User[] users) {
        for (int i = 1; i < users.length-1; i++) {
                if (users[i].equals(users[i+1])) {
                    return true;
                }
            }
        return false;
    }

    public static int findUser(User user, User[] users){
        int userInd = 0;
        for(int i = 1; i<users.length; i++){
            if(users[i].equals(user)){
                userInd = i;
            }
        }
        return userInd;
    }

}