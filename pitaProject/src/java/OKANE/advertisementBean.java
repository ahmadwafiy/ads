/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OKANE;
import java.io.File;
/**
 *
 * @author ahmdwafy
 * last modified : 21/4/2018
 */
public class advertisementBean {

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the photo
     */
    public File getPhoto() {
        return photo;
    }

    /**
     * @param photo the photo to set
     */
    public void setPhoto(File photo) {
        this.photo = photo;
    }

    /**
     * @return the price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(String price) {
        this.price = price;
    }

    /**
     * @return the phoneno
     */
    public String getPhoneno() {
        return phoneno;
    }

    /**
     * @param phoneno the phoneno to set
     */
    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    /**
     * @return the category
     */
    public int getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(int category) {
        this.category = category;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

   

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the ad_images
     */
    public String getAd_images() {
        return ad_images;
    }

    /**
     * @param ad_images the ad_images to set
     */
    public void setAd_images(String ad_images) {
        this.ad_images = ad_images;
    }

    /**
     * @return the adsID
     */
    public int getAdsID() {
        return adsID;
    }

    /**
     * @param adsID the adsID to set
     */
    public void setAdsID(int adsID) {
        this.adsID = adsID;
    }

    /**
     * @return the adsTitle
     */
    public String getAdsTitle() {
        return adsTitle;
    }

    /**
     * @param adsTitle the adsTitle to set
     */
    public void setAdsTitle(String adsTitle) {
        this.adsTitle = adsTitle;
    }

    /**
     * @return the adsDesc
     */
    public String getAdsDesc() {
        return adsDesc;
    }

    /**
     * @param adsDesc the adsDesc to set
     */
    public void setAdsDesc(String adsDesc) {
        this.adsDesc = adsDesc;
    }

   

    /**
     * @return the userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    private int adsID;
    private String adsTitle;
    private String adsDesc;
    private String price;
    private int userID;
    private String phoneno;
    private String email;
    private String ad_images;
    private String name;
    private int category;
    private File photo;
    private String username;
}
//price blom di add dlm uploadDAO,(done) 