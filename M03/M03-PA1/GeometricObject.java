public abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    // *Using protected because it is only used by subclasses*
    // Construct a default geometric object
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    // Construct a geometric object with color and  filled value
    protected GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }

    // Return color
    public String getColor() {
        return color;
    }

    // Set new color
    public void setColor(String color) {
        this.color = color;
    }

    // Return value of filled
    public boolean isFilled() {
        return filled;
    }

    // Set a new value of filled 
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // Get dateCreated
    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color
                + " and filled " + filled;
    }

    /* You cannot create instances of abstract classes using the
       "new" operator */
    // Abstract method getArea
    public abstract double getArea(); 

    // Abstract method getPerimeter
    public abstract double getPerimeter();
}