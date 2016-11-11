package net.caimito;

import java.util.ArrayList;
import java.util.List;

public class NeuralNet {
	private ArrayList<Layer> hiddenLayers = new ArrayList<>() ;
	private Layer inputLayer;
	private Layer outputLayer;
	
	public NeuralNet(int numberOfHiddenLayers, int numberOfNeuronsPerLayer) {
		initNetwork(numberOfHiddenLayers, numberOfNeuronsPerLayer) ;
		
		inputLayer = new Layer(numberOfNeuronsPerLayer) ;
		outputLayer = new Layer(numberOfNeuronsPerLayer) ;
	}

	private void initNetwork(int layers, int numberOfNeurons) {
		for (int i = 0; i < layers; i++)
			hiddenLayers.add(new Layer(numberOfNeurons)) ;
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

}
