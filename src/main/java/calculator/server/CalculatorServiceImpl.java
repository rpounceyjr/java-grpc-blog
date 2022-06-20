package calculator.server;

import com.proto.greeting.CalculatorRequest;
import com.proto.greeting.CalculatorResponse;
import com.proto.greeting.CalculatorServiceGrpc;
import io.grpc.stub.StreamObserver;

public class CalculatorServiceImpl extends CalculatorServiceGrpc.CalculatorServiceImplBase {
    @Override
    public void sumNums(CalculatorRequest request, StreamObserver<CalculatorResponse> responseObserver) {
        responseObserver.onNext(CalculatorResponse.newBuilder().setSumOfNums(request.getFirstNum() + request.getSecondNum()).build());
        responseObserver.onCompleted();
    }
}
