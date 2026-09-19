package solarxr_protocol.rpc

import dev.slimevr.fbscodegen.runtime.FlatBufferReader
import dev.slimevr.fbscodegen.runtime.FlatBufferWriter
import dev.slimevr.fbscodegen.runtime.readFlatBufferString
import kotlin.Int
import kotlin.String
import kotlin.collections.List

/**
 * Request to get currently registered plugin bone registrations from loaded plugins.
 */
public class GetPluginBonesRequest : RpcMessage {
  public fun encode(builder: FlatBufferWriter): Int {
    builder.startTable(0)
    return builder.endTable()
  }

  public companion object {
    public fun decode(bb: FlatBufferReader, tableOffset: Int): GetPluginBonesRequest = GetPluginBonesRequest()
  }
}

/**
 * Response containing the list of plugin bone registrations.
 * Each PluginBoneRegistration represents a custom bone exposed by a plugin for tracker assignment or other purposes.
 */
public data class GetPluginBonesResponse(
  public val registeredpluginbones: List<PluginBoneRegistration>? = null,
) : RpcMessage {
  public fun encode(builder: FlatBufferWriter): Int {
    val __off_registeredpluginbones = registeredpluginbones?.let { builder.createVectorOfTables(it.map { e -> e.encode(builder) }.toIntArray()) }

    builder.startTable(1)
    __off_registeredpluginbones?.let { builder.addOffset(0, it, 0) }
    return builder.endTable()
  }

  public companion object {
    public fun decode(bb: FlatBufferReader, tableOffset: Int): GetPluginBonesResponse {
      val vtableOffset = tableOffset - bb.getInt(tableOffset)
      val vtableSize = bb.getShort(vtableOffset).toInt()

      val __offset_registeredpluginbones = if (vtableSize > 4) bb.getShort(vtableOffset + 4).toInt() else 0

      return GetPluginBonesResponse(
              registeredpluginbones = if (__offset_registeredpluginbones != 0) { val vecOff = tableOffset + __offset_registeredpluginbones + bb.getInt(tableOffset + __offset_registeredpluginbones); val len = bb.getInt(vecOff); (0 until len).mapNotNull { i -> if (bb.getInt(vecOff + 4 + i * 4) != 0) PluginBoneRegistration.decode(bb, vecOff + 4 + i * 4 + bb.getInt(vecOff + 4 + i * 4)) else null } } else null
          )
    }
  }
}

public data class PluginBoneRegistration(
  public val id: String? = null,
  public val name: String? = null,
  public val parentBoneId: String? = null,
  public val vmcBoneName: String? = null,
  public val modelUrl: String? = null,
) {
  public fun encode(builder: FlatBufferWriter): Int {
    val __off_id = id?.let { builder.createString(it) }
    val __off_name = name?.let { builder.createString(it) }
    val __off_parentBoneId = parentBoneId?.let { builder.createString(it) }
    val __off_vmcBoneName = vmcBoneName?.let { builder.createString(it) }
    val __off_modelUrl = modelUrl?.let { builder.createString(it) }

    builder.startTable(5)
    __off_id?.let { builder.addOffset(0, it, 0) }
    __off_name?.let { builder.addOffset(1, it, 0) }
    __off_parentBoneId?.let { builder.addOffset(2, it, 0) }
    __off_vmcBoneName?.let { builder.addOffset(3, it, 0) }
    __off_modelUrl?.let { builder.addOffset(4, it, 0) }
    return builder.endTable()
  }

  public companion object {
    public fun decode(bb: FlatBufferReader, tableOffset: Int): PluginBoneRegistration {
      val vtableOffset = tableOffset - bb.getInt(tableOffset)
      val vtableSize = bb.getShort(vtableOffset).toInt()

      val __offset_id = if (vtableSize > 4) bb.getShort(vtableOffset + 4).toInt() else 0
      val __offset_name = if (vtableSize > 6) bb.getShort(vtableOffset + 6).toInt() else 0
      val __offset_parentBoneId = if (vtableSize > 8) bb.getShort(vtableOffset + 8).toInt() else 0
      val __offset_vmcBoneName = if (vtableSize > 10) bb.getShort(vtableOffset + 10).toInt() else 0
      val __offset_modelUrl = if (vtableSize > 12) bb.getShort(vtableOffset + 12).toInt() else 0

      return PluginBoneRegistration(
              id = if (__offset_id != 0) readFlatBufferString(bb, tableOffset + __offset_id) else null,
              name = if (__offset_name != 0) readFlatBufferString(bb, tableOffset + __offset_name) else null,
              parentBoneId = if (__offset_parentBoneId != 0) readFlatBufferString(bb, tableOffset + __offset_parentBoneId) else null,
              vmcBoneName = if (__offset_vmcBoneName != 0) readFlatBufferString(bb, tableOffset + __offset_vmcBoneName) else null,
              modelUrl = if (__offset_modelUrl != 0) readFlatBufferString(bb, tableOffset + __offset_modelUrl) else null
          )
    }
  }
}

public data class PluginBonesUpdateResponse(
  public val registeredpluginbones: List<PluginBoneRegistration>? = null,
) : RpcMessage {
  public fun encode(builder: FlatBufferWriter): Int {
    val __off_registeredpluginbones = registeredpluginbones?.let { builder.createVectorOfTables(it.map { e -> e.encode(builder) }.toIntArray()) }

    builder.startTable(1)
    __off_registeredpluginbones?.let { builder.addOffset(0, it, 0) }
    return builder.endTable()
  }

  public companion object {
    public fun decode(bb: FlatBufferReader, tableOffset: Int): PluginBonesUpdateResponse {
      val vtableOffset = tableOffset - bb.getInt(tableOffset)
      val vtableSize = bb.getShort(vtableOffset).toInt()

      val __offset_registeredpluginbones = if (vtableSize > 4) bb.getShort(vtableOffset + 4).toInt() else 0

      return PluginBonesUpdateResponse(
              registeredpluginbones = if (__offset_registeredpluginbones != 0) { val vecOff = tableOffset + __offset_registeredpluginbones + bb.getInt(tableOffset + __offset_registeredpluginbones); val len = bb.getInt(vecOff); (0 until len).mapNotNull { i -> if (bb.getInt(vecOff + 4 + i * 4) != 0) PluginBoneRegistration.decode(bb, vecOff + 4 + i * 4 + bb.getInt(vecOff + 4 + i * 4)) else null } } else null
          )
    }
  }
}
