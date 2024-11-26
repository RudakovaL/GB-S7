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
public class Notebook {
    String name;
    List<Note> lists = new ArrayList<>();

    @Override
    public String toString() {
        return "Тетрадь '%s'. Листов '%s'".formatted(this.getName(), this.lists.size());
    }
}
