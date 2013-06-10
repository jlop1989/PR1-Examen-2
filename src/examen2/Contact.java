package examen2;

public class Contact extends Entity{
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    @Override
    public void receiveMessage(String message) {
        MessengerTools.sendMessage(message, phoneNumber);
    }
    
}