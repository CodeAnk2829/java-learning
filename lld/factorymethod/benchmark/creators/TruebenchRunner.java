package lld.factorymethod.benchmark.creators;

import lld.factorymethod.benchmark.information.BenchmarkRequest;
import lld.factorymethod.benchmark.products.Benchmark;
import lld.factorymethod.benchmark.products.Truebench;

public class TruebenchRunner extends BenchmarkRunner {
    protected Benchmark createBenchmark(BenchmarkRequest request) {
        return new Truebench(request.getDatasetVersion());
    }
}
