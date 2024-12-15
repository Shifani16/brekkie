package com.example.projectakhirdashboard.Data

import android.content.Context
import androidx.compose.runtime.*
import androidx.compose.ui.platform.LocalContext
import com.google.gson.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.lang.reflect.Type

class PackageItemDeserializer(private val context: Context) : JsonDeserializer<PackageItem> {
    override fun deserialize(json: JsonElement, typeOfT: Type, jsonDeserializationContext: JsonDeserializationContext): PackageItem { // Renamed parameter
        val jsonObject = json.asJsonObject
        val iconResString = jsonObject.get("iconRes").asString
        val iconRes = this.context.resources.getIdentifier(iconResString, "drawable", this.context.packageName)

        return PackageItem(
            id = jsonObject.get("id").asString,
            name = jsonObject.get("name").asString,
            price = jsonObject.get("price").asString,
            iconRes = iconRes
        )
    }
}