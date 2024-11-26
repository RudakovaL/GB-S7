package org.example;

import org.example.domain.Note;
import org.example.domain.Notebook;
import org.example.domain.Record;
import org.example.view.NotebookPresenter;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Record r1 = new Record();
        r1.setContent("rec 1");

        Record r2 = new Record();
        r2.setContent("rec2");

        Record r3 = new Record();
        r3.setContent("rec3");

        Note n1 = new Note();
        n1.setNumber(22);

        n1.getRecords().add(r1);
        r1.setNote(n1);

        n1.getRecords().add(r2);
        r2.setNote(n1);

        Note n2 = new Note();
        n2.setNumber(23);

        n2.getRecords().add(r3);
        r3.setNote(n2);

        Notebook notebook = new Notebook("Дневник", List.of(n1, n2));
        n1.setNotebook(notebook);
        n2.setNotebook(notebook);

        NotebookPresenter presenter = new NotebookPresenter(notebook);

        System.out.println(presenter.showNotes());
        System.out.println(presenter.showNote(1));
        System.out.println(presenter.showRecordsByNoteNumber(0));
    }
}
