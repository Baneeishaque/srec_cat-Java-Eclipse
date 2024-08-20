class InputFilterSequence extends InputFilter {

	public InputFilterSequence(Input deeperInput) {
        super(deeperInput);
    }
	
	public static InputFilterSequence create(Input deeperInput) {
        return new InputFilterSequence(deeperInput);
    }
}