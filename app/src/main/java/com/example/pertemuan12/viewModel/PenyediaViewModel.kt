package com.example.pertemuan12.viewModel

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.pertemuan12.MahasiswaApplications


object PenyediaViewModel{
    val Factory = viewModelFactory {
        initializer {
            HomeViewModel(
                aplikasiMahasiswa().container.mahasiswaRepository
            )
        }
        initializer {
            InsertViewModel(
                aplikasiMahasiswa().container.mahasiswaRepository
            )
        }
        initializer {
            DetailViewModel(
                createSavedStateHandle(),aplikasiMahasiswa().container.mahasiswaRepository
            )
        }
        initializer {
            UpdateViewModel(
                createSavedStateHandle(),aplikasiMahasiswa().container.mahasiswaRepository
            )
        }
    }
    fun CreationExtras.aplikasiMahasiswa(): MahasiswaApplications =
        (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY]as MahasiswaApplications)
}