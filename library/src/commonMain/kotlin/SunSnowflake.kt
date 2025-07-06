package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SunSnowflake: ImageVector
    get() {
        if (_SunSnowflake != null) {
            return _SunSnowflake!!
        }
        _SunSnowflake = ImageVector.Builder(
            name = "SunSnowflake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0.69f)
                lineTo(8.69f, 4f)
                horizontalLineTo(4f)
                verticalLineTo(8.69f)
                lineTo(0.69f, 12f)
                lineTo(4f, 15.31f)
                verticalLineTo(20f)
                horizontalLineTo(8.69f)
                lineTo(12f, 23.31f)
                lineTo(13f, 22.31f)
                verticalLineTo(17.83f)
                lineTo(16.24f, 21.07f)
                lineTo(17.66f, 19.66f)
                lineTo(13f, 15f)
                verticalLineTo(13f)
                horizontalLineTo(15f)
                lineTo(19.66f, 17.66f)
                lineTo(21.07f, 16.24f)
                lineTo(17.83f, 13f)
                horizontalLineTo(22f)
                verticalLineTo(11f)
                horizontalLineTo(17.83f)
                lineTo(21.07f, 7.76f)
                lineTo(19.66f, 6.34f)
                lineTo(15f, 11f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                lineTo(17.66f, 4.34f)
                lineTo(16.24f, 2.93f)
                lineTo(13f, 6.17f)
                verticalLineTo(1.69f)
                moveTo(11f, 6.09f)
                verticalLineTo(8.13f)
                curveTo(9.24f, 8.59f, 8f, 10.18f, 8f, 12f)
                curveTo(8f, 13.82f, 9.24f, 15.41f, 11f, 15.87f)
                verticalLineTo(17.91f)
                curveTo(8.12f, 17.42f, 6f, 14.93f, 6f, 12f)
                curveTo(6f, 9.07f, 8.11f, 6.57f, 11f, 6.09f)
                close()
            }
        }.build()

        return _SunSnowflake!!
    }

@Suppress("ObjectPropertyName")
private var _SunSnowflake: ImageVector? = null
