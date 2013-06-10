
package examen2;

public abstract class MessengerTools {
    private static int id=0;
    private static String lastMessage;
    private static String lastPhone;
    
    public static int getUniqueId(){
        return id++;
    }
    
    public static void sendMessage(String message, String phoneNumber){
        lastMessage=message;
        lastPhone=phoneNumber;
    }

    public static String getLastMessage() {
        return lastMessage;
    }

    public static String getLastPhone() {
        return lastPhone;
    }

}