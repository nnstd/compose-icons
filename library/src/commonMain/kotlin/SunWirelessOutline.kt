package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SunWirelessOutline: ImageVector
    get() {
        if (_SunWirelessOutline != null) {
            return _SunWirelessOutline!!
        }
        _SunWirelessOutline = ImageVector.Builder(
            name = "SunWirelessOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 1f)
                lineTo(13.39f, 4.42f)
                curveTo(12.65f, 4.15f, 11.84f, 4f, 11f, 4f)
                reflectiveCurveTo(9.35f, 4.15f, 8.61f, 4.42f)
                lineTo(11f, 1f)
                moveTo(2.34f, 6f)
                lineTo(6.5f, 5.65f)
                curveTo(5.9f, 6.16f, 5.36f, 6.78f, 4.94f, 7.5f)
                curveTo(4.5f, 8.24f, 4.25f, 9f, 4.11f, 9.79f)
                lineTo(2.34f, 6f)
                moveTo(2.36f, 16f)
                lineTo(4.12f, 12.23f)
                curveTo(4.26f, 13f, 4.53f, 13.78f, 4.95f, 14.5f)
                curveTo(5.37f, 15.24f, 5.91f, 15.86f, 6.5f, 16.37f)
                lineTo(2.36f, 16f)
                moveTo(19.65f, 6f)
                lineTo(17.88f, 9.79f)
                curveTo(17.74f, 9f, 17.47f, 8.23f, 17.05f, 7.5f)
                curveTo(16.63f, 6.78f, 16.1f, 6.15f, 15.5f, 5.64f)
                lineTo(19.65f, 6f)
                moveTo(23f, 13f)
                horizontalLineTo(21f)
                curveTo(21f, 15.05f, 20.22f, 17.1f, 18.66f, 18.66f)
                curveTo(17.09f, 20.23f, 15.05f, 21f, 13f, 21f)
                verticalLineTo(23f)
                curveTo(15.56f, 23f, 18.12f, 22f, 20.07f, 20.07f)
                reflectiveCurveTo(23f, 15.56f, 23f, 13f)
                moveTo(19f, 13f)
                horizontalLineTo(17f)
                curveTo(17f, 14f, 16.61f, 15.05f, 15.83f, 15.83f)
                curveTo(15.05f, 16.61f, 14f, 17f, 13f, 17f)
                verticalLineTo(19f)
                curveTo(14.54f, 19f, 16.08f, 18.41f, 17.25f, 17.24f)
                curveTo(18.41f, 16.08f, 19f, 14.54f, 19f, 13f)
                moveTo(11f, 8f)
                curveTo(12.65f, 8f, 14f, 9.35f, 14f, 11f)
                reflectiveCurveTo(12.65f, 14f, 11f, 14f)
                reflectiveCurveTo(8f, 12.65f, 8f, 11f)
                reflectiveCurveTo(9.35f, 8f, 11f, 8f)
                moveTo(11f, 6f)
                curveTo(8.24f, 6f, 6f, 8.24f, 6f, 11f)
                reflectiveCurveTo(8.24f, 16f, 11f, 16f)
                reflectiveCurveTo(16f, 13.76f, 16f, 11f)
                reflectiveCurveTo(13.76f, 6f, 11f, 6f)
                close()
            }
        }.build()

        return _SunWirelessOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SunWirelessOutline: ImageVector? = null
