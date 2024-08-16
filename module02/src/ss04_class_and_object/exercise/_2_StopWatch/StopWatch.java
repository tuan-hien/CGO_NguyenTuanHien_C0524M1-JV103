package ss04_class_and_object.exercise._2_StopWatch;

public class StopWatch {
    //Trường startTime và endTime là private
    private long startTime, endTime;

    //Phương thức khởi tạo không tham số khởi tạo startTime với thời gian hiện tại của hệ thống.
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    //phương thức getter để trả về giá trị của startTime và endTime.
    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    //Phương thức start() để reset startTime về thời gian hiện tại của hệ thống.
    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}

