package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.*;

import java.util.Iterator;
import java.util.List;

public class SongPlayer {

    public void play(Song song, List<Instrument> instrumentList) {
        Iterator<Note> notas = song.getSongIterator();

        while (notas.hasNext()) {
            Note nota = notas.next();
            for(Instrument instrument : instrumentList){
                instrument.play(nota);
            }
        }

    }

}
