package com.apsapps.indimessenger.interfaces;

import com.apsapps.indimessenger.models.Contact;
import com.apsapps.indimessenger.models.User;

import java.util.ArrayList;

/**
 * Created by a_man on 01-01-2018.
 */

public interface HomeIneractor {
    User getUserMe();

    ArrayList<Contact> getLocalContacts();

}
