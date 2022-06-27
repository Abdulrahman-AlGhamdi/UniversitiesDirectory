package com.ss.universitiesdirectory.ui.settings

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.ss.universitiesdirectory.manager.settings.SettingsManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SettingsViewModel @Inject constructor(
    private val settingsRepository: SettingsManager
) : ViewModel() {

    var openThemeDialog by mutableStateOf(false)

    fun setAppMode(isDarkMode: Boolean) = settingsRepository.setAppTheme(isDarkMode)

    fun sendEmail() = settingsRepository.sendEmail()
}