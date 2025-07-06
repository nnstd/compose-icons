package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FormatText: ImageVector
    get() {
        if (_FormatText != null) {
            return _FormatText!!
        }
        _FormatText = ImageVector.Builder(
            name = "FormatText",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 4f)
                lineTo(19.66f, 8.35f)
                lineTo(18.7f, 8.61f)
                curveTo(18.25f, 7.74f, 17.79f, 6.87f, 17.26f, 6.43f)
                curveTo(16.73f, 6f, 16.11f, 6f, 15.5f, 6f)
                horizontalLineTo(13f)
                verticalLineTo(16.5f)
                curveTo(13f, 17f, 13f, 17.5f, 13.33f, 17.75f)
                curveTo(13.67f, 18f, 14.33f, 18f, 15f, 18f)
                verticalLineTo(19f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                curveTo(9.67f, 18f, 10.33f, 18f, 10.67f, 17.75f)
                curveTo(11f, 17.5f, 11f, 17f, 11f, 16.5f)
                verticalLineTo(6f)
                horizontalLineTo(8.5f)
                curveTo(7.89f, 6f, 7.27f, 6f, 6.74f, 6.43f)
                curveTo(6.21f, 6.87f, 5.75f, 7.74f, 5.3f, 8.61f)
                lineTo(4.34f, 8.35f)
                lineTo(5.5f, 4f)
                horizontalLineTo(18.5f)
                close()
            }
        }.build()

        return _FormatText!!
    }

@Suppress("ObjectPropertyName")
private var _FormatText: ImageVector? = null
