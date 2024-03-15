package Day5;

import Day5.SimpleCalculator;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SimpleCalculatorTest {
    //instancing the object
    SimpleCalculator SC=new SimpleCalculator();

    @Test(priority = 0)
    public void testAddition(){


        // giving inputs to userinputs methods
        SC.userInput1(10);
        SC.userInput2(15);
        assertEquals(25, SC.addition());

    }
    @Test(priority = 1)
    public void testSubtraction(){


        // giving inputs to userinputs methods
        SC.userInput1(10);
        SC.userInput2(15);
        assertEquals(-5, SC.subtraction());

    }
    @Test(priority = 2)
    public void testMultiplication(){
        //instancing the object

        // giving inputs to userinputs methods
        SC.userInput1(5);
        SC.userInput2(15);
        assertEquals(75, SC.multiplication());

    }
    @Test(priority = 3)
    public void testDivision(){
        //instancing the object

        // giving inputs to userinputs methods
        SC.userInput1(15);
        SC.userInput2(15);
        assertEquals(1, SC.division());

    }
    @Test(priority = 4)
    public void testDivisionZeroException(){
        //instancing the object

        // giving inputs to userinputs methods
        SC.userInput1(15);
        SC.userInput2(0);
        try{
            SC.division();
        }
        catch(IllegalArgumentException e){
            assertEquals("Error: Invalid division by Zero",e.getMessage());
        }

    }


}