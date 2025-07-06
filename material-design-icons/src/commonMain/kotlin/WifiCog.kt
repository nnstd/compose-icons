package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiCog: ImageVector
    get() {
        if (_WifiCog != null) {
            return _WifiCog!!
        }
        _WifiCog = ImageVector.Builder(
            name = "WifiCog",
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
                lineTo(18.74f, 12f)
                curveTo(17.66f, 12.05f, 16.63f, 12.33f, 15.73f, 12.81f)
                curveTo(14.6f, 12.29f, 13.33f, 12f, 12f, 12f)
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
                lineTo(12.22f, 20.71f)
                curveTo(12.08f, 20.16f, 12f, 19.59f, 12f, 19f)
                curveTo(12f, 17.57f, 12.43f, 16.24f, 13.17f, 15.13f)
                curveTo(12.79f, 15.05f, 12.4f, 15f, 12f, 15f)
                moveTo(23.8f, 20.4f)
                curveTo(23.9f, 20.4f, 23.9f, 20.5f, 23.8f, 20.6f)
                lineTo(22.8f, 22.3f)
                curveTo(22.7f, 22.4f, 22.6f, 22.4f, 22.5f, 22.4f)
                lineTo(21.3f, 22f)
                curveTo(21f, 22.2f, 20.8f, 22.3f, 20.5f, 22.5f)
                lineTo(20.3f, 23.8f)
                curveTo(20.3f, 23.9f, 20.2f, 24f, 20.1f, 24f)
                horizontalLineTo(18.1f)
                curveTo(18f, 24f, 17.9f, 23.9f, 17.8f, 23.8f)
                lineTo(17.6f, 22.5f)
                curveTo(17.3f, 22.4f, 17f, 22.2f, 16.8f, 22f)
                lineTo(15.6f, 22.5f)
                curveTo(15.5f, 22.5f, 15.4f, 22.5f, 15.3f, 22.4f)
                lineTo(14.3f, 20.7f)
                curveTo(14.2f, 20.6f, 14.3f, 20.5f, 14.4f, 20.4f)
                lineTo(15.5f, 19.6f)
                verticalLineTo(18.6f)
                lineTo(14.4f, 17.8f)
                curveTo(14.3f, 17.7f, 14.3f, 17.6f, 14.3f, 17.5f)
                lineTo(15.3f, 15.8f)
                curveTo(15.4f, 15.7f, 15.5f, 15.7f, 15.6f, 15.7f)
                lineTo(16.8f, 16.2f)
                curveTo(17.1f, 16f, 17.3f, 15.9f, 17.6f, 15.7f)
                lineTo(17.8f, 14.4f)
                curveTo(17.8f, 14.3f, 17.9f, 14.2f, 18.1f, 14.2f)
                horizontalLineTo(20.1f)
                curveTo(20.2f, 14.2f, 20.3f, 14.3f, 20.3f, 14.4f)
                lineTo(20.5f, 15.7f)
                curveTo(20.8f, 15.8f, 21.1f, 16f, 21.4f, 16.2f)
                lineTo(22.6f, 15.7f)
                curveTo(22.7f, 15.7f, 22.9f, 15.7f, 22.9f, 15.8f)
                lineTo(23.9f, 17.5f)
                curveTo(24f, 17.6f, 23.9f, 17.7f, 23.8f, 17.8f)
                lineTo(22.7f, 18.6f)
                verticalLineTo(19.6f)
                lineTo(23.8f, 20.4f)
                moveTo(20.5f, 19f)
                curveTo(20.5f, 18.2f, 19.8f, 17.5f, 19f, 17.5f)
                reflectiveCurveTo(17.5f, 18.2f, 17.5f, 19f)
                reflectiveCurveTo(18.2f, 20.5f, 19f, 20.5f)
                reflectiveCurveTo(20.5f, 19.8f, 20.5f, 19f)
                close()
            }
        }.build()

        return _WifiCog!!
    }

@Suppress("ObjectPropertyName")
private var _WifiCog: ImageVector? = null
