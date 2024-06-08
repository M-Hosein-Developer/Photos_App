package com.example.photos.presenter.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.photos.domain.model.PhotoResponse
import com.example.photos.domain.usecase.MainUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val useCase: MainUseCase) : ViewModel() {

    private val _photos = MutableLiveData<List<PhotoResponse.PhotoResponseItem>>()
    val photos: LiveData<List<PhotoResponse.PhotoResponseItem>> = _photos

    init {
        photosFun()
    }

    private fun photosFun() = viewModelScope.launch {

        _photos.value = useCase.getPhotos()

    }

}