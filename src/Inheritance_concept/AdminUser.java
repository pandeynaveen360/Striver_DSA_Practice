package Inheritance_concept;

public class AdminUser extends User{

    public AdminUser(String username, String email){
        super(username,email);
    }

    public void manageProduct(){
        System.out.println("Admin is managing products");
    }

    @Override
    public void showDashboard(){

        System.out.println("AdminUser personalised dashboard");

    }

    public static void main(String[] args) {
        AdminUser au = new AdminUser("pandeynaveen360", "naveenppandey8080@gmail.com");
        au.Login();
        au.showDashboard();
    }
}
