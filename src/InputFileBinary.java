public class InputFileBinary extends InputFile {
    public InputFileBinary(String fileName) {
        super(fileName);
    }

    public static InputFileBinary create(String fileName) {
        return new InputFileBinary(fileName);
    }
}