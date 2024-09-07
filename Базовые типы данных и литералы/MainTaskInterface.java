interface ButtonInterface {
    void click();
}

class PlayButton implements ButtonInterface {
    public void click() {
        System.out.println("started");
    }
}

class StopButton implements ButtonInterface {
    public void click() {
        System.out.println("stopped");
    }
}

class MainTaskInteface {
    public static void main(String[] args) {
        var playButton = new PlayButton();
        var stopButton = new StopButton();
        playButton.click();
        stopButton.click();
    }
}