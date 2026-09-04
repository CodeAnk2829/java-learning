package lld.factorymethod.benchmark.products;

public abstract class Benchmark {
    private boolean isRunSuccessful;
    protected String datasetVersion;

    protected Benchmark(String datasetVersion) {
        this.isRunSuccessful = false;
        this.datasetVersion = datasetVersion;
    }

    protected abstract void loadDataset();
    protected abstract void evaluate();
    protected abstract void generateReport();

    public void run() {
        this.loadDataset();
        this.evaluate();
        this.generateReport();
        this.isRunSuccessful = true;
    }

    public String getRunStatus() {
        String runStatus = this.isRunSuccessful ? "SUCCESS" : "FAILED";
        return runStatus; 
    }
}
