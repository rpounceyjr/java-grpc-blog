package calculator.client;

import com.proto.greeting.CalculatorRequest;
import com.proto.greeting.CalculatorResponse;
import com.proto.greeting.CalculatorServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class CalculatorClient {
    private static void sumNums(ManagedChannel channel) {
        System.out.println("summing some nums");
        CalculatorServiceGrpc.CalculatorServiceBlockingStub stub = CalculatorServiceGrpc.newBlockingStub(channel);
        CalculatorResponse response = stub.sumNums(CalculatorRequest.newBuilder().setFirstNum(1).setSecondNum(2).build());

        System.out.println("Sum: " + response.getSumOfNums());
    }

    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("Need an argument");
            return;
        }

        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 5052)
                .usePlaintext()
                .build();

        switch (args[0]) {
            case "sum":
                sumNums(channel);
                break;

            default:
                System.out.println("Invalid keyword: " + args[0]);
        }

        System.out.println("Shutting down");
        channel.shutdown();
    }
}
