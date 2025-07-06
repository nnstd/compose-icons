package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SunSnowflakeVariant: ImageVector
    get() {
        if (_SunSnowflakeVariant != null) {
            return _SunSnowflakeVariant!!
        }
        _SunSnowflakeVariant = ImageVector.Builder(
            name = "SunSnowflakeVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.92f, 1.58f)
                lineTo(11.18f, 2.58f)
                lineTo(12.39f, 4.67f)
                lineTo(11.8f, 6.85f)
                lineTo(9f, 7.6f)
                lineTo(7.38f, 6f)
                lineTo(7.42f, 3.59f)
                lineTo(5.43f, 3.59f)
                lineTo(5.43f, 5.42f)
                lineTo(3.59f, 5.42f)
                lineTo(3.6f, 7.42f)
                lineTo(6f, 7.42f)
                lineTo(7.65f, 9.03f)
                lineTo(6.9f, 11.82f)
                lineTo(4.68f, 12.4f)
                lineTo(2.59f, 11.2f)
                lineTo(1.59f, 12.93f)
                lineTo(3.17f, 13.84f)
                lineTo(2.26f, 15.42f)
                lineTo(4f, 16.42f)
                lineTo(5.19f, 14.33f)
                lineTo(7.42f, 13.75f)
                lineTo(7.92f, 14.26f)
                lineTo(9.32f, 12.86f)
                lineTo(8.78f, 12.32f)
                lineTo(9.53f, 9.54f)
                lineTo(12.32f, 8.78f)
                lineTo(12.85f, 9.32f)
                lineTo(14.26f, 7.91f)
                lineTo(13.73f, 7.37f)
                lineTo(14.32f, 5.19f)
                lineTo(16.41f, 4f)
                lineTo(15.41f, 2.25f)
                lineTo(13.83f, 3.16f)
                lineTo(12.92f, 1.58f)
                moveTo(20.72f, 4f)
                lineTo(4f, 20.72f)
                lineTo(5.27f, 22f)
                lineTo(10.16f, 17.11f)
                curveTo(10.63f, 17.43f, 11.15f, 17.68f, 11.71f, 17.83f)
                curveTo(14.38f, 18.55f, 17.12f, 16.96f, 17.83f, 14.29f)
                curveTo(18.22f, 12.86f, 17.93f, 11.36f, 17.11f, 10.16f)
                lineTo(22f, 5.27f)
                lineTo(20.72f, 4f)
                moveTo(18.74f, 9f)
                curveTo(19.18f, 9.63f, 19.53f, 10.38f, 19.75f, 11.19f)
                curveTo(19.97f, 12f, 20.03f, 12.81f, 19.96f, 13.61f)
                lineTo(22.65f, 10.41f)
                lineTo(18.74f, 9f)
                moveTo(19.32f, 15.95f)
                curveTo(19f, 16.67f, 18.5f, 17.35f, 17.93f, 17.94f)
                curveTo(17.34f, 18.53f, 16.66f, 19f, 15.96f, 19.34f)
                lineTo(20.05f, 20.06f)
                lineTo(19.32f, 15.95f)
                moveTo(9f, 18.71f)
                lineTo(10.41f, 22.66f)
                lineTo(13.59f, 19.95f)
                curveTo(12.81f, 20f, 12f, 19.97f, 11.19f, 19.76f)
                curveTo(10.36f, 19.54f, 9.62f, 19.17f, 9f, 18.71f)
                close()
            }
        }.build()

        return _SunSnowflakeVariant!!
    }

@Suppress("ObjectPropertyName")
private var _SunSnowflakeVariant: ImageVector? = null
