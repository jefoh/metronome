public class Metronome implements Runnable {

    private int beatsPerMeasure;
    private int bpm;
    private boolean isRunning;

    public Metronome() {
        this.bpm = 60;
        this.beatsPerMeasure = 4;
    }

    public Metronome(int bpm, int beatsPerMeasure) {
        this.bpm = bpm;
        this.beatsPerMeasure = beatsPerMeasure;
    }

    public int getBpm() {
        return this.bpm;
    }

    public void setBpm(int newBpm) {
        this.bpm = newBpm;
    }

    public void raiseBpm() {
        this.bpm++;
    }

    public void lowerBpm() {
        this.bpm--;
    }

    public boolean getIsRunning() {
        return this.isRunning;
    }

    public void run() {
        this.isRunning = true;
        while(this.isRunning) {
            for (int i = 1; i <= this.beatsPerMeasure; i++) {
                System.out.println(i);
                try {
                    Thread.sleep((long) (1000 * (60.0 / bpm)));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public int getTimeSignature() {
        return this.beatsPerMeasure;
    }

    public void setTimeSignature(int beatsPerMeasure) {
        this.beatsPerMeasure = beatsPerMeasure;
    }
}
