class Rev extends Exception {
    Rev(String msg) {
        super(msg);
    }
}

public class CustomExceptions {
    public static void main(String[] args) {
        try {
            int age = 17;
            if (age < 18) throw new Rev("not eligible");
            System.out.println("eligible");
        } catch (Rev e) {
            System.out.println(e.getMessage());
        }
    }
}