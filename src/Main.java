





public class Main {

	public static void main(String[] args) {
		String fn = "../../sample_files/hello_world.txt";
		Input ifp = InputFileBinary.create(fn);
		ifp = InputFilterSequence.create(ifp);
	}
}
