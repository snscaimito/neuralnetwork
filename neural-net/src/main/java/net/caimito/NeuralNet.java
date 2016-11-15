package net.caimito;

import java.util.ArrayList;
import java.util.List;

public class NeuralNet {
	private ArrayList<Layer> hiddenLayers = new ArrayList<>() ;
	private Layer inputLayer;
	private Layer outputLayer;
	
	public NeuralNet(int numberOfHiddenLayers, int numberOfNeuronsPerLayer, SignalProcessingFunction function) {
		initNetwork(numberOfHiddenLayers, numberOfNeuronsPerLayer, function) ;
		
		inputLayer = new Layer(numberOfNeuronsPerLayer, function) ;
		outputLayer = new Layer(numberOfNeuronsPerLayer, function) ;
	}

	private void initNetwork(int layers, int numberOfNeurons, SignalProcessingFunction function) {
		for (int i = 0; i < layers; i++)
			hiddenLayers.add(new Layer(numberOfNeurons, function)) ;
	}

	public List<Layer> getHiddenLayers() {
		return hiddenLayers ;
	}

	public Layer getInputLayer() {
		return inputLayer ;
	}

	public Layer getOutputLayer() {
		return outputLayer ;
	}

	public NeuralNet train() {
		return this;
	}

}
