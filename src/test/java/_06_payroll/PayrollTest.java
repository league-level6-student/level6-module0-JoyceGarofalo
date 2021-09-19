package _06_payroll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PayrollTest {

    Payroll payroll = new Payroll();

    @Test
    void itShouldCalculatePaycheck() {
        //given
    	double hourlyWage = 4.2;
    	int numHours = 5;
    	double expected = 21;
    	
        //when
    	double actual = Payroll.calculatePaycheck(hourlyWage, numHours);
    	
        //then
    	assertEquals(expected, actual);
    	
    }

    @Test
    void itShouldCalculateMileageReimbursement() {
        //given
    	int milesTraveled = 12;
    	double expected = 6.9;
    	
        //when
    	double actual = Payroll.calculateMileageReimbursement(milesTraveled);

        //then
    	assertEquals(expected, actual);
    }

    @Test
    void itShouldCreateOfferLetter() {
        //given
    	String employeeName = "Joyce";
    	double hourlyWage = 13.5;
    	String expected = "Hello Joyce, We are pleased to offer you an hourly wage of 13.5";

        //when
    	String actual = Payroll.createOfferLetter(employeeName, hourlyWage);

        //then
    	assertEquals(expected, actual);
    }

}