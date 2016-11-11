package net.caimito;

import static org.hamcrest.Matchers.emptyCollectionOf;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NeuralNetTest {

	@Test
	public void createEmptyNetwork() {
		NeuralNet network = new NeuralNet(0, 0);

		assertThat(network.getHiddenLayers(), emptyCollectionOf(Layer.class));
		assertThat(network.getInputLayer(), is(instanceOf(Layer.class)));
		assertThat(network.getOutputLayer(), is(instanceOf(Layer.class)));
	}

	@Test
	public void initializeSingleLayerNetwork() {
		NeuralNet network = new NeuralNet(1, 0);

		assertThat(network.getHiddenLayers().size(), is(1));
		assertThat(network.getInputLayer(), is(instanceOf(Layer.class)));
		assertThat(network.getOutputLayer(), is(instanceOf(Layer.class)));
	}

	@Test
	public void initializeSingleLayerNetworkTwoNeurons() {
		NeuralNet network = new NeuralNet(1, 2);

		assertThat(network.getInputLayer(), is(instanceOf(Layer.class)));
		assertThat(network.getOutputLayer(), is(instanceOf(Layer.class)));

		assertThat(network.getHiddenLayers().size(), is(1));
		Layer hiddenLayer = network.getHiddenLayers().get(0);
		assertThat(hiddenLayer.getNeurons(), hasItem(instanceOf(Neuron.class)));
		assertThat(hiddenLayer.getNeurons().size(), is(2));

		assertThat(network.getInputLayer().getNeurons().size(), is(2));
		assertThat(network.getOutputLayer().getNeurons().size(), is(2));
	}

}
