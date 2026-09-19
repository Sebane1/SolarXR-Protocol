package solarxr_protocol.rpc

import dev.slimevr.fbscodegen.runtime.FlatBufferReader
import dev.slimevr.fbscodegen.runtime.FlatBufferWriter
import dev.slimevr.fbscodegen.runtime.readFlatBufferString
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.collections.List

public data class PluginBone(
  public val id: String? = null,
  public val name: String? = null,
  public val parentBoneId: String? = null,
  public val localPositionX: Float = 0.0f,
  public val localPositionY: Float = 0.0f,
  public val localPositionZ: Float = 0.0f,
  public val localRotationX: Float = 0.0f,
  public val localRotationY: Float = 0.0f,
  public val localRotationZ: Float = 0.0f,
  public val localRotationW: Float = 1.0f,
  public val vmcBoneName: String? = null,
  public val vrcOscParamName: String? = null,
  public val modelUrl: String? = null,
) {
  public fun encode(builder: FlatBufferWriter): Int {
    val __off_id = id?.let { builder.createString(it) }
    val __off_name = name?.let { builder.createString(it) }
    val __off_parentBoneId = parentBoneId?.let { builder.createString(it) }
    val __off_vmcBoneName = vmcBoneName?.let { builder.createString(it) }
    val __off_vrcOscParamName = vrcOscParamName?.let { builder.createString(it) }
    val __off_modelUrl = modelUrl?.let { builder.createString(it) }

    builder.startTable(13)
    __off_id?.let { builder.addOffset(0, it, 0) }
    __off_name?.let { builder.addOffset(1, it, 0) }
    __off_parentBoneId?.let { builder.addOffset(2, it, 0) }
    builder.addFloat(3, localPositionX, 0.0)
    builder.addFloat(4, localPositionY, 0.0)
    builder.addFloat(5, localPositionZ, 0.0)
    builder.addFloat(6, localRotationX, 0.0)
    builder.addFloat(7, localRotationY, 0.0)
    builder.addFloat(8, localRotationZ, 0.0)
    builder.addFloat(9, localRotationW, 1.0)
    __off_vmcBoneName?.let { builder.addOffset(10, it, 0) }
    __off_vrcOscParamName?.let { builder.addOffset(11, it, 0) }
    __off_modelUrl?.let { builder.addOffset(12, it, 0) }
    return builder.endTable()
  }

  public companion object {
    public fun decode(bb: FlatBufferReader, tableOffset: Int): PluginBone {
      val vtableOffset = tableOffset - bb.getInt(tableOffset)
      val vtableSize = bb.getShort(vtableOffset).toInt()

      val __offset_id = if (vtableSize > 4) bb.getShort(vtableOffset + 4).toInt() else 0
      val __offset_name = if (vtableSize > 6) bb.getShort(vtableOffset + 6).toInt() else 0
      val __offset_parentBoneId = if (vtableSize > 8) bb.getShort(vtableOffset + 8).toInt() else 0
      val __offset_localPositionX = if (vtableSize > 10) bb.getShort(vtableOffset + 10).toInt() else 0
      val __offset_localPositionY = if (vtableSize > 12) bb.getShort(vtableOffset + 12).toInt() else 0
      val __offset_localPositionZ = if (vtableSize > 14) bb.getShort(vtableOffset + 14).toInt() else 0
      val __offset_localRotationX = if (vtableSize > 16) bb.getShort(vtableOffset + 16).toInt() else 0
      val __offset_localRotationY = if (vtableSize > 18) bb.getShort(vtableOffset + 18).toInt() else 0
      val __offset_localRotationZ = if (vtableSize > 20) bb.getShort(vtableOffset + 20).toInt() else 0
      val __offset_localRotationW = if (vtableSize > 22) bb.getShort(vtableOffset + 22).toInt() else 0
      val __offset_vmcBoneName = if (vtableSize > 24) bb.getShort(vtableOffset + 24).toInt() else 0
      val __offset_vrcOscParamName = if (vtableSize > 26) bb.getShort(vtableOffset + 26).toInt() else 0
      val __offset_modelUrl = if (vtableSize > 28) bb.getShort(vtableOffset + 28).toInt() else 0

      return PluginBone(
              id = if (__offset_id != 0) readFlatBufferString(bb, tableOffset + __offset_id) else null,
              name = if (__offset_name != 0) readFlatBufferString(bb, tableOffset + __offset_name) else null,
              parentBoneId = if (__offset_parentBoneId != 0) readFlatBufferString(bb, tableOffset + __offset_parentBoneId) else null,
              localPositionX = if (__offset_localPositionX != 0) bb.getFloat(tableOffset + __offset_localPositionX) else 0.0f,
              localPositionY = if (__offset_localPositionY != 0) bb.getFloat(tableOffset + __offset_localPositionY) else 0.0f,
              localPositionZ = if (__offset_localPositionZ != 0) bb.getFloat(tableOffset + __offset_localPositionZ) else 0.0f,
              localRotationX = if (__offset_localRotationX != 0) bb.getFloat(tableOffset + __offset_localRotationX) else 0.0f,
              localRotationY = if (__offset_localRotationY != 0) bb.getFloat(tableOffset + __offset_localRotationY) else 0.0f,
              localRotationZ = if (__offset_localRotationZ != 0) bb.getFloat(tableOffset + __offset_localRotationZ) else 0.0f,
              localRotationW = if (__offset_localRotationW != 0) bb.getFloat(tableOffset + __offset_localRotationW) else 1.0f,
              vmcBoneName = if (__offset_vmcBoneName != 0) readFlatBufferString(bb, tableOffset + __offset_vmcBoneName) else null,
              vrcOscParamName = if (__offset_vrcOscParamName != 0) readFlatBufferString(bb, tableOffset + __offset_vrcOscParamName) else null,
              modelUrl = if (__offset_modelUrl != 0) readFlatBufferString(bb, tableOffset + __offset_modelUrl) else null
          )
    }
  }
}

public data class PluginBonesUpdateResponse(
  public val bones: List<PluginBone>? = null,
) : RpcMessage {
  public fun encode(builder: FlatBufferWriter): Int {
    val __off_bones = bones?.let { builder.createVectorOfTables(it.map { e -> e.encode(builder) }.toIntArray()) }

    builder.startTable(1)
    __off_bones?.let { builder.addOffset(0, it, 0) }
    return builder.endTable()
  }

  public companion object {
    public fun decode(bb: FlatBufferReader, tableOffset: Int): PluginBonesUpdateResponse {
      val vtableOffset = tableOffset - bb.getInt(tableOffset)
      val vtableSize = bb.getShort(vtableOffset).toInt()

      val __offset_bones = if (vtableSize > 4) bb.getShort(vtableOffset + 4).toInt() else 0

      return PluginBonesUpdateResponse(
              bones = if (__offset_bones != 0) { val vecOff = tableOffset + __offset_bones + bb.getInt(tableOffset + __offset_bones); val len = bb.getInt(vecOff); (0 until len).mapNotNull { i -> if (bb.getInt(vecOff + 4 + i * 4) != 0) PluginBone.decode(bb, vecOff + 4 + i * 4 + bb.getInt(vecOff + 4 + i * 4)) else null } } else null
          )
    }
  }
}
