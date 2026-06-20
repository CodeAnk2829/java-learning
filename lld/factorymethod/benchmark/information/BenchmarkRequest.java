package lld.factorymethod.benchmark.information;

public class BenchmarkRequest {
    private String benchmarkName;
    private String datasetVersion;

    public BenchmarkRequest(String benchmarkName, String datasetVersion) {
        this.benchmarkName = benchmarkName;
        this.datasetVersion = datasetVersion;
    }

    public String getBenchmarkName() {
        return this.benchmarkName;
    }

    public String getDatasetVersion() {
        return this.datasetVersion;
    }
}
