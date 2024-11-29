package io.realm;


public interface com_apsapps_indimessenger_models_StatusNewRealmProxyInterface {
    public RealmList<com.apsapps.indimessenger.models.StatusImageNew> realmGet$statusImages();
    public void realmSet$statusImages(RealmList<com.apsapps.indimessenger.models.StatusImageNew> value);
    public String realmGet$lastMessage();
    public void realmSet$lastMessage(String value);
    public String realmGet$myId();
    public void realmSet$myId(String value);
    public String realmGet$userId();
    public void realmSet$userId(String value);
    public String realmGet$groupId();
    public void realmSet$groupId(String value);
    public long realmGet$timeUpdated();
    public void realmSet$timeUpdated(long value);
    public com.apsapps.indimessenger.models.User realmGet$user();
    public void realmSet$user(com.apsapps.indimessenger.models.User value);
    public com.apsapps.indimessenger.models.Group realmGet$group();
    public void realmSet$group(com.apsapps.indimessenger.models.Group value);
    public boolean realmGet$read();
    public void realmSet$read(boolean value);
}
