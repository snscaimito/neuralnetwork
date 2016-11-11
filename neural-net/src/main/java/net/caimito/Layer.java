package net.caimito;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Layer {

	private List<Neuron> neuronsInLayer = new ArrayList<>() ;
	
	public Layer(int numberOfNeurons) {
		Random randomInputWeight = new Random() ;
		Random randomOutputWeight = new Random() ;
		
		for (int i=0; i < numberOfNeurons; i++)
			neuronsInLayer.add(new Neuron(randomInputWeight.nextDouble(), randomOutputWeight.nextDouble())) ;
	}

	public List<Neuron> getNeurons() {
		return neuronsInLayer ;
	}

}
