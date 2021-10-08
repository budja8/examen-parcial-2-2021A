package uaslp.ingenieria.exams;

import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Song {
    private List<Note> notes = new LinkedList<>();

    public Song(File file) {
        readSong(file);
    }

    private void readSong(File file) {
        Note note = new Note();
        note.setNote(1);
        note.setTempo(75);
        notes.add(note);
    }

    public Iterator<Note> getSongIterator() {
        return notes.listIterator();
    }


}
