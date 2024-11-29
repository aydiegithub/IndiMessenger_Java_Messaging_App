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
public class com_apsapps_indimessenger_models_MessageNewRealmProxy extends com.apsapps.indimessenger.models.MessageNew
    implements RealmObjectProxy, com_apsapps_indimessenger_models_MessageNewRealmProxyInterface {

    static final class MessageNewColumnInfo extends ColumnInfo {
        long bodyIndex;
        long senderNameIndex;
        long senderIdIndex;
        long recipientIdIndex;
        long idIndex;
        long dateIndex;
        long deliveredIndex;
        long sentIndex;
        long attachmentTypeIndex;
        long attachmentIndex;

        MessageNewColumnInfo(OsSchemaInfo schemaInfo) {
            super(10);
            OsObjectSchemaInfo objectSchemaInfo = schemaInfo.getObjectSchemaInfo("MessageNew");
            this.bodyIndex = addColumnDetails("body", "body", objectSchemaInfo);
            this.senderNameIndex = addColumnDetails("senderName", "senderName", objectSchemaInfo);
            this.senderIdIndex = addColumnDetails("senderId", "senderId", objectSchemaInfo);
            this.recipientIdIndex = addColumnDetails("recipientId", "recipientId", objectSchemaInfo);
            this.idIndex = addColumnDetails("id", "id", objectSchemaInfo);
            this.dateIndex = addColumnDetails("date", "date", objectSchemaInfo);
            this.deliveredIndex = addColumnDetails("delivered", "delivered", objectSchemaInfo);
            this.sentIndex = addColumnDetails("sent", "sent", objectSchemaInfo);
            this.attachmentTypeIndex = addColumnDetails("attachmentType", "attachmentType", objectSchemaInfo);
            this.attachmentIndex = addColumnDetails("attachment", "attachment", objectSchemaInfo);
        }

        MessageNewColumnInfo(ColumnInfo src, boolean mutable) {
            super(src, mutable);
            copy(src, this);
        }

        @Override
        protected final ColumnInfo copy(boolean mutable) {
            return new MessageNewColumnInfo(this, mutable);
        }

        @Override
        protected final void copy(ColumnInfo rawSrc, ColumnInfo rawDst) {
            final MessageNewColumnInfo src = (MessageNewColumnInfo) rawSrc;
            final MessageNewColumnInfo dst = (MessageNewColumnInfo) rawDst;
            dst.bodyIndex = src.bodyIndex;
            dst.senderNameIndex = src.senderNameIndex;
            dst.senderIdIndex = src.senderIdIndex;
            dst.recipientIdIndex = src.recipientIdIndex;
            dst.idIndex = src.idIndex;
            dst.dateIndex = src.dateIndex;
            dst.deliveredIndex = src.deliveredIndex;
            dst.sentIndex = src.sentIndex;
            dst.attachmentTypeIndex = src.attachmentTypeIndex;
            dst.attachmentIndex = src.attachmentIndex;
        }
    }

    private static final OsObjectSchemaInfo expectedObjectSchemaInfo = createExpectedObjectSchemaInfo();

    private MessageNewColumnInfo columnInfo;
    private ProxyState<com.apsapps.indimessenger.models.MessageNew> proxyState;

    com_apsapps_indimessenger_models_MessageNewRealmProxy() {
        proxyState.setConstructionFinished();
    }

    @Override
    public void realm$injectObjectContext() {
        if (this.proxyState != null) {
            return;
        }
        final BaseRealm.RealmObjectContext context = BaseRealm.objectContext.get();
        this.columnInfo = (MessageNewColumnInfo) context.getColumnInfo();
        this.proxyState = new ProxyState<com.apsapps.indimessenger.models.MessageNew>(this);
        proxyState.setRealm$realm(context.getRealm());
        proxyState.setRow$realm(context.getRow());
        proxyState.setAcceptDefaultValue$realm(context.getAcceptDefaultValue());
        proxyState.setExcludeFields$realm(context.getExcludeFields());
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$body() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.bodyIndex);
    }

    @Override
    public void realmSet$body(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.bodyIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.bodyIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.bodyIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.bodyIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$senderName() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.senderNameIndex);
    }

    @Override
    public void realmSet$senderName(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.senderNameIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.senderNameIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.senderNameIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.senderNameIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$senderId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.senderIdIndex);
    }

    @Override
    public void realmSet$senderId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.senderIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.senderIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.senderIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.senderIdIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public String realmGet$recipientId() {
        proxyState.getRealm$realm().checkIfValid();
        return (java.lang.String) proxyState.getRow$realm().getString(columnInfo.recipientIdIndex);
    }

    @Override
    public void realmSet$recipientId(String value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                row.getTable().setNull(columnInfo.recipientIdIndex, row.getIndex(), true);
                return;
            }
            row.getTable().setString(columnInfo.recipientIdIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().setNull(columnInfo.recipientIdIndex);
            return;
        }
        proxyState.getRow$realm().setString(columnInfo.recipientIdIndex, value);
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
    public long realmGet$date() {
        proxyState.getRealm$realm().checkIfValid();
        return (long) proxyState.getRow$realm().getLong(columnInfo.dateIndex);
    }

    @Override
    public void realmSet$date(long value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.dateIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.dateIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$delivered() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.deliveredIndex);
    }

    @Override
    public void realmSet$delivered(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.deliveredIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.deliveredIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public boolean realmGet$sent() {
        proxyState.getRealm$realm().checkIfValid();
        return (boolean) proxyState.getRow$realm().getBoolean(columnInfo.sentIndex);
    }

    @Override
    public void realmSet$sent(boolean value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setBoolean(columnInfo.sentIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setBoolean(columnInfo.sentIndex, value);
    }

    @Override
    @SuppressWarnings("cast")
    public int realmGet$attachmentType() {
        proxyState.getRealm$realm().checkIfValid();
        return (int) proxyState.getRow$realm().getLong(columnInfo.attachmentTypeIndex);
    }

    @Override
    public void realmSet$attachmentType(int value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            final Row row = proxyState.getRow$realm();
            row.getTable().setLong(columnInfo.attachmentTypeIndex, row.getIndex(), value, true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        proxyState.getRow$realm().setLong(columnInfo.attachmentTypeIndex, value);
    }

    @Override
    public com.apsapps.indimessenger.models.AttachmentList realmGet$attachment() {
        proxyState.getRealm$realm().checkIfValid();
        if (proxyState.getRow$realm().isNullLink(columnInfo.attachmentIndex)) {
            return null;
        }
        return proxyState.getRealm$realm().get(com.apsapps.indimessenger.models.AttachmentList.class, proxyState.getRow$realm().getLink(columnInfo.attachmentIndex), false, Collections.<String>emptyList());
    }

    @Override
    public void realmSet$attachment(com.apsapps.indimessenger.models.AttachmentList value) {
        if (proxyState.isUnderConstruction()) {
            if (!proxyState.getAcceptDefaultValue$realm()) {
                return;
            }
            if (proxyState.getExcludeFields$realm().contains("attachment")) {
                return;
            }
            if (value != null && !RealmObject.isManaged(value)) {
                value = ((Realm) proxyState.getRealm$realm()).copyToRealm(value);
            }
            final Row row = proxyState.getRow$realm();
            if (value == null) {
                // Table#nullifyLink() does not support default value. Just using Row.
                row.nullifyLink(columnInfo.attachmentIndex);
                return;
            }
            proxyState.checkValidObject(value);
            row.getTable().setLink(columnInfo.attachmentIndex, row.getIndex(), ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex(), true);
            return;
        }

        proxyState.getRealm$realm().checkIfValid();
        if (value == null) {
            proxyState.getRow$realm().nullifyLink(columnInfo.attachmentIndex);
            return;
        }
        proxyState.checkValidObject(value);
        proxyState.getRow$realm().setLink(columnInfo.attachmentIndex, ((RealmObjectProxy) value).realmGet$proxyState().getRow$realm().getIndex());
    }

    private static OsObjectSchemaInfo createExpectedObjectSchemaInfo() {
        OsObjectSchemaInfo.Builder builder = new OsObjectSchemaInfo.Builder("MessageNew", 10, 0);
        builder.addPersistedProperty("body", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("senderName", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("senderId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("recipientId", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("id", RealmFieldType.STRING, !Property.PRIMARY_KEY, !Property.INDEXED, !Property.REQUIRED);
        builder.addPersistedProperty("date", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("delivered", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("sent", RealmFieldType.BOOLEAN, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedProperty("attachmentType", RealmFieldType.INTEGER, !Property.PRIMARY_KEY, !Property.INDEXED, Property.REQUIRED);
        builder.addPersistedLinkProperty("attachment", RealmFieldType.OBJECT, "AttachmentList");
        return builder.build();
    }

    public static OsObjectSchemaInfo getExpectedObjectSchemaInfo() {
        return expectedObjectSchemaInfo;
    }

    public static MessageNewColumnInfo createColumnInfo(OsSchemaInfo schemaInfo) {
        return new MessageNewColumnInfo(schemaInfo);
    }

    public static String getSimpleClassName() {
        return "MessageNew";
    }

    public static final class ClassNameHelper {
        public static final String INTERNAL_CLASS_NAME = "MessageNew";
    }

    @SuppressWarnings("cast")
    public static com.apsapps.indimessenger.models.MessageNew createOrUpdateUsingJsonObject(Realm realm, JSONObject json, boolean update)
        throws JSONException {
        final List<String> excludeFields = new ArrayList<String>(1);
        if (json.has("attachment")) {
            excludeFields.add("attachment");
        }
        com.apsapps.indimessenger.models.MessageNew obj = realm.createObjectInternal(com.apsapps.indimessenger.models.MessageNew.class, true, excludeFields);

        final com_apsapps_indimessenger_models_MessageNewRealmProxyInterface objProxy = (com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) obj;
        if (json.has("body")) {
            if (json.isNull("body")) {
                objProxy.realmSet$body(null);
            } else {
                objProxy.realmSet$body((String) json.getString("body"));
            }
        }
        if (json.has("senderName")) {
            if (json.isNull("senderName")) {
                objProxy.realmSet$senderName(null);
            } else {
                objProxy.realmSet$senderName((String) json.getString("senderName"));
            }
        }
        if (json.has("senderId")) {
            if (json.isNull("senderId")) {
                objProxy.realmSet$senderId(null);
            } else {
                objProxy.realmSet$senderId((String) json.getString("senderId"));
            }
        }
        if (json.has("recipientId")) {
            if (json.isNull("recipientId")) {
                objProxy.realmSet$recipientId(null);
            } else {
                objProxy.realmSet$recipientId((String) json.getString("recipientId"));
            }
        }
        if (json.has("id")) {
            if (json.isNull("id")) {
                objProxy.realmSet$id(null);
            } else {
                objProxy.realmSet$id((String) json.getString("id"));
            }
        }
        if (json.has("date")) {
            if (json.isNull("date")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
            } else {
                objProxy.realmSet$date((long) json.getLong("date"));
            }
        }
        if (json.has("delivered")) {
            if (json.isNull("delivered")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'delivered' to null.");
            } else {
                objProxy.realmSet$delivered((boolean) json.getBoolean("delivered"));
            }
        }
        if (json.has("sent")) {
            if (json.isNull("sent")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'sent' to null.");
            } else {
                objProxy.realmSet$sent((boolean) json.getBoolean("sent"));
            }
        }
        if (json.has("attachmentType")) {
            if (json.isNull("attachmentType")) {
                throw new IllegalArgumentException("Trying to set non-nullable field 'attachmentType' to null.");
            } else {
                objProxy.realmSet$attachmentType((int) json.getInt("attachmentType"));
            }
        }
        if (json.has("attachment")) {
            if (json.isNull("attachment")) {
                objProxy.realmSet$attachment(null);
            } else {
                com.apsapps.indimessenger.models.AttachmentList attachmentObj = com_apsapps_indimessenger_models_AttachmentListRealmProxy.createOrUpdateUsingJsonObject(realm, json.getJSONObject("attachment"), update);
                objProxy.realmSet$attachment(attachmentObj);
            }
        }
        return obj;
    }

    @SuppressWarnings("cast")
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public static com.apsapps.indimessenger.models.MessageNew createUsingJsonStream(Realm realm, JsonReader reader)
        throws IOException {
        final com.apsapps.indimessenger.models.MessageNew obj = new com.apsapps.indimessenger.models.MessageNew();
        final com_apsapps_indimessenger_models_MessageNewRealmProxyInterface objProxy = (com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) obj;
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (false) {
            } else if (name.equals("body")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$body((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$body(null);
                }
            } else if (name.equals("senderName")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$senderName((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$senderName(null);
                }
            } else if (name.equals("senderId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$senderId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$senderId(null);
                }
            } else if (name.equals("recipientId")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$recipientId((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$recipientId(null);
                }
            } else if (name.equals("id")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$id((String) reader.nextString());
                } else {
                    reader.skipValue();
                    objProxy.realmSet$id(null);
                }
            } else if (name.equals("date")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$date((long) reader.nextLong());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'date' to null.");
                }
            } else if (name.equals("delivered")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$delivered((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'delivered' to null.");
                }
            } else if (name.equals("sent")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$sent((boolean) reader.nextBoolean());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'sent' to null.");
                }
            } else if (name.equals("attachmentType")) {
                if (reader.peek() != JsonToken.NULL) {
                    objProxy.realmSet$attachmentType((int) reader.nextInt());
                } else {
                    reader.skipValue();
                    throw new IllegalArgumentException("Trying to set non-nullable field 'attachmentType' to null.");
                }
            } else if (name.equals("attachment")) {
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                    objProxy.realmSet$attachment(null);
                } else {
                    com.apsapps.indimessenger.models.AttachmentList attachmentObj = com_apsapps_indimessenger_models_AttachmentListRealmProxy.createUsingJsonStream(realm, reader);
                    objProxy.realmSet$attachment(attachmentObj);
                }
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return realm.copyToRealm(obj);
    }

    public static com.apsapps.indimessenger.models.MessageNew copyOrUpdate(Realm realm, com.apsapps.indimessenger.models.MessageNew object, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
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
            return (com.apsapps.indimessenger.models.MessageNew) cachedRealmObject;
        }

        return copy(realm, object, update, cache);
    }

    public static com.apsapps.indimessenger.models.MessageNew copy(Realm realm, com.apsapps.indimessenger.models.MessageNew newObject, boolean update, Map<RealmModel,RealmObjectProxy> cache) {
        RealmObjectProxy cachedRealmObject = cache.get(newObject);
        if (cachedRealmObject != null) {
            return (com.apsapps.indimessenger.models.MessageNew) cachedRealmObject;
        }

        // rejecting default values to avoid creating unexpected objects from RealmModel/RealmList fields.
        com.apsapps.indimessenger.models.MessageNew realmObject = realm.createObjectInternal(com.apsapps.indimessenger.models.MessageNew.class, false, Collections.<String>emptyList());
        cache.put(newObject, (RealmObjectProxy) realmObject);

        com_apsapps_indimessenger_models_MessageNewRealmProxyInterface realmObjectSource = (com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) newObject;
        com_apsapps_indimessenger_models_MessageNewRealmProxyInterface realmObjectCopy = (com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) realmObject;

        realmObjectCopy.realmSet$body(realmObjectSource.realmGet$body());
        realmObjectCopy.realmSet$senderName(realmObjectSource.realmGet$senderName());
        realmObjectCopy.realmSet$senderId(realmObjectSource.realmGet$senderId());
        realmObjectCopy.realmSet$recipientId(realmObjectSource.realmGet$recipientId());
        realmObjectCopy.realmSet$id(realmObjectSource.realmGet$id());
        realmObjectCopy.realmSet$date(realmObjectSource.realmGet$date());
        realmObjectCopy.realmSet$delivered(realmObjectSource.realmGet$delivered());
        realmObjectCopy.realmSet$sent(realmObjectSource.realmGet$sent());
        realmObjectCopy.realmSet$attachmentType(realmObjectSource.realmGet$attachmentType());

        com.apsapps.indimessenger.models.AttachmentList attachmentObj = realmObjectSource.realmGet$attachment();
        if (attachmentObj == null) {
            realmObjectCopy.realmSet$attachment(null);
        } else {
            com.apsapps.indimessenger.models.AttachmentList cacheattachment = (com.apsapps.indimessenger.models.AttachmentList) cache.get(attachmentObj);
            if (cacheattachment != null) {
                realmObjectCopy.realmSet$attachment(cacheattachment);
            } else {
                realmObjectCopy.realmSet$attachment(com_apsapps_indimessenger_models_AttachmentListRealmProxy.copyOrUpdate(realm, attachmentObj, update, cache));
            }
        }
        return realmObject;
    }

    public static long insert(Realm realm, com.apsapps.indimessenger.models.MessageNew object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.apsapps.indimessenger.models.MessageNew.class);
        long tableNativePtr = table.getNativePtr();
        MessageNewColumnInfo columnInfo = (MessageNewColumnInfo) realm.getSchema().getColumnInfo(com.apsapps.indimessenger.models.MessageNew.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$body = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$body();
        if (realmGet$body != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bodyIndex, rowIndex, realmGet$body, false);
        }
        String realmGet$senderName = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$senderName();
        if (realmGet$senderName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.senderNameIndex, rowIndex, realmGet$senderName, false);
        }
        String realmGet$senderId = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$senderId();
        if (realmGet$senderId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.senderIdIndex, rowIndex, realmGet$senderId, false);
        }
        String realmGet$recipientId = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$recipientId();
        if (realmGet$recipientId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.recipientIdIndex, rowIndex, realmGet$recipientId, false);
        }
        String realmGet$id = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$date(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.deliveredIndex, rowIndex, ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$delivered(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.sentIndex, rowIndex, ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$sent(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.attachmentTypeIndex, rowIndex, ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$attachmentType(), false);

        com.apsapps.indimessenger.models.AttachmentList attachmentObj = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$attachment();
        if (attachmentObj != null) {
            Long cacheattachment = cache.get(attachmentObj);
            if (cacheattachment == null) {
                cacheattachment = com_apsapps_indimessenger_models_AttachmentListRealmProxy.insert(realm, attachmentObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.attachmentIndex, rowIndex, cacheattachment, false);
        }
        return rowIndex;
    }

    public static void insert(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.apsapps.indimessenger.models.MessageNew.class);
        long tableNativePtr = table.getNativePtr();
        MessageNewColumnInfo columnInfo = (MessageNewColumnInfo) realm.getSchema().getColumnInfo(com.apsapps.indimessenger.models.MessageNew.class);
        com.apsapps.indimessenger.models.MessageNew object = null;
        while (objects.hasNext()) {
            object = (com.apsapps.indimessenger.models.MessageNew) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$body = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$body();
            if (realmGet$body != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bodyIndex, rowIndex, realmGet$body, false);
            }
            String realmGet$senderName = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$senderName();
            if (realmGet$senderName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.senderNameIndex, rowIndex, realmGet$senderName, false);
            }
            String realmGet$senderId = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$senderId();
            if (realmGet$senderId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.senderIdIndex, rowIndex, realmGet$senderId, false);
            }
            String realmGet$recipientId = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$recipientId();
            if (realmGet$recipientId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.recipientIdIndex, rowIndex, realmGet$recipientId, false);
            }
            String realmGet$id = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$date(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.deliveredIndex, rowIndex, ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$delivered(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.sentIndex, rowIndex, ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$sent(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.attachmentTypeIndex, rowIndex, ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$attachmentType(), false);

            com.apsapps.indimessenger.models.AttachmentList attachmentObj = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$attachment();
            if (attachmentObj != null) {
                Long cacheattachment = cache.get(attachmentObj);
                if (cacheattachment == null) {
                    cacheattachment = com_apsapps_indimessenger_models_AttachmentListRealmProxy.insert(realm, attachmentObj, cache);
                }
                table.setLink(columnInfo.attachmentIndex, rowIndex, cacheattachment, false);
            }
        }
    }

    public static long insertOrUpdate(Realm realm, com.apsapps.indimessenger.models.MessageNew object, Map<RealmModel,Long> cache) {
        if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
            return ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex();
        }
        Table table = realm.getTable(com.apsapps.indimessenger.models.MessageNew.class);
        long tableNativePtr = table.getNativePtr();
        MessageNewColumnInfo columnInfo = (MessageNewColumnInfo) realm.getSchema().getColumnInfo(com.apsapps.indimessenger.models.MessageNew.class);
        long rowIndex = OsObject.createRow(table);
        cache.put(object, rowIndex);
        String realmGet$body = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$body();
        if (realmGet$body != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.bodyIndex, rowIndex, realmGet$body, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.bodyIndex, rowIndex, false);
        }
        String realmGet$senderName = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$senderName();
        if (realmGet$senderName != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.senderNameIndex, rowIndex, realmGet$senderName, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.senderNameIndex, rowIndex, false);
        }
        String realmGet$senderId = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$senderId();
        if (realmGet$senderId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.senderIdIndex, rowIndex, realmGet$senderId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.senderIdIndex, rowIndex, false);
        }
        String realmGet$recipientId = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$recipientId();
        if (realmGet$recipientId != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.recipientIdIndex, rowIndex, realmGet$recipientId, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.recipientIdIndex, rowIndex, false);
        }
        String realmGet$id = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$id();
        if (realmGet$id != null) {
            Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
        } else {
            Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
        }
        Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$date(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.deliveredIndex, rowIndex, ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$delivered(), false);
        Table.nativeSetBoolean(tableNativePtr, columnInfo.sentIndex, rowIndex, ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$sent(), false);
        Table.nativeSetLong(tableNativePtr, columnInfo.attachmentTypeIndex, rowIndex, ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$attachmentType(), false);

        com.apsapps.indimessenger.models.AttachmentList attachmentObj = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$attachment();
        if (attachmentObj != null) {
            Long cacheattachment = cache.get(attachmentObj);
            if (cacheattachment == null) {
                cacheattachment = com_apsapps_indimessenger_models_AttachmentListRealmProxy.insertOrUpdate(realm, attachmentObj, cache);
            }
            Table.nativeSetLink(tableNativePtr, columnInfo.attachmentIndex, rowIndex, cacheattachment, false);
        } else {
            Table.nativeNullifyLink(tableNativePtr, columnInfo.attachmentIndex, rowIndex);
        }
        return rowIndex;
    }

    public static void insertOrUpdate(Realm realm, Iterator<? extends RealmModel> objects, Map<RealmModel,Long> cache) {
        Table table = realm.getTable(com.apsapps.indimessenger.models.MessageNew.class);
        long tableNativePtr = table.getNativePtr();
        MessageNewColumnInfo columnInfo = (MessageNewColumnInfo) realm.getSchema().getColumnInfo(com.apsapps.indimessenger.models.MessageNew.class);
        com.apsapps.indimessenger.models.MessageNew object = null;
        while (objects.hasNext()) {
            object = (com.apsapps.indimessenger.models.MessageNew) objects.next();
            if (cache.containsKey(object)) {
                continue;
            }
            if (object instanceof RealmObjectProxy && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm() != null && ((RealmObjectProxy) object).realmGet$proxyState().getRealm$realm().getPath().equals(realm.getPath())) {
                cache.put(object, ((RealmObjectProxy) object).realmGet$proxyState().getRow$realm().getIndex());
                continue;
            }
            long rowIndex = OsObject.createRow(table);
            cache.put(object, rowIndex);
            String realmGet$body = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$body();
            if (realmGet$body != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.bodyIndex, rowIndex, realmGet$body, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.bodyIndex, rowIndex, false);
            }
            String realmGet$senderName = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$senderName();
            if (realmGet$senderName != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.senderNameIndex, rowIndex, realmGet$senderName, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.senderNameIndex, rowIndex, false);
            }
            String realmGet$senderId = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$senderId();
            if (realmGet$senderId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.senderIdIndex, rowIndex, realmGet$senderId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.senderIdIndex, rowIndex, false);
            }
            String realmGet$recipientId = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$recipientId();
            if (realmGet$recipientId != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.recipientIdIndex, rowIndex, realmGet$recipientId, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.recipientIdIndex, rowIndex, false);
            }
            String realmGet$id = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$id();
            if (realmGet$id != null) {
                Table.nativeSetString(tableNativePtr, columnInfo.idIndex, rowIndex, realmGet$id, false);
            } else {
                Table.nativeSetNull(tableNativePtr, columnInfo.idIndex, rowIndex, false);
            }
            Table.nativeSetLong(tableNativePtr, columnInfo.dateIndex, rowIndex, ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$date(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.deliveredIndex, rowIndex, ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$delivered(), false);
            Table.nativeSetBoolean(tableNativePtr, columnInfo.sentIndex, rowIndex, ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$sent(), false);
            Table.nativeSetLong(tableNativePtr, columnInfo.attachmentTypeIndex, rowIndex, ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$attachmentType(), false);

            com.apsapps.indimessenger.models.AttachmentList attachmentObj = ((com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) object).realmGet$attachment();
            if (attachmentObj != null) {
                Long cacheattachment = cache.get(attachmentObj);
                if (cacheattachment == null) {
                    cacheattachment = com_apsapps_indimessenger_models_AttachmentListRealmProxy.insertOrUpdate(realm, attachmentObj, cache);
                }
                Table.nativeSetLink(tableNativePtr, columnInfo.attachmentIndex, rowIndex, cacheattachment, false);
            } else {
                Table.nativeNullifyLink(tableNativePtr, columnInfo.attachmentIndex, rowIndex);
            }
        }
    }

    public static com.apsapps.indimessenger.models.MessageNew createDetachedCopy(com.apsapps.indimessenger.models.MessageNew realmObject, int currentDepth, int maxDepth, Map<RealmModel, CacheData<RealmModel>> cache) {
        if (currentDepth > maxDepth || realmObject == null) {
            return null;
        }
        CacheData<RealmModel> cachedObject = cache.get(realmObject);
        com.apsapps.indimessenger.models.MessageNew unmanagedObject;
        if (cachedObject == null) {
            unmanagedObject = new com.apsapps.indimessenger.models.MessageNew();
            cache.put(realmObject, new RealmObjectProxy.CacheData<RealmModel>(currentDepth, unmanagedObject));
        } else {
            // Reuse cached object or recreate it because it was encountered at a lower depth.
            if (currentDepth >= cachedObject.minDepth) {
                return (com.apsapps.indimessenger.models.MessageNew) cachedObject.object;
            }
            unmanagedObject = (com.apsapps.indimessenger.models.MessageNew) cachedObject.object;
            cachedObject.minDepth = currentDepth;
        }
        com_apsapps_indimessenger_models_MessageNewRealmProxyInterface unmanagedCopy = (com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) unmanagedObject;
        com_apsapps_indimessenger_models_MessageNewRealmProxyInterface realmSource = (com_apsapps_indimessenger_models_MessageNewRealmProxyInterface) realmObject;
        unmanagedCopy.realmSet$body(realmSource.realmGet$body());
        unmanagedCopy.realmSet$senderName(realmSource.realmGet$senderName());
        unmanagedCopy.realmSet$senderId(realmSource.realmGet$senderId());
        unmanagedCopy.realmSet$recipientId(realmSource.realmGet$recipientId());
        unmanagedCopy.realmSet$id(realmSource.realmGet$id());
        unmanagedCopy.realmSet$date(realmSource.realmGet$date());
        unmanagedCopy.realmSet$delivered(realmSource.realmGet$delivered());
        unmanagedCopy.realmSet$sent(realmSource.realmGet$sent());
        unmanagedCopy.realmSet$attachmentType(realmSource.realmGet$attachmentType());

        // Deep copy of attachment
        unmanagedCopy.realmSet$attachment(com_apsapps_indimessenger_models_AttachmentListRealmProxy.createDetachedCopy(realmSource.realmGet$attachment(), currentDepth + 1, maxDepth, cache));

        return unmanagedObject;
    }

    @Override
    @SuppressWarnings("ArrayToString")
    public String toString() {
        if (!RealmObject.isValid(this)) {
            return "Invalid object";
        }
        StringBuilder stringBuilder = new StringBuilder("MessageNew = proxy[");
        stringBuilder.append("{body:");
        stringBuilder.append(realmGet$body() != null ? realmGet$body() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{senderName:");
        stringBuilder.append(realmGet$senderName() != null ? realmGet$senderName() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{senderId:");
        stringBuilder.append(realmGet$senderId() != null ? realmGet$senderId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{recipientId:");
        stringBuilder.append(realmGet$recipientId() != null ? realmGet$recipientId() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{id:");
        stringBuilder.append(realmGet$id() != null ? realmGet$id() : "null");
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{date:");
        stringBuilder.append(realmGet$date());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{delivered:");
        stringBuilder.append(realmGet$delivered());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{sent:");
        stringBuilder.append(realmGet$sent());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{attachmentType:");
        stringBuilder.append(realmGet$attachmentType());
        stringBuilder.append("}");
        stringBuilder.append(",");
        stringBuilder.append("{attachment:");
        stringBuilder.append(realmGet$attachment() != null ? "AttachmentList" : "null");
        stringBuilder.append("}");
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public ProxyState<?> realmGet$proxyState() {
        return proxyState;
    }

}
