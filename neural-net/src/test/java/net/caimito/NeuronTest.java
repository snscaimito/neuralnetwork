package net.caimito;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NeuronTest {

	@Test
	public void neuronFires() {
		Neuron inputNeuron = Neuron.createInputNeuron() ;
		Neuron middleNeuron = Neuron.createRegularNeuron(new HalfValueFunction()) ;
		Neuron receivingNeuron = Neuron.createRegularNeuron(new HalfValueFunction()) ;
		
		middleNeuron.createDentriteConnection(inputNeuron);
		receivingNeuron.createDentriteConnection(middleNeuron);
		
		inputNeuron.receiveSignal(0.7) ;
		
		assertThat(receivingNeuron.hasReceivedSignal(), is(greaterThan(0.0))) ;
	}
	
	@Test
	public void neuronDoesNotFire() {
		Neuron inputNeuron = Neuron.createInputNeuron() ;
		Neuron receivingNeuron = Neuron.createRegularNeuron(new HalfValueFunction()) ;
		
		receivingNeuron.createDentriteConnection(inputNeuron);
		inputNeuron.fireSignal() ;
		
		assertThat(receivingNeuron.hasReceivedSignal(), is(0.0)) ;
	}
	
}
