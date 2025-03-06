package container;

public class NeuronDemo {
	
	private Neuron n;
	
	// Constructor to initialize the Neuron object
	public NeuronDemo() {
		this.n = null;
	}
	
	public void demonstrate() {
		Neuron.setMinWeightValue(0.1);
		Neuron.setMaxWeightValue(0.7);
		this.n = new Neuron(new double[] {0.2, 0.3, 0.4}, 0.2);
		this.n.setGradient(0.6);
		this.n.setValue(1);
	}

	public Neuron getN() {
		return n;
	}

	public void setN(Neuron n) {
		this.n = n;
	}
}
