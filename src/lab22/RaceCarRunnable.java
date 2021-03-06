package lab22;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import static java.lang.Thread.sleep;
import static lab22.Race.startRaceTime;


/**
 * @author - Viacheslav Shevchuk
 *
 * Creation class RaceCarRunnable where we set a random speed (though method).
 *
 */


public class RaceCarRunnable extends Car {

    private int passed;
    private int distance;
    private boolean isFinish;
    private CountDownLatch countDownLatch;
    private long finishTime;

    public RaceCarRunnable(String name, int maxSpeed, int distance, CountDownLatch countDownLatch) {
        super(name, maxSpeed);
        this.distance = distance;
        this.countDownLatch = countDownLatch;
    }

    static int count = 1;

    public long getFinishTime() {
        return finishTime;
    }

    public int getRandomSpeed() {
        int min = getMaxSpeed() / 2;
        int max = getMaxSpeed();
        Random random = new Random();
        int speed = random.nextInt((max - min) + 1);
        return speed += min;
    }

    void print() {
        System.out.println("__________________________");
        System.out.println(getName() + " => " + "speed: " + getRandomSpeed() + ";" + " \nprogress: " + getPassed() + "/" + getDistance() + " miles");
        System.out.println("_________________________________________________");
    }

    public int getPassed() {
        return passed;
    }

    public void setPassed(int passed) {
        this.passed = passed;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isFinish() {
        return isFinish;
    }

    public void setFinish(boolean finish) {
        isFinish = finish;
    }

    @Override
    public String toString() {
        return "RaceCarRunnable{" +
                "passed=" + passed +
                ", distance=" + distance +
                ", isFinish=" + isFinish +
                '}';
    }

    @Override
    public void run() {
        super.run();
        while (!isFinish) {
            try {
                int speed = getRandomSpeed();
                passed += speed;
                print();
                sleep(1000);
                if (passed >= distance) {
                    isFinish = true;
//                    long result = startRaceTime - finishTime;
//                    result = finishTime;
                } else
                    System.out.println("Car's still going to finish... " + getName() + " on the move = " + getPassed() + " miles");
                System.out.println("____  _____  _____  ____");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        countDownLatch.countDown();
        if (passed >= distance) {
            System.out.println("=============");
            System.out.println("Place = " + count++ + " -> " + getName() + " || " + "finish time: " + getFinishTime() + ".");
            System.out.println("=============");
        }
    }
}

