package com.ivand.gamestore.data
import android.os.Parcelable

import kotlinx.android.parcel.Parcelize

@Parcelize
data class Console(
    val name: String,
    val description: String,
    val imageResource: Int,
    val games: List<Game>
) : Parcelable