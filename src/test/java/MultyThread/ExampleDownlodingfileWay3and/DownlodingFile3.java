package MultyThread.ExampleDownlodingfileWay3and;

public class DownlodingFile3 implements Runnable {
    private Filee3 file;

//    public DownlodingFile(Filee file) {
//        this.file = file;
//    }
    public DownlodingFile3() {
        this.file = new Filee3();
    }


    @Override
    public void run() {
        System.out.println("start downloadine...");
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            file.increas();
            System.out.println("reading bytes : "+i);
        }
        System.out.println("done!");
    }

    public Filee3 getFile() {
        return file;
    }
}
