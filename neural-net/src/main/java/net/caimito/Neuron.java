package net.caimito;

public class Neuron {
	
	private double inputWeight;
	private double outputWeight;

	public Neuron(double inputWeight, double outputWeight) {
		this.inputWeight = inputWeight ;
		this.outputWeight = outputWeight ;
	}

	public double getInputWeight() {
		return inputWeight ;
	}

	public double getOutputWeight() {
		return outputWeight ;
	}
}
