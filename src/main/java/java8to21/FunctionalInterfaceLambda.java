package java8to21;

interface GenericInterface<T> {
    public void info(String t);
}

class ImplementedClass<T> implements GenericInterface<String> {
    @Override
    public void info(String t) {
        System.out.println(t);
    }
}

public class FunctionalInterfaceLambda {

    public static void main(String[] args) {

        // [1] Implemented Class
        GenericInterface obj1 = new ImplementedClass();
        obj1.info("Implemented -> Arvind");

        // [2] Anonymous Inner Class
        GenericInterface obj2 = new GenericInterface(){
            @Override
            public void info(String t){
                System.out.println("Anonymous -> " +t);
            }
        };
        obj2.info("Arvind");

        // [3] Using Lambda
        GenericInterface obj3 = (String n) -> {
            System.out.println("Lambda -> " +n);
        };
        obj3.info("Arvind");

    }

}
