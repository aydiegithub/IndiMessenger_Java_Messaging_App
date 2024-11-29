package io.realm;


public interface com_apsapps_indimessenger_models_MessageRealmProxyInterface {
    public String realmGet$body();
    public void realmSet$body(String value);
    public String realmGet$senderName();
    public void realmSet$senderName(String value);
    public String realmGet$senderId();
    public void realmSet$senderId(String value);
    public String realmGet$recipientId();
    public void realmSet$recipientId(String value);
    public String realmGet$id();
    public void realmSet$id(String value);
    public String realmGet$statusUrl();
    public void realmSet$statusUrl(String value);
    public long realmGet$date();
    public void realmSet$date(long value);
    public boolean realmGet$delivered();
    public void realmSet$delivered(boolean value);
    public boolean realmGet$sent();
    public void realmSet$sent(boolean value);
    public int realmGet$attachmentType();
    public void realmSet$attachmentType(int value);
    public com.apsapps.indimessenger.models.Attachment realmGet$attachment();
    public void realmSet$attachment(com.apsapps.indimessenger.models.Attachment value);
    public boolean realmGet$readMsg();
    public void realmSet$readMsg(boolean value);
    public String realmGet$replyId();
    public void realmSet$replyId(String value);
    public String realmGet$delete();
    public void realmSet$delete(String value);
    public RealmList<String> realmGet$userIds();
    public void realmSet$userIds(RealmList<String> value);
    public RealmList<String> realmGet$grpDeletedMsgIds();
    public void realmSet$grpDeletedMsgIds(RealmList<String> value);
    public boolean realmGet$isBlocked();
    public void realmSet$isBlocked(boolean value);
}
