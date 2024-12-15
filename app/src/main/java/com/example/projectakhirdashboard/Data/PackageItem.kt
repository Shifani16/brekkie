package com.example.projectakhirdashboard.Data

data class PackageItem(
    val id: String,
    val name: String,
    val price: String,
    val iconRes: Int
)

data class Packages(
    val populerPackages: List<PackageItem>,
    val ekonomisPackages: List<PackageItem>
)


data class PromoItem(val id: String, val name: String, val price: String, val imageResId: Int)