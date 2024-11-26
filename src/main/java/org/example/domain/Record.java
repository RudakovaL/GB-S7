package org.example.domain;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Record {

    String content;

    LocalDateTime time = LocalDateTime.now();

    Note note;

    @Override
    public String toString() {
        return """
                \nЗапись от %s
                Текст записи:
                %s
                """.formatted(this.time,this.content);
    }
}
