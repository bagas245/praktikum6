package com.alvinbagasoctaviandi_19102046.praktikum6

import android.os.Parcelable
import android.provider.MediaStore
import kotlinx.android.parcel.Parcelize

    @Parcelize
    data class MyData(
        var name: String,
        var description: String,
        var photo: String
    ) : Parcelable