public class bankoops {
    public static void main(String[] args) {
       Bankaccount myacc = new Bankaccount(); 
       myacc.username = "Gurparshad Singh";
    //    myacc.password = "abc";
       myacc.setPassword("abc123");
    }
}
class Bankaccount{
    public String username;
    private String password;
    public void setPassword(String newPassword){
    password = newPassword;
    }
}
