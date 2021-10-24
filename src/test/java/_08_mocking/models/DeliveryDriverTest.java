package _08_mocking.models;

import _07_intro_to_mocking.models.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class DeliveryDriverTest {

    DeliveryDriver deliveryDriver;
    
    @Mock
    CellPhone cellPhone;
    
    @Mock
    Car car;
    
    @Mock
    String name;

    @BeforeEach
    void setUp() {

    	MockitoAnnotations.openMocks(this); //error

        deliveryDriver = new DeliveryDriver(name, car, cellPhone);
    }

    @Test
    void itShouldWasteTime() {
        //given
    	boolean expectedwastingTime = true;
    	
        //when
    	when(cellPhone.browseCatMemes()).thenReturn(true);
    	
    	boolean actualwastingTime = cellPhone.browseCatMemes();
    	
        //then
    	assertEquals(expectedwastingTime, actualwastingTime);
    }

    @Test
    void itShouldRefuel() {
        //given
    	 boolean expectedRefuel = true;
         int octane = 85;

         //when
         when(car.fillTank(octane)).thenReturn(true);
         
         boolean actualRefuel = car.fillTank(octane);

         //then
         assertEquals(expectedRefuel, actualRefuel);
    }

    @Test
    void itShouldContactCustomer() {
        //given
    	boolean expectedContact = true;
    	String phoneNumber = "858-123-456";
    	
        //when
    	when(cellPhone.call(phoneNumber)).thenReturn(true);
    	
    	boolean actualContact = cellPhone.call(phoneNumber);
    	
        //then
    	assertEquals(expectedContact, actualContact);
    }

}