package lld.factorymethod.benchmark.products;

public class Truebench extends Benchmark {
    public Truebench(String datasetVersion) {
        super(datasetVersion);
    }

    protected void loadDataset() {
        System.out.println("Loading the dataset of version " + this.datasetVersion + " for Truebench...");
    }

    protected void evaluate() {
        System.out.println("Evaluating on Truebench benchmark...");
    }

    protected void generateReport() {
        System.out.println("Generating reports for the previous run...");
    }
}
