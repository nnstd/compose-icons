package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiSettings: ImageVector
    get() {
        if (_WifiSettings != null) {
            return _WifiSettings!!
        }
        _WifiSettings = ImageVector.Builder(
            name = "WifiSettings",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                lineTo(8.4f, 15.2f)
                curveTo(9.4f, 14.45f, 10.65f, 14f, 12f, 14f)
                reflectiveCurveTo(14.6f, 14.45f, 15.6f, 15.2f)
                lineTo(12f, 20f)
                moveTo(4.8f, 10.4f)
                lineTo(6.6f, 12.8f)
                curveTo(8.1f, 11.67f, 9.97f, 11f, 12f, 11f)
                reflectiveCurveTo(15.9f, 11.67f, 17.4f, 12.8f)
                lineTo(19.2f, 10.4f)
                curveTo(17.19f, 8.89f, 14.7f, 8f, 12f, 8f)
                reflectiveCurveTo(6.81f, 8.89f, 4.8f, 10.4f)
                moveTo(12f, 2f)
                curveTo(7.95f, 2f, 4.21f, 3.34f, 1.2f, 5.6f)
                lineTo(3f, 8f)
                curveTo(5.5f, 6.12f, 8.62f, 5f, 12f, 5f)
                reflectiveCurveTo(18.5f, 6.12f, 21f, 8f)
                lineTo(22.8f, 5.6f)
                curveTo(19.79f, 3.34f, 16.05f, 2f, 12f, 2f)
                moveTo(7f, 24f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(7f)
                verticalLineTo(24f)
                moveTo(15f, 24f)
                horizontalLineTo(17f)
                verticalLineTo(22f)
                horizontalLineTo(15f)
                verticalLineTo(24f)
                moveTo(11f, 24f)
                horizontalLineTo(13f)
                verticalLineTo(22f)
                horizontalLineTo(11f)
                verticalLineTo(24f)
                close()
            }
        }.build()

        return _WifiSettings!!
    }

@Suppress("ObjectPropertyName")
private var _WifiSettings: ImageVector? = null
