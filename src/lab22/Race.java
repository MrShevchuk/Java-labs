package lab22;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

import static java.lang.System.currentTimeMillis;
import static java.lang.Thread.sleep;


/**
 * @author - Viacheslav Shevchuk
 *
 * Creation class Race, that implements racing process with several cars.
 * Each car has an own random speed. We also set time, maxSpeed and distance.
 *
 */


public class Race {

    public static AtomicLong startRaceTime;

    public static void main(String[] args) {
        int count = 6;
        List<RaceCarRunnable> cars = new ArrayList<>();
        CountDownLatch countDownLatch = new CountDownLatch(count);
        cars.add(new RaceCarRunnable("Bugatti Chiron", 480, 1000, countDownLatch));
        cars.add(new RaceCarRunnable("Audi R8", 320, 1000, countDownLatch));
        cars.add(new RaceCarRunnable("Nissan GT-R 35", 320, 1000, countDownLatch));
        cars.add(new RaceCarRunnable("Lamborghini huracan", 325, 1000, countDownLatch));
        cars.add(new RaceCarRunnable("BMW i8", 250, 1000, countDownLatch));
        cars.add(new RaceCarRunnable("Porsche 911", 330, 1000, countDownLatch));

        List<Thread> threads = cars.stream().map(Thread::new).collect(Collectors.toList());
        startRace(threads);

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("___________________");
        System.out.println("Finish");

    }

    static void startRace(List<Thread> cars) {
       new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("Race will start in: ");
                    sleep(1000);
                    System.out.println("3");
                    sleep(555);
                    System.out.println("2");
                    sleep(555);
                    System.out.println("1");
                    sleep(700);
                    System.out.println("GO!!!");
                    for (Thread thread : cars) {
                        thread.start();
                        long startRaceTime = currentTimeMillis();
                        System.out.println(startRaceTime);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
