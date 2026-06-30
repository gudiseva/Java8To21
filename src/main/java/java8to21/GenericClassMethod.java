package java8to21;

class GenericClass<DataType>{

    public void genericMethod(DataType value){
        System.out.println(value);
    }

}

public class GenericClassMethod {

    public static void main(String[] args) {

        GenericClass<Integer> obj1 = new GenericClass<Integer>();
        obj1.genericMethod(10);

        // Diamond operator only & different data type
        GenericClass<String> obj2 = new GenericClass<>();
        obj2.genericMethod("Arvind");

    }

}
