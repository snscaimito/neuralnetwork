package net.caimito;

import java.util.ArrayList;
import java.util.List;

public class Layer {

	private List<Neuron> neuronsInLayer = new ArrayList<>() ;
	
	public Layer(int numberOfNeurons, SignalProcessingFunction function) {
		for (int i=0; i < numberOfNeurons; i++)
			neuronsInLayer.add(Neuron.createRegularNeuron(function)) ;
	}

	public List<Neuron> getNeurons() {
		return neuronsInLayer ;
	}

	public void connectTo(Layer otherLayer) {
		for (Neuron neuronThisLayer : neuronsInLayer) {
			for (Neuron neuronOtherLayer : otherLayer.getNeurons()) { 
				neuronThisLayer.createDentriteConnection(neuronOtherLayer);
			}
		}
	}

}
