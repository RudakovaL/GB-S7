package org.example.view;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.example.domain.Note;
import org.example.domain.Notebook;
import org.example.domain.Record;

import java.util.List;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class NotebookPresenter implements NotebookView {

    Notebook notebook;

    @Override
    public List<Note> showNotes() {
        return this.notebook.getLists();
    }

    @Override
    public Note showNote(int number) {
        return this.notebook.getLists().get(number);
    }

    @Override
    public List<Record> showRecordsByNoteNumber(int number) {
        return this.notebook.getLists().get(number).getRecords();
    }
}
