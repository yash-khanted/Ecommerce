package my.project.ecommerce.exceptions;

public class DuplicateRecordFoundException extends RuntimeException{
    @Override
    public String getMessage() {
        return "The product cannot be saved as duplicate product found";
    }
}
