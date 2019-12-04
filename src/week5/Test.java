package week5;

import java.util.Random;

public class Test {
    public static void main(String arg[]) {
        for (int i = 0; i < 10; i++) {
            System.out.println(getRandom());
        }
    }

    static float getRandom() {
        Random random = new Random();
        return random.nextFloat();
    }
}
