class promote {
    public static void main(String[] args) {
        byte b = 42;
        char c = 'a'; // ASCII value of 'a' is 97
        short s = 1024;
        int i = 5000;
        float f = 6.74f;
        double d = 0.1234;

        double result = (f * b) + (i / c) - (d * s);
        
        System.out.println((f * b) + " + " + (i / c) + " - " + (d * s));
        System.out.println("Result: " + result);
}
}
