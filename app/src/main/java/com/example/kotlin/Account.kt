package com.example.kotlin

import android.os.Parcel
import android.os.Parcelable

public class Account() : Parcelable {
    lateinit var name: String
    lateinit var typ: String
    private lateinit var accessId: Integer

    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Account> {
        override fun createFromParcel(parcel: Parcel): Account {
            return Account(parcel)
        }

        override fun newArray(size: Int): Array<Account?> {
            return arrayOfNulls(size)
        }
    }

}