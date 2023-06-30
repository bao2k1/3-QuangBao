package Day3.Bai3;

import java.util.Random;

class Car {
    private String name;
    private int speed;

    public Car(String name) {
        this.name = name;
        speed = 0;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void speedUp() {
        Random random = new Random();
        int speedUp = random.nextInt(10) + 1;
        speed += speedUp;
    }

    public void speedDown() {
        Random random = new Random();
        int speedDown = random.nextInt(5) + 1;
        speed -= speedDown;
        if (speed < 0) {
            speed = 0;
        }
    }
}
