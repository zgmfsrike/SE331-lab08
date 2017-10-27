package camt.cbsd.lab05.course;

import camt.cbsd.lab05.entity.Course;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,Long> {
}
