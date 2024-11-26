package org.example.view;

import org.example.domain.Note;
import org.example.domain.Record;

import java.util.List;

public interface NotebookView {

    List<Note> showNotes();
    Note showNote(int number);
    List<Record> showRecordsByNoteNumber(int number);
}
