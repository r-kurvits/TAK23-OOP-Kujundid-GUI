import java.lang.Math;

public class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public double getTotalSurfaceArea() {
        double baseArea = 2 * Math.PI * Math.pow(radius, 2);
        double lateralArea = 2 * Math.PI * radius * height;
        return baseArea + lateralArea;
    }

    public double getlateralSurfaceArea() {
        return 2 * Math.PI * radius * height;
    }

    public double getVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    public String cylinderValues() {
        StringBuilder result = new StringBuilder();
        result.append("Silindri raadius: ").append(getRadius()).append("\n");
        result.append("Silindri kõrgus: ").append(getHeight()).append("\n");
        result.append("Silindri kogu pindala: ").append(getTotalSurfaceArea()).append("\n");
        result.append("Silindri külg pindala: ").append(getlateralSurfaceArea()).append("\n");
        result.append("Silindri ruumala: ").append(getVolume()).append("\n");

        return result.toString();
    }

    public String cylinderValuesToTxtFile() {
        return "Silinder;" + radius + ";" + height + ";" + getTotalSurfaceArea() + ";" + getlateralSurfaceArea() + ";" + getVolume();
    }
}
