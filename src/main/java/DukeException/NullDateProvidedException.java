package DukeException;

public class NullDateProvidedException extends RuntimeException {
    public NullDateProvidedException(String str) {
        super(str);
    }

    public NullDateProvidedException() {
        super();
    }
}
