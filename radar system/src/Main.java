import java.util.Scanner;

class RadarSystem {
    private double radarRange;

    public RadarSystem(double radarRange) {
        this.radarRange = radarRange;
    }

    public void detectObject(double distance) {
        if (distance <= radarRange) {
            System.out.println("Object detected within radar range.");
        } else {
            System.out.println("No object detected within radar range.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radar range: ");
        double radarRange = scanner.nextDouble();

        RadarSystem radar = new RadarSystem(radarRange);

        while (true) {
            System.out.print("Enter distance to object (or -1 to exit): ");
            double distance = scanner.nextDouble();

            if (distance == -1) {
                System.out.println("Exiting...");
                break;
            }

            radar.detectObject(distance);
        }

        scanner.close();
    }
}
