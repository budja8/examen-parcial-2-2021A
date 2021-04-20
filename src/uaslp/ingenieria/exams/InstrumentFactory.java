package uaslp.ingenieria.exams;

import uaslp.ingenieria.exams.instruments.*;

public class InstrumentFactory {

    public static Instrument getInstrument(Instrumento instrumento){

        return switch (instrumento) {
            case PIANO -> new Piano();
            case VIOLIN -> new Violin();
            case FLAUTA -> new Flauta();
            case GUITARRA -> new Guitarra();
        };

    }
}
