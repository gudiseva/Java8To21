package java8to21;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Employees.class)
@interface Employee {
    int id();
    String name();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Employees {
    Employee[] value();
}

@Employee(id = 1, name = "Nag")
@Employee(id = 2, name = "Arvind")
@Employee(id = 3, name = "Gudiseva")
public class RepeatableAnnotations {

    public static void main(String[] args) {
        Employee[] employees = RepeatableAnnotations.class.getAnnotationsByType(Employee.class);
        for (Employee employee : employees) {
            System.out.println(employee.id() + " " + employee.name());
        }
    }
}
