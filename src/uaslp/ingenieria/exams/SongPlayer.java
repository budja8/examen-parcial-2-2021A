package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.Instrument;
import uaslp.ingenieria.exams.instruments.Instrumento;

import java.util.Iterator;

public class SongPlayer {


    // Inyección de dependencias
    public void play(Song song, Instrument instrument) {
        Iterator<Nota> notas = song.getSongIterator();

        while (notas.hasNext()) {
            Nota nota = notas.next();
            instrument.tocaNota(nota);
        }
    }

}
