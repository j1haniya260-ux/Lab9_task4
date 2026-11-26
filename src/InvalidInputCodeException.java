class InvalidInputCodeException extends Exception {
    public InvalidInputCodeException(String message) {
        super(message);
    }
}

class OutOfRangeValueException extends Exception {
    public OutOfRangeValueException(String message) {
        super(message);
    }
}

class UnauthorizedActionException extends Exception {
    public UnauthorizedActionException(String message) {
        super(message);
    }
}

class ExceptionGenerator {
    public void checkValue(int value)
            throws InvalidInputCodeException, OutOfRangeValueException, UnauthorizedActionException {
        if (value == 1) {
            throw new InvalidInputCodeException("Code 1 is invalid.");
        } else if (value == 2) {
            throw new OutOfRangeValueException("Value 2 is out of allowed range.");
        } else if (value == 3) {
            throw new UnauthorizedActionException("Value 3 is not authorized.");
        } else {
            System.out.println("Value " + value + " is valid.");
        }
    }
}