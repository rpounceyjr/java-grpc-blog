package blog.client;

import com.proto.blog.Blog;
import com.proto.blog.BlogId;
import com.proto.blog.BlogServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class BlogClient {
    private static BlogId createBlog(BlogServiceGrpc.BlogServiceBlockingStub stub) {
        try {
            BlogId createResponse = stub.createBlog(
                    Blog.newBuilder()
                            .setAuthor("Me")
                            .setTitle("this")
                            .setContent("This is a blog post")
                            .build()
            );

            System.out.println("Blog created with ID: " + createResponse.getId());
            return createResponse;
        } catch(StatusRuntimeException exception) {
            System.out.println("Couldn't create blog");
            exception.printStackTrace();
            return null;
        }

    }

    private static void run(ManagedChannel channel) {
        BlogServiceGrpc.BlogServiceBlockingStub stub = BlogServiceGrpc.newBlockingStub(channel);

        BlogId blogId = createBlog(stub);

        if(blogId == null) {
            return;
        }
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

        run(channel);

        System.out.println("Shutting down");
        channel.shutdown();
    }
}
