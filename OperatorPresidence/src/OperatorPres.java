public class OperatorPres {
    public static void main(String[] args){
        System.out.println("Hello");

    double myFirstNumber = 20.00d;
    double mySecondNumber = 80.00d;
    double myValueTotal = (myFirstNumber + mySecondNumber) * 100.00d;
        System.out.println("MyValueTotal = " + myValueTotal);

    double theRemainder = (myValueTotal % 40.00d);
        System.out.println("theRemainder = " + theRemainder);

    boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
    if (!isNoRemainder){
        System.out.println("Got some remainder");
    }
    }
}
