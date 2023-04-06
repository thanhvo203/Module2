package lesson_4.exercise_1.stop_watch;


public class TestWatch {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        System.out.println(stopWatch.getStartTime());
        for (int i = 0 ; i <= 10000; i++){
            stopWatch.stop();
            System.out.println(stopWatch.getEndTime());
            System.out.println("C :" + i);
        }
        System.out.println(stopWatch.getElapsedTime());
    }
}
