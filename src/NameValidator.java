package validators;

public class NameValidator implements Validator{
    // допишите код класса
    @Override
    public void validate(String value) throws ValidateException {
        if (value.isEmpty()) {
            throw new ValidateNameException("Имя не должно быть пустым");
        }
    }
}