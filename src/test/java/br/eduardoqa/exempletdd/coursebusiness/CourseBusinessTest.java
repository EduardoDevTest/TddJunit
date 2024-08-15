package br.eduardoqa.exempletdd.coursebusiness;

import br.eduardoqa.exampletdd.SimpleMath;
import br.eduardoqa.exampletdd.coursebusiness.CourseBusiness;
import br.eduardoqa.exampletdd.service.CourseService;
import courseservice.stubs.CourseServiceStub;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CourseBusinessTest {
    SimpleMath simpleMath = new SimpleMath();

    @Test
    void testRetivierCourseRelatedToSpring_when_UsingAStub() {

        // Given
        CourseService stubCourseService = new CourseServiceStub();
        CourseBusiness business = new CourseBusiness(stubCourseService);


        // When / act
        var filteredcourse = business.retiviercourseRelatedToSpring("Eduardo");

        // Asserts
        Assertions.assertEquals(5 , filteredcourse.size());

    }

}