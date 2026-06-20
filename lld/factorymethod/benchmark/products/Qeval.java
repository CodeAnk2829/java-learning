package lld.factorymethod.benchmark.products;

public class Qeval extends Benchmark {
    public Qeval(String datasetVersion) {
        super(datasetVersion);
    }

    protected void loadDataset() {
        System.out.println("Loading the dataset of version " + this.datasetVersion + " for Qeval...");
    }

    protected void evaluate() {
        System.out.println("Evaluating on Qeval benchmark...");
    }
    
    protected void generateReport() {
        System.out.println("Generating reports for the previous run...");
    }
}
