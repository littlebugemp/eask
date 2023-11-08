package com.netflix.dgs.codegen.generated.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.net.URL;
import java.time.OffsetDateTime;

public class User {
  private String uid;

  private String username;

  private String email;

  private URL avatar;

  private OffsetDateTime createDateTime;

  private String displayName;

  public User() {
  }

  public User(String uid, String username, String email, URL avatar, OffsetDateTime createDateTime,
      String displayName) {
    this.uid = uid;
    this.username = username;
    this.email = email;
    this.avatar = avatar;
    this.createDateTime = createDateTime;
    this.displayName = displayName;
  }

  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public URL getAvatar() {
    return avatar;
  }

  public void setAvatar(URL avatar) {
    this.avatar = avatar;
  }

  public OffsetDateTime getCreateDateTime() {
    return createDateTime;
  }

  public void setCreateDateTime(OffsetDateTime createDateTime) {
    this.createDateTime = createDateTime;
  }

  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  @Override
  public String toString() {
    return "User{" + "uid='" + uid + "'," +"username='" + username + "'," +"email='" + email + "'," +"avatar='" + avatar + "'," +"createDateTime='" + createDateTime + "'," +"displayName='" + displayName + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User that = (User) o;
        return java.util.Objects.equals(uid, that.uid) &&
                            java.util.Objects.equals(username, that.username) &&
                            java.util.Objects.equals(email, that.email) &&
                            java.util.Objects.equals(avatar, that.avatar) &&
                            java.util.Objects.equals(createDateTime, that.createDateTime) &&
                            java.util.Objects.equals(displayName, that.displayName);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(uid, username, email, avatar, createDateTime, displayName);
  }

  public static com.netflix.dgs.codegen.generated.types.User.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private String uid;

    private String username;

    private String email;

    private URL avatar;

    private OffsetDateTime createDateTime;

    private String displayName;

    public User build() {
                  com.netflix.dgs.codegen.generated.types.User result = new com.netflix.dgs.codegen.generated.types.User();
                      result.uid = this.uid;
          result.username = this.username;
          result.email = this.email;
          result.avatar = this.avatar;
          result.createDateTime = this.createDateTime;
          result.displayName = this.displayName;
                      return result;
    }

    public com.netflix.dgs.codegen.generated.types.User.Builder uid(String uid) {
      this.uid = uid;
      return this;
    }

    public com.netflix.dgs.codegen.generated.types.User.Builder username(String username) {
      this.username = username;
      return this;
    }

    public com.netflix.dgs.codegen.generated.types.User.Builder email(String email) {
      this.email = email;
      return this;
    }

    public com.netflix.dgs.codegen.generated.types.User.Builder avatar(URL avatar) {
      this.avatar = avatar;
      return this;
    }

    public com.netflix.dgs.codegen.generated.types.User.Builder createDateTime(
        OffsetDateTime createDateTime) {
      this.createDateTime = createDateTime;
      return this;
    }

    public com.netflix.dgs.codegen.generated.types.User.Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }
  }
}
