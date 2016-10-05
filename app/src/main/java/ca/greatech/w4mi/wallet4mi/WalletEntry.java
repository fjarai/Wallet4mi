package ca.greatech.w4mi.wallet4mi;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Dictionary;
import java.util.Locale;
//import java.util.HashMap;

/**
 * Created by Frank on 2016-09-27.
 */
public class WalletEntry {
    private String name;
    private String category;
    private String group;
    private Date created;
    private Date updated;
    //private Dictionary<String, String> info;
    private String owner;
    private Boolean shared;
    private String[] sharedParties;

    public WalletEntry() {
    }

    public WalletEntry(String name, String category, String group, String owner) {
        this.name = name;
        this.category = category;
        this.group = group;
        this.owner = owner;
        this.created = new Date();
        this.updated = new Date();
        //this.info = new Dictionary<String, String>();
        this.shared = false;
        //this.sharedParties = new String[10];
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getCategory() {return category;}
    public void setCategory(String category) {this.category = category;}

    public String getGroup() {return group;}
    public void setGroup(String group){this.group = group;}

    /*public String getCreated() {
        if (null != created)
            return created.toString();
        return new Date().toString();
    }

    public String getUpdated() {
        if (null != updated)
            return updated.toString();
        return new Date().toString();
    }

    //public void setUpdated(Date updated) {this.updated = updated;}
    public void setUpdated(String updated) throws ParseException {
        DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
        this.updated = format.parse(updated);
    }*/
    //public Dictionary<String, String> getInfo() {return info;}
    //public String getInfoByKey(String key) {
    //    return info.get(key);
    //}
    //public void addInfo(String key, String value) {
    //    this.info.put(key, value);
    //}

    public String getOwner() {return owner;}

    public boolean getShared() {
        if (null != shared)
            return shared;
        return false;
    }
    public void setShared(Boolean shared) {this.shared = shared;}

    //public String[] getSharedParties() {return sharedParties;}
    //public void addSharedParty(String shareParty) { this.sharedParties[0] = shareParty;}
}
