/* Class Song: fields title, artist, and method play()
Subclasses: PopSong, RockSong, JazzSong override play() with unique print messages
Demonstrate polymorphic behavior using a playlist of Song[]
File: MusicApp.java */

class Song{
    public String title;
    public String artist;

    public void play(){}
}

class PopSong extends Song{
    public PopSong(String t, String a){
        this.title = t;
        this.artist = a;
    }

    @Override
    public void play(){
        System.out.println(title + " is a pop song made by " + artist + ".");
    }
}

class RockSong extends Song{
    public RockSong(String t, String a){
        this.title = t;
        this.artist = a;
    }

    @Override
    public void play(){
        System.out.println(title + " is a rock song made by " + artist + ".");
    }
}

class JazzSong extends Song{
    public JazzSong(String t, String a){
        this.title = t;
        this.artist = a;
    }

    @Override
    public void play(){
        System.out.println(title + " is a jazz song made by " + artist + ".");
    }
}

public class MusicApp {
    public static void main(String[] args) {
        Song[] song = new Song[3];
        song[0] = new PopSong("Just Dance", "Katy Perry");
        song[1] = new RockSong("Sandman", "Metallica");
        song[2] = new JazzSong("Fly Me To The Moon", "Frank");

        song[0].play();
        song[1].play();
        song[2].play();
    }
}
