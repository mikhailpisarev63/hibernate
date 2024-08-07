package mysqllibrary;

import lombok.Getter;

@Getter
public class RequestStringSQL {
    private final String coursesWherePrice = "Select * From Courses where price >= '100000'";
    private final String studentsCourseName = "SELECT pl.course_name, pl.subscription_date " +
            "FROM PurchaseList pl " +
            "WHERE pl.course_name = \"Веб-разработчик c 0 до PRO\" " +
            "ORDER BY pl.subscription_date;";
    private final String resultSqlRegistrationDate = "SELECT * FROM Students s " +
            "WHERE MONTH(s.registration_date ) = 4;";
}
