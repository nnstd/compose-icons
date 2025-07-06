package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneCheckOutline: ImageVector
    get() {
        if (_PhoneCheckOutline != null) {
            return _PhoneCheckOutline!!
        }
        _PhoneCheckOutline = ImageVector.Builder(
            name = "PhoneCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 15.5f)
                arcTo(11.36f, 11.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.43f, 14.93f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15.43f, 15.18f)
                lineTo(13.23f, 17.38f)
                arcTo(15.1f, 15.1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.64f, 10.79f)
                lineTo(8.84f, 8.59f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.09f, 7.59f)
                arcTo(11.36f, 11.36f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.5f, 3f)
                horizontalLineTo(4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 4f)
                arcTo(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 21f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 20f)
                verticalLineTo(16.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 15.5f)
                moveTo(5f, 5f)
                horizontalLineTo(6.54f)
                arcTo(12.54f, 12.54f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 7.59f)
                lineTo(5.79f, 8.8f)
                arcTo(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 5f)
                moveTo(19f, 19f)
                arcTo(15f, 15f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15.2f, 18.24f)
                lineTo(16.41f, 17f)
                arcTo(12.31f, 12.31f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 17.45f)
                moveTo(15f, 11.44f)
                lineTo(11.29f, 7.74f)
                lineTo(12.71f, 6.32f)
                lineTo(15f, 8.59f)
                lineTo(20.29f, 3.29f)
                lineTo(21.71f, 4.71f)
                close()
            }
        }.build()

        return _PhoneCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneCheckOutline: ImageVector? = null
