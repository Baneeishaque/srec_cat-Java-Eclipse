import java.util.Objects;
class InputFilter extends Input {
    private Input deeperInput;

    public InputFilter(Input deeperInput) {
        this.deeperInput = Objects.requireNonNull(deeperInput);
    }
    
    @Override
    public String filename() {
        return deeperInput.filename();
    }
}