package examen2;

import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author julio
 */
public class GroupTest {
    private Group familia;
    private Group amigos;
    private Group todos;
    private Contact pepe;
    private Contact juan;
    private Contact ana;
    private Contact maría;
		
    @Before
    public void initiallize(){
        pepe = new Contact("Pepe", "5555380");
        juan = new Contact("Juan", "55541501");
        ana = new Contact("Ana", "5557781");
        familia = new Group("familia");
        amigos = new Group("amigos");
        todos = new Group("todos");
        maría = new Contact("María", "5557780");
		
    }
    
    @Test
    public void testName() {
        assertEquals("Error getName\n", "Pepe", pepe.getName());
        assertEquals("Error getName\n", "Juan", juan.getName());
        assertEquals("Error getName\n", "Ana", ana.getName());
        assertEquals("Error getName\n", "María", maría.getName());
        assertEquals("Error getName\n", "familia", familia.getName());
        assertEquals("Error getName\n", "amigos", amigos.getName());
        assertEquals("Error getName\n", "todos", todos.getName());
    }
    
    @Test
    public void testFamilia() {
        assertTrue("Error Add\n",familia.add(ana));
        assertTrue("Error IsMember\n",familia.isMember(ana.getId()));
        assertFalse("Error Add\n",familia.add(ana));
        assertTrue("Error Add\n",familia.add(pepe));
        assertTrue("Error IsMember\n",familia.isMember(pepe.getId()));
        assertFalse("Error Add\n",familia.add(pepe));
        familia.receiveMessage("Esto es para familia");
        assertEquals("Error receiveMessage\n", "Esto es para familia", MessengerTools.getLastMessage());
        familia.remove(ana.getId());
        assertFalse("Error IsMember\n",familia.isMember(ana.getId()));
    }
    
    @Test
    public void testAmigos() {
        assertTrue("Error Add\n",amigos.add(juan));
        assertTrue("Error IsMember\n",amigos.isMember(juan.getId()));
        assertFalse("Error Add\n",amigos.add(juan));
        assertTrue("Error Add\n",amigos.add(maría));
        assertTrue("Error IsMember\n",amigos.isMember(maría.getId()));
        assertFalse("Error Add\n",amigos.add(maría));
        amigos.receiveMessage("Esto es para amigos");
        assertEquals("Error receiveMessage\n", "Esto es para amigos", MessengerTools.getLastMessage());
        amigos.remove(juan.getId());
        assertFalse("Error IsMember\n",amigos.isMember(juan.getId()));
    }
    
    @Test
    public void testTodos() {
        assertTrue("Error Add\n",todos.add(ana));
        assertTrue("Error IsMember\n",todos.isMember(ana.getId()));
        assertFalse("Error Add\n",todos.add(ana));
        assertTrue("Error Add\n",todos.add(pepe));
        assertTrue("Error IsMember\n",todos.isMember(pepe.getId()));
        assertFalse("Error Add\n",todos.add(pepe));
        assertTrue("Error Add\n",todos.add(juan));
        assertTrue("Error IsMember\n",todos.isMember(juan.getId()));
        assertFalse("Error Add\n",todos.add(juan));
        assertTrue("Error Add\n",todos.add(maría));
        assertTrue("Error IsMember\n",todos.isMember(maría.getId()));
        assertFalse("Error Add\n",todos.add(maría));
        todos.receiveMessage("Esto es para todos");
        assertEquals("Error receiveMessage\n", "Esto es para todos", MessengerTools.getLastMessage());
        todos.remove(ana.getId());
        assertFalse("Error IsMember\n",todos.isMember(ana.getId()));
    }
    
}
