// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package java.com.sungan.authApi;

public interface UserInfoResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:UserInfoResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 userId = 1;</code>
   * @return The userId.
   */
  long getUserId();

  /**
   * <code>string username = 2;</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <code>string username = 2;</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <code>string profileImageUrl = 3;</code>
   * @return The profileImageUrl.
   */
  java.lang.String getProfileImageUrl();
  /**
   * <code>string profileImageUrl = 3;</code>
   * @return The bytes for profileImageUrl.
   */
  com.google.protobuf.ByteString
      getProfileImageUrlBytes();

  /**
   * <code>string email = 4;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 4;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>string avatar = 5;</code>
   * @return The avatar.
   */
  java.lang.String getAvatar();
  /**
   * <code>string avatar = 5;</code>
   * @return The bytes for avatar.
   */
  com.google.protobuf.ByteString
      getAvatarBytes();
}
