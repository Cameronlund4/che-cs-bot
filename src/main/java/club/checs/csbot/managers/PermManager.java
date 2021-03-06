package club.checs.csbot.managers;

import sx.blah.discord.handle.obj.IUser;

import java.util.ArrayList;

public class PermManager {

    private ArrayList<IUser> muted = new ArrayList<IUser>();

    public PermManager() {
        //TODO: Add Useful Constructor
    }

    public void mute(IUser user) {
        if (!isMuted(user))
            muted.add(user);
    }

    public void unmute(IUser user) {
        if (isMuted(user))
            muted.remove(user);
    }

    public boolean isMuted(IUser user) {
        for (IUser mutedUser : muted) {
            if (user.equals(mutedUser))
                return true;
        }
        return false;
    }

}
