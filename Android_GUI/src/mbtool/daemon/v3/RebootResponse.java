// automatically generated by the FlatBuffers compiler, do not modify

package mbtool.daemon.v3;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class RebootResponse extends Table {
  public static RebootResponse getRootAsRebootResponse(ByteBuffer _bb) { return getRootAsRebootResponse(_bb, new RebootResponse()); }
  public static RebootResponse getRootAsRebootResponse(ByteBuffer _bb, RebootResponse obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public RebootResponse __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public boolean success() { int o = __offset(4); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public RebootError error() { return error(new RebootError()); }
  public RebootError error(RebootError obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createRebootResponse(FlatBufferBuilder builder,
      boolean success,
      int errorOffset) {
    builder.startObject(2);
    RebootResponse.addError(builder, errorOffset);
    RebootResponse.addSuccess(builder, success);
    return RebootResponse.endRebootResponse(builder);
  }

  public static void startRebootResponse(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addSuccess(FlatBufferBuilder builder, boolean success) { builder.addBoolean(0, success, false); }
  public static void addError(FlatBufferBuilder builder, int errorOffset) { builder.addOffset(1, errorOffset, 0); }
  public static int endRebootResponse(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

