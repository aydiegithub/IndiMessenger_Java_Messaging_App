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
public class com_apsapps_indimessenger_models_AttachmentListRealmProxy extends com.apsapps.indimessenger.models.AttachmentList
    implements RealmObjectProxy, com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface {

    static final class AttachmentListColumnInfo extends ColumnInfo {
        long nameIndex;
        long dataIndex;
        long urlListIndex;
        long bytesCountIndex;

        AttachmentListColumnInfo(OsSchemaInfo schemaInfo) {
            super(4);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("AttachmentList");
            this.nameIndex = addColumnDetails("name", "name", objectSchemaInfo);
            this.dataIndex = addColumnDetails("data", "data", objectSchemaInfo);
            this.urlListIndex = addColumnDetails("urlList", "urlList", objectSchemaInfo);
            this.bytesCountIndex = addColumnDetails("bytesCount", "bytesCount", objectSchemaInfo);
        }

        AttachmentListColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new AttachmentListColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final AttachmentListColumnInfo src = (AttachmentListColumnInfo) rawSrc;
            final AttachmentListColumnInfo dst = (AttachmentListColumnInfo) rawDst;
            dst.nameIndex = src.nameIndex;
            dst.dataIndex = src.dataIndex;
            dst.urlListIndex = src.urlListIndex;
            dst.bytesCountIndex = src.bytesCountIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private AttachmentListColumnInfo columnInfo;
    private ProxyState<com.apsapps.indimessenger.models.AttachmentList> proxyState;
    private RealmList<com.apsapps.indimessenger.models.StatusImageList> urlListRealmList;

    com_apsapps_indimessenger_models_AttachmentListRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (AttachmentListColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.apsapps.indimessenger.models.AttachmentList>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
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
    public String realmGet$data() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.dataIndex);
    }

    @Override
    public void realmSet$data(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.dataIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.dataIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.dataIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.dataIndex, value);
    }

    @Override
    public RealmList<com.apsapps.indimessenger.models.StatusImageList> realmGet$urlList() {
        proxyState.getRealm$realm().checkIfValid();
        // use the cached value if available
        if (urlListRealmList != null) {
            return urlListRealmList;
        } else {
            OsList osList = proxyState.getRow$realm().getModelList(columnInfo.urlListIndex);
            urlListRealmList = new RealmList<com.apsapps.indimessenger.models.StatusImageList>(com.apsapps.indimessenger.models.StatusImageList.class, osList, proxyState.getRealm$realm());
            return urlListRealmList;
        }
    }

    @Override
    public void realmSet$urlList(RealmList<com.apsapps.indimessenger.models.StatusImageList> value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("urlList")) {
                return;
            }
            // if the list contains unmanaged RealmObjects, convert them to managed.
            if (value != null && !value.isManaged()) {
                final Realm realm = (Realm) proxyState.getRealm$realm();
                final RealmList<com.apsapps.indimessenger.models.StatusImageList> original = value;
                value = new RealmList<com.apsapps.indimessenger.models.StatusImageList>();
                for (com.apsapps.indimessenger.models.StatusImageList item : original) {
                    if (item == null || RealmObject.isManaged(item)) {
                        value.add(item);
                    } else {
                        value.add(realm.copyToRealm(item));
                    }
                }
            }
        }

        proxyState.getRealm$realm().checkIfValid();
        OsList osList = proxyState.getRow$realm().getModelList(columnInfo.urlListIndex);
        // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
        if (value != null && value.size() == osList.size()) {
            int objects = value.size();
            for (int i = 0; i < objects; i++) {
                com.apsapps.indimessenger.models.StatusImageList linkedObject = value.get(i);
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
                com.apsapps.indimessenger.models.StatusImageList linkedObject = value.get(i);
                proxyState.checkValidObject(linkedObject);
                osList.addRow(((RealmObjectProxy) linkedObject).realmGet$proxyState().getRow$realm().getIndex());
            }
        }
    }

    @Override
    @SuppressWarnings("cast")
    public long realmGet$bytesCount() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.bytesCountIndex);
    }

    @Override
    public void realmSet$bytesCount(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.bytesCountIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.bytesCountIndex, value);
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("AttachmentList", 4, 0);
        builder.addPersistedProperty("name", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("data", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedLinkProperty("urlList", RealmFieldType.LIST, "StatusImageList");
        builder.addPersistedProperty("bytesCount", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static AttachmentListColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new AttachmentListColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "AttachmentList";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "AttachmentList";
    }

    @SuppressWarnings("cast")
    public static com.apsapps.indimessenger.models.AttachmentList createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        if (json.has("urlList")) {
            excludeFields.add("urlList");
        }
        com.apsapps.indimessenger.models.AttachmentList obj = realm.createObjectInternal(com.apsapps.indimessenger.models.AttachmentList.class, true, excludeFields);

        final com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface objProxy = (com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface) obj;
        if (json.has("name")) {
            if (json.isNull("name")) {
                objProxy.realmSet$name(null);
            } else {
                objProxy.realmSet$name((String) json.getString("name"));
            }
        }
        if (json.has("data")) {
            if (json.isNull("data")) {
                objProxy.realmSet$data(null);
            } else {
                objProxy.realmSet$data((String) json.getString("data"));
            }
        }
        if (json.has("urlList")) {
            if (json.isNull("urlList")) {
                objProxy.realmSet$urlList(null);
            } else {
                objProxy.realmGet$urlList().clear();
                JSONArray array = json.getJSONArray("urlList");
                for (int i = 0; i < array.length(); i++) {
                    com.apsapps.indimessenger.models.StatusImageList item = com_apsapps_indimessenger_models_StatusImageListRealmProxy.createOrUpdateUsingJsonObject(realm, array.getJSONObject(i), update);
                    objProxy.realmGet$urlList().add(item);
                }
            }
        }
        if (json.has("bytesCount")) {
            if (json.isNull("bytesCount")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'bytesCount' to null.");
            } else {
                objProxy.realmSet$bytesCount((long) json.getLong("bytesCount"));
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.apsapps.indimessenger.models.AttachmentList createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.apsapps.indimessenger.models.AttachmentList obj = new com.apsapps.indimessenger.models.AttachmentList();
        final com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface objProxy = (com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("name")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$name((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$name(null);
                }
            } else if (name.equals("data")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$data((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$data(null);
                }
            } else if (name.equals("urlList")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$urlList(null);
                } else {
                    objProxy.realmSet$urlList(new RealmList<com.apsapps.indimessenger.models.StatusImageList>());
                    reader.beginArray();
                    while (reader.hasNext()) {
                        com.apsapps.indimessenger.models.StatusImageList item = com_apsapps_indimessenger_models_StatusImageListRealmProxy.createUsingJsonStream(realm, reader);
                        objProxy.realmGet$urlList().add(item);
                    }
                    reader.endArray();
                }
            } else if (name.equals("bytesCount")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$bytesCount((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'bytesCount' to null.");
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    public static com.apsapps.indimessenger.models.AttachmentList copyOrUpdate(Realm realm, com.apsapps.indimessenger.models.AttachmentList object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.apsapps.indimessenger.models.AttachmentList) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static com.apsapps.indimessenger.models.AttachmentList copy(Realm realm, com.apsapps.indimessenger.models.AttachmentList newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.apsapps.indimessenger.models.AttachmentList) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.apsapps.indimessenger.models.AttachmentList realmObject = realm.createObjectInternal(com.apsapps.indimessenger.models.AttachmentList.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface realmObjectSource = (com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface) newObject;
        com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface realmObjectCopy = (com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$name(realmObjectSource.realmGet$name());
        realmObjectCopy.realmSet$data(realmObjectSource.realmGet$data());

        RealmList<com.apsapps.indimessenger.models.StatusImageList> urlListList = realmObjectSource.realmGet$urlList();
        if (urlListList != null) {
            RealmList<com.apsapps.indimessenger.models.StatusImageList> urlListRealmList = realmObjectCopy.realmGet$urlList();
            urlListRealmList.clear();
            for (int i = 0; i < urlListList.size(); i++) {
                com.apsapps.indimessenger.models.StatusImageList urlListItem = urlListList.get(i);
                com.apsapps.indimessenger.models.StatusImageList cacheurlList = (com.apsapps.indimessenger.models.StatusImageList) cache.get(urlListItem);
                if (cacheurlList != null) {
                    urlListRealmList.add(cacheurlList);
                } else {
                    urlListRealmList.add(com_apsapps_indimessenger_models_StatusImageListRealmProxy.copyOrUpdate(realm, urlListItem, update, cache));
                }
            }
        }

        realmObjectCopy.realmSet$bytesCount(realmObjectSource.realmGet$bytesCount());
        return realmObject;
    }

    public static long insert(Realm realm, com.apsapps.indimessenger.models.AttachmentList object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.apsapps.indimessenger.models.AttachmentList.class);
        long tableNativePtr = table.getNativePtr();
        AttachmentListColumnInfo columnInfo = (AttachmentListColumnInfo) realm.getSchema().getColumnInfo(com.apsapps.indimessenger.models.AttachmentList.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$name = ((com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        }
        String realmGet$data = ((com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface) object).realmGet$data();
        if (realmGet$data != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dataIndex, rowIndex, realmGet$data, false);
        }

        RealmList<com.apsapps.indimessenger.models.StatusImageList> urlListList = ((com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface) object).realmGet$urlList();
        if (urlListList != null) {
            OsList urlListOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.urlListIndex);
            for (com.apsapps.indimessenger.models.StatusImageList urlListItem : urlListList) {
                Long cacheItemIndexurlList = cache.get(urlListItem);
                if (cacheItemIndexurlList == null) {
                    cacheItemIndexurlList = com_apsapps_indimessenger_models_StatusImageListRealmProxy.insert(realm, urlListItem, cache);
                }
                urlListOsList.addRow(cacheItemIndexurlList);
            }
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.bytesCountIndex, rowIndex, ((com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface) object).realmGet$bytesCount(), false);
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.apsapps.indimessenger.models.AttachmentList.class);
        long tableNativePtr = table.getNativePtr();
        AttachmentListColumnInfo columnInfo = (AttachmentListColumnInfo) realm.getSchema().getColumnInfo(com.apsapps.indimessenger.models.AttachmentList.class);
        com.apsapps.indimessenger.models.AttachmentList object = null;
        while (objects.hasNext()) {
            object = (com.apsapps.indimessenger.models.AttachmentList) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$name = ((com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            }
            String realmGet$data = ((com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface) object).realmGet$data();
            if (realmGet$data != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dataIndex, rowIndex, realmGet$data, false);
            }

            RealmList<com.apsapps.indimessenger.models.StatusImageList> urlListList = ((com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface) object).realmGet$urlList();
            if (urlListList != null) {
                OsList urlListOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.urlListIndex);
                for (com.apsapps.indimessenger.models.StatusImageList urlListItem : urlListList) {
                    Long cacheItemIndexurlList = cache.get(urlListItem);
                    if (cacheItemIndexurlList == null) {
                        cacheItemIndexurlList = com_apsapps_indimessenger_models_StatusImageListRealmProxy.insert(realm, urlListItem, cache);
                    }
                    urlListOsList.addRow(cacheItemIndexurlList);
                }
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.bytesCountIndex, rowIndex, ((com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface) object).realmGet$bytesCount(), false);
        }
    }

    public static long insertOrUpdate(Realm realm, com.apsapps.indimessenger.models.AttachmentList object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.apsapps.indimessenger.models.AttachmentList.class);
        long tableNativePtr = table.getNativePtr();
        AttachmentListColumnInfo columnInfo = (AttachmentListColumnInfo) realm.getSchema().getColumnInfo(com.apsapps.indimessenger.models.AttachmentList.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$name = ((com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface) object).realmGet$name();
        if (realmGet$name != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
        }
        String realmGet$data = ((com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface) object).realmGet$data();
        if (realmGet$data != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.dataIndex, rowIndex, realmGet$data, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.dataIndex, rowIndex, false);
        }

        OsList urlListOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.urlListIndex);
        RealmList<com.apsapps.indimessenger.models.StatusImageList> urlListList = ((com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface) object).realmGet$urlList();
        if (urlListList != null && urlListList.size() == urlListOsList.size()) {
            // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
            int objects = urlListList.size();
            for (int i = 0; i < objects; i++) {
                com.apsapps.indimessenger.models.StatusImageList urlListItem = urlListList.get(i);
                Long cacheItemIndexurlList = cache.get(urlListItem);
                if (cacheItemIndexurlList == null) {
                    cacheItemIndexurlList = com_apsapps_indimessenger_models_StatusImageListRealmProxy.insertOrUpdate(realm, urlListItem, cache);
                }
                urlListOsList.setRow(i, cacheItemIndexurlList);
            }
        } else {
            urlListOsList.removeAll();
            if (urlListList != null) {
                for (com.apsapps.indimessenger.models.StatusImageList urlListItem : urlListList) {
                    Long cacheItemIndexurlList = cache.get(urlListItem);
                    if (cacheItemIndexurlList == null) {
                        cacheItemIndexurlList = com_apsapps_indimessenger_models_StatusImageListRealmProxy.insertOrUpdate(realm, urlListItem, cache);
                    }
                    urlListOsList.addRow(cacheItemIndexurlList);
                }
            }
        }

        Table.nativeSetLong(tableNativePtr, columnInfo.bytesCountIndex, rowIndex, ((com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface) object).realmGet$bytesCount(), false);
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.apsapps.indimessenger.models.AttachmentList.class);
        long tableNativePtr = table.getNativePtr();
        AttachmentListColumnInfo columnInfo = (AttachmentListColumnInfo) realm.getSchema().getColumnInfo(com.apsapps.indimessenger.models.AttachmentList.class);
        com.apsapps.indimessenger.models.AttachmentList object = null;
        while (objects.hasNext()) {
            object = (com.apsapps.indimessenger.models.AttachmentList) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$name = ((com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface) object).realmGet$name();
            if (realmGet$name != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.nameIndex, rowIndex, realmGet$name, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.nameIndex, rowIndex, false);
            }
            String realmGet$data = ((com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface) object).realmGet$data();
            if (realmGet$data != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.dataIndex, rowIndex, realmGet$data, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.dataIndex, rowIndex, false);
            }

            OsList urlListOsList = new OsList(table.getUncheckedRow(rowIndex), columnInfo.urlListIndex);
            RealmList<com.apsapps.indimessenger.models.StatusImageList> urlListList = ((com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface) object).realmGet$urlList();
            if (urlListList != null && urlListList.size() == urlListOsList.size()) {
                // For lists of equal lengths, we need to set each element directly as clearing the receiver list can be wrong if the input and target list are the same.
                int objectCount = urlListList.size();
                for (int i = 0; i < objectCount; i++) {
                    com.apsapps.indimessenger.models.StatusImageList urlListItem = urlListList.get(i);
                    Long cacheItemIndexurlList = cache.get(urlListItem);
                    if (cacheItemIndexurlList == null) {
                        cacheItemIndexurlList = com_apsapps_indimessenger_models_StatusImageListRealmProxy.insertOrUpdate(realm, urlListItem, cache);
                    }
                    urlListOsList.setRow(i, cacheItemIndexurlList);
                }
            } else {
                urlListOsList.removeAll();
                if (urlListList != null) {
                    for (com.apsapps.indimessenger.models.StatusImageList urlListItem : urlListList) {
                        Long cacheItemIndexurlList = cache.get(urlListItem);
                        if (cacheItemIndexurlList == null) {
                            cacheItemIndexurlList = com_apsapps_indimessenger_models_StatusImageListRealmProxy.insertOrUpdate(realm, urlListItem, cache);
                        }
                        urlListOsList.addRow(cacheItemIndexurlList);
                    }
                }
            }

            Table.nativeSetLong(tableNativePtr, columnInfo.bytesCountIndex, rowIndex, ((com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface) object).realmGet$bytesCount(), false);
        }
    }

    public static com.apsapps.indimessenger.models.AttachmentList createDetachedCopy(com.apsapps.indimessenger.models.AttachmentList realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.apsapps.indimessenger.models.AttachmentList unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.apsapps.indimessenger.models.AttachmentList();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.apsapps.indimessenger.models.AttachmentList) cachedObject.object;
            }
            unmanagedObject = (com.apsapps.indimessenger.models.AttachmentList) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface unmanagedCopy = (com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface) unmanagedObject;
        com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface realmSource = (com_apsapps_indimessenger_models_AttachmentListRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$name(realmSource.realmGet$name());
        unmanagedCopy.realmSet$data(realmSource.realmGet$data());

        // Deep copy of urlList
        if (currentDepth == maxDepth) {
            unmanagedCopy.realmSet$urlList(null);
        } else {
            RealmList<com.apsapps.indimessenger.models.StatusImageList> managedurlListList = realmSource.realmGet$urlList();
            RealmList<com.apsapps.indimessenger.models.StatusImageList> unmanagedurlListList = new RealmList<com.apsapps.indimessenger.models.StatusImageList>();
            unmanagedCopy.realmSet$urlList(unmanagedurlListList);
            int nextDepth = currentDepth + 1;
            int size = managedurlListList.size();
            for (int i = 0; i < size; i++) {
                com.apsapps.indimessenger.models.StatusImageList item = com_apsapps_indimessenger_models_StatusImageListRealmProxy.createDetachedCopy(managedurlListList.get(i), nextDepth, maxDepth, cache);
                unmanagedurlListList.add(item);
            }
        }
        unmanagedCopy.realmSet$bytesCount(realmSource.realmGet$bytesCount());

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("AttachmentList = proxy[");
        stringBuilder.append("{name:");
        stringBuilder.append(realmGet$name() != null ? realmGet$name() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{data:");
        stringBuilder.append(realmGet$data() != null ? realmGet$data() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{urlList:");
        stringBuilder.append("RealmList<StatusImageList>[").append(realmGet$urlList().size()).append("]");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{bytesCount:");
        stringBuilder.append(realmGet$bytesCount());
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
        com_apsapps_indimessenger_models_AttachmentListRealmProxy aAttachmentList = (com_apsapps_indimessenger_models_AttachmentListRealmProxy)o;

        String path = proxyState.getRealm$realm().getPath();
        String otherPath = aAttachmentList.proxyState.getRealm$realm().getPath();
        if (path != null ? !path.equals(otherPath) : otherPath != null) return false;

        String tableName = proxyState.getRow$realm().getTable().getName();
        String otherTableName = aAttachmentList.proxyState.getRow$realm().getTable().getName();
        if (tableName != null ? !tableName.equals(otherTableName) : otherTableName != null) return false;

        if (proxyState.getRow$realm().getIndex() != aAttachmentList.proxyState.getRow$realm().getIndex()) return false;

        return true;
    }
}
