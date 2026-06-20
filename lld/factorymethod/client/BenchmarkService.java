package lld.factorymethod.client;

import lld.factorymethod.benchmark.creators.BenchmarkRunner;
import lld.factorymethod.benchmark.creators.QevalRunner;
import lld.factorymethod.benchmark.creators.TruebenchRunner;
import lld.factorymethod.benchmark.information.BenchmarkRequest;

public class BenchmarkService {
    private BenchmarkRunner bRunner;
    private BenchmarkRequest request;
    private String benchmarkType;

    public BenchmarkService(String benchmarkType) {
        this.benchmarkType = benchmarkType;
    }

    public void runBenchmark() {
        switch (this.benchmarkType) {
            case "truebench":
                this.request = new BenchmarkRequest("Truebench", "v0.1");
                this.bRunner = new TruebenchRunner();
                this.bRunner.execute(request);
                break;

            case "qeval":
                this.request = new BenchmarkRequest("Qeval", "v0.1");
                this.bRunner = new QevalRunner();
                this.bRunner.execute(request); 
                break;

            default:
                System.out.println("Invalid benchmark type");
                break;
        }
    }
}
