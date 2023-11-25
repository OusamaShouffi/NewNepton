package com.example.Neptonmemorycrudeureka;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping(path="subject")
public class SubjectController {
	private final SubjectService subjectService;
	public SubjectController(SubjectService subjectService) {
		this.subjectService = subjectService;
	}
	@GetMapping(path="", produces= MediaType.APPLICATION_JSON_VALUE)
	public List<SubjectDto> allSubjects() {
		log.info("allSubjects");
		return subjectService.findAll();
	}
	@PostMapping(path="")
	public void newSubject(@RequestBody @Valid SubjectDto subjectDto) {
		subjectService.save(subjectDto);
	}
	@PutMapping(path="/")
	public void replaceSubject(@RequestBody @Valid SubjectDto subjectDto) {
		subjectService.save(subjectDto);
	}
	@DeleteMapping (path="/{id}")
	public void deleteSubject(@PathVariable("id") Long id) {
		subjectService.deleteById(id);
	}
}
