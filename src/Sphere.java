import java.lang.Math;

public class Sphere {
    private int radius;
    public Sphere(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    public double getVolume() {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String sphereValues() {
        StringBuilder result = new StringBuilder();
        result.append("Kera raadius: ").append(getRadius()).append("\n");
        result.append("Kera pindala: ").append(getSurfaceArea()).append("\n");
        result.append("Kera ümbermõõt: ").append(getCircumference()).append("\n");
        result.append("Kera ruumala: ").append(getVolume()).append("\n");

        return result.toString();
    }

    public String sphereValuesToTxtFile() {
        return "Kera;" + radius + ";" + getSurfaceArea() + ";" + getCircumference() + ";" + getVolume() + ";";
    }

}
