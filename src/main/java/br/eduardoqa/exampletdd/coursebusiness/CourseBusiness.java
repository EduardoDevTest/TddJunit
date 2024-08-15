package br.eduardoqa.exampletdd.coursebusiness;


//SUT

import br.eduardoqa.exampletdd.service.CourseService;

import java.util.ArrayList;
import java.util.List;

public class CourseBusiness {

    // Teremos uma depedendencia de course service
    private CourseService service;

    public CourseBusiness(CourseService service) {
        this.service = service;
    }

    public List<String> retiviercourseRelatedToSpring(String student) {

        var filteredCourses = new ArrayList<String>();
        var allCourses = service.retrivierCourse(student);

        for (String courses : allCourses) {
            if(courses.contains("Spring")){
                filteredCourses.add(courses);
            }
        }


        return filteredCourses;




    }




}
