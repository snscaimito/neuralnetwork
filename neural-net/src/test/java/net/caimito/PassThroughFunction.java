package net.caimito;

public class PassThroughFunction implements SignalProcessingFunction {

	@Override
	public boolean isBeyondThreshold(double signalReceived) {
		return true;
	}

}
