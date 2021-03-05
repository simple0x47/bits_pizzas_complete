package android.example.bitsandpizza.data;

import android.os.Parcel;
import android.os.Parcelable;

public class BaseEntity implements Parcelable {
    private String name;
    private int imageResourceId;
    private String description;

    protected BaseEntity(String name, int imageResourceId, String description) {
        this.name = name;
        this.imageResourceId = imageResourceId;
        this.description = description;
    }

    protected BaseEntity(Parcel in) {
        name = in.readString();
        imageResourceId = in.readInt();
        description = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(imageResourceId);
        dest.writeString(description);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<BaseEntity> CREATOR = new Creator<BaseEntity>() {
        @Override
        public BaseEntity createFromParcel(Parcel in) {
            return new BaseEntity(in);
        }

        @Override
        public BaseEntity[] newArray(int size) {
            return new BaseEntity[size];
        }
    };

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String getDescription() {
        return description;
    }
}
