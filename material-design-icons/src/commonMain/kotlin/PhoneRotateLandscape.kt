package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PhoneRotateLandscape: ImageVector
    get() {
        if (_PhoneRotateLandscape != null) {
            return _PhoneRotateLandscape!!
        }
        _PhoneRotateLandscape = ImageVector.Builder(
            name = "PhoneRotateLandscape",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 1f)
                horizontalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1f, 3f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 18f)
                horizontalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 16f)
                verticalLineTo(3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 1f)
                moveTo(9f, 15f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                moveTo(21f, 13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(20f)
                horizontalLineTo(6f)
                verticalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 23f)
                horizontalLineTo(21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 23f, 21f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 13f)
                moveTo(23f, 10f)
                lineTo(19f, 8f)
                lineTo(20.91f, 7.09f)
                curveTo(19.74f, 4.31f, 17f, 2.5f, 14f, 2.5f)
                verticalLineTo(1f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23f, 10f)
                close()
            }
        }.build()

        return _PhoneRotateLandscape!!
    }

@Suppress("ObjectPropertyName")
private var _PhoneRotateLandscape: ImageVector? = null
