package com.quangnguyen.data.model

import com.google.gson.annotations.SerializedName

data class ImageModel(val id: String, val urls: ImageUrlsList, val links: ImageLinksList)

data class ImageUrlsList(val raw: String, val full: String, val regular: String, val small: String,
    val thumb: String)

data class ImageLinksList(val self: String, val html: String, val download: String, @SerializedName(
    "download_location") val downloadLocation: String)