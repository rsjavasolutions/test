package task10.model;

public class Statistic {

    private long success;
    private long failure;

    public Statistic() {
    }

    public Statistic(long success, long failure) {
        this.success = success;
        this.failure = failure;
    }

    public long getSuccess() {
        return success;
    }


    public long getFailure() {
        return failure;
    }

    public void collect(boolean sent){
        if (sent){
            success++;
        } else {
            failure++;
        }
    }

}
