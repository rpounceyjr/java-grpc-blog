// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blog/blog.proto

package com.proto.blog;

public final class BlogOuterClass {
  private BlogOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_Blog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_Blog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_blog_BlogId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_blog_BlogId_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017blog/blog.proto\022\004blog\032\033google/protobuf" +
      "/empty.proto\"B\n\004Blog\022\n\n\002id\030\001 \001(\t\022\016\n\006auth" +
      "or\030\002 \001(\t\022\r\n\005title\030\003 \001(\t\022\017\n\007content\030\004 \001(\t" +
      "\"\024\n\006BlogId\022\n\n\002id\030\001 \001(\t2\364\001\n\013BlogService\022&" +
      "\n\ncreateBlog\022\n.blog.Blog\032\014.blog.BlogId\022$" +
      "\n\010readBlog\022\014.blog.BlogId\032\n.blog.Blog\0220\n\n" +
      "updateBlog\022\n.blog.Blog\032\026.google.protobuf" +
      ".Empty\0222\n\ndeleteBlog\022\014.blog.BlogId\032\026.goo" +
      "gle.protobuf.Empty\0221\n\tlistBlogs\022\026.google" +
      ".protobuf.Empty\032\n.blog.Blog0\001B\022\n\016com.pro" +
      "to.blogP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_blog_Blog_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_blog_Blog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_Blog_descriptor,
        new java.lang.String[] { "Id", "Author", "Title", "Content", });
    internal_static_blog_BlogId_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_blog_BlogId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_blog_BlogId_descriptor,
        new java.lang.String[] { "Id", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}