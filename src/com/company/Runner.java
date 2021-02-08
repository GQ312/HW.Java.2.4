package com.company;

public class Runner extends Thread {
    Runner runner;
    int x;
    int n;

    public Runner(int x, Runner runner) {
        this.runner = runner;
        this.x = x;
    }

    public Runner() {

    }

    public void repeat() {
        System.out.println("Runner " + (x + 5) + " took stick!");
        System.out.println("Runner " + x + " is running to Runner " + (x - 1));
    }

    @Override
    public void run() {

        if (x == 0) {
            x +=5;
            while (x > 0) {
                System.out.println("Runner " + x + " took stick!");
                if ( x != 1) {
                    System.out.println("Runner " + x + " is running to Runner " + (x - 1));
                    try {
                        sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                x -= 1;
            }
        }

        if (x > 0) {
        System.out.println("Runner " + x + " took stick!");
        System.out.println("Runner " + x + " is running to Runner " + (x + 1));
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.runner.start();
        }





    }
}
