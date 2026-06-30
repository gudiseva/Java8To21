package java8to21;

public class DiamondGenericClass<DataType> {

    DataType value;

    // Constructor
    public DiamondGenericClass(DataType value) {
        this.value = value;
    }

    public DataType getValue() {
        return value;
    }

    public static void main(String[] args) {
        DiamondGenericClass<String> obj1 = new DiamondGenericClass<String>("Arvind");
        System.out.println(obj1.getValue());

        // Diamond operator only
        DiamondGenericClass<String> obj2 = new DiamondGenericClass<>("Gudiseva");
        System.out.println(obj2.getValue());
    }
}
