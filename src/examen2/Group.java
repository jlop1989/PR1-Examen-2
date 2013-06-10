package examen2;

import java.util.ArrayList;

public class Group extends Entity{
    
    private ArrayList<Entity> members;

    public Group(String name) {
        super(name);
        this.members= new ArrayList<>();
    }

    public ArrayList<Entity> getMembers() {
        return members;
    }
    
    public boolean isMember(int id){
        for(Entity entity : members)
            if(entity.getId()==id) return true;
        return false;
    }
    
    public boolean add(Entity entity){
        if(isMember(entity.getId())) return false;
        if(members.size()>=20) return false;
        members.add(entity);
        return true;
    }
    
    public void remove(int id){
        Entity removed=null;
        for(Entity entity : members){
            if(entity.getId()==id){
                removed=entity;
                break;
            }
        }
        if(removed!=null) members.remove(removed);
    }

    @Override
    public void receiveMessage(String message) {
        for(Entity entity : members)
            entity.receiveMessage(message);
    }
    
}