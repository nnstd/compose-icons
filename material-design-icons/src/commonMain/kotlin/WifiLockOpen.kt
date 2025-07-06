package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WifiLockOpen: ImageVector
    get() {
        if (_WifiLockOpen != null) {
            return _WifiLockOpen!!
        }
        _WifiLockOpen = ImageVector.Builder(
            name = "WifiLockOpen",
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
                moveTo(16.31f, 9.81f)
                curveTo(14.97f, 9.29f, 13.5f, 9f, 12f, 9f)
                curveTo(9.3f, 9f, 6.81f, 9.89f, 4.8f, 11.4f)
                lineTo(6.6f, 13.8f)
                curveTo(8.1f, 12.67f, 9.97f, 12f, 12f, 12f)
                curveTo(12.83f, 12f, 13.63f, 12.12f, 14.39f, 12.33f)
                curveTo(14.7f, 11.3f, 15.38f, 10.41f, 16.31f, 9.81f)
                moveTo(8.4f, 16.2f)
                lineTo(12f, 21f)
                lineTo(13f, 19.67f)
                verticalLineTo(17.2f)
                curveTo(13f, 16.5f, 13.27f, 15.81f, 13.7f, 15.26f)
                curveTo(13.16f, 15.1f, 12.59f, 15f, 12f, 15f)
                curveTo(10.65f, 15f, 9.4f, 15.45f, 8.4f, 16.2f)
                moveTo(21.8f, 16f)
                horizontalLineTo(17.5f)
                verticalLineTo(13.5f)
                curveTo(17.5f, 12.7f, 18.2f, 12.2f, 19f, 12.2f)
                reflectiveCurveTo(20.5f, 12.7f, 20.5f, 13.5f)
                verticalLineTo(14f)
                horizontalLineTo(21.8f)
                verticalLineTo(13.5f)
                curveTo(21.8f, 12.1f, 20.4f, 11f, 19f, 11f)
                reflectiveCurveTo(16.2f, 12.1f, 16.2f, 13.5f)
                verticalLineTo(16f)
                curveTo(15.6f, 16f, 15f, 16.6f, 15f, 17.2f)
                verticalLineTo(20.7f)
                curveTo(15f, 21.4f, 15.6f, 22f, 16.2f, 22f)
                horizontalLineTo(21.7f)
                curveTo(22.4f, 22f, 23f, 21.4f, 23f, 20.8f)
                verticalLineTo(17.3f)
                curveTo(23f, 16.6f, 22.4f, 16f, 21.8f, 16f)
                close()
            }
        }.build()

        return _WifiLockOpen!!
    }

@Suppress("ObjectPropertyName")
private var _WifiLockOpen: ImageVector? = null
