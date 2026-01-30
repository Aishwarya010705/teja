class car {
    String color;

    void run() {
        System.out.println("The " + color + " car is running.");
    }
}

public class code7 {
    public static void main(String args[]) {
        car RR = new car();
        RR.color = "White & blue";
        RR.run();
    }
}