public class Main {
    public static void main(String[] args) {
        Dashboard d = new Dashboard();
        boolean register = d.register();
        boolean login = false;

        if(register){
            login = d.login();
        }
        else{
            d.register();
        }

        if(login){
            d.dashboard();
        }
        else{
            d.dashboard();
        }
    }
}
