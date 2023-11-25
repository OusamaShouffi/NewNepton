package com.example.Neptonmemorycrud;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SubjectServiceImpl implements SubjectService {
    private static final int MAXIMUM_SUBJECT_COUNT = 7;
    private final SubjectRepository subjectRepository;

    public SubjectServiceImpl(SubjectRepository subjectRepository) {
        this.subjectRepository = subjectRepository;
    }

    @Override
    public List<SubjectDto> findAll() {
        return subjectRepository.findAll();
    }

    @Override
    public SubjectDto getById(Long id) {
        return subjectRepository.getById(id);
    }

    @Override
    public Long save(SubjectDto articleDto) {
        if (subjectRepository.findAll().size() >= MAXIMUM_SUBJECT_COUNT) {
            throw new TooMuchArticleException();
        }
        return subjectRepository.save(articleDto);
    }
    @Override
    public void deleteById(Long id) {
        subjectRepository.deleteById(id);
    }
}
