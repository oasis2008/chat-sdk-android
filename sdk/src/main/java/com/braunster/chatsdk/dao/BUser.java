package com.braunster.chatsdk.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS
import com.braunster.chatsdk.dao.DaoSession;

// KEEP INCLUDES - put your custom includes here
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.braunster.chatsdk.Utils.JsonHelper;
import com.braunster.chatsdk.Utils.sorter.ThreadsSorter;
import com.braunster.chatsdk.dao.core.DaoCore;
import com.braunster.chatsdk.dao.entities.BThreadEntity;
import com.braunster.chatsdk.dao.entities.BUserEntity;
import com.braunster.chatsdk.Utils.Debug;
import com.braunster.chatsdk.network.AbstractNetworkAdapter;
import com.braunster.chatsdk.network.BDefines;
import com.braunster.chatsdk.network.BFirebaseDefines;
import com.braunster.chatsdk.network.BNetworkManager;
import com.braunster.chatsdk.network.BPath;
import de.greenrobot.dao.DaoException;
import de.greenrobot.dao.Property;
import timber.log.Timber;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
// KEEP INCLUDES END
/**
 * Entity mapped to table BUSER.
 */
public class BUser extends BUserEntity {

    private Long id;
    private String entityID;
    private Integer AuthenticationType;
    private String messageColor;
    private java.util.Date lastOnline;
    private java.util.Date lastUpdated;
    private Boolean Online;
    private String Metadata;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient BUserDao myDao;

    private List<BLinkedContact> BLinkedContacts;
    private List<BFollower> BFollowers;
    private List<BLinkedAccount> BLinkedAccounts;
    private List<BLinkData> BLinkData;

    // KEEP FIELDS - put your custom fields here
    private static final String TAG = BUser.class.getSimpleName();
    private static final boolean DEBUG = Debug.BUser;

    private static final String USER_PREFIX = "user";
    // KEEP FIELDS END

    public BUser() {
    }

    public BUser(Long id) {
        this.id = id;
    }

    public BUser(Long id, String entityID, Integer AuthenticationType, String messageColor, java.util.Date lastOnline, java.util.Date lastUpdated, Boolean Online, String Metadata) {
        this.id = id;
        this.entityID = entityID;
        this.AuthenticationType = AuthenticationType;
        this.messageColor = messageColor;
        this.lastOnline = lastOnline;
        this.lastUpdated = lastUpdated;
        this.Online = Online;
        this.Metadata = Metadata;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getBUserDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEntityID() {
        return entityID;
    }

    public void setEntityID(String entityID) {
        this.entityID = entityID;
    }

    public Integer getAuthenticationType() {
        return AuthenticationType;
    }

    public void setAuthenticationType(Integer AuthenticationType) {
        this.AuthenticationType = AuthenticationType;
    }

    public String getMessageColor() {
        return messageColor;
    }

    public void setMessageColor(String messageColor) {
        this.messageColor = messageColor;
    }

    public java.util.Date getLastOnline() {
        return lastOnline;
    }

    public void setLastOnline(java.util.Date lastOnline) {
        this.lastOnline = lastOnline;
    }

    public java.util.Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public Boolean getOnline() {
        return Online;
    }

    public void setOnline(Boolean Online) {
        this.Online = Online;
    }

    public String getMetadata() {
        return Metadata;
    }

    public void setMetadata(String Metadata) {
        this.Metadata = Metadata;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<BLinkedContact> getBLinkedContacts() {
        if (BLinkedContacts == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BLinkedContactDao targetDao = daoSession.getBLinkedContactDao();
            List<BLinkedContact> BLinkedContactsNew = targetDao._queryBUser_BLinkedContacts(id);
            synchronized (this) {
                if(BLinkedContacts == null) {
                    BLinkedContacts = BLinkedContactsNew;
                }
            }
        }
        return BLinkedContacts;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetBLinkedContacts() {
        BLinkedContacts = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<BFollower> getBFollowers() {
        if (BFollowers == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BFollowerDao targetDao = daoSession.getBFollowerDao();
            List<BFollower> BFollowersNew = targetDao._queryBUser_BFollowers(id);
            synchronized (this) {
                if(BFollowers == null) {
                    BFollowers = BFollowersNew;
                }
            }
        }
        return BFollowers;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetBFollowers() {
        BFollowers = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<BLinkedAccount> getBLinkedAccounts() {
        if (BLinkedAccounts == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BLinkedAccountDao targetDao = daoSession.getBLinkedAccountDao();
            List<BLinkedAccount> BLinkedAccountsNew = targetDao._queryBUser_BLinkedAccounts(id);
            synchronized (this) {
                if(BLinkedAccounts == null) {
                    BLinkedAccounts = BLinkedAccountsNew;
                }
            }
        }
        return BLinkedAccounts;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetBLinkedAccounts() {
        BLinkedAccounts = null;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<BLinkData> getBLinkData() {
        if (BLinkData == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BLinkDataDao targetDao = daoSession.getBLinkDataDao();
            List<BLinkData> BLinkDataNew = targetDao._queryBUser_BLinkData(id);
            synchronized (this) {
                if(BLinkData == null) {
                    BLinkData = BLinkDataNew;
                }
            }
        }
        return BLinkData;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetBLinkData() {
        BLinkData = null;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

    // KEEP METHODS - put your custom methods here

    @Override
    public BPath getBPath() {
        return new BPath().addPathComponent(BFirebaseDefines.Path.BUsersPath, getEntityID());
    }

    @Override
    public Type getEntityType() {
        return Type.bEntityTypeUser;
    }

    public Date lastUpdated() {
        return lastUpdated;
    }

    public String[] getCacheIDs(){
        return new String[]{entityID != null ? entityID : ""};
    }

    /** Get a link account of the user by type.
     * @return BLinkedAccount if found
     * @return null if no account found.*/
    public BLinkedAccount getAccountWithType(int type){
        for (BLinkedAccount account : getBLinkedAccounts())
        {
            if (account.getType() == type)
                return account;
        }
        return null;
    }

    @Override
    public List<BThread> getThreads(){
        return getThreads(-1);
    }

    @Override
    public List<BThread> getThreads(int type){
        return getThreads(type, false);
    }

    /**
     * @param type the type of the threads to get, Pass -1 to get all types.
     * @param allowDeleted if true deleted thread will be returned in the result list
     * @return a list with all the threads.
     ** */
    @Override
    public List<BThread> getThreads(int type, boolean allowDeleted){
        /* Getting the thread list by getBLinkData can be out of date so we get the data from the database*/

        List<BThread> threads = new ArrayList<>();
        List<BLinkData> list =  DaoCore.fetchEntitiesWithProperty(BLinkData.class, BLinkDataDao.Properties.UserID, getId());

        if (DEBUG) Timber.d("BUser, getThreads, Amount: %s", (list == null ? "null" : list.size()));

        if (list == null) return null;

        BThread thread;
        boolean checkType = (type == BThreadEntity.Type.Private || type == BThreadEntity.Type.Public);
        for (BLinkData data : list)
        {

            thread = data.getBThread();
            if (thread == null) continue;
            if (!allowDeleted && thread.isDeleted()) {
                if (DEBUG) Timber.
                        i("Thread, name: %s, deleted: %s", thread.getName(), thread.getDeleted());
                continue;
            }

            if (!checkType) {
                threads.add(thread);
            } else if (thread.getType() != null && type == thread.getType()) {
                threads.add(thread);
            }
        }

        // Sort the threads in default order.
        Collections.sort(threads, new ThreadsSorter());
        
        return threads;
    }

    @Override
    public List<BUser> getContacts() {
        /* Getting the contact list by getBLinkedContacts can be out of date so we get the data from the database*/
        List<BUser> contacts = new ArrayList<BUser>();

        List<BLinkedContact> list =  DaoCore.fetchEntitiesWithProperty(BLinkedContact.class, BLinkedContactDao.Properties.Owner, getId());

        if (DEBUG) Timber.d(TAG, "BUser, getContacts, Amount: %s",(list==null?"null":list.size()) );

        for (BLinkedContact contact : list)
        {
            BUser user = null;

            if (contact.getEntityID() != null)
            {
                user = DaoCore.<BUser>fetchEntityWithEntityID(BUser.class, contact.getEntityID());
            }

            if (user != null)
                contacts.add(user);
        }

        return contacts;

    }

    @Override
    public void addContact(BUser user) {
        if (user.equals(this))
            return;

        BLinkedContact contact;

        if (StringUtils.isNotEmpty(user.getEntityID()))
            contact = DaoCore.fetchEntityWithProperties(BLinkedContact.class, new Property[]{BLinkedContactDao.Properties.Owner, BLinkedContactDao.Properties.EntityID}, getId(), user.getEntityID());

        else return;
        
        boolean exist = contact != null;

        if (!exist)
        {
            BLinkedContact linkedContact = new BLinkedContact();
            linkedContact.setEntityID(user.getEntityID());
            // This is the bind value between the LinkedContact to this user.
            linkedContact.setOwner(getId());
            DaoCore.createEntity(linkedContact);
        }
    }

   
   
   
    private BFollower fetchFollower(BUser follower, int type){
        return DaoCore.fetchEntityWithProperties(BFollower.class,
                new Property[]{BFollowerDao.Properties.BUserId, BFollowerDao.Properties.OwnerId, BFollowerDao.Properties.Type},
                follower.getId(), getId(),  type);
    }

    @Override
    public List<BUser> getFollowers() {
        List<BUser> users = new ArrayList<BUser>();

        List<BFollower> followers = DaoCore.fetchEntitiesWithProperties(BFollower.class,
                new Property[]{BFollowerDao.Properties.OwnerId, BFollowerDao.Properties.Type},
                getId(), BFollower.Type.FOLLOWER);

        for (BFollower f : followers)
        {
            if (f!=null)
                users.add(f.getUser());
        }

        return users;
    }

    @Override
    public List<BUser> getFollows() {
        List<BUser> users = new ArrayList<BUser>();

        List<BFollower> followers = DaoCore.fetchEntitiesWithProperties(BFollower.class,
                new Property[]{BFollowerDao.Properties.OwnerId, BFollowerDao.Properties.Type},
                getId(), BFollower.Type.FOLLOWS);

        for (BFollower f : followers)
        {
            if (f!=null)
                users.add(f.getUser());
        }

        return users;
    }

    @Override
    public BFollower fetchOrCreateFollower(BUser follower, int type) {

        BFollower follows = fetchFollower(follower, type);

        if (follows== null)
        {
            follows = new BFollower();

            follows.setOwner(this);
            follows.setUser(follower);
            follows.setType(type);

            follows = DaoCore.createEntity(follows);
        }

        return follows;
    }

    public boolean isFollowing(BUser user){
        return fetchFollower(user, BFollower.Type.FOLLOWER) != null;
    }

    public boolean follows(BUser user){
        return fetchFollower(user, BFollower.Type.FOLLOWS) != null;
    }

    
    
   
    @Override
    public void setMetaPictureUrl(String imageUrl) {
        setMetadataString(BDefines.Keys.BPictureURL, imageUrl);
    }

    @Override
    public String getMetaPictureUrl() {
        return metaStringForKey(BDefines.Keys.BPictureURL);
    }

    @Override
    public String getThumbnailPictureURL() {
        return metaStringForKey(BDefines.Keys.BPictureURLThumbnail);
    }

    @Override
    public void setMetaPictureThumbnail(String thumbnailUrl) {
        setMetadataString(BDefines.Keys.BPictureURLThumbnail, thumbnailUrl);
    }

    @Override
    public void setMetaName(String name) {
        setMetadataString(BDefines.Keys.BName, name);
    }

    @Override
    public String getMetaName() {
        return metaStringForKey(BDefines.Keys.BName);
    }

    @Override
    public void setMetaEmail(String email) {
        setMetadataString(BDefines.Keys.BEmail, email);
    }

    @Override
    public String getMetaEmail() {
        return metaStringForKey(BDefines.Keys.BEmail);
    }

    public String metaStringForKey(String key){
        return (String) metaMap().get(key);
    }

    public void setMetadataString(String key, String value){
        Map<String, Object> map = metaMap();
        map.put(key, value);
        
        setMetaMap(map);
        DaoCore.updateEntity(this);
    }

    /**
     * Setting the metadata, The Map will be converted to a Json String.
     **/
    public void setMetaMap(Map<String, Object> metadata){
        metadata = updateMetaDataFormat(metadata);
        
        this.Metadata = new JSONObject(metadata).toString();
    }
    
    @Deprecated()
    /**
     * This is for maintaining compatibility with older chat versions, It will be removed in a few versions.
     **/
    private Map<String, Object> updateMetaDataFormat(Map<String, Object> map){
        
        Map<String, Object> newData = new HashMap<>();

        String newKey, value;
        for (String key : map.keySet())
        {
            if (map.get(key) instanceof Map)
            {
                value = (String) ((Map) map.get(key)).get(BDefines.Keys.BValue);
                newKey = (String) ((Map) map.get(key)).get(BDefines.Keys.BKey);
                newData.put(newKey, value);
                
                if (DEBUG) Timber.i("convertedData, Key: %s, Value: %s", newKey, value);
            }
            else 
                newData.put(key, map.get(key));
        }
        
        return newData;
    }

    /**
     * Converting the metadata json to a map object
     **/
    public Map<String, Object> metaMap(){
        if (StringUtils.isEmpty(Metadata))
            return new HashMap<>();

        try {
            return JsonHelper.toMap(new JSONObject(Metadata));
        } catch (JSONException e) {
            e.printStackTrace();
            Timber.e(e.getCause(), "Cant parse metadata json to map. Meta: %s", Metadata);

            return new HashMap<>();
        }
    }

    
    
    
    public boolean hasThread(BThread thread){
        com.braunster.chatsdk.dao.BLinkData data =
                DaoCore.fetchEntityWithProperties(com.braunster.chatsdk.dao.BLinkData.class,
                        new Property[]{BLinkDataDao.Properties.ThreadID, BLinkDataDao.Properties.UserID}, thread.getId(), getId());

        return data != null;
    }

    public String getPushChannel(){
        if (entityID == null)
            return "";

        return USER_PREFIX + (entityID.replace(":","_"));
    }

    public Map<String, String> getUserIndexMap(){
        Map<String, String> values = new HashMap<String, String>();
        values.put(BDefines.Keys.BName, AbstractNetworkAdapter.processForQuery(getMetaName()));
        values.put(BDefines.Keys.BEmail, AbstractNetworkAdapter.processForQuery(getMetaEmail()));

        String phoneNumber = metaStringForKey(BDefines.Keys.BPhone);
        if (BDefines.IndexUserPhoneNumber && StringUtils.isNotBlank(phoneNumber))
            values.put(BDefines.Keys.BPhone, AbstractNetworkAdapter.processForQuery(phoneNumber));
        
        return values;
    }

    public boolean isMe(){
        return getId().longValue()
                == BNetworkManager.sharedManager().getNetworkAdapter().currentUserModel().getId().longValue();
    }

    @Override
    public String toString() {
        return String.format("BUser, id: %s meta: %s", id, getMetadata());
    }
    // KEEP METHODS END

}
