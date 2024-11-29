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
public class com_apsapps_indimessenger_models_StatusImageListRealmProxy extends com.apsapps.indimessenger.models.StatusImageList
    implements RealmObjectProxy, com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface {

    static final class StatusImageListColumnInfo extends ColumnInfo {
        long urlIndex;
        long uploadTimeIndex;
        long expiryIndex;

        StatusImageListColumnInfo(OsSchemaInfo schemaInfo) {
            super(3);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("StatusImageList");
            this.urlIndex = addColumnDetails("url", "url", objectSchemaInfo);
            this.uploadTimeIndex = addColumnDetails("uploadTime", "uploadTime", objectSchemaInfo);
            this.expiryIndex = addColumnDetails("expiry", "expiry", objectSchemaInfo);
        }

        StatusImageListColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new StatusImageListColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final StatusImageListColumnInfo src = (StatusImageListColumnInfo) rawSrc;
            final StatusImageListColumnInfo dst = (StatusImageListColumnInfo) rawDst;
            dst.urlIndex = src.urlIndex;
            dst.uploadTimeIndex = src.uploadTimeIndex;
            dst.expiryIndex = src.expiryIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private StatusImageListColumnInfo columnInfo;
    private ProxyState<com.apsapps.indimessenger.models.StatusImageList> proxyState;

    com_apsapps_indimessenger_models_StatusImageListRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (StatusImageListColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.apsapps.indimessenger.models.StatusImageList>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$url() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.urlIndex);
    }

    @Override
    public void realmSet$url(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.urlIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.urlIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.urlIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.urlIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$uploadTime() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.uploadTimeIndex);
    }

    @Override
    public void realmSet$uploadTime(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.uploadTimeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.uploadTimeIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$expiry() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.expiryIndex);
    }

    @Override
    public void realmSet$expiry(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.expiryIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.expiryIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("StatusImageList", 3, 0);
        builder.addPersistedProperty("url", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("uploadTime", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("expiry", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static StatusImageListColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new StatusImageListColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "StatusImageList";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "StatusImageList";
    }

    @SuppressWarnings("cast")
    public static com.apsapps.indimessenger.models.StatusImageList createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = Collections.<String> emptyList();
        com.apsapps.indimessenger.models.StatusImageList obj = realm.createObjectInternal(com.apsapps.indimessenger.models.StatusImageList.class, true, excludeFields);

        final com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface objProxy = (com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface) obj;
        if (json.has("url")) {
            if (json.isNull("url")) {
                objProxy.realmSet$url(null);
            } else {
                objProxy.realmSet$url((String) json.getString("url"));
            }
        }
        if (json.has("uploadTime")) {
            if (json.isNull("uploadTime")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'uploadTime' to null.");
            } else {
                objProxy.realmSet$uploadTime((long) json.getLong("uploadTime"));
            }
        }
        if (json.has("expiry")) {
            if (json.isNull("expiry")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'expiry' to null.");
            } else {
                objProxy.realmSet$expiry((boolean) json.getBoolean("expiry"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.apsapps.indimessenger.models.StatusImageList createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.apsapps.indimessenger.models.StatusImageList obj = new com.apsapps.indimessenger.models.StatusImageList();
        final com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface objProxy = (com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("url")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$url((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$url(null);
                }
            } else if (name.equals("uploadTime")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$uploadTime((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'uploadTime' to null.");
                }
            } else if (name.equals("expiry")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$expiry((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'expiry' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    public static com.apsapps.indimessenger.models.StatusImageList copyOrUpdate(Realm realm, com.apsapps.indimessenger.models.StatusImageList object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.apsapps.indimessenger.models.StatusImageList) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static com.apsapps.indimessenger.models.StatusImageList copy(Realm realm, com.apsapps.indimessenger.models.StatusImageList newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.apsapps.indimessenger.models.StatusImageList) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.apsapps.indimessenger.models.StatusImageList realmObject = realm.createObjectInternal(com.apsapps.indimessenger.models.StatusImageList.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface realmObjectSource = (com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface) newObject;
        com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface realmObjectCopy = (com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$url(realmObjectSource.realmGet$url());
        realmObjectCopy.realmSet$uploadTime(realmObjectSource.realmGet$uploadTime());
        realmObjectCopy.realmSet$expiry(realmObjectSource.realmGet$expiry());
        return realmObject;
    }

    public static long insert(Realm realm, com.apsapps.indimessenger.models.StatusImageList object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.apsapps.indimessenger.models.StatusImageList.class);
        long tableNativePtr = table.getNativePtr();
        StatusImageListColumnInfo columnInfo = (StatusImageListColumnInfo) realm.getSchema().getColumnInfo(com.apsapps.indimessenger.models.StatusImageList.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$url = ((com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface) object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.uploadTimeIndex, rowIndex, ((com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface) object).realmGet$uploadTime(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.expiryIndex, rowIndex, ((com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface) object).realmGet$expiry(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.apsapps.indimessenger.models.StatusImageList.class);
        long tableNativePtr = table.getNativePtr();
        StatusImageListColumnInfo columnInfo = (StatusImageListColumnInfo) realm.getSchema().getColumnInfo(com.apsapps.indimessenger.models.StatusImageList.class);
        com.apsapps.indimessenger.models.StatusImageList object = null;
        while (objects.hasNext()) {
            object = (com.apsapps.indimessenger.models.StatusImageList) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$url = ((com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface) object).realmGet$url();
            if (realmGet$url != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.uploadTimeIndex, rowIndex, ((com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface) object).realmGet$uploadTime(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.expiryIndex, rowIndex, ((com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface) object).realmGet$expiry(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.apsapps.indimessenger.models.StatusImageList object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.apsapps.indimessenger.models.StatusImageList.class);
        long tableNativePtr = table.getNativePtr();
        StatusImageListColumnInfo columnInfo = (StatusImageListColumnInfo) realm.getSchema().getColumnInfo(com.apsapps.indimessenger.models.StatusImageList.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$url = ((com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface) object).realmGet$url();
        if (realmGet$url != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.urlIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.uploadTimeIndex, rowIndex, ((com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface) object).realmGet$uploadTime(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.expiryIndex, rowIndex, ((com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface) object).realmGet$expiry(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.apsapps.indimessenger.models.StatusImageList.class);
        long tableNativePtr = table.getNativePtr();
        StatusImageListColumnInfo columnInfo = (StatusImageListColumnInfo) realm.getSchema().getColumnInfo(com.apsapps.indimessenger.models.StatusImageList.class);
        com.apsapps.indimessenger.models.StatusImageList object = null;
        while (objects.hasNext()) {
            object = (com.apsapps.indimessenger.models.StatusImageList) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$url = ((com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface) object).realmGet$url();
            if (realmGet$url != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.urlIndex, rowIndex, realmGet$url, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.urlIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.uploadTimeIndex, rowIndex, ((com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface) object).realmGet$uploadTime(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.expiryIndex, rowIndex, ((com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface) object).realmGet$expiry(), false);
        }
    }

    public static com.apsapps.indimessenger.models.StatusImageList createDetachedCopy(com.apsapps.indimessenger.models.StatusImageList realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.apsapps.indimessenger.models.StatusImageList unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.apsapps.indimessenger.models.StatusImageList();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.apsapps.indimessenger.models.StatusImageList) cachedObject.object;
            }
            unmanagedObject = (com.apsapps.indimessenger.models.StatusImageList) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface unmanagedCopy = (com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface) unmanagedObject;
        com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface realmSource = (com_apsapps_indimessenger_models_StatusImageListRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$url(realmSource.realmGet$url());
        unmanagedCopy.realmSet$uploadTime(realmSource.realmGet$uploadTime());
        unmanagedCopy.realmSet$expiry(realmSource.realmGet$expiry());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("StatusImageList = proxy[");
        stringBuilder.append("{url:");
        stringBuilder.append(realmGet$url() != null ? realmGet$url() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{uploadTime:");
        stringBuilder.append(realmGet$uploadTime());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{expiry:");
        stringBuilder.append(realmGet$expiry());
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
        com_apsapps_indimessenger_models_StatusImageListRealmProxy aStatusImageList = (com_apsapps_indimessenger_models_StatusImageListRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aStatusImageList.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aStatusImageList.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aStatusImageList.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
