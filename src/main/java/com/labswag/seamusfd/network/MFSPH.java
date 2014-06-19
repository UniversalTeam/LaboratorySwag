package com.labswag.seamusfd.network;

import codechicken.lib.packet.PacketCustom;
import codechicken.lib.packet.PacketCustom.IClientPacketHandler;
import com.labswag.seamusfd.libs.ModInfo;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.INetHandlerPlayClient;

public class MFSPH implements IClientPacketHandler
{
	public static final String channel = ModInfo.CHANNEL;

	@Override
	public void handlePacket(PacketCustom packet, Minecraft mc, INetHandlerPlayClient netHandler)
	{
		switch (packet.getType())
		{

		}
	}
}
