import datastructures.list.ListImplementation;
import topics.FirstPrint;
import java.time.LocalDateTime;
import topics.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    //This a static variable
    public static LocalDateTime time = LocalDateTime.now();

    public static void main(String[] args) {
        System.out.println(time);
        list();
    }

    public void readArray(){
        Arrays arrayClass = new Arrays();
        arrayClass.read();
    }

    public void hello() {
        FirstPrint hello = new FirstPrint();
        hello.print();
    }

    public static void list(){
        ListImplementation listNumber = new ListImplementation(1);
        listNumber.append(2);
        listNumber.append(3);
        listNumber.append(4);
        System.out.println(listNumber.popFirst());
        listNumber.print();
    }
}