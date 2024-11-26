package org.example.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Note {
    int number;
    List<Record> records = new ArrayList<>();
    Notebook notebook;

    @Override
    public String toString() {
        return "Лист с номером %s тетрадки '%s'".formatted(this.number, this.notebook.getName());
    }
}
