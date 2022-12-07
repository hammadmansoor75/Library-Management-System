public class User {
    private String username;
    private String password;

    User(){

    }

    public boolean registerUser(String username, String password, String confirmPassword){
        if(password.equals(confirmPassword)){
            this.username = username;
            this.password = password;
            System.out.println("Congratulations! You are Registerd Succesfully.");
            return true;
        }
        else{
            System.out.println("Password dosen't match!");
            return false;
        }
    }

    public boolean login(String username, String password){
        if(this.username.equals(username) && this.password.equals(password)){
            System.out.println("Congratulations "+ username + " ! You are Logged In Succesfully.");
            return true;
        }
        else{
            System.out.println("Invalid Username or password !");
            return false;
        }
    }
}
