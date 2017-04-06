package com.example.kishor.mvpdagerrxjava.DTO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by kishor on 27/02/17.
 */

public class Post {

    private int success;
    private String message;
    private int total_items;
    private String last_update;
    private List<DataBean> data;

    public int getSuccess() {
        return success;
    }

    public void setSuccess(int success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getTotal_items() {
        return total_items;
    }

    public void setTotal_items(int total_items) {
        this.total_items = total_items;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }


    public static class DataBean {

        private String id;
        private String title;
        private String body;
        private String image;
        @SerializedName("image-thumbnail")
        private String imagethumbnail;
        @SerializedName("image-medium")
        private String imagemedium;
        @SerializedName("image-large")
        private String imagelarge;
        @SerializedName("image-providercategory_threex")
        private String imageprovidercategory_threex;
        private String field_ad_area;
        private String field_ad_display_page;
        private String field_ads_url;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getImagethumbnail() {
            return imagethumbnail;
        }

        public void setImagethumbnail(String imagethumbnail) {
            this.imagethumbnail = imagethumbnail;
        }

        public String getImagemedium() {
            return imagemedium;
        }

        public void setImagemedium(String imagemedium) {
            this.imagemedium = imagemedium;
        }

        public String getImagelarge() {
            return imagelarge;
        }

        public void setImagelarge(String imagelarge) {
            this.imagelarge = imagelarge;
        }

        public String getImageprovidercategory_threex() {
            return imageprovidercategory_threex;
        }

        public void setImageprovidercategory_threex(String imageprovidercategory_threex) {
            this.imageprovidercategory_threex = imageprovidercategory_threex;
        }

        public String getField_ad_area() {
            return field_ad_area;
        }

        public void setField_ad_area(String field_ad_area) {
            this.field_ad_area = field_ad_area;
        }

        public String getField_ad_display_page() {
            return field_ad_display_page;
        }

        public void setField_ad_display_page(String field_ad_display_page) {
            this.field_ad_display_page = field_ad_display_page;
        }

        public String getField_ads_url() {
            return field_ads_url;
        }

        public void setField_ads_url(String field_ads_url) {
            this.field_ads_url = field_ads_url;
        }
    }
}
