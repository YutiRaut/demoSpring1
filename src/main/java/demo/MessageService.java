package demo;

public interface MessageService {
    String getMessage();
}

class MessageServiceImpl implements MessageService {
    @Override
    public String getMessage() {
        return "Hello, Spring!";
    }
}
