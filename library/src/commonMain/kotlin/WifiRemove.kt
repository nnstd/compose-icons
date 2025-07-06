package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiRemove: ImageVector
    get() {
        if (_WifiRemove != null) {
            return _WifiRemove!!
        }
        _WifiRemove = ImageVector.Builder(
            name = "WifiRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                curveTo(9.97f, 12f, 8.1f, 12.67f, 6.6f, 13.8f)
                lineTo(4.8f, 11.4f)
                curveTo(6.81f, 9.89f, 9.3f, 9f, 12f, 9f)
                reflectiveCurveTo(17.19f, 9.89f, 19.2f, 11.4f)
                lineTo(17.92f, 13.1f)
                curveTo(17.55f, 13.17f, 17.18f, 13.27f, 16.84f, 13.41f)
                curveTo(15.44f, 12.5f, 13.78f, 12f, 12f, 12f)
                moveTo(21f, 9f)
                lineTo(22.8f, 6.6f)
                curveTo(19.79f, 4.34f, 16.05f, 3f, 12f, 3f)
                reflectiveCurveTo(4.21f, 4.34f, 1.2f, 6.6f)
                lineTo(3f, 9f)
                curveTo(5.5f, 7.12f, 8.62f, 6f, 12f, 6f)
                reflectiveCurveTo(18.5f, 7.12f, 21f, 9f)
                moveTo(12f, 15f)
                curveTo(10.65f, 15f, 9.4f, 15.45f, 8.4f, 16.2f)
                lineTo(12f, 21f)
                lineTo(13.04f, 19.61f)
                curveTo(13f, 19.41f, 13f, 19.21f, 13f, 19f)
                curveTo(13f, 17.66f, 13.44f, 16.43f, 14.19f, 15.43f)
                curveTo(13.5f, 15.16f, 12.77f, 15f, 12f, 15f)
                moveTo(21.12f, 15.46f)
                lineTo(19f, 17.59f)
                lineTo(16.88f, 15.47f)
                lineTo(15.47f, 16.88f)
                lineTo(17.59f, 19f)
                lineTo(15.47f, 21.12f)
                lineTo(16.88f, 22.54f)
                lineTo(19f, 20.41f)
                lineTo(21.12f, 22.54f)
                lineTo(22.54f, 21.12f)
                lineTo(20.41f, 19f)
                lineTo(22.54f, 16.88f)
                lineTo(21.12f, 15.46f)
                close()
            }
        }.build()

        return _WifiRemove!!
    }

@Suppress("ObjectPropertyName")
private var _WifiRemove: ImageVector? = null
