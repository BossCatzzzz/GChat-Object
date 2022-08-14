package com.mycenter.gobject;

import java.io.Serializable;

/**
 *
 * @author Gic
 */
public class GPacket implements Serializable {

    String action = "", content_first = "", content_last = "";

    public GPacket(String act) {
        action = act;
    }

    public GPacket(String act, String one) {
        action = act;
        content_first = one;
    }

    public GPacket(String act, String one, String two) {
        action = act;
        content_first = one;
        content_last = two;
    }

    public String getAction() {
        return action;
    }

    public String getFirst() {
        return content_first;
    }

    public String getLast() {
        return content_last;
    }

    @Override
    public String toString() {
       return "\n" + action+ "|" + content_first + "|" +content_last+"\n";
    }
}
