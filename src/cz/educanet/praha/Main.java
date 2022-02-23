package cz.educanet.praha;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final LanderControls controls = new LanderControls();
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter your altitude: ");
        final int altitude = sc.nextInt();
        System.out.println("Enter your velocity: ");
        final int velocity = sc.nextInt();

        try {
            final var lander = new LunarLanding(
                    controls,
                    altitude,
                    velocity
            );
            System.out.println("Total amount of fuel: " + lander.land());
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
