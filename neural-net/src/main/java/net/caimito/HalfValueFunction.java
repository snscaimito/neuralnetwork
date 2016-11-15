package net.caimito;

public class HalfValueFunction implements SignalProcessingFunction {

	@Override
	public boolean isBeyondThreshold(double signalReceived) {
		return signalReceived > 0.5 ;
	}

}
