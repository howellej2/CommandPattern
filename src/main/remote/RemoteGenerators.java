package remote;

import java.util.Scanner;

import vendors.Television;
import bin.vendors.Light;

/**
 * Library of methods to create specific types of remotes.
 */
public class RemoteGenerators
{
    /**
     * Creates a remote for managing a tv.
     * Here the client connects the receiver (tv) to concrete commands (ie Power) and sets them in the invoker (Remote)
     * 
     * @param tv the tv to connect the remote to
     * @param userInput a method of getting input when subscribing or unsubsrcibing to channels.
     * @return the created remote.
     */

    public static Remote lightRemote(Light light, Scanner userInput)
    {
        Remote lightRemote = new Remote(2);
        lightRemote.setButton(new ColorForward(light), 1);
        return lightRemote;
    }

    public static Remote tvRemote(Television tv, Scanner userInput)
    {
        Remote tvRemote = new Remote(2);
        tvRemote.setButton(new ChannelForward(tv), 1);
        tvRemote.setButton(new ChannelBackward(tv), 1);
        return tvRemote;
    }
}
