package com.example.Neptonmemorycrudeureka;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Objects;
@Data
public class SubjectDto {
    @NotNull
    private Long id;
    @NotNull
    @NotBlank
    private String name;
    @NotBlank
    private String teacher;
    private Integer semester;

    @Min(10)
    private Integer score;

    @Override
    public String toString() {
        return "SubjectDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", semester='" + semester + '\'' +
                ", score=" + score +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectDto that = (SubjectDto) o;
        return id.equals(that.id) && name.equals(that.name) && teacher.equals(that.teacher) && semester.equals(that.semester) && score.equals(that.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, teacher, semester, score);
    }
}
