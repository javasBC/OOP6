public class MyException extends Exception {

    public MyException(String message){
        super(message);
    }

    static void testNewExc(String input) throws Exception {

        if (input.toLowerCase().charAt(0) == 'r')
            System.out.println(input + "nice job");
        else
            throw new MyException("hodi is a king ");
    }

}
