package lld.factorymethod.benchmark.creators;

import lld.factorymethod.benchmark.information.BenchmarkRequest;
import lld.factorymethod.benchmark.products.Benchmark;
import lld.factorymethod.benchmark.products.Qeval;

public class QevalRunner extends BenchmarkRunner {
    public Benchmark createBenchmark(BenchmarkRequest request) {
        return new Qeval(request.getDatasetVersion());
    }
}
