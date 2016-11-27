package com.example.android.miwok;

/**
 * Represents a vocabulary word that the user wants to learn. It contains a default translation
 * and a Miwok translation of the word.
 */

public class Word {

    /**
     * Default translation of the word
     */
    private String mDefaultTranslation;

    /**
     * Miwok translation of the word
     */
    private String mMiwokTranslation;

    /**
     * Image resource ID for the word
     */
    private int mImageResourceId;

    /**
     * Audio resource ID for the word
     */
    private int mAudioResourceID;


    /**
     * Constructor that takes the Miwok and default translation of the word as input parameters.
     *
     * @param defaultTranslation the default translation of the word.
     * @param miwokTranslation   the Miwok translation of the word.
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceID = audioResourceID;
    }

    /**
     * Constructor that takes the Miwok, default translation, and image resouce ID of the word as input parameters.
     *
     * @param defaultTranslation the default translation of the word.
     * @param miwokTranslation   the Miwok translation of the word.
     * @param imageResourceId    the image resource ID for the word.
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceID) {
        this(defaultTranslation, miwokTranslation,audioResourceID);

        mImageResourceId = imageResourceId;
    }


    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public int getImageResourcesId() {
        return mImageResourceId;
    }

    public int getAudioResourceID(){
        return mAudioResourceID;
    }

    public boolean hasImageId() {
        return mImageResourceId != 0;
    }
}
