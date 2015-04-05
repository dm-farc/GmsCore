// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: protos-repo/mcs.proto
package org.microg.gms.gcm.mcs;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import okio.ByteString;

import static com.squareup.wire.Message.Datatype.BYTES;
import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Label.REQUIRED;

public final class Extension extends Message {

  public static final Integer DEFAULT_ID = 0;
  public static final ByteString DEFAULT_DATA = ByteString.EMPTY;

  /**
   * 12: SelectiveAck
   * 13: StreamAck
   */
  @ProtoField(tag = 1, type = INT32, label = REQUIRED)
  public final Integer id;

  @ProtoField(tag = 2, type = BYTES, label = REQUIRED)
  public final ByteString data;

  public Extension(Integer id, ByteString data) {
    this.id = id;
    this.data = data;
  }

  private Extension(Builder builder) {
    this(builder.id, builder.data);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Extension)) return false;
    Extension o = (Extension) other;
    return equals(id, o.id)
        && equals(data, o.data);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = id != null ? id.hashCode() : 0;
      result = result * 37 + (data != null ? data.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<Extension> {

    public Integer id;
    public ByteString data;

    public Builder() {
    }

    public Builder(Extension message) {
      super(message);
      if (message == null) return;
      this.id = message.id;
      this.data = message.data;
    }

    /**
     * 12: SelectiveAck
     * 13: StreamAck
     */
    public Builder id(Integer id) {
      this.id = id;
      return this;
    }

    public Builder data(ByteString data) {
      this.data = data;
      return this;
    }

    @Override
    public Extension build() {
      checkRequiredFields();
      return new Extension(this);
    }
  }
}