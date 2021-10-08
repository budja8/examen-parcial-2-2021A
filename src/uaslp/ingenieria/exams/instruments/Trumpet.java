package uaslp.ingenieria.exams.instruments;

import uaslp.ingenieria.exams.Note;

public class Trumpet extends Instrument{
    @Override
    public void play(Note note) {
        System.out.println("Sonido de trompeta");
    }
}
