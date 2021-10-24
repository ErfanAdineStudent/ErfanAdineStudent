package MultyThread.ExampleDownlodingfileWay2;

public class DownlodingFile implements Runnable {
    private Filee file;

    public DownlodingFile(Filee file) {
        this.file = file;
    }
    public DownlodingFile() {
        this.file = new Filee();
    }


    @Override
    public void run() {
        System.out.println("start downloadine...");
        for (int i = 0; i < 10_000; i++) {
            file.increas();
        }
        System.out.println("done!");
    }

    public Filee getFile() {
        return file;
    }
}
