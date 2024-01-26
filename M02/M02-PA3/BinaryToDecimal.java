public class BinaryToDecimal {
    public static long bin2Dec(String binary) throws BinaryFormatException {
        long bin = Long.parseLong(binary);
        long decimal = 0;
        long base = 1;
        long temp = bin;
        
        while (temp > 0) {
            long lastNumber = temp % 10;
            if (lastNumber < 0 || lastNumber > 1) {
                throw new BinaryFormatException(binary);
            }
            temp = temp / 10;

            decimal += lastNumber * base;
            base = base * 2;
        }
        return decimal;
    } 
}
