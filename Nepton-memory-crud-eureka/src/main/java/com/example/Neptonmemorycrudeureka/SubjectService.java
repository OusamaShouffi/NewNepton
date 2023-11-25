package com.example.Neptonmemorycrudeureka;

import java.util.List;

public interface SubjectService {
    List<SubjectDto> findAll();
    SubjectDto getById(Long id);
    Long save(SubjectDto articleDto);
    void deleteById(Long id);
}
