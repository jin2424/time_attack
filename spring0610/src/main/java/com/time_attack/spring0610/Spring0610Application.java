package com.time_attack.spring0610;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Spring0610Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring0610Application.class, args);
	}

}
	@Bean
	public CommandLineRunner demo(CourseRepository courseRepository, CourseService courseService) {
		return (args) -> {
			courseRepository.save(new Course("프론트엔드의 꽃, 리액트", "임민영"));

			System.out.println("데이터 인쇄");
			List<Course> courseList = courseRepository.findAll();
			for (int i=0; i<courseList.size(); i++) {123
				Course course = courseList.get(i);
				System.out.println(course.getId());
				System.out.println(course.getTitle());
				System.out.println(course.getTutor());
			}

			CourseRequestDto requestDto = new CourseRequestDto("웹개발의 봄, Spring", "임민영");
			courseService.update(1L, requestDto);
			courseList = courseRepository.findAll();
			for (int i=0; i<courseList.size(); i++) {
				Course course = courseList.get(i);
				System.out.println(course.getId());
				System.out.println(course.getTitle());
				System.out.println(course.getTutor());
			}
		};
	}
}