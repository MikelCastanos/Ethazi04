/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ira_a
 */
public class ConsultaHotelTest {
    
    public ConsultaHotelTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cargarHoteles method, of class ConsultaHotel.
     */
    @Test
    public void testCargarHoteles() {
        System.out.println("cargarHoteles");
        ConsultaHotel instance = new ConsultaHotel();
        instance.cargarHoteles();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of HotelPorLugar method, of class ConsultaHotel.
     */
    @Test
    public void testHotelPorLugar() {
        System.out.println("HotelPorLugar");
        String ubicacionHotel = "Bilbao";
        ConsultaHotel instance = new ConsultaHotel();
//        ArrayList<String> expResult = new ArrayList();
        ArrayList<String> result = instance.HotelPorLugar(ubicacionHotel);
        Assert.assertEquals(2, result.size());
//        ArrayList<String> expResult =null;
//        ArrayList<String> result = instance.HotelPorLugar(ubicacionHotel);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
