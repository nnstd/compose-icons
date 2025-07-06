package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiLock: ImageVector
    get() {
        if (_WifiLock != null) {
            return _WifiLock!!
        }
        _WifiLock = ImageVector.Builder(
            name = "WifiLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 6f)
                curveTo(8.62f, 6f, 5.5f, 7.12f, 3f, 9f)
                lineTo(1.2f, 6.6f)
                curveTo(4.21f, 4.34f, 7.95f, 3f, 12f, 3f)
                reflectiveCurveTo(19.79f, 4.34f, 22.8f, 6.6f)
                lineTo(21f, 9f)
                curveTo(18.5f, 7.12f, 15.38f, 6f, 12f, 6f)
                moveTo(17.4f, 10.29f)
                curveTo(15.77f, 9.47f, 13.94f, 9f, 12f, 9f)
                curveTo(9.3f, 9f, 6.81f, 9.89f, 4.8f, 11.4f)
                lineTo(6.6f, 13.8f)
                curveTo(8.1f, 12.67f, 9.97f, 12f, 12f, 12f)
                curveTo(12.97f, 12f, 13.9f, 12.16f, 14.78f, 12.44f)
                curveTo(15.34f, 11.45f, 16.27f, 10.68f, 17.4f, 10.29f)
                moveTo(8.4f, 16.2f)
                lineTo(12f, 21f)
                lineTo(13f, 19.67f)
                verticalLineTo(17.2f)
                curveTo(13f, 16.5f, 13.27f, 15.81f, 13.7f, 15.26f)
                curveTo(13.16f, 15.1f, 12.59f, 15f, 12f, 15f)
                curveTo(10.65f, 15f, 9.4f, 15.45f, 8.4f, 16.2f)
                moveTo(23f, 17.3f)
                verticalLineTo(20.8f)
                curveTo(23f, 21.4f, 22.4f, 22f, 21.7f, 22f)
                horizontalLineTo(16.2f)
                curveTo(15.6f, 22f, 15f, 21.4f, 15f, 20.7f)
                verticalLineTo(17.2f)
                curveTo(15f, 16.6f, 15.6f, 16f, 16.2f, 16f)
                verticalLineTo(14.5f)
                curveTo(16.2f, 13.1f, 17.6f, 12f, 19f, 12f)
                reflectiveCurveTo(21.8f, 13.1f, 21.8f, 14.5f)
                verticalLineTo(16f)
                curveTo(22.4f, 16f, 23f, 16.6f, 23f, 17.3f)
                moveTo(20.5f, 14.5f)
                curveTo(20.5f, 13.7f, 19.8f, 13.2f, 19f, 13.2f)
                reflectiveCurveTo(17.5f, 13.7f, 17.5f, 14.5f)
                verticalLineTo(16f)
                horizontalLineTo(20.5f)
                verticalLineTo(14.5f)
                close()
            }
        }.build()

        return _WifiLock!!
    }

@Suppress("ObjectPropertyName")
private var _WifiLock: ImageVector? = null
