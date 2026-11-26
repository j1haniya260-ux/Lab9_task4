public class Main {
    public static void main(String[] args) {
        ExceptionGenerator generator = new ExceptionGenerator();

        for (int i = 1; i <= 3; i++) {
            try {
                generator.checkValue(i);
            } catch (InvalidInputCodeException | OutOfRangeValueException | UnauthorizedActionException e) {
                System.out.println("Caught custom exception: " + e.getClass().getSimpleName() + " -> " + e.getMessage());
            }
        }
    }
}