package examen2;

public abstract class Entity{
    private String name;
    private int id;

    public Entity(String name) {
        this.name = name;
        this.id= MessengerTools.getUniqueId();
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
    
    public abstract void receiveMessage(String message);
        
}