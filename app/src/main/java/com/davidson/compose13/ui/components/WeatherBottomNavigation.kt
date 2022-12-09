package com.davidson.compose13.ui.components

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

sealed class Screen(
    val route: String,
    @StringRes val stringRes: Int,
    @DrawableRes val iconRes: Int
)