package java8to21;

import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

/*
## Class-Level vs Field-Level Usage
You can apply annotations globally or selectively based on your data hiding needs.

Class-Level: Generates accessors for all non-static fields in the class.
Field-Level: Targets specific variables individually.
 */

@Getter // Generates getters for all fields
@Setter // Generates setters for all fields
class User {
    private Long id;

    @NonNull
    private String name;
    private String email;

    // Overrides class-level setting to hide the setter for this field
    @Setter(lombok.AccessLevel.NONE)
    private String password;
}

/*
## The Convenient @Data Alternative
Instead of managing multiple annotations, you can use @Data at the class level.
It serves as a bundled shortcut that automatically applies:
 @Getter and @Setter
 @ToString
 @EqualsAndHashCode
 @RequiredArgsConstructor
 */

@Data
class Product {
    private String sku;
    private double price;
}

/*
## Advanced Configurations

Boolean Fields: For a boolean named active, Lombok names the getter isActive() instead of getActive().

Access Control: Pass parameters like @Setter(AccessLevel.PROTECTED) to change method visibility from public.

Fluent API: Add @Accessors(fluent = true) to remove the "get" and "set" prefixes entirely, allowing chainable methods like user.email("test@test.com").
 */
public class LombokTypeAnnotations {

    public static void main(String[] args) {
        User usr = new User();

        usr.setName("Arvind");
        System.out.println(usr.getName() + " <- This is a not Null String");

        try{
            usr.setName(null);
            System.out.println(usr.getName());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage() + " <- This is from the try catch exception.");
        }

        usr.setEmail(null);
        System.out.println(usr.getEmail() + " <- Null is printed.");
    }

}
