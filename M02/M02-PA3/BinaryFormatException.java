public class BinaryFormatException extends NumberFormatException {
    private String binary;

    public BinaryFormatException(String binary) {
        super(binary + " is not a binary string");
        this.binary = binary;
    }

    public String getBinary() {
        return binary;
    }
}
