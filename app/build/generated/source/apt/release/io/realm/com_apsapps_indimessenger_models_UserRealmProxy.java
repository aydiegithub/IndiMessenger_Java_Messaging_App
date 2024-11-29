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
public class com_apsapps_indimessenger_models_UserRealmProxy extends com.apsapps.indimessenger.models.User
    implements RealmObjectProxy, com_apsapps_indimessenger_models_UserRealmProxyInterface {

    static final class UserColumnInfo extends ColumnInfo {
        long idIndex;
        long nameIndex;
        long statusIndex;
        long imageIndex;
        long wallpaperIndex;
        long timestampIndex;
        long solochatIndex;
        long blockedUsersIdsIndex;

        UserColumnInfo(OsSchemaInfo schemaInfo) {
            super(8);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("User");
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.statusIndex = addColumnDetails("status", "status", objectSchemaInfo);
            this.imageIndex = addColumnDetails("image", "image", objectSchemaInfo);
            this.wallpaperIndex = addColumnDetails("wallpaper", "wallpaper", objectSchemaInfo);
            this.timestampIndex = addColumnDetails("timestamp", "timestamp", objectSchemaInfo);
            this.solochatIndex = addColumnDetails("solochat", "solochat", objectSchemaInfo);
            this.blockedUsersIdsIndex = addColumnDetails("blockedUsersIds", "blockedUsersIds", objectSchemaInfo);
        }

        UserColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new UserColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final UserColumnInfo src = (UserColumnInfo) rawSrc;
            final UserColumnInfo dst = (UserColumnInfo) rawDst;
            dst.idIndex = src.idIndex;
            dst.nameIndex = src.nameIndex;
            dst.statusIndex = src.statusIndex;
            dst.imageIndex = src.imageIndex;
            dst.wallpaperIndex = src.wallpaperIndex;
            dst.timestampIndex = src.timestampIndex;
            dst.solochatIndex = src.solochatIndex;
            dst.blockedUsersIdsIndex = src.blockedUsersIdsIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private UserColumnInfo columnInfo;
    private ProxyState<com.apsapps.indimessenger.models.User> proxyState;
    private RealmList<com.apsapps.indimessenger.models.solochat> solochatRealmList;
    private RealmList<String> blockedUsersIdsRealmList;

    com_apsapps_indimessenger_models_UserRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (UserColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.apsapps.indimessenger.models.User>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$id() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.idIndex);
    }

    @Override
    public void realmSet$id(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.idIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.idIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.idIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.idIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$name() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.nameIndex);
    }

    @Override
    public void realmSet$name(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.nameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.nameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.nameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.nameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$status() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.statusIndex);
    }

    @Override
    public void realmSet$status(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.statusIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.statusIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.statusIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.statusIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$image() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.imageIndex);
    }

    @Override
    public void realmSet$image(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.imageIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.imageIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.imageIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.imageIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$wallpaper() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.wallpaperIndex);
    }

    @Override
    public void realmSet$wallpaper(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.wallpaperIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.wallpaperIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.wallpaperIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.wallpaperIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$timestamp() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.timestampIndex);
    }

    @Override
    public void realmSet$timestamp(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.timestampIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.timestampIndex, value);
    }

    @Override
    public RealmList<com.apsapps.indimessenger.models.solochat> realmGet$solochat() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (solochatRealmList != null) {
            return solochatRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.solochatIndex);
            solochatRealmList = new RealmList<com.apsapps.indimessenger.models.solochat>(com.apsapps.indimessenger.models.solochat.class, osList, proxyState.getRealm$realm());
            return solochatRealmList;
        }
    }

    @Override
    public void realmSet$solochat(RealmList<com.apsapps.indimessenger.models.solochat> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("solochat")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.apsapps.indimessenger.models.solochat> original = value;
                value = new RealmList<com.apsapps.indimessenger.models.solochat>();
                for (com.apsapps.indimessenger.models.solochat item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.solochatIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.apsapps.indimessenger.models.solochat linkedObject = value.get(i);
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
                com.apsapps.indimessenger.models.solochat linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    @Override
    public RealmList<String> realmGet$blockedUsersIds() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (blockedUsersIdsRealmList != null) {
            return blockedUsersIdsRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getValueList(columnInfo.blockedUsersIdsIndex, RealmFieldType.STRING_LIST);
            blockedUsersIdsRealmList = new RealmList<java.lang.String>(java.lang.String.class, osList, proxyState.getRealm$realm());
            return blockedUsersIdsRealmList;
        }
    }

    @Override
    public void realmSet$blockedUsersIds(RealmList<String> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("blockedUsersIds")) {
                return;
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getValueList(columnInfo.blockedUsersIdsIndex, RealmFieldType.STRING_LIST);
        osList.removeAll();
        if (value == null) {
            return;
        }
        for (java.lang.String item : value) {
            if (item == null) {
                osList.addNull();
            } else {
                osList.addString(item);
            }
        }
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("User", 8, 0);
        builder.addPersistedProperty("id", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("status", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("image", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("wallpaper", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("timestamp", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("solochat", RealmFieldType.LIST, "solochat");
        builder.addPersistedValueListProperty("blockedUsersIds", RealmFieldType.STRING_LIST, !Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static UserColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new UserColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "User";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "User";
    }

    @SuppressWarnings("cast")
    public static com.apsapps.indimessenger.models.User createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(2);
        if (json.has("solochat")) {
            excludeFields.add("solochat");
        }
        if (json.has("blockedUsersIds")) {
            excludeFields.add("blockedUsersIds");
        }
        com.apsapps.indimessenger.models.User obj = realm.createObjectInternal(com.apsapps.indimessenger.models.User.class, true, excludeFields);

        final com_apsapps_indimessenger_models_UserRealmProxyInterface objProxy = (com_apsapps_indimessenger_models_UserRealmProxyInterface) obj;
        if (json.has("id")) {
            if (json.isNull("id")) {
                objProxy.realmSet$id(null);
            } else {
                objProxy.realmSet$id((String) json.getString("id"));
            }
        }
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("status")) {
            if (json.isNull("status")) {
                objProxy.realmSet$status(null);
            } else {
                objProxy.realmSet$status((String) json.getString("status"));
            }
        }
        if (json.has("image")) {
            if (json.isNull("image")) {
                objProxy.realmSet$image(null);
            } else {
                objProxy.realmSet$image((String) json.getString("image"));
            }
        }
        if (json.has("wallpaper")) {
            if (json.isNull("wallpaper")) {
                objProxy.realmSet$wallpaper(null);
            } else {
                objProxy.realmSet$wallpaper((String) json.getString("wallpaper"));
            }
        }
        if (json.has("timestamp")) {
            if (json.isNull("timestamp")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'timestamp' to null.");
            } else {
                objProxy.realmSet$timestamp((long) json.getLong("timestamp"));
            }
        }
        if (json.has("solochat")) {
            if (json.isNull("solochat")) {
                objProxy.realmSet$solochat(null);
            } else {
                objProxy.realmGet$solochat().clear();
                JSONArray array = json.getJSONArray("solochat");
                for (int i = 0; i < array.length(); i++) {
                    com.apsapps.indimessenger.models.solochat item = com_apsapps_indimessenger_models_solochatRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$solochat().add(item);
                }
            }
        }
        ProxyUtils.setRealmListWithJsonObject(objProxy.realmGet$blockedUsersIds(), json, "blockedUsersIds");
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.apsapps.indimessenger.models.User createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.apsapps.indimessenger.models.User obj = new com.apsapps.indimessenger.models.User();
        final com_apsapps_indimessenger_models_UserRealmProxyInterface objProxy = (com_apsapps_indimessenger_models_UserRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("status")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$status((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$status(null);
                }
            } else if (name.equals("image")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$image((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$image(null);
                }
            } else if (name.equals("wallpaper")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$wallpaper((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$wallpaper(null);
                }
            } else if (name.equals("timestamp")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$timestamp((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'timestamp' to null.");
                }
            } else if (name.equals("solochat")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$solochat(null);
                } else {
                    objProxy.realmSet$solochat(new RealmList<com.apsapps.indimessenger.models.solochat>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.apsapps.indimessenger.models.solochat item = com_apsapps_indimessenger_models_solochatRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$solochat().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("blockedUsersIds")) {
                objProxy.realmSet$blockedUsersIds(ProxyUtils.createRealmListWithJsonStream(java.lang.String.class, reader));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    public static com.apsapps.indimessenger.models.User copyOrUpdate(Realm realm, com.apsapps.indimessenger.models.User object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.apsapps.indimessenger.models.User) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static com.apsapps.indimessenger.models.User copy(Realm realm, com.apsapps.indimessenger.models.User newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.apsapps.indimessenger.models.User) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.apsapps.indimessenger.models.User realmObject = realm.createObjectInternal(com.apsapps.indimessenger.models.User.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_apsapps_indimessenger_models_UserRealmProxyInterface realmObjectSource = (com_apsapps_indimessenger_models_UserRealmProxyInterface) newObject;
        com_apsapps_indimessenger_models_UserRealmProxyInterface realmObjectCopy = (com_apsapps_indimessenger_models_UserRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$id(realmObjectSource.realmGet$id());
        realmObjectCopy.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectCopy.realmSet$status(realmObjectSource.realmGet$status());
        realmObjectCopy.realmSet$image(realmObjectSource.realmGet$image());
        realmObjectCopy.realmSet$wallpaper(realmObjectSource.realmGet$wallpaper());
        realmObjectCopy.realmSet$timestamp(realmObjectSource.realmGet$timestamp());

        RealmList<com.apsapps.indimessenger.models.solochat> solochatList = realmObjectSource.realmGet$solochat();
        if (solochatList != null) {
            RealmList<com.apsapps.indimessenger.models.solochat> solochatRealmList = realmObjectCopy.realmGet$solochat();
            solochatRealmList.clear();
            for (int i = 0; i < solochatList.size(); i++) {
                com.apsapps.indimessenger.models.solochat solochatItem = solochatList.get(i);
                com.apsapps.indimessenger.models.solochat cachesolochat = (com.apsapps.indimessenger.models.solochat) cache.get(solochatItem);
                if (cachesolochat != null) {
                    solochatRealmList.add(cachesolochat);
                } else {
                    solochatRealmList.add(com_apsapps_indimessenger_models_solochatRealmProxy.copyOrUpdate(realm, solochatItem, update, cache));
                }
            }
        }

        realmObjectCopy.realmSet$blockedUsersIds(realmObjectSource.realmGet$blockedUsersIds());
        return realmObject;
    }

    public static long insert(Realm realm, com.apsapps.indimessenger.models.User object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.apsapps.indimessenger.models.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.apsapps.indimessenger.models.User.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$id = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
        }
        String realmGet$name = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$status = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
        }
        String realmGet$image = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$image();
        if (realmGet$image != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imageIndex, rowIndex, realmGet$image, false);
        }
        String realmGet$wallpaper = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$wallpaper();
        if (realmGet$wallpaper != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.wallpaperIndex, rowIndex, realmGet$wallpaper, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timestampIndex, rowIndex, ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$timestamp(), false);

        RealmList<com.apsapps.indimessenger.models.solochat> solochatList = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$solochat();
        if (solochatList != null) {
            OsList solochatOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.solochatIndex);
            for (com.apsapps.indimessenger.models.solochat solochatItem : solochatList) {
                Long cacheItemIndexsolochat = cache.get(solochatItem);
                if (cacheItemIndexsolochat == null) {
                    cacheItemIndexsolochat = com_apsapps_indimessenger_models_solochatRealmProxy.insert(realm, solochatItem, cache);
                }
                solochatOsList.addRow(cacheItemIndexsolochat);
            }
        }

        RealmList<java.lang.String> blockedUsersIdsList = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$blockedUsersIds();
        if (blockedUsersIdsList != null) {
            OsList blockedUsersIdsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.blockedUsersIdsIndex);
            for (java.lang.String blockedUsersIdsItem : blockedUsersIdsList) {
                if (blockedUsersIdsItem == null) {
                    blockedUsersIdsOsList.addNull();
                } else {
                    blockedUsersIdsOsList.addString(blockedUsersIdsItem);
                }
            }
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.apsapps.indimessenger.models.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.apsapps.indimessenger.models.User.class);
        com.apsapps.indimessenger.models.User object = null;
        while (objects.hasNext()) {
            object = (com.apsapps.indimessenger.models.User) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$id = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
            }
            String realmGet$name = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            String realmGet$status = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
            }
            String realmGet$image = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$image();
            if (realmGet$image != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.imageIndex, rowIndex, realmGet$image, false);
            }
            String realmGet$wallpaper = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$wallpaper();
            if (realmGet$wallpaper != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.wallpaperIndex, rowIndex, realmGet$wallpaper, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timestampIndex, rowIndex, ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$timestamp(), false);

            RealmList<com.apsapps.indimessenger.models.solochat> solochatList = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$solochat();
            if (solochatList != null) {
                OsList solochatOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.solochatIndex);
                for (com.apsapps.indimessenger.models.solochat solochatItem : solochatList) {
                    Long cacheItemIndexsolochat = cache.get(solochatItem);
                    if (cacheItemIndexsolochat == null) {
                        cacheItemIndexsolochat = com_apsapps_indimessenger_models_solochatRealmProxy.insert(realm, solochatItem, cache);
                    }
                    solochatOsList.addRow(cacheItemIndexsolochat);
                }
            }

            RealmList<java.lang.String> blockedUsersIdsList = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$blockedUsersIds();
            if (blockedUsersIdsList != null) {
                OsList blockedUsersIdsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.blockedUsersIdsIndex);
                for (java.lang.String blockedUsersIdsItem : blockedUsersIdsList) {
                    if (blockedUsersIdsItem == null) {
                        blockedUsersIdsOsList.addNull();
                    } else {
                        blockedUsersIdsOsList.addString(blockedUsersIdsItem);
                    }
                }
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.apsapps.indimessenger.models.User object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.apsapps.indimessenger.models.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.apsapps.indimessenger.models.User.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$id = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
        }
        String realmGet$name = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$status = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$status();
        if (realmGet$status != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.statusIndex, rowIndex, false);
        }
        String realmGet$image = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$image();
        if (realmGet$image != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.imageIndex, rowIndex, realmGet$image, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.imageIndex, rowIndex, false);
        }
        String realmGet$wallpaper = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$wallpaper();
        if (realmGet$wallpaper != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.wallpaperIndex, rowIndex, realmGet$wallpaper, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.wallpaperIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.timestampIndex, rowIndex, ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$timestamp(), false);

        OsList solochatOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.solochatIndex);
        RealmList<com.apsapps.indimessenger.models.solochat> solochatList = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$solochat();
        if (solochatList != null && solochatList.size() == solochatOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = solochatList.size();
            for (int i = 0; i < objects; i++) {
                com.apsapps.indimessenger.models.solochat solochatItem = solochatList.get(i);
                Long cacheItemIndexsolochat = cache.get(solochatItem);
                if (cacheItemIndexsolochat == null) {
                    cacheItemIndexsolochat = com_apsapps_indimessenger_models_solochatRealmProxy.insertOrUpdate(realm, solochatItem, cache);
                }
                solochatOsList.setRow(i, cacheItemIndexsolochat);
            }
        } else {
            solochatOsList.removeAll();
            if (solochatList != null) {
                for (com.apsapps.indimessenger.models.solochat solochatItem : solochatList) {
                    Long cacheItemIndexsolochat = cache.get(solochatItem);
                    if (cacheItemIndexsolochat == null) {
                        cacheItemIndexsolochat = com_apsapps_indimessenger_models_solochatRealmProxy.insertOrUpdate(realm, solochatItem, cache);
                    }
                    solochatOsList.addRow(cacheItemIndexsolochat);
                }
            }
        }


        OsList blockedUsersIdsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.blockedUsersIdsIndex);
        blockedUsersIdsOsList.removeAll();
        RealmList<java.lang.String> blockedUsersIdsList = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$blockedUsersIds();
        if (blockedUsersIdsList != null) {
            for (java.lang.String blockedUsersIdsItem : blockedUsersIdsList) {
                if (blockedUsersIdsItem == null) {
                    blockedUsersIdsOsList.addNull();
                } else {
                    blockedUsersIdsOsList.addString(blockedUsersIdsItem);
                }
            }
        }

        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.apsapps.indimessenger.models.User.class);
        long tableNativePtr = table.getNativePtr();
        UserColumnInfo columnInfo = (UserColumnInfo) realm.getSchema().getColumnInfo(com.apsapps.indimessenger.models.User.class);
        com.apsapps.indimessenger.models.User object = null;
        while (objects.hasNext()) {
            object = (com.apsapps.indimessenger.models.User) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$id = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
            }
            String realmGet$name = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            String realmGet$status = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$status();
            if (realmGet$status != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.statusIndex, rowIndex, realmGet$status, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.statusIndex, rowIndex, false);
            }
            String realmGet$image = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$image();
            if (realmGet$image != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.imageIndex, rowIndex, realmGet$image, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.imageIndex, rowIndex, false);
            }
            String realmGet$wallpaper = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$wallpaper();
            if (realmGet$wallpaper != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.wallpaperIndex, rowIndex, realmGet$wallpaper, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.wallpaperIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.timestampIndex, rowIndex, ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$timestamp(), false);

            OsList solochatOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.solochatIndex);
            RealmList<com.apsapps.indimessenger.models.solochat> solochatList = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$solochat();
            if (solochatList != null && solochatList.size() == solochatOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = solochatList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.apsapps.indimessenger.models.solochat solochatItem = solochatList.get(i);
                    Long cacheItemIndexsolochat = cache.get(solochatItem);
                    if (cacheItemIndexsolochat == null) {
                        cacheItemIndexsolochat = com_apsapps_indimessenger_models_solochatRealmProxy.insertOrUpdate(realm, solochatItem, cache);
                    }
                    solochatOsList.setRow(i, cacheItemIndexsolochat);
                }
            } else {
                solochatOsList.removeAll();
                if (solochatList != null) {
                    for (com.apsapps.indimessenger.models.solochat solochatItem : solochatList) {
                        Long cacheItemIndexsolochat = cache.get(solochatItem);
                        if (cacheItemIndexsolochat == null) {
                            cacheItemIndexsolochat = com_apsapps_indimessenger_models_solochatRealmProxy.insertOrUpdate(realm, solochatItem, cache);
                        }
                        solochatOsList.addRow(cacheItemIndexsolochat);
                    }
                }
            }


            OsList blockedUsersIdsOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.blockedUsersIdsIndex);
            blockedUsersIdsOsList.removeAll();
            RealmList<java.lang.String> blockedUsersIdsList = ((com_apsapps_indimessenger_models_UserRealmProxyInterface) object).realmGet$blockedUsersIds();
            if (blockedUsersIdsList != null) {
                for (java.lang.String blockedUsersIdsItem : blockedUsersIdsList) {
                    if (blockedUsersIdsItem == null) {
                        blockedUsersIdsOsList.addNull();
                    } else {
                        blockedUsersIdsOsList.addString(blockedUsersIdsItem);
                    }
                }
            }

        }
    }

    public static com.apsapps.indimessenger.models.User createDetachedCopy(com.apsapps.indimessenger.models.User realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.apsapps.indimessenger.models.User unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.apsapps.indimessenger.models.User();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.apsapps.indimessenger.models.User) cachedObject.object;
            }
            unmanagedObject = (com.apsapps.indimessenger.models.User) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_apsapps_indimessenger_models_UserRealmProxyInterface unmanagedCopy = (com_apsapps_indimessenger_models_UserRealmProxyInterface) unmanagedObject;
        com_apsapps_indimessenger_models_UserRealmProxyInterface realmSource = (com_apsapps_indimessenger_models_UserRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$status(realmSource.realmGet$status());
        unmanagedCopy.realmSet$image(realmSource.realmGet$image());
        unmanagedCopy.realmSet$wallpaper(realmSource.realmGet$wallpaper());
        unmanagedCopy.realmSet$timestamp(realmSource.realmGet$timestamp());

        // Deep copy of solochat
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$solochat(null);
        } else {
            RealmList<com.apsapps.indimessenger.models.solochat> managedsolochatList = realmSource.realmGet$solochat();
            RealmList<com.apsapps.indimessenger.models.solochat> unmanagedsolochatList = new RealmList<com.apsapps.indimessenger.models.solochat>();
            unmanagedCopy.realmSet$solochat(unmanagedsolochatList);
            int nextDepth = currentDepth + 1;
            int size = managedsolochatList.size();
            for (int i = 0; i < size; i++) {
                com.apsapps.indimessenger.models.solochat item = com_apsapps_indimessenger_models_solochatRealmProxy.createDetachedCopy(managedsolochatList.get(i), nextDepth, maxDepth, cache);
                unmanagedsolochatList.add(item);
            }
        }

        unmanagedCopy.realmSet$blockedUsersIds(new RealmList<java.lang.String>());
        unmanagedCopy.realmGet$blockedUsersIds().addAll(realmSource.realmGet$blockedUsersIds());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("User = proxy[");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{status:");
        stringBuilder.append(realmGet$status() != null ? realmGet$status() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{image:");
        stringBuilder.append(realmGet$image() != null ? realmGet$image() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{wallpaper:");
        stringBuilder.append(realmGet$wallpaper() != null ? realmGet$wallpaper() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{timestamp:");
        stringBuilder.append(realmGet$timestamp());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{solochat:");
        stringBuilder.append("RealmList<solochat>[").append(realmGet$solochat().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{blockedUsersIds:");
        stringBuilder.append("RealmList<String>[").append(realmGet$blockedUsersIds().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

}
