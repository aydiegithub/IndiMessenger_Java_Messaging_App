package com.apsapps.indimessenger.interfaces;

import android.view.View;

import com.apsapps.indimessenger.models.Group;
import com.apsapps.indimessenger.models.User;


public interface OnUserGroupItemClick {
    void OnUserClick(User user, int position, View userImage);
    void OnGroupClick(Group group, int position, View userImage);
}
