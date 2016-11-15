package net.caimito;

public class NeuralNetworkBuilder {

	private int numberOfHiddenLayers;
	private int numberOfNeuronsPerLayer;
	private SignalProcessingFunction signalProcessingFunction ;

	public NeuralNet build() {
		return new NeuralNet(numberOfHiddenLayers, numberOfNeuronsPerLayer, signalProcessingFunction) ;
	}

	public NeuralNetworkBuilder withHiddenLayers(int numberOfHiddenLayers) {
		this.numberOfHiddenLayers = numberOfHiddenLayers ;
		
		return this;
	}

	public NeuralNetworkBuilder withNeuronsPerLayer(int numberOfNeuronsPerLayer) {
		this.numberOfNeuronsPerLayer = numberOfNeuronsPerLayer ;
		
		return this;
	}
	
	public NeuralNetworkBuilder withSignalFunction(SignalProcessingFunction function) {
		this.signalProcessingFunction = function ;
		
		return this ;
	}

}
