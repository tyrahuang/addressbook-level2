package seedu.addressbook.data.person;

import seedu.addressbook.data.exception.IllegalValueException;

public class Contact {
	public final String value;
    private boolean isPrivate;
    
	public Contact(String value, boolean isPrivate, String messageConstraints, String validationRegex)throws IllegalValueException{
		this.isPrivate = isPrivate;
        if (!isValid(value, validationRegex)) {
            throw new IllegalValueException(messageConstraints);
        }
        this.value = value;
	}

	public static boolean isValid(String test, String validationRegex) {
        return test.matches(validationRegex);
    }
	
	@Override
	public String toString() {
		return value;
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	public boolean isPrivate() {
		return isPrivate;
	}
}
