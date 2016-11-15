package net.caimito;

public class Main {

	private static NeuralNet network ;
	
	public static void main(String[] args) {
		network = new NeuralNetworkBuilder()
				.withHiddenLayers(1)
				.withNeuronsPerLayer(2)
				.build() ;
		
		printInputLayer() ;
		printHiddenLayers() ;
		printOutputLayer() ;
	}

	private static void printOutputLayer() {
		System.out.println("OUTPUT LAYER ============");
		printLayer(network.getOutputLayer()) ;
	}

	private static void printHiddenLayers() {
		System.out.println("HIDDEN LAYERS ============");
		
		for (Layer layer : network.getHiddenLayers()) {
			System.out.println("=== HIDDEN LAYER =======") ;
			printLayer(layer);
		}
	}

	private static void printInputLayer() {
		System.out.println("INPUT LAYER ============");
		printLayer(network.getInputLayer()) ;
	}
	
	private static void printLayer(Layer layer) {
		for (Neuron neuron : layer.getNeurons()) {
			System.out.println(neuron);
		}
	}

}
