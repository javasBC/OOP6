import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.*;
import java.io.File;
import java.nio.file.AtomicMoveNotSupportedException;
import java.util.FormatterClosedException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //int x1= 6;
        //int x2= 6;
//
        //String name1="hodi";
        //String name2="hodi";
        //name2="hii";
//
        //System.out.println("int =="+(x1==x2));
        //System.out.println("Sting =="+(name1==name2));
        //System.out.println("Sting equals"+name1.equals(name2));
//
//
        //Computer computer1= new Computer("red",3.6,512,"lenovo");
        //Computer computer2= new Computer("black",2.4,1000,"asus");
        //Computer computer3= new Computer("black",2.4,1000,"asus");
        //Computer computer4= new Computer("silver",2.4,512,"mac");
//
        //computer4=computer1;
        //Color color = new Color(4567978);
//
        //System.out.println(computer3.equals(computer2));
        //System.out.println(computer1.equals(computer4));
        //System.out.println(computer1.equals(color));
//
        //Person p1 = new Person("shai",99.13,3147778);
        //Person p2 = new Person("liran",98.54,4445554);
        //Person p3 = new Person("OZ",19.2,3147778);
        //Person p4 = new Person("shai",18.4,3147778);
        //Person p5 = new Person("shai",18.4,3147778);
//
        //System.out.println(p4.equals(p5));
//


        //int[] arr = new int[5];
        //arr[5]=18;


        //Scanner s = new Scanner(System.in);
        //int x=s.nextInt(), y=0;

        //int x;
        //int y;
        //x = 18;
        //int[] a = new int[5];
//
        //try {
//
        //    int newX = Integer.parseInt("555");
        //    try {
        //        a[8] = 3;
//
        //        System.out.println("after the first exc");
        //        try {
        //            y = x / 0;
        //        } catch (Exception e) {
        //        }
        //    } catch (ArithmeticException e) {
        //    } catch (Exception e1) {
        //    }
//
        //} catch (FormatterClosedException e1) {
        //    //if (e instanceof ArithmeticException)
        //    //    System.out.println("really man !@$E!!!!!");
        //    //if (e instanceof ArrayIndexOutOfBoundsException)
        //    //    System.out.println("out of the bounds");
        //    //y = 0;
        //    System.out.println(e1.getMessage());
        //    y = 10/x;
        //} catch (Exception e3) {
        //    System.out.println(e3);
        //} finally {
        //    System.out.println("in final ");
        //}
//
        //System.out.println("after the try catch block");


        //try{
        //    System.out.println(10/1);
        //    System.out.println(10/0);
        //    System.out.println(10/0);
        //    System.out.println(10/0);
        //    System.out.println(10/0);
        //    System.out.println(10/0);
        //    System.out.println(10/0);
        //    System.out.println(10/0);
        //    System.out.println(10/0);
        //    System.out.println(10/0);
//
//
        //}catch (Exception e){
        //    e.printStackTrace();
        //}
        //finally {
        //    //close the connection
        //}
        //System.out.println("ok");

        //int x1, x2;
        //boolean flag;
        //Scanner scanner = new Scanner(System.in);
        //x1 = scanner.nextInt();
        //do {
        //    try {
        //        x2 = scanner.nextInt();
        //        System.out.println(x1/x2);
        //        break;
        //    } catch (ArithmeticException e) {
        //        System.out.println("y cannot be zero");
        //    } catch (Exception e2) {
        //        System.out.println("something went wrong");
        //    }
        //} while (true);

        // int y =excepRe(x1,scanner);
        // System.out.println(x1/y);


        Scanner sc1 = new Scanner(System.in);
        System.out.println("hii to all");
        System.out.println("Please enter a place starts with the litter r");
        String input = sc1.next();

        try {
            MyException.testNewExc(input);
        } catch (MyException e) {
            System.out.println(e);
        }catch (Exception e1){

        }

    }




    //private static int excepRe(int x,Scanner scanner) {
    //    int y;
    //    try{
    //        y=scanner.nextInt();
    //        System.out.println(x/y);
    //        return y;
    //    }catch (Exception e ){
    //        System.out.println("not this time");
    //        return excepRe(x,scanner);
    //    }
//


    //public static int checkInput(){
    //    Scanner s = new Scanner(System.in);
    //    try{
    //    return s.nextInt();
    //    }catch ( e){
    //        System.out.println("naaaaaaaaaah");
    //        return checkInput();
    //    }

    //}
}


//7) What is unreachable catch block error?
//When you are keeping multiple catch blocks,
// the order of catch blocks must be from most specific to
// most general ones. i.e sub classes of Exception must come first
// and super classes later. If you keep super classes first and sub classes later
// , compiler will show unreachable catch block error.


//כתבו קטע קוד שמקבל מהמשתמש 2 מספרים ממשיים ומדפיס את את
// X/Y
//אם ה Y שווה לאפס יש לבקש מהמשתמש להכניס ערך אחר ללא שימוש ב IF









