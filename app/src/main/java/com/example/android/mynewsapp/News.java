package com.example.android.mynewsapp;

/**
 * An {@link News} object contains information related to a single news.
 */
public class News {

    /** Section Name of the news */
    private String mSectionId;

    /** Web title of the news */
    private String mWebTitle;

    /** Pilar Name of the news */
    private String mPublicationType;

    /** Date of the publication */
    private long mPublicationDate;

    /** Website URL of the news */
    private String mWebUrl;

    /**
     * Constructs a new {@link News} object.
     *  @param section is the theme of the publication, for exemple :sport or lifestyle
     * @param title is the web title of the news
     * @param type is the format of the news
     * @param date is the date of article publication
     * @param url is the website URL to find more details about the news
     */
    public News (String section, String title, String type, Long date, String url) {
        mSectionId = section;
        mWebTitle = title;
        mPublicationType = type;
        mPublicationDate = date;
        mWebUrl = url;
    }

    /**
     * Returns the section name of the news.
     */
    public String getSection() {
        return mSectionId;
    }

    /**
     * Returns the title of the news.
     */
    public String getTitle() {
        return mWebTitle;
    }

    /**
     * Returns the the topic (pilar name) of the news.
     */
    public String getType() {
        return mPublicationType;
    }

    /**
     * Returns the publication date of the news.
     */
    public long getDate() {
        return mPublicationDate;
    }

    /**
     * Returns the website URL to find more information about the news.
     */
    public String getUrl() {
        return mWebUrl;
    }
}

