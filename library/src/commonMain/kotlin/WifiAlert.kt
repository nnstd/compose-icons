package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiAlert: ImageVector
    get() {
        if (_WifiAlert != null) {
            return _WifiAlert!!
        }
        _WifiAlert = ImageVector.Builder(
            name = "WifiAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.24f, 5f)
                horizontalLineTo(18f)
                verticalLineTo(7.25f)
                curveTo(16.16f, 6.45f, 14.13f, 6f, 12f, 6f)
                curveTo(8.62f, 6f, 5.5f, 7.12f, 3f, 9f)
                lineTo(1.2f, 6.6f)
                curveTo(4.21f, 4.34f, 7.95f, 3f, 12f, 3f)
                curveTo(14.97f, 3f, 17.77f, 3.73f, 20.24f, 5f)
                moveTo(8.4f, 16.2f)
                lineTo(12f, 21f)
                lineTo(15.6f, 16.2f)
                curveTo(14.6f, 15.45f, 13.35f, 15f, 12f, 15f)
                reflectiveCurveTo(9.4f, 15.45f, 8.4f, 16.2f)
                moveTo(4.8f, 11.4f)
                lineTo(6.6f, 13.8f)
                curveTo(8.1f, 12.67f, 9.97f, 12f, 12f, 12f)
                reflectiveCurveTo(15.9f, 12.67f, 17.4f, 13.8f)
                lineTo(18f, 13f)
                verticalLineTo(10.62f)
                curveTo(16.23f, 9.59f, 14.19f, 9f, 12f, 9f)
                curveTo(9.3f, 9f, 6.81f, 9.89f, 4.8f, 11.4f)
                moveTo(20f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(15f)
                horizontalLineTo(20f)
                verticalLineTo(17f)
                moveTo(20f, 7f)
                verticalLineTo(13f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _WifiAlert!!
    }

@Suppress("ObjectPropertyName")
private var _WifiAlert: ImageVector? = null
