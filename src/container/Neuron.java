package container;

public class Neuron {
	
	private static double minWeightValue;
	private static double maxWeightValue;
	private double[] weights;
	private double gradient;
	private double bias;
	private double value;
	
	public Neuron(double[] weights, double bias) {
		this.setWeights(weights);
		this.setBias(bias);
		this.setGradient(0);
		this.setValue(0);
	}
	
	public Neuron(double value) {
		this.setValue(value);
		this.setWeights(null);
		this.setBias(-1);
		this.setGradient(-1);
	}
	
	public Neuron(Neuron o) {
		this(o.getWeights(), o.getBias());
	}
	
	public static void setRangeWeight(double min, double max) {
		Neuron.setMinWeightValue(min);
		Neuron.setMaxWeightValue(max);
	}

	public static double getMinWeightValue() {
		return minWeightValue;
	}

	public static void setMinWeightValue(double minWeightValue) {
		Neuron.minWeightValue = minWeightValue;
	}

	public static double getMaxWeightValue() {
		return maxWeightValue;
	}

	public static void setMaxWeightValue(double maxWeightValue) {
		Neuron.maxWeightValue = maxWeightValue;
	}

	public double[] getWeights() {
		return weights;
	}

	public void setWeights(double[] weights) {
		this.weights = weights;
	}

	public double getGradient() {
		return gradient;
	}

	public void setGradient(double gradient) {
		this.gradient = gradient;
	}

	public double getBias() {
		return bias;
	}

	public void setBias(double bias) {
		this.bias = bias;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
	
}
