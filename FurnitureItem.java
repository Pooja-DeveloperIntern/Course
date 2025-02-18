// FurnitureItem.java
public class FurnitureItem {
    // Attributes
    private String type;
    private String material;
    private String color;
    private int grade;
    private String usage;
    private double price;

    // Constructor
    public FurnitureItem(String type, String material, String color, int grade, String usage, double price) {
        this.type = type;
        this.material = material;
        this.color = color;
        this.grade = grade;
        this.usage = usage;
        this.price = price;
    }

    // Method to apply a 5% discount if the furniture is for outdoor use
    public void applyDiscount() {
        if (usage.equalsIgnoreCase("outdoor")) {
            price *= 0.95; // Apply 5% discount
        }
    }

    // Method to display furniture details
    public void displayDetails() {
        System.out.println("Furniture Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Grade: " + grade);
        System.out.println("Usage: " + usage);
        System.out.println("Price after discount (if applicable): $" + String.format("%.2f", price));
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a furniture object
        FurnitureItem chair = new FurnitureItem("Chair", "Plastic", "Red", 2, "Outdoor", 150.0);

        // Applying discount
        chair.applyDiscount();

        // Displaying details
        chair.displayDetails();
    }
}
