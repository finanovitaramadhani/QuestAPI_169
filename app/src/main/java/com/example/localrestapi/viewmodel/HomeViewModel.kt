package com.example.localrestapi.viewmodel

import com.example.localrestapi.modeldata.DataSiswa

sealed interface StatusUiSiswa{
    data class Success(val siswa: List<DataSiswa> = listOf()): StatusUiSiswa
    object Error : StatusUiSiswa
    object Loading : StatusUiSiswa
}
