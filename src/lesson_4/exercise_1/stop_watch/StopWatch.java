package lesson_4.exercise_1.stop_watch;



public class StopWatch {
    private long startTime;
    private long endTime;
    public StopWatch(){

    }
    public StopWatch(long startTime, long endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public long start(){
        return this.startTime = System.currentTimeMillis();
    }
    public long stop(){
        return this.endTime =  System.currentTimeMillis();
    }
    public long getStartTime(){
        return this.startTime;
    }
    public void setStartTime(long startTime){
        this.startTime = startTime;
    }
    public long getEndTime(){
        return this.endTime;
    }
    public void setEndTime(long endTime){
        this.endTime = endTime;
    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
