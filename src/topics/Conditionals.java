package topics;

public class Conditionals {

    /** This method use the conditional for print if the number is even or odd */
    public void conditionalIf(int number){
        if(number%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }

    /** This method use the conditional for print if the number is even or odd */
    public void conditionalSwitch(int number){
        switch(number%2){
            case 0:
                System.out.println("even");
                break;
            default:
                System.out.println("odd");
                break;
        }
    }
}
