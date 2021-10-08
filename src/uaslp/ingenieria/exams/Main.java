package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.*;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String fileName = "archivo.music"; //args[0];
        List<Instrument> instrumentList = new LinkedList<>();  //args[1]

        Flute flute = new Flute();
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Trumpet trumpet = new Trumpet();
        Violin violin = new Violin();

        SongPlayer songPlayer = new SongPlayer();
        Song song = new Song(new File(fileName));

        instrumentList.add(flute);
        instrumentList.add(guitar);
        instrumentList.add(piano);
        instrumentList.add(trumpet);instrumentList.add(violin);


        songPlayer.play(song, instrumentList);

    }
}
