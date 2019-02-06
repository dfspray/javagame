package Main;

import Engine.io.Window;

public class Main {

    public static void main(String[] args) {
        Window window = new Window(800,600,"Is this working?");
        window.create();

        while (!window.closed()) {
            window.update();
            System.out.println("Hey");
            window.swapBuffers();
        }
    }
}