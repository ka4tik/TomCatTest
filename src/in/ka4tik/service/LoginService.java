package in.ka4tik.service;

import in.ka4tik.model.User;

import java.util.HashMap;

public class LoginService {

    private HashMap<String,String> users  = new HashMap<String,String>();
    public LoginService(){
        users.put("johndoe","John Doe");
        users.put("janedoe","Jane Doe");
        users.put("ka4tik","Kartik Singal");

    }
    public boolean authenticate(String userId,String password){
        if(password == null || password.trim().equals("")){
            return false;
        }
        return true;
    }
    public User getUser(String userId){
        User user = new User();
        user.setUserName(users.get(userId));
        user.setUserId(userId);
        return user;
    }
}
