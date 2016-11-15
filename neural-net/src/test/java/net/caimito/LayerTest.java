package net.caimito;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class LayerTest {
	
	@Test
	public void createLayer() {
		Layer layer = new Layer(2, new HalfValueFunction()) ;
		assertThat(layer.getNeurons().size(), is(2)) ;
	}

	@Test
	public void twoFullyConnectedLayers() {
		Layer sendingLayer = new Layer(2, new PassThroughFunction()) ;
		Layer receivingLayer = new Layer(2, new PassThroughFunction()) ;
		
		receivingLayer.connectTo(sendingLayer) ;
		
		Neuron neuronSendingLayer = sendingLayer.getNeurons().get(0) ;
		neuronSendingLayer.receiveSignal(0.7);
		
		Neuron neuronOneReceivingLayer = receivingLayer.getNeurons().get(0) ;
		assertThat(neuronOneReceivingLayer.hasReceivedSignal(), is(0.7)) ;
		
		Neuron neuronTwoReceivingLayer = receivingLayer.getNeurons().get(1) ;
		assertThat(neuronTwoReceivingLayer.hasReceivedSignal(), is(0.7)) ;
	}
}
