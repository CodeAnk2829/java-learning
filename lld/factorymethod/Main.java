package lld.factorymethod;

import java.util.*;

import lld.factorymethod.client.BenchmarkService;
import lld.factorymethod.client.DialogBox;
import lld.factorymethod.client.LoggerManager;
import lld.factorymethod.client.NotificationService;
import lld.factorymethod.client.TransportService;

public class Main {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        String notificationType = scanner.nextLine();
        System.out.println(notificationType);

        NotificationService nService = new NotificationService(notificationType);
        nService.send();

        String logisticType = scanner.nextLine();
        TransportService tService = new TransportService(logisticType);
        tService.initiateTransportation();

        String dialogType = scanner.nextLine();
        DialogBox dBox = new DialogBox(dialogType);
        dBox.renderDialogOnButtonClick();

        String logLevel = scanner.nextLine();
        LoggerManager lManager = new LoggerManager(logLevel);
        lManager.displayLogs();

        String benchmarkType = scanner.nextLine();
        BenchmarkService bService = new BenchmarkService(benchmarkType);
        bService.runBenchmark();
        scanner.close();
    }
}
