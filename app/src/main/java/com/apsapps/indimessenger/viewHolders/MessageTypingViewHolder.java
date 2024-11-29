package com.apsapps.indimessenger.viewHolders;

import android.view.View;

import com.apsapps.indimessenger.models.AttachmentTypes;

public class MessageTypingViewHolder extends BaseMessageViewHolder {
    public MessageTypingViewHolder(View itemView) {
        super(itemView, AttachmentTypes.NONE_TYPING,null);
    }
}
