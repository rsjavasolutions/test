package task10.model;

public class Statistic {

    private long success;
    private long failure;

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

    private void collect(boolean sent){
        if (sent){
            success++;
        } else {
            failure++;
        }
    }

}
