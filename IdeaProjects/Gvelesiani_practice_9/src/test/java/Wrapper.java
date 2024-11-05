public class Wrapper <T> {
    private T value;

    public Wrapper(T value) {
        this.value = value;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Wrapper<String> stringWrapper = new Wrapper<>("ჯავას კურსი თითქმის დაასრულე!");
        System.out.println("String value: " + stringWrapper.getValue());

        Wrapper<Double> doubleWrapper = new Wrapper<>(99.9);
        System.out.println("Double value: " + doubleWrapper.getValue());

        stringWrapper.setValue("დარჩა ერთი დავალება!");
        System.out.println("Updated String value: " + stringWrapper.getValue());
    }
}