// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package java.com.sungan.authApi;

public final class UserProto {
  private UserProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserInfoRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserInfoRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UserInfoResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UserInfoResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\"!\n\017UserInfoRequest\022\016\n\006userI" +
      "d\030\001 \001(\003\"l\n\020UserInfoResponse\022\016\n\006userId\030\001 " +
      "\001(\003\022\020\n\010username\030\002 \001(\t\022\027\n\017profileImageUrl" +
      "\030\003 \001(\t\022\r\n\005email\030\004 \001(\t\022\016\n\006avatar\030\005 \001(\t2<\n" +
      "\004User\0224\n\013GetUserInfo\022\020.UserInfoRequest\032\021" +
      ".UserInfoResponse\"\000B&\n\027java.com.sungan.a" +
      "uthApiB\tUserProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UserInfoRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UserInfoRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserInfoRequest_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_UserInfoResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_UserInfoResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UserInfoResponse_descriptor,
        new java.lang.String[] { "UserId", "Username", "ProfileImageUrl", "Email", "Avatar", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
