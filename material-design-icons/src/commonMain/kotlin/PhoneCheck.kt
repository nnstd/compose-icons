package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneCheck: ImageVector
    get() {
        if (_PhoneCheck != null) {
            return _PhoneCheck!!
        }
        _PhoneCheck = ImageVector.Builder(
            name = "PhoneCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.62f, 10.79f)
                arcTo(15.1f, 15.1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.21f, 17.38f)
                lineTo(15.41f, 15.18f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16.41f, 14.93f)
                arcTo(11.36f, 11.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 15.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 16.5f)
                verticalLineTo(20f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 21f)
                arcTo(17f, 17f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 4f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 3f)
                horizontalLineTo(7.5f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 4f)
                arcTo(11.36f, 11.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.07f, 7.57f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.82f, 8.57f)
                moveTo(21.71f, 4.71f)
                lineTo(20.29f, 3.29f)
                lineTo(15f, 8.59f)
                lineTo(12.71f, 6.29f)
                lineTo(11.29f, 7.71f)
                lineTo(15f, 11.41f)
                close()
            }
        }.build()

        return _PhoneCheck!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneCheck: ImageVector? = null
