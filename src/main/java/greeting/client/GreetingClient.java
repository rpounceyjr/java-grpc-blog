package greeting.client;

import com.proto.greeting.Greeting;
import com.proto.greeting.GreetingRequest;
import com.proto.greeting.GreetingResponse;
import com.proto.greeting.GreetingServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import javax.sound.sampled.FloatControl;

public class GreetingClient {
    private static void doGreet(ManagedChannel channel) {
        System.out.println("Enter doGreet");
        GreetingServiceGrpc.GreetingServiceBlockingStub stub = GreetingServiceGrpc.newBlockingStub(channel);
        GreetingResponse response = stub.greet(GreetingRequest.newBuilder().setFirstName("Roger").build());

        System.out.println("Greetings: " + response.getResult());
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Need one argument to work");
            return;
        }
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 5051)
                .usePlaintext()
                .build();

        switch (args[0]) {
            case "greet":
                doGreet(channel);
                break;
            default:
                System.out.println("Keyword is invalid: " + args[0]);
        }

        System.out.println("Shutting down");
        channel.shutdown();
    }
}
