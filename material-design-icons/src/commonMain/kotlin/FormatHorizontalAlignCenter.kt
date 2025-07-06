package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatHorizontalAlignCenter: ImageVector
    get() {
        if (_FormatHorizontalAlignCenter != null) {
            return _FormatHorizontalAlignCenter!!
        }
        _FormatHorizontalAlignCenter = ImageVector.Builder(
            name = "FormatHorizontalAlignCenter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(23f)
                verticalLineTo(11f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                lineTo(15f, 12f)
                lineTo(19f, 16f)
                moveTo(5f, 8f)
                verticalLineTo(11f)
                horizontalLineTo(1f)
                verticalLineTo(13f)
                horizontalLineTo(5f)
                verticalLineTo(16f)
                lineTo(9f, 12f)
                lineTo(5f, 8f)
                moveTo(11f, 20f)
                horizontalLineTo(13f)
                verticalLineTo(4f)
                horizontalLineTo(11f)
                verticalLineTo(20f)
                close()
            }
        }.build()

        return _FormatHorizontalAlignCenter!!
    }

@Suppress("ObjectPropertyName")
private var _FormatHorizontalAlignCenter: ImageVector? = null
