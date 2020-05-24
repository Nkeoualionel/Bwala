package com.lionelnkeoua.com.bwala.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Lionel on 04/02/2018.
 */
public class Acceuil implements Parcelable{
    public int image;
    public String title;
    public String description;

    public Acceuil(int image, String title, String description) {
        this.image = image;
        this.title = title;
        this.description = description;
    }

    protected Acceuil(Parcel in) {
        image = in.readInt();
        title = in.readString();
        description = in.readString();
    }

    public static final Creator<Acceuil> CREATOR = new Creator<Acceuil>() {
        @Override
        public Acceuil createFromParcel(Parcel in) {
            return new Acceuil(in);
        }

        @Override
        public Acceuil[] newArray(int size) {
            return new Acceuil[size];
        }
    };

    public int getImage() {return image;}

    public String getTitle() {return title;}

    public String getDescription() {return description;}

    public void setImage(int image) {
        this.image = image;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(image);
        dest.writeString(title);
        dest.writeString(description);
    }
}
