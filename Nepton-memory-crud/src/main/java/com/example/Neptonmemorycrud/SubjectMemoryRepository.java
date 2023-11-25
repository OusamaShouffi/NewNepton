package com.example.Neptonmemorycrud;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SubjectMemoryRepository implements SubjectRepository {
    private final List<SubjectDto> subject = new ArrayList<>();

    public int findSubjectById(Long id) {
        int found = -1;
        for (int i = 0; i < subject.size(); i++) {
            if (subject.get(i).getId().equals(id)) {
                found = i;
                break;
            }
        }
        return found;
    }

    @Override
    public List<SubjectDto> findAll() {
        return subject;
    }

    @Override
    public SubjectDto getById(Long id) {
        int subjectByIdIndex = findSubjectById(id);

        return subjectByIdIndex == -1 ? null : subject.get(subjectByIdIndex);
    }

    @Override
    public Long save(SubjectDto subjectDto) {
        int found = findSubjectById(subjectDto.getId());

        if (found != -1) {
            SubjectDto foundArticle = subject.get(found);
            foundArticle.setName(subjectDto.getName());
            foundArticle.setScore(subjectDto.getScore());
            foundArticle.setScore(subjectDto.getSemester());
            foundArticle.setTeacher(subjectDto.getTeacher());
        } else {
            subject.add(subjectDto);
        }
        return null;
    }

    @Override
    public void deleteById(Long id) {
        int found = findSubjectById(id);

        if (found != -1) {
            subject.remove(found);
        }
    }
}
