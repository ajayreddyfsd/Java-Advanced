class Box<T> {      // T is a placeholder for any type
    private T content;

    public void setContent(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}

public class Main {
    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();  // Box for Strings
        stringBox.setContent("Hello");
        System.out.println(stringBox.getContent());  // Output: Hello

        Box<Integer> intBox = new Box<>();  // Box for Integers
        intBox.setContent(123);
        System.out.println(intBox.getContent());  // Output: 123
    }
}
