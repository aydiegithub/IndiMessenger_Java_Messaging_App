package io.realm;


import android.annotation.TargetApi;
import android.os.Build;
import android.util.JsonReader;
import android.util.JsonToken;
import io.realm.ProxyUtils;
import io.realm.exceptions.RealmMigrationNeededException;
import io.realm.internal.ColumnInfo;
import io.realm.internal.OsList;
import io.realm.internal.OsObject;
import io.realm.internal.OsObjectSchemaInfo;
import io.realm.internal.OsSchemaInfo;
import io.realm.internal.Property;
import io.realm.internal.RealmObjectProxy;
import io.realm.internal.Row;
import io.realm.internal.Table;
import io.realm.internal.android.JsonUtils;
import io.realm.log.RealmLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressWarnings("all")
public class com_apsapps_indimessenger_models_ChatRealmProxy extends com.apsapps.indimessenger.models.Chat
    implements RealmObjectProxy, com_apsapps_indimessenger_models_ChatRealmProxyInterface {

    static final class ChatColumnInfo extends ColumnInfo {
        long messagesIndex;
        long lastMessageIndex;
        long myIdIndex;
        long userIdIndex;
        long groupIdIndex;
        long timeUpdatedIndex;
        long userIndex;
        long groupIndex;
        long readIndex;

        ChatColumnInfo(OsSchemaInfo schemaInfo) {
            super(9);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("Chat");
            this.messagesIndex = addColumnDetails("messages", "messages", objectSchemaInfo);
            this.lastMessageIndex = addColumnDetails("lastMessage", "lastMessage", objectSchemaInfo);
            this.myIdIndex = addColumnDetails("myId", "myId", objectSchemaInfo);
            this.userIdIndex = addColumnDetails("userId", "userId", objectSchemaInfo);
            this.groupIdIndex = addColumnDetails("groupId", "groupId", objectSchemaInfo);
            this.timeUpdatedIndex = addColumnDetails("timeUpdated", "timeUpdated", objectSchemaInfo);
            this.userIndex = addColumnDetails("user", "user", objectSchemaInfo);
            this.groupIndex = addColumnDetails("group", "group", objectSchemaInfo);
            this.readIndex = addColumnDetails("read", "read", objectSchemaInfo);
        }

        ChatColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new ChatColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final ChatColumnInfo src = (ChatColumnInfo) rawSrc;
            final ChatColumnInfo dst = (ChatColumnInfo) rawDst;
            dst.messagesIndex = src.messagesIndex;
            dst.lastMessageIndex = src.lastMessageIndex;
            dst.myIdIndex = src.myIdIndex;
            dst.userIdIndex = src.userIdIndex;
            dst.groupIdIndex = src.groupIdIndex;
            dst.timeUpdatedIndex = src.timeUpdatedIndex;
            dst.userIndex = src.userIndex;
            dst.groupIndex = src.groupIndex;
            dst.readIndex = src.readIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private ChatColumnInfo columnInfo;
    private ProxyState<com.apsapps.indimessenger.models.Chat> proxyState;
    private RealmList<com.apsapps.indimessenger.models.Message> messagesRealmList;

    com_apsapps_indimessenger_models_ChatRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (ChatColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.apsapps.indimessenger.models.Chat>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    public RealmList<com.apsapps.indimessenger.models.Message> realmGet$messages() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (messagesRealmList != null) {
            return messagesRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.messagesIndex);
            messagesRealmList = new RealmList<com.apsapps.indimessenger.models.Message>(com.apsapps.indimessenger.models.Message.class, osList, proxyState.getRealm$realm());
            return messagesRealmList;
        }
    }

    @Override
    public void realmSet$messages(RealmList<com.apsapps.indimessenger.models.Message> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("messages")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.apsapps.indimessenger.models.Message> original = value;
                value = new RealmList<com.apsapps.indimessenger.models.Message>();
                for (com.apsapps.indimessenger.models.Message item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.messagesIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.apsapps.indimessenger.models.Message linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.setRow(i, ((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        } else {
            osList.removeAll();
            if (value == null) {
                return;
            }
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.apsapps.indimessenger.models.Message linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$lastMessage() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.lastMessageIndex);
    }

    @Override
    public void realmSet$lastMessage(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.lastMessageIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.lastMessageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.lastMessageIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.lastMessageIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$myId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.myIdIndex);
    }

    @Override
    public void realmSet$myId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.myIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.myIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.myIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.myIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$userId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.userIdIndex);
    }

    @Override
    public void realmSet$userId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.userIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.userIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.userIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.userIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$groupId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.groupIdIndex);
    }

    @Override
    public void realmSet$groupId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.groupIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.groupIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.groupIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.groupIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$timeUpdated() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.timeUpdatedIndex);
    }

    @Override
    public void realmSet$timeUpdated(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.timeUpdatedIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.timeUpdatedIndex, value);
    }

    @Override
    public com.apsapps.indimessenger.models.User realmGet$user() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.userIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.apsapps.indimessenger.models.User.class, proxyState.getRow$realm().getLink(columnInfo.userIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$user(com.apsapps.indimessenger.models.User value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("user")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.userIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.userIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.userIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.userIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    public com.apsapps.indimessenger.models.Group realmGet$group() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.groupIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.apsapps.indimessenger.models.Group.class, proxyState.getRow$realm().getLink(columnInfo.groupIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$group(com.apsapps.indimessenger.models.Group value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("group")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.groupIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.groupIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.groupIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.groupIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$read() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.readIndex);
    }

    @Override
    public void realmSet$read(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.readIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.readIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("Chat", 9, 0);
        builder.addPersistedLinkProperty("messages", RealmFieldType.LIST, "Message");
        builder.addPersistedProperty("lastMessage", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("myId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("userId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("groupId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("timeUpdated", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("user", RealmFieldType.OBJECT, "User");
        builder.addPersistedLinkProperty("group", RealmFieldType.OBJECT, "Group");
        builder.addPersistedProperty("read", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static ChatColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new ChatColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "Chat";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "Chat";
    }

    @SuppressWarnings("cast")
    public static com.apsapps.indimessenger.models.Chat createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(3);
        if (json.has("messages")) {
            excludeFields.add("messages");
        }
        if (json.has("user")) {
            excludeFields.add("user");
        }
        if (json.has("group")) {
            excludeFields.add("group");
        }
        com.apsapps.indimessenger.models.Chat obj = realm.createObjectInternal(com.apsapps.indimessenger.models.Chat.class, true, excludeFields);

        final com_apsapps_indimessenger_models_ChatRealmProxyInterface objProxy = (com_apsapps_indimessenger_models_ChatRealmProxyInterface) obj;
        if (json.has("messages")) {
            if (json.isNull("messages")) {
                objProxy.realmSet$messages(null);
            } else {
                objProxy.realmGet$messages().clear();
                JSONArray array = json.getJSONArray("messages");
                for (int i = 0; i < array.length(); i++) {
                    com.apsapps.indimessenger.models.Message item = com_apsapps_indimessenger_models_MessageRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$messages().add(item);
                }
            }
        }
        if (json.has("lastMessage")) {
            if (json.isNull("lastMessage")) {
                objProxy.realmSet$lastMessage(null);
            } else {
                objProxy.realmSet$lastMessage((String) json.getString("lastMessage"));
            }
        }
        if (json.has("myId")) {
            if (json.isNull("myId")) {
                objProxy.realmSet$myId(null);
            } else {
                objProxy.realmSet$myId((String) json.getString("myId"));
            }
        }
        if (json.has("userId")) {
            if (json.isNull("userId")) {
                objProxy.realmSet$userId(null);
            } else {
                objProxy.realmSet$userId((String) json.getString("userId"));
            }
        }
        if (json.has("groupId")) {
            if (json.isNull("groupId")) {
                objProxy.realmSet$groupId(null);
            } else {
                objProxy.realmSet$groupId((String) json.getString("groupId"));
            }
        }
        if (json.has("timeUpdated")) {
            if (json.isNull("timeUpdated")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'timeUpdated' to null.");
            } else {
                objProxy.realmSet$timeUpdated((long) json.getLong("timeUpdated"));
            }
        }
        if (json.has("user")) {
            if (json.isNull("user")) {
                objProxy.realmSet$user(null);
            } else {
                com.apsapps.indimessenger.models.User userObj = com_apsapps_indimessenger_models_UserRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("user"), update);
                objProxy.realmSet$user(userObj);
            }
        }
        if (json.has("group")) {
            if (json.isNull("group")) {
                objProxy.realmSet$group(null);
            } else {
                com.apsapps.indimessenger.models.Group groupObj = com_apsapps_indimessenger_models_GroupRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("group"), update);
                objProxy.realmSet$group(groupObj);
            }
        }
        if (json.has("read")) {
            if (json.isNull("read")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'read' to null.");
            } else {
                objProxy.realmSet$read((boolean) json.getBoolean("read"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.apsapps.indimessenger.models.Chat createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.apsapps.indimessenger.models.Chat obj = new com.apsapps.indimessenger.models.Chat();
        final com_apsapps_indimessenger_models_ChatRealmProxyInterface objProxy = (com_apsapps_indimessenger_models_ChatRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("messages")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$messages(null);
                } else {
                    objProxy.realmSet$messages(new RealmList<com.apsapps.indimessenger.models.Message>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.apsapps.indimessenger.models.Message item = com_apsapps_indimessenger_models_MessageRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$messages().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("lastMessage")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$lastMessage((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$lastMessage(null);
                }
            } else if (name.equals("myId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$myId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$myId(null);
                }
            } else if (name.equals("userId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$userId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$userId(null);
                }
            } else if (name.equals("groupId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$groupId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$groupId(null);
                }
            } else if (name.equals("timeUpdated")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timeUpdated((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'timeUpdated' to null.");
                }
            } else if (name.equals("user")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$user(null);
                } else {
                    com.apsapps.indimessenger.models.User userObj = com_apsapps_indimessenger_models_UserRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$user(userObj);
                }
            } else if (name.equals("group")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$group(null);
                } else {
                    com.apsapps.indimessenger.models.Group groupObj = com_apsapps_indimessenger_models_GroupRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$group(groupObj);
                }
            } else if (name.equals("read")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$read((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'read' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    public static com.apsapps.indimessenger.models.Chat copyOrUpdate(Realm realm, com.apsapps.indimessenger.models.Chat object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null) {
            final BaseRealm otherRealm = ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm();
            if (otherRealm.threadId != realm.threadId) {
                throw new IllegalArgumentException("Objects which belong to Realm instances in other threads cannot be copied into this Realm instance.");
            }
            if (otherRealm.getPath().equals(realm.getPath())) {
                return object;
            }
        }
        final BaseRealm.RealmObjectContext objectContext = BaseRealm.objectContext.get();
        RealmObjectProxy cachedRealmObject = cache.get(object);
        if (cachedRealmObject != null) {
            return (com.apsapps.indimessenger.models.Chat) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static com.apsapps.indimessenger.models.Chat copy(Realm realm, com.apsapps.indimessenger.models.Chat newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.apsapps.indimessenger.models.Chat) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.apsapps.indimessenger.models.Chat realmObject = realm.createObjectInternal(com.apsapps.indimessenger.models.Chat.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_apsapps_indimessenger_models_ChatRealmProxyInterface realmObjectSource = (com_apsapps_indimessenger_models_ChatRealmProxyInterface) newObject;
        com_apsapps_indimessenger_models_ChatRealmProxyInterface realmObjectCopy = (com_apsapps_indimessenger_models_ChatRealmProxyInterface) realmObject;


        RealmList<com.apsapps.indimessenger.models.Message> messagesList = realmObjectSource.realmGet$messages();
        if (messagesList != null) {
            RealmList<com.apsapps.indimessenger.models.Message> messagesRealmList = realmObjectCopy.realmGet$messages();
            messagesRealmList.clear();
            for (int i = 0; i < messagesList.size(); i++) {
                com.apsapps.indimessenger.models.Message messagesItem = messagesList.get(i);
                com.apsapps.indimessenger.models.Message cachemessages = (com.apsapps.indimessenger.models.Message) cache.get(messagesItem);
                if (cachemessages != null) {
                    messagesRealmList.add(cachemessages);
                } else {
                    messagesRealmList.add(com_apsapps_indimessenger_models_MessageRealmProxy.copyOrUpdate(realm, messagesItem, update, cache));
                }
            }
        }

        realmObjectCopy.realmSet$lastMessage(realmObjectSource.realmGet$lastMessage());
        realmObjectCopy.realmSet$myId(realmObjectSource.realmGet$myId());
        realmObjectCopy.realmSet$userId(realmObjectSource.realmGet$userId());
        realmObjectCopy.realmSet$groupId(realmObjectSource.realmGet$groupId());
        realmObjectCopy.realmSet$timeUpdated(realmObjectSource.realmGet$timeUpdated());

        com.apsapps.indimessenger.models.User userObj = realmObjectSource.realmGet$user();
        if (userObj == null) {
            realmObjectCopy.realmSet$user(null);
        } else {
            com.apsapps.indimessenger.models.User cacheuser = (com.apsapps.indimessenger.models.User) cache.get(userObj);
            if (cacheuser != null) {
                realmObjectCopy.realmSet$user(cacheuser);
            } else {
                realmObjectCopy.realmSet$user(com_apsapps_indimessenger_models_UserRealmProxy.copyOrUpdate(realm, userObj, update, cache));
            }
        }

        com.apsapps.indimessenger.models.Group groupObj = realmObjectSource.realmGet$group();
        if (groupObj == null) {
            realmObjectCopy.realmSet$group(null);
        } else {
            com.apsapps.indimessenger.models.Group cachegroup = (com.apsapps.indimessenger.models.Group) cache.get(groupObj);
            if (cachegroup != null) {
                realmObjectCopy.realmSet$group(cachegroup);
            } else {
                realmObjectCopy.realmSet$group(com_apsapps_indimessenger_models_GroupRealmProxy.copyOrUpdate(realm, groupObj, update, cache));
            }
        }
        realmObjectCopy.realmSet$read(realmObjectSource.realmGet$read());
        return realmObject;
    }

    public static long insert(Realm realm, com.apsapps.indimessenger.models.Chat object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.apsapps.indimessenger.models.Chat.class);
        long tableNativePtr = table.getNativePtr();
        ChatColumnInfo columnInfo = (ChatColumnInfo) realm.getSchema().getColumnInfo(com.apsapps.indimessenger.models.Chat.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);

        RealmList<com.apsapps.indimessenger.models.Message> messagesList = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$messages();
        if (messagesList != null) {
            OsList messagesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.messagesIndex);
            for (com.apsapps.indimessenger.models.Message messagesItem : messagesList) {
                Long cacheItemIndexmessages = cache.get(messagesItem);
                if (cacheItemIndexmessages == null) {
                    cacheItemIndexmessages = com_apsapps_indimessenger_models_MessageRealmProxy.insert(realm, messagesItem, cache);
                }
                messagesOsList.addRow(cacheItemIndexmessages);
            }
        }
        String realmGet$lastMessage = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$lastMessage();
        if (realmGet$lastMessage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lastMessageIndex, rowIndex, realmGet$lastMessage, false);
        }
        String realmGet$myId = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$myId();
        if (realmGet$myId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.myIdIndex, rowIndex, realmGet$myId, false);
        }
        String realmGet$userId = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
        }
        String realmGet$groupId = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$groupId();
        if (realmGet$groupId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.groupIdIndex, rowIndex, realmGet$groupId, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timeUpdatedIndex, rowIndex, ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$timeUpdated(), false);

        com.apsapps.indimessenger.models.User userObj = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$user();
        if (userObj != null) {
            Long cacheuser = cache.get(userObj);
            if (cacheuser == null) {
                cacheuser = com_apsapps_indimessenger_models_UserRealmProxy.insert(realm, userObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.userIndex, rowIndex, cacheuser, false);
        }

        com.apsapps.indimessenger.models.Group groupObj = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$group();
        if (groupObj != null) {
            Long cachegroup = cache.get(groupObj);
            if (cachegroup == null) {
                cachegroup = com_apsapps_indimessenger_models_GroupRealmProxy.insert(realm, groupObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.groupIndex, rowIndex, cachegroup, false);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.readIndex, rowIndex, ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$read(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.apsapps.indimessenger.models.Chat.class);
        long tableNativePtr = table.getNativePtr();
        ChatColumnInfo columnInfo = (ChatColumnInfo) realm.getSchema().getColumnInfo(com.apsapps.indimessenger.models.Chat.class);
        com.apsapps.indimessenger.models.Chat object = null;
        while (objects.hasNext()) {
            object = (com.apsapps.indimessenger.models.Chat) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);

            RealmList<com.apsapps.indimessenger.models.Message> messagesList = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$messages();
            if (messagesList != null) {
                OsList messagesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.messagesIndex);
                for (com.apsapps.indimessenger.models.Message messagesItem : messagesList) {
                    Long cacheItemIndexmessages = cache.get(messagesItem);
                    if (cacheItemIndexmessages == null) {
                        cacheItemIndexmessages = com_apsapps_indimessenger_models_MessageRealmProxy.insert(realm, messagesItem, cache);
                    }
                    messagesOsList.addRow(cacheItemIndexmessages);
                }
            }
            String realmGet$lastMessage = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$lastMessage();
            if (realmGet$lastMessage != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lastMessageIndex, rowIndex, realmGet$lastMessage, false);
            }
            String realmGet$myId = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$myId();
            if (realmGet$myId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.myIdIndex, rowIndex, realmGet$myId, false);
            }
            String realmGet$userId = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
            }
            String realmGet$groupId = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$groupId();
            if (realmGet$groupId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.groupIdIndex, rowIndex, realmGet$groupId, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timeUpdatedIndex, rowIndex, ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$timeUpdated(), false);

            com.apsapps.indimessenger.models.User userObj = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$user();
            if (userObj != null) {
                Long cacheuser = cache.get(userObj);
                if (cacheuser == null) {
                    cacheuser = com_apsapps_indimessenger_models_UserRealmProxy.insert(realm, userObj, cache);
                }
                table.setLink(columnInfo.userIndex, rowIndex, cacheuser, false);
            }

            com.apsapps.indimessenger.models.Group groupObj = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$group();
            if (groupObj != null) {
                Long cachegroup = cache.get(groupObj);
                if (cachegroup == null) {
                    cachegroup = com_apsapps_indimessenger_models_GroupRealmProxy.insert(realm, groupObj, cache);
                }
                table.setLink(columnInfo.groupIndex, rowIndex, cachegroup, false);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.readIndex, rowIndex, ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$read(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.apsapps.indimessenger.models.Chat object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.apsapps.indimessenger.models.Chat.class);
        long tableNativePtr = table.getNativePtr();
        ChatColumnInfo columnInfo = (ChatColumnInfo) realm.getSchema().getColumnInfo(com.apsapps.indimessenger.models.Chat.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);

        OsList messagesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.messagesIndex);
        RealmList<com.apsapps.indimessenger.models.Message> messagesList = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$messages();
        if (messagesList != null && messagesList.size() == messagesOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = messagesList.size();
            for (int i = 0; i < objects; i++) {
                com.apsapps.indimessenger.models.Message messagesItem = messagesList.get(i);
                Long cacheItemIndexmessages = cache.get(messagesItem);
                if (cacheItemIndexmessages == null) {
                    cacheItemIndexmessages = com_apsapps_indimessenger_models_MessageRealmProxy.insertOrUpdate(realm, messagesItem, cache);
                }
                messagesOsList.setRow(i, cacheItemIndexmessages);
            }
        } else {
            messagesOsList.removeAll();
            if (messagesList != null) {
                for (com.apsapps.indimessenger.models.Message messagesItem : messagesList) {
                    Long cacheItemIndexmessages = cache.get(messagesItem);
                    if (cacheItemIndexmessages == null) {
                        cacheItemIndexmessages = com_apsapps_indimessenger_models_MessageRealmProxy.insertOrUpdate(realm, messagesItem, cache);
                    }
                    messagesOsList.addRow(cacheItemIndexmessages);
                }
            }
        }

        String realmGet$lastMessage = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$lastMessage();
        if (realmGet$lastMessage != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.lastMessageIndex, rowIndex, realmGet$lastMessage, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.lastMessageIndex, rowIndex, false);
        }
        String realmGet$myId = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$myId();
        if (realmGet$myId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.myIdIndex, rowIndex, realmGet$myId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.myIdIndex, rowIndex, false);
        }
        String realmGet$userId = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$userId();
        if (realmGet$userId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.userIdIndex, rowIndex, false);
        }
        String realmGet$groupId = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$groupId();
        if (realmGet$groupId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.groupIdIndex, rowIndex, realmGet$groupId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.groupIdIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timeUpdatedIndex, rowIndex, ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$timeUpdated(), false);

        com.apsapps.indimessenger.models.User userObj = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$user();
        if (userObj != null) {
            Long cacheuser = cache.get(userObj);
            if (cacheuser == null) {
                cacheuser = com_apsapps_indimessenger_models_UserRealmProxy.insertOrUpdate(realm, userObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.userIndex, rowIndex, cacheuser, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.userIndex, rowIndex);
        }

        com.apsapps.indimessenger.models.Group groupObj = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$group();
        if (groupObj != null) {
            Long cachegroup = cache.get(groupObj);
            if (cachegroup == null) {
                cachegroup = com_apsapps_indimessenger_models_GroupRealmProxy.insertOrUpdate(realm, groupObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.groupIndex, rowIndex, cachegroup, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.groupIndex, rowIndex);
        }
        Table.nativeSetBoolean(tableNativePtr, columnInfo.readIndex, rowIndex, ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$read(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.apsapps.indimessenger.models.Chat.class);
        long tableNativePtr = table.getNativePtr();
        ChatColumnInfo columnInfo = (ChatColumnInfo) realm.getSchema().getColumnInfo(com.apsapps.indimessenger.models.Chat.class);
        com.apsapps.indimessenger.models.Chat object = null;
        while (objects.hasNext()) {
            object = (com.apsapps.indimessenger.models.Chat) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);

            OsList messagesOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.messagesIndex);
            RealmList<com.apsapps.indimessenger.models.Message> messagesList = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$messages();
            if (messagesList != null && messagesList.size() == messagesOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = messagesList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.apsapps.indimessenger.models.Message messagesItem = messagesList.get(i);
                    Long cacheItemIndexmessages = cache.get(messagesItem);
                    if (cacheItemIndexmessages == null) {
                        cacheItemIndexmessages = com_apsapps_indimessenger_models_MessageRealmProxy.insertOrUpdate(realm, messagesItem, cache);
                    }
                    messagesOsList.setRow(i, cacheItemIndexmessages);
                }
            } else {
                messagesOsList.removeAll();
                if (messagesList != null) {
                    for (com.apsapps.indimessenger.models.Message messagesItem : messagesList) {
                        Long cacheItemIndexmessages = cache.get(messagesItem);
                        if (cacheItemIndexmessages == null) {
                            cacheItemIndexmessages = com_apsapps_indimessenger_models_MessageRealmProxy.insertOrUpdate(realm, messagesItem, cache);
                        }
                        messagesOsList.addRow(cacheItemIndexmessages);
                    }
                }
            }

            String realmGet$lastMessage = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$lastMessage();
            if (realmGet$lastMessage != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.lastMessageIndex, rowIndex, realmGet$lastMessage, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.lastMessageIndex, rowIndex, false);
            }
            String realmGet$myId = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$myId();
            if (realmGet$myId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.myIdIndex, rowIndex, realmGet$myId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.myIdIndex, rowIndex, false);
            }
            String realmGet$userId = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$userId();
            if (realmGet$userId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.userIdIndex, rowIndex, realmGet$userId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.userIdIndex, rowIndex, false);
            }
            String realmGet$groupId = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$groupId();
            if (realmGet$groupId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.groupIdIndex, rowIndex, realmGet$groupId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.groupIdIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timeUpdatedIndex, rowIndex, ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$timeUpdated(), false);

            com.apsapps.indimessenger.models.User userObj = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$user();
            if (userObj != null) {
                Long cacheuser = cache.get(userObj);
                if (cacheuser == null) {
                    cacheuser = com_apsapps_indimessenger_models_UserRealmProxy.insertOrUpdate(realm, userObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.userIndex, rowIndex, cacheuser, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.userIndex, rowIndex);
            }

            com.apsapps.indimessenger.models.Group groupObj = ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$group();
            if (groupObj != null) {
                Long cachegroup = cache.get(groupObj);
                if (cachegroup == null) {
                    cachegroup = com_apsapps_indimessenger_models_GroupRealmProxy.insertOrUpdate(realm, groupObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.groupIndex, rowIndex, cachegroup, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.groupIndex, rowIndex);
            }
            Table.nativeSetBoolean(tableNativePtr, columnInfo.readIndex, rowIndex, ((com_apsapps_indimessenger_models_ChatRealmProxyInterface) object).realmGet$read(), false);
        }
    }

    public static com.apsapps.indimessenger.models.Chat createDetachedCopy(com.apsapps.indimessenger.models.Chat realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.apsapps.indimessenger.models.Chat unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.apsapps.indimessenger.models.Chat();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.apsapps.indimessenger.models.Chat) cachedObject.object;
            }
            unmanagedObject = (com.apsapps.indimessenger.models.Chat) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_apsapps_indimessenger_models_ChatRealmProxyInterface unmanagedCopy = (com_apsapps_indimessenger_models_ChatRealmProxyInterface) unmanagedObject;
        com_apsapps_indimessenger_models_ChatRealmProxyInterface realmSource = (com_apsapps_indimessenger_models_ChatRealmProxyInterface) realmObject;

        // Deep copy of messages
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$messages(null);
        } else {
            RealmList<com.apsapps.indimessenger.models.Message> managedmessagesList = realmSource.realmGet$messages();
            RealmList<com.apsapps.indimessenger.models.Message> unmanagedmessagesList = new RealmList<com.apsapps.indimessenger.models.Message>();
            unmanagedCopy.realmSet$messages(unmanagedmessagesList);
            int nextDepth = currentDepth + 1;
            int size = managedmessagesList.size();
            for (int i = 0; i < size; i++) {
                com.apsapps.indimessenger.models.Message item = com_apsapps_indimessenger_models_MessageRealmProxy.createDetachedCopy(managedmessagesList.get(i), nextDepth, maxDepth, cache);
                unmanagedmessagesList.add(item);
            }
        }
        unmanagedCopy.realmSet$lastMessage(realmSource.realmGet$lastMessage());
        unmanagedCopy.realmSet$myId(realmSource.realmGet$myId());
        unmanagedCopy.realmSet$userId(realmSource.realmGet$userId());
        unmanagedCopy.realmSet$groupId(realmSource.realmGet$groupId());
        unmanagedCopy.realmSet$timeUpdated(realmSource.realmGet$timeUpdated());

        // Deep copy of user
        unmanagedCopy.realmSet$user(com_apsapps_indimessenger_models_UserRealmProxy.createDetachedCopy(realmSource.realmGet$user(), currentDepth + 1, maxDepth, cache));

        // Deep copy of group
        unmanagedCopy.realmSet$group(com_apsapps_indimessenger_models_GroupRealmProxy.createDetachedCopy(realmSource.realmGet$group(), currentDepth + 1, maxDepth, cache));
        unmanagedCopy.realmSet$read(realmSource.realmGet$read());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("Chat = proxy[");
        stringBuilder.append("{messages:");
        stringBuilder.append("RealmList<Message>[").append(realmGet$messages().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{lastMessage:");
        stringBuilder.append(realmGet$lastMessage() != null ? realmGet$lastMessage() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{myId:");
        stringBuilder.append(realmGet$myId() != null ? realmGet$myId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{userId:");
        stringBuilder.append(realmGet$userId() != null ? realmGet$userId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{groupId:");
        stringBuilder.append(realmGet$groupId() != null ? realmGet$groupId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{timeUpdated:");
        stringBuilder.append(realmGet$timeUpdated());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{user:");
        stringBuilder.append(realmGet$user() != null ? "User" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{group:");
        stringBuilder.append(realmGet$group() != null ? "Group" : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{read:");
        stringBuilder.append(realmGet$read());
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

    @Override
    public int hashCode() {
        String realmName = proxyState.getRealm$realm().getPath();
        String tableName = proxyState.getRow$realm().getTable().getName();
        long rowIndex = proxyState.getRow$realm().getIndex();

        int result = 17;
        result = 31 * result + ((realmName != null) ? realmName.hashCode() : 0);
        result = 31 * result + ((tableName != null) ? tableName.hashCode() : 0);
        result = 31 * result + (int) (rowIndex ^ (rowIndex >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        com_apsapps_indimessenger_models_ChatRealmProxy aChat = (com_apsapps_indimessenger_models_ChatRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aChat.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aChat.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aChat.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
