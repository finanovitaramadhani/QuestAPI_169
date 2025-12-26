@file:OptIn(InternalSerializationApi::class)

package com.example.localrestapi.viewmodel

import com.example.localrestapi.modeldata.DataSiswa
import kotlinx.serialization.InternalSerializationApi

sealed interface StatusUIDetail {
    data class Success(val satusiswa: DataSiswa) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}

