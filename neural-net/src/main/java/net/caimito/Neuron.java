package net.caimito;

import java.util.HashSet;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Neuron {
	private static Logger logger = LoggerFactory.getLogger(Neuron.class) ;
	
	private Set<Neuron> inputDentriteConnections = new HashSet<>() ;
	private Set<Neuron> outputAxonConnections = new HashSet<>() ;
	private double signalReceived ;
	private SignalProcessingFunction signalProcessingFunction;

	private Neuron(SignalProcessingFunction signalProcessingFunction) {
		this.signalProcessingFunction = signalProcessingFunction ;
	}
	
	public static Neuron createInputNeuron() {
		return new Neuron(null) ;
	}
	
	public static Neuron createRegularNeuron(SignalProcessingFunction function) {
		return new Neuron(function) ;
	}

	public void createDentriteConnection(Neuron neuron) {
		this.inputDentriteConnections.add(neuron) ;
		neuron.createAxonConnection(this);
	}
	
	private void createAxonConnection(Neuron neuron) {
		this.outputAxonConnections.add(neuron) ;
	}

	public void fireSignal() {
		if (signalProcessingFunction == null)
			doFire() ;
		else
			if (signalProcessingFunction.isBeyondThreshold(signalReceived))
				doFire() ;
	}

	private void doFire() {
		for (Neuron neighboringNeuron : outputAxonConnections) {
			logger.info("{} sending to {}", this, neighboringNeuron);
			neighboringNeuron.receiveSignal(signalReceived) ;
		}
	}
	
	public void receiveSignal(double signal) {
		logger.info("{} received {}", this, signal);
		signalReceived = signal ;
		fireSignal() ;
	}

	public double hasReceivedSignal() {
		return signalReceived ;
	}

}
