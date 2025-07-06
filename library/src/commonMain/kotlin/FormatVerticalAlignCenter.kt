package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatVerticalAlignCenter: ImageVector
    get() {
        if (_FormatVerticalAlignCenter != null) {
            return _FormatVerticalAlignCenter!!
        }
        _FormatVerticalAlignCenter = ImageVector.Builder(
            name = "FormatVerticalAlignCenter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 19f)
                horizontalLineTo(11f)
                verticalLineTo(23f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(16f)
                lineTo(12f, 15f)
                lineTo(8f, 19f)
                moveTo(16f, 5f)
                horizontalLineTo(13f)
                verticalLineTo(1f)
                horizontalLineTo(11f)
                verticalLineTo(5f)
                horizontalLineTo(8f)
                lineTo(12f, 9f)
                lineTo(16f, 5f)
                moveTo(4f, 11f)
                verticalLineTo(13f)
                horizontalLineTo(20f)
                verticalLineTo(11f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _FormatVerticalAlignCenter!!
    }

@Suppress("ObjectPropertyName")
private var _FormatVerticalAlignCenter: ImageVector? = null
