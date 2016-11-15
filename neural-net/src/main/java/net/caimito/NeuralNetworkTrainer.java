package net.caimito;

public class NeuralNetworkTrainer {

	private NeuralNet trainedNetwork;
	private double[][] trainSet;
	private double[] expectedOutputSet;
	private int maxEpochs;
	private double targetError;
	private double learningRate;

	public NeuralNetworkTrainer(NeuralNet networkToBeTrained) {
		this.trainedNetwork = networkToBeTrained ;
	}

	public NeuralNet train() {
		return trainedNetwork ;
	}

	public NeuralNetworkTrainer trainSet(double[][] trainSet) {
		this.trainSet = trainSet ;
		return this;
	}

	public NeuralNetworkTrainer expectedOutputSet(double[] expectedOutput) {
		this.expectedOutputSet = expectedOutput ;
		return null;
	}

	public NeuralNetworkTrainer maxEpochs(int epochs) {
		this.maxEpochs = epochs ;
		return this;
	}

	public NeuralNetworkTrainer targetError(double targetError) {
		this.targetError = targetError ;
		return this;
	}

	public NeuralNetworkTrainer learningRate(double learningRate) {
		this.learningRate = learningRate ;
		return this;
	}

}
