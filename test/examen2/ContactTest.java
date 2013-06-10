package examen2;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ContactTest {
    private Contact pepe;
    private Contact juan;
    private Contact ana;
		
    @Before
    public void initiallize(){
        pepe = new Contact("Pepe", "5555380");
        juan = new Contact("Juan", "55541501");
         ana = new Contact("Ana", "5557781");
    }
    
    @Test
    public void testName() {
        assertEquals("Error getName\n", "Pepe", pepe.getName());
        assertEquals("Error getName\n", "Juan", juan.getName());
        assertEquals("Error getName\n", "Ana", ana.getName());
    }
    
    @Test
    public void testPhoneNumber() {
        assertEquals("Error getPhoneNumber\n", "5555380", pepe.getPhoneNumber());
        assertEquals("Error getPhoneNumber\n", "55541501", juan.getPhoneNumber());
        assertEquals("Error getPhoneNumber\n", "5557781", ana.getPhoneNumber());
    }
    
    @Test
    public void testReceiveMessage() {
        pepe.receiveMessage("cagoenCros");
        assertEquals("Error receiveMessage\n", "cagoenCros", MessengerTools.getLastMessage());
        assertEquals("Error receiveMessage\n", "5555380", MessengerTools.getLastPhone());
        juan.receiveMessage("Hola soy juan");
        assertEquals("Error receiveMessage\n", "Hola soy juan", MessengerTools.getLastMessage());
        assertEquals("Error receiveMessage\n", "55541501", MessengerTools.getLastPhone());
        ana.receiveMessage("Hola soy ana");
        assertEquals("Error receiveMessage\n", "Hola soy ana", MessengerTools.getLastMessage());
        assertEquals("Error receiveMessage\n", "5557781", MessengerTools.getLastPhone());
    }
    
}
