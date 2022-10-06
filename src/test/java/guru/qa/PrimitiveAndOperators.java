package guru.qa;

public class PrimitiveAndOperators {
    public static void test() {
        System.out.println("Hello world!");
        // Data types
        boolean example = true; // Тип определяющий правда или ложь

        // Хранение цельночисленных значений
        byte aByte; // 8 bit (-128 / 127) -2^7 / (2^7)-1 -обьем резервируемой памяти
        short aShort; // 16 bit (-32768 / 32767) -2^15 / (2^15)-1 -обьем резервируемой памяти
        int aInt; // 32 bit -2^31 / (2^31)-1 -обьем резервируемой памяти
        long aLong; // 64 bit -2^63 / (2^63)-1 -обьем резервируемой памяти

        // Хранение чисел с плавающей точкой
        float aFloat; // 32 bit
        double aDouble; // 64 bit
        char aChar = '1'; // какой ни будь 1 символ

        // Операторы математические + - * / %
        // Операторы условные > < >= <= == !=
        // Операторы логические && - и, || - или,
        int a = 10;
        int b = 15;
        System.out.println();
    }
}
