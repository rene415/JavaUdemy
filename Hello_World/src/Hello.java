public class Hello {

    public static void main(String[] args){
        // 1. create a byte var and set to any valid byte
        byte myByte =28;
        //2. Create a short var and set to any valid short
        short myShort = 200;
        //3. create a int var and set to any valid int
        int myInt = 100000;
        //4. create a long var and set it equal to 50_000 + 10(byte+short+int)
        long myLong = 50_000L+(10L*(myByte+myInt+myShort));
        System.out.println(myLong);

    }
}
