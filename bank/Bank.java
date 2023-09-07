// example of encapsulation -> wrapping related infos inside a package
// Data hiding can be obtained through encapsulation by using access modifiers
package bank;

class Account {
    public String name; // access anywhere both inside and outside the package
    protected String email; // access anywhere inside the same package. in case of outside the package, only be accessed in sub classes (derived/child classes)
    private String password; // only be accessed inside the class

    // getters and setters -> allows to access private parameters outside the class
    // getter
    public String getPass (){
        return this.password;
    }
    // setter
    public void setPass(String password){
        this.password = password;
    }
};

public class Bank {
    public String name;
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "a1";
        account1.email = "a@g.c";
        account1.setPass("pass");
        // System.out.println(account1.getPass());
    }
}
