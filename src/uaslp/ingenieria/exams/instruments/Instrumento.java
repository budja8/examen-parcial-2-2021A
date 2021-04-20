package uaslp.ingenieria.exams.instruments;

public enum Instrumento {
    PIANO(new Piano()),
    GUITARRA(new Guitarra()),
    FLAUTA(new Flauta()),
    VIOLIN(new Violin());

    private Instrument instrument;

    Instrumento(Instrument instrument){
        this.instrument = instrument;
    }

    public Instrument getInstrument(){
        return instrument;
    }
}
