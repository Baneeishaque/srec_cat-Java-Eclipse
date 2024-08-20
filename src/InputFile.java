public class InputFile extends Input {
    private String fileName;

    public InputFile(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String filename() {
        return fileName;
    }
}