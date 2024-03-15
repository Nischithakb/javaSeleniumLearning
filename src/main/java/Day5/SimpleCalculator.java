package Day5;

public class SimpleCalculator {
    int userInput1;
    int userInput2;
    int result;
    public void userInput1(int userInp1){
        userInput1=userInp1;
    }
    public void userInput2(int userInp2){
        userInput2=userInp2;
    }
    public int addition(){
        result=userInput1+userInput2;
        return result;
    }
    public int subtraction(){
        result=userInput1-userInput2;
        return result;
    }
    public int multiplication(){
        result=userInput1*userInput2;
        return result;
    }
    public int division(){
        if(userInput2<1){
            throw new IllegalArgumentException("Error: Invalid division by Zero");
        }
        else {
            result = (userInput1) / (userInput2);
            return result;

        }

    }


}
