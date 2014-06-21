package com.labswag.seamusfd.network;

import codechicken.lib.packet.PacketCustom;
import codechicken.lib.packet.PacketCustom.IServerPacketHandler;
import com.labswag.seamusfd.libs.ModInfo;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.play.INetHandlerPlayServer;

public class MFCPH implements IServerPacketHandler
{
	public static final String channel = ModInfo.CHANNEL;

	@Override
	public void handlePacket(PacketCustom packet, EntityPlayerMP player, INetHandlerPlayServer netHandler)
	{
		switch (packet.getType())
		{

		}
	}
}
