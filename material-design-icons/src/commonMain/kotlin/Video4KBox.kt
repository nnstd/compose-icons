package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Video4KBox: ImageVector
    get() {
        if (_Video4KBox != null) {
            return _Video4KBox!!
        }
        _Video4KBox = ImageVector.Builder(
            name = "Video4KBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                moveTo(12f, 13.5f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(9.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(9.5f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(12f)
                horizontalLineTo(12f)
                verticalLineTo(13.5f)
                moveTo(18f, 15f)
                horizontalLineTo(16.2f)
                lineTo(14.4f, 12.8f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(14.5f)
                verticalLineTo(11.2f)
                lineTo(16.2f, 9f)
                horizontalLineTo(18f)
                lineTo(15.8f, 12f)
                lineTo(18f, 15f)
                close()
            }
        }.build()

        return _Video4KBox!!
    }

@Suppress("ObjectPropertyName")
private var _Video4KBox: ImageVector? = null
