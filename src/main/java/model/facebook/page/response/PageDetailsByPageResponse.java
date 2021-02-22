package model.facebook.page.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PageDetailsByPageResponse {
    @SerializedName("result")
    @Expose
    private Result result;

    @SerializedName("exec_time")
    @Expose
    private String exec_time;

    public Result getResult ()
    {
        return result;
    }

    public void setResult (Result result)
    {
        this.result = result;
    }

    public String getExec_time ()
    {
        return exec_time;
    }

    public void setExec_time (String exec_time)
    {
        this.exec_time = exec_time;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [result = "+result+", exec_time = "+exec_time+"]";
    }

    public class Result
    {
        private String whatsapp;

        private String[] open_hour_details;

        private String cover_photo;

        private String link;

        private String about;

        private String price_range;

        private String[] phones;

        private String impressum;

        private String likers_count;

        private Category_list[] category_list;

        private String alias;

        private Links[] links;

        private String id;

        private String open_hour;

        private String email;

        private String website;

        private String address;

        private String fan_count;

        private String verified;

        private String photo;

        private History[] history;

        private String additional_info;

        private String privacy_policy;

        private String name;

        private Admin_locations[] admin_locations;

        private Location location;

        private String category;

        private String checkins;

        public String getWhatsapp ()
        {
            return whatsapp;
        }

        public void setWhatsapp (String whatsapp)
        {
            this.whatsapp = whatsapp;
        }

        public String[] getOpen_hour_details ()
        {
            return open_hour_details;
        }

        public void setOpen_hour_details (String[] open_hour_details)
        {
            this.open_hour_details = open_hour_details;
        }

        public String getCover_photo ()
        {
            return cover_photo;
        }

        public void setCover_photo (String cover_photo)
        {
            this.cover_photo = cover_photo;
        }

        public String getLink ()
        {
            return link;
        }

        public void setLink (String link)
        {
            this.link = link;
        }

        public String getAbout ()
        {
            return about;
        }

        public void setAbout (String about)
        {
            this.about = about;
        }

        public String getPrice_range ()
        {
            return price_range;
        }

        public void setPrice_range (String price_range)
        {
            this.price_range = price_range;
        }

        public String[] getPhones ()
        {
            return phones;
        }

        public void setPhones (String[] phones)
        {
            this.phones = phones;
        }

        public String getImpressum ()
        {
            return impressum;
        }

        public void setImpressum (String impressum)
        {
            this.impressum = impressum;
        }

        public String getLikers_count ()
        {
            return likers_count;
        }

        public void setLikers_count (String likers_count)
        {
            this.likers_count = likers_count;
        }

        public Category_list[] getCategory_list ()
        {
            return category_list;
        }

        public void setCategory_list (Category_list[] category_list)
        {
            this.category_list = category_list;
        }

        public String getAlias ()
        {
            return alias;
        }

        public void setAlias (String alias)
        {
            this.alias = alias;
        }

        public Links[] getLinks ()
        {
            return links;
        }

        public void setLinks (Links[] links)
        {
            this.links = links;
        }

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public String getOpen_hour ()
        {
            return open_hour;
        }

        public void setOpen_hour (String open_hour)
        {
            this.open_hour = open_hour;
        }

        public String getEmail ()
        {
            return email;
        }

        public void setEmail (String email)
        {
            this.email = email;
        }

        public String getWebsite ()
        {
            return website;
        }

        public void setWebsite (String website)
        {
            this.website = website;
        }

        public String getAddress ()
        {
            return address;
        }

        public void setAddress (String address)
        {
            this.address = address;
        }

        public String getFan_count ()
        {
            return fan_count;
        }

        public void setFan_count (String fan_count)
        {
            this.fan_count = fan_count;
        }

        public String getVerified ()
        {
            return verified;
        }

        public void setVerified (String verified)
        {
            this.verified = verified;
        }

        public String getPhoto ()
        {
            return photo;
        }

        public void setPhoto (String photo)
        {
            this.photo = photo;
        }

        public History[] getHistory ()
        {
            return history;
        }

        public void setHistory (History[] history)
        {
            this.history = history;
        }

        public String getAdditional_info ()
        {
            return additional_info;
        }

        public void setAdditional_info (String additional_info)
        {
            this.additional_info = additional_info;
        }

        public String getPrivacy_policy ()
        {
            return privacy_policy;
        }

        public void setPrivacy_policy (String privacy_policy)
        {
            this.privacy_policy = privacy_policy;
        }

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public Admin_locations[] getAdmin_locations ()
        {
            return admin_locations;
        }

        public void setAdmin_locations (Admin_locations[] admin_locations)
        {
            this.admin_locations = admin_locations;
        }

        public Location getLocation ()
        {
            return location;
        }

        public void setLocation (Location location)
        {
            this.location = location;
        }

        public String getCategory ()
        {
            return category;
        }

        public void setCategory (String category)
        {
            this.category = category;
        }

        public String getCheckins ()
        {
            return checkins;
        }

        public void setCheckins (String checkins)
        {
            this.checkins = checkins;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [whatsapp = "+whatsapp+", open_hour_details = "+open_hour_details+", cover_photo = "+cover_photo+", link = "+link+", about = "+about+", price_range = "+price_range+", phones = "+phones+", impressum = "+impressum+", likers_count = "+likers_count+", category_list = "+category_list+", alias = "+alias+", links = "+links+", id = "+id+", open_hour = "+open_hour+", email = "+email+", website = "+website+", address = "+address+", fan_count = "+fan_count+", verified = "+verified+", photo = "+photo+", history = "+history+", additional_info = "+additional_info+", privacy_policy = "+privacy_policy+", name = "+name+", admin_locations = "+admin_locations+", location = "+location+", category = "+category+", checkins = "+checkins+"]";
        }
    }

    public class Admin_locations
    {
        private String count;

        private String name;

        public String getCount ()
        {
            return count;
        }

        public void setCount (String count)
        {
            this.count = count;
        }

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [count = "+count+", name = "+name+"]";
        }
    }

    public class History
    {
        private String name;

        private String time;

        private String type;

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public String getTime ()
        {
            return time;
        }

        public void setTime (String time)
        {
            this.time = time;
        }

        public String getType ()
        {
            return type;
        }

        public void setType (String type)
        {
            this.type = type;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [name = "+name+", time = "+time+", type = "+type+"]";
        }
    }

    public class Category_list
    {
        private String name;

        private String url;

        public String getName ()
        {
            return name;
        }

        public void setName (String name)
        {
            this.name = name;
        }

        public String getUrl ()
        {
            return url;
        }

        public void setUrl (String url)
        {
            this.url = url;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [name = "+name+", url = "+url+"]";
        }
    }

    public class Location
    {
        private String latitude;

        private String longitude;

        public String getLatitude ()
        {
            return latitude;
        }

        public void setLatitude (String latitude)
        {
            this.latitude = latitude;
        }

        public String getLongitude ()
        {
            return longitude;
        }

        public void setLongitude (String longitude)
        {
            this.longitude = longitude;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [latitude = "+latitude+", longitude = "+longitude+"]";
        }
    }

    public class Links
    {
        private String alias;

        private String id;

        private String type;

        private String url;

        public String getAlias ()
        {
            return alias;
        }

        public void setAlias (String alias)
        {
            this.alias = alias;
        }

        public String getId ()
        {
            return id;
        }

        public void setId (String id)
        {
            this.id = id;
        }

        public String getType ()
        {
            return type;
        }

        public void setType (String type)
        {
            this.type = type;
        }

        public String getUrl ()
        {
            return url;
        }

        public void setUrl (String url)
        {
            this.url = url;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [alias = "+alias+", id = "+id+", type = "+type+", url = "+url+"]";
        }
    }
}
