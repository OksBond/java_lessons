/**
 * Created by Оксана on 07.02.2017.
 */

/*An improved version of the traffic light simulation that
stores the light delay (задержка) in TrafficLightColor.
*/

//An enumeration of the colors of a traffic light.
enum TrafficLightColor2 {
    RED(12000), GREEN(10000), YELLOW (2000);

    private int delay;
    TrafficLightColor2(int d){
        delay=d;
    }

     int getDelay(){return delay;}
}



//A computerized traffic light
class TrafficLightSimulator2 implements Runnable {
    private Thread thrd;   //holds the thread that runs the simulation-поток для имитации светоф.
    private TrafficLightColor2 tlc; //holds the traffic light color-тек. цвет светоф.
    boolean stop = false;   //set to true to stop the simulation-для остановки имитации уст. в true
    boolean changed = false;    //true when the light has changed-true, если светофор перекл.

    TrafficLightSimulator2(TrafficLightColor2 init) {
        tlc = init;

        thrd = new Thread(this);
        thrd.start();
    }

    TrafficLightSimulator2() {
        tlc = TrafficLightColor2.RED;

        thrd = new Thread(this);
        thrd.start();
    }

    //Start up the light - Запуск имитации автоматизированного светофора
    public void run() {
        while (!stop) {
            //Notice how this code has been simplified.
            //По сравнению с предыд. версией пр-мы код значительно упростился!
            try {
                Thread.sleep(tlc.getDelay());

//                switch (tlc) {
//                    case GREEN:
//                        Thread.sleep(10000);    //green for 10 seconds
//                        break;
//                    case YELLOW:
//                        Thread.sleep(2000);     //yellow for 2 seconds
//                        break;
//                    case RED:
//                        Thread.sleep(12000);    //red for 12 seconds
//                        break;
//                }
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }

            changeColor();
        }
    }

    //Change color.
    synchronized void changeColor() {
        switch (tlc) {
            case RED:
                tlc = TrafficLightColor2.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor2.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor2.YELLOW;
        }

        changed = true;
        notify(); //signal that the light has changed
    }

    //Wait untill a light change occurs.
    synchronized void waitForChange() {
        try {
            while (!changed)
                wait(); //wait for light to change
            changed = false;
        } catch (InterruptedException exc) {
            System.out.println(exc);
        }
    }

    //Return current color.
    TrafficLightColor2 getColor() {
        return tlc;
    }

    //Stop the traffic light.
    void cancel() {
        stop = true;
    }
}

public class TrafficLightDemo2 {
    public static void main(String[] args) {
        TrafficLightSimulator2 t1 =
                new TrafficLightSimulator2(TrafficLightColor2.GREEN);

        for (int i = 0; i < 9; i++) {
            System.out.println(t1.getColor());
            t1.waitForChange();
        }
        t1.cancel();
    }
}
