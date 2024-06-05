import java.io.File;

public class Model {
    public Model() {

    }

    public static boolean isNumber(String userInput) {
        try {
            int number = Integer.parseInt(userInput);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public String getSphereUserInput(String shpereRadius) {
        if(isNumber(shpereRadius)) {
            int radius = Integer.parseInt(shpereRadius);
            return calculateSphere(radius);
        }
        return null;
    }

    public String calculateSphere(int radius) {
        Sphere sphere = new Sphere(radius);
        FileHandler.appendToFile(sphere.sphereValuesToTxtFile());
        return sphere.sphereValues();
    }

    public String getCylinderUserInput(String cylinderRadius, String cylinderHeight) {
        if(isNumber(cylinderRadius) && isNumber(cylinderHeight)) {
            int radius = Integer.parseInt(cylinderRadius);
            int height = Integer.parseInt(cylinderHeight);
            return calculateCylinder(radius, height);
        }
        return null;
    }

    public String calculateCylinder(int radius, int height) {
        Cylinder cylinder = new Cylinder(radius, height);
        FileHandler.appendToFile(cylinder.cylinderValuesToTxtFile());
        return cylinder.cylinderValues();
    }

    public boolean checkIfFileExists() {
        String filePath = FileHandler.getFilePath();
        return new File(filePath).exists();
    }


}
