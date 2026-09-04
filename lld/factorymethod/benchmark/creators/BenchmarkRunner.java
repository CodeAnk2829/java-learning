package lld.factorymethod.benchmark.creators;

import lld.factorymethod.benchmark.information.BenchmarkRequest;
import lld.factorymethod.benchmark.products.Benchmark;

public abstract class BenchmarkRunner {
    public void execute(BenchmarkRequest request) {
        this.prepareEnvironment(request);
        Benchmark bench = this.createBenchmark(request);
        bench.run();
        String runStatus = bench.getRunStatus();
        this.publishResults(runStatus);
    }

    protected void prepareEnvironment(BenchmarkRequest request) {
        System.out.println("Preparing environment for " + request.getBenchmarkName() + " on dataset of version " + request.getDatasetVersion());
    }

    protected abstract Benchmark createBenchmark(BenchmarkRequest request);

    protected void publishResults(String runStatus) {
        System.out.println("Publishing results...");
        System.out.println("Status: " + runStatus);
    }
}
