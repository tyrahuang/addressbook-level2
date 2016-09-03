package seedu.addressbook.data.exception;

public class FileDeleteException extends Exception{
	public FileDeleteException(){
		super();
	}
	
	public FileDeleteException(String message){
		super(message);
	}
	
}
