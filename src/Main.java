public class Main {
    public static void main(String[] args) {

        System.out.println("Задача");
        TestClass testClassOne = new TestClass();
        TestClass testClassTwo = new TestClass();
        System.out.println("Курица с кодом:" + testClassOne.getId());
        testClassOne.setNameChicken("Кокоша");
        testClassOne.setCountLittleChicken(5);
        testClassTwo.setNameChicken("Кокоша");
        testClassTwo.setCountLittleChicken(4);
        System.out.println(testClassOne);
        System.out.println(testClassTwo);
        if (testClassOne.equals(testClassTwo)) {
            System.out.println("Куры одинаковы и хотят гречи в парадной, на поребрике!");
        }

    }


}