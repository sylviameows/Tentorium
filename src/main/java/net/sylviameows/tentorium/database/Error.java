package net.sylviameows.tentorium.database;

import net.sylviameows.tentorium.TentoriumCore;

import java.util.logging.Level;

public class Error {
    public static void execute(TentoriumCore plugin, Exception ex){
        plugin.getLogger().log(Level.SEVERE, "Couldn't execute MySQL statement: ", ex);
    }
    public static void close(TentoriumCore plugin, Exception ex){
        plugin.getLogger().log(Level.SEVERE, "Failed to close MySQL connection: ", ex);
    }
}
