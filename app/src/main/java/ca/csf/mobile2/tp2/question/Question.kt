package ca.csf.mobile2.tp2.question

import android.os.Parcel
import android.os.Parcelable

class Question(val choice1 : String,
               val choice2 : String,
               val id : Int,
               val nbChoice1 : Int,
               val nbChoice2 : Int,
               val text : String) : Parcelable {

    constructor(parcel: Parcel) : this(
        parcel.readString(),
        parcel.readString(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readInt(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(choice1)
        parcel.writeString(choice2)
        parcel.writeInt(id)
        parcel.writeInt(nbChoice1)
        parcel.writeInt(nbChoice2)
        parcel.writeString(text)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Question> {
        override fun createFromParcel(parcel: Parcel): Question {
            return Question(parcel)
        }

        override fun newArray(size: Int): Array<Question?> {
            return arrayOfNulls(size)
        }
    }

}