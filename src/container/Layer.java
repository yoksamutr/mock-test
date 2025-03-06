package container;
import function.Function;
import util.Activation;
import util.GenRandom;

public class Layer {
	
	private Neuron[] neurons;
	private Function function;
	
	public Layer(int inNeurons, int nNeurons, Function function) {
		this.setFunction(function);
		this.setNeurons(new Neuron[nNeurons]);
		
		for(int i=0; i<nNeurons; i++) {
			double[] weights = new double[inNeurons];
			for(int j=0; j<inNeurons; j++) {
				weights[j] = GenRandom.randomDouble(Neuron.getMinWeightValue(), Neuron.getMaxWeightValue());
			}
			double bias = GenRandom.randomDouble(0, 1);
            neurons[i] = new Neuron(weights, bias);
		}
	}
	
	public Layer(double[] input) {
		this.setNeurons(new Neuron[input.length]);
		for(int i=0; i<this.getNeurons().length; i++) {
			this.getNeurons()[i] = new Neuron(input[i]);
		}
		this.setFunction(null);
	}
	
	public double applyActivation(double x) {
		if (function == null) {
			throw new IllegalArgumentException("Unknown activation function: null");
		}
		switch (function) {
        case SIGMOID:
            return Activation.sigmoid(x);
        case TANH:
            return Activation.tanh(x);
        case RELU:
            return Activation.relu(x);
        default:
            throw new IllegalArgumentException("Unknown activation function: " + function);
		}
	}
	
	public double applyActivationDerivative(double x) {
		if (function == null) {
			throw new IllegalArgumentException("Unknown activation function: null");
		}
		switch (function) {
		case SIGMOID:
			return Activation.sigmoidDerivative(x);
		case TANH:
			return Activation.tanhDerivative(x);
		case RELU:
			return Activation.reluDerivative(x);
		default:
			throw new IllegalArgumentException("Unknown activation function: " + function);
		}
	}

	public Neuron[] getNeurons() {
		return neurons;
	}

	public void setNeurons(Neuron[] neurons) {
		this.neurons = neurons;
	}

	public Function getFunction() {
		return function;
	}

	public void setFunction(Function function) {
		this.function = function;
	}
	
	
}
