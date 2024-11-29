package io.realm;


public interface com_apsapps_indimessenger_models_GroupRealmProxyInterface {
    public String realmGet$id();
    public void realmSet$id(String value);
    public String realmGet$name();
    public void realmSet$name(String value);
    public String realmGet$status();
    public void realmSet$status(String value);
    public String realmGet$image();
    public void realmSet$image(String value);
    public String realmGet$admin();
    public void realmSet$admin(String value);
    public RealmList<String> realmGet$userIds();
    public void realmSet$userIds(RealmList<String> value);
    public RealmList<String> realmGet$grpExitUserIds();
    public void realmSet$grpExitUserIds(RealmList<String> value);
    public long realmGet$date();
    public void realmSet$date(long value);
}
