package ss04_class_and_object.exercise._2_StopWatch;

class Main {
    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        System.out.println("Starting " + stopWatch.getStartTime() + " milliseconds");
        for (int i = 0; i < 1000000000; i++) {
            double x = Math.sqrt(i);
        }

        stopWatch.stop();
        System.out.println("Finished " + stopWatch.getEndTime() + " milliseconds");

        System.out.println("Elapsed time: " + stopWatch.getElapsedTime() + " milliseconds");
    }
}