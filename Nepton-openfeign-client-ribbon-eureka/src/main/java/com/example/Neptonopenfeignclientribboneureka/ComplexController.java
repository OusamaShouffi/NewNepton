package com.example.Neptonopenfeignclientribboneureka;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ComplexController {
    private static final int Best_Score_THRESHOLD = 85;
    private final SubjectClient subjectClient;

    @GetMapping("find-all-best-subject")
    List<SubjectDto> findAllBestSubject() {
        return subjectClient.allSubjects().stream()
                .filter(subject -> subject.getScore() > Best_Score_THRESHOLD)
                .toList();
    }
}
