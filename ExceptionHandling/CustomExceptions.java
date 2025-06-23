class InvalidDataFormatException extends Exception {
    public InvalidDataFormatException(String message) {
        super(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            processData("some data; invalid format");
        } catch (InvalidDataFormatException e) {
            System.err.println("Error processing data: " + e.getMessage());
        }
    }

    public static void processData(String data) throws InvalidDataFormatException {
        if (!data.contains(",")) {
            throw new InvalidDataFormatException("Data does not contain the required comma separator.");
        }
        System.out.println("Data processed successfully");
    }
}
