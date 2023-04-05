package lesson4.exercise;
import java.time.LocalTime;

public class StopWatch {
     long startTime;
     long endTime;
     public StopWatch(long startTime, long endTime){
         this.startTime = startTime;
         this.endTime = endTime;
     }
    public long getStartTime(){
        return this.startTime;
    }
    public long getEndTime(){
        return this.endTime;
    }
    public static void main(String[] args) {

    }
}

