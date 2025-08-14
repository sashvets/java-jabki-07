package main.playable;

public class Song implements Playable,Rated {

    private String title;

    public Song(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Играю песню " + title);
    }

    @Override
    public void appreciated() {
        System.out.println("Оценена " + title);
    }
}