/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author LuanaOrellana
 */
public class UserStoryTest {
    
    @Test
    public void testGetStatusUserStory() {
        UserStory story = new UserStory(1,"Registrar Tarea","Se guarden los siguientes datos:"+
            "ID_Tarea,Nombre,Descripcion,Historia a la que pertenece",300,3);
        String expected = "In Progress";
        String actual = story.getStatus();
        
        assertEquals(expected, actual);
    }
}
