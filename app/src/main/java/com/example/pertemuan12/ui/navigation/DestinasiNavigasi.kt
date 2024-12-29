package com.example.pertemuan12.ui.navigation

interface DestinasiNavigasi{
    val route : String
    val titleRes : String
}

object DestinasiDetail : DestinasiNavigasi{
    override val route = "detail"
    override val titleRes = "Detail Kontak"
    const val NIM = "nim"
    val routesWithArg = "$route/{$NIM}"
}