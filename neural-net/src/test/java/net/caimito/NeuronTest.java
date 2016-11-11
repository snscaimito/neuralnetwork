package net.caimito;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NeuronTest {

	@Test
	public void createNeuron() {
		Neuron neuron = new Neuron(0.1, 0.2) ;
		assertThat(neuron.getInputWeight(), is(0.1));
		assertThat(neuron.getOutputWeight(), is(0.2)) ;
	}
}
