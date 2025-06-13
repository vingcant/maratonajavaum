package javacore.wrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
         byte byteP = 1;
         short shortP = 1;
         int intP = 1;
         long longP = 10L;
         float floatP = 10F;
         double doubleP = 10D;
         char charP = 'p';
         boolean booleanP = true;

         Byte byteWrapper = 1;
         Short shortWrapper = 1;
         Integer intWrapper = 1;
         Long longWrapper = 10L;
         Float floatWrapper = 10F; //> boxing || formar um wrapper
         Double doubleWrapper = 10D;
         Character charWrapper = 'P';
         Boolean booleanWrapper = false;

         int i = intWrapper; //> Unboxing || transformar um wrapper em primitivo

        Integer intWrapper2 = Integer.parseInt("2");
        System.out.println(intWrapper2);

        boolean real = Boolean.parseBoolean("false");

        System.out.println(real);

        System.out.println(Character.isDigit('d'));
        //Muitos metodos no objeto Character

    }
}
