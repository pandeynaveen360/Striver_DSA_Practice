package Inheritance_concept;

public class User {

    private String username;

    private String email;

    public User(String username, String email){
        this.username = username;
        this.email = email;

    }

    public void Login(){
        System.out.println(username + " logged in");
    }

    public void showDashboard(){
        System.out.println(username + "s dashboard");
    }
}
