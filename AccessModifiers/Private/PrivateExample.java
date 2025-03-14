package AccessModifiers.Private;

public class PrivateExample {
    private String msg = "This is a secret message";
    private void showMsg(){
        System.out.println(msg);
    }
    public void accessMessage(){
        showMsg();
    }
}
