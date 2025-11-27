package Inheritance_concept;

public class RegularUser extends User{

    public RegularUser(String username, String email){
        super(username,email);
    }

    public void browseProduct(){
        System.out.println("Customer is browsing products");

    }

    @Override
    public void showDashboard(){

        System.out.println("RegularUser personalised dashboard");

    }
}
