package de.mclenburg.privatechannel.clients;

import java.net.HttpCookie;

public interface Authenticator {
    HttpCookie login(String username, String password);
}
