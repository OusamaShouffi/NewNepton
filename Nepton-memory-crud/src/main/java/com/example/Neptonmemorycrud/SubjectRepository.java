package com.example.Neptonmemorycrud;

import java.util.List;

public interface SubjectRepository {
    List<SubjectDto> findAll();
    SubjectDto getById(Long id);
    Long save(SubjectDto subjectDto);
    void deleteById(Long id);
}
