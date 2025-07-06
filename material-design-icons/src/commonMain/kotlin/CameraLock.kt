package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraLock: ImageVector
    get() {
        if (_CameraLock != null) {
            return _CameraLock!!
        }
        _CameraLock = ImageVector.Builder(
            name = "CameraLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 4f)
                horizontalLineTo(7f)
                lineTo(9f, 2f)
                horizontalLineTo(15f)
                lineTo(17f, 4f)
                horizontalLineTo(20f)
                curveTo(21.11f, 4f, 22f, 4.89f, 22f, 6f)
                verticalLineTo(12f)
                curveTo(21.16f, 11.37f, 20.13f, 11f, 19f, 11f)
                curveTo(18.21f, 11f, 17.46f, 11.18f, 16.79f, 11.5f)
                curveTo(16.18f, 9.22f, 14.27f, 7f, 12f, 7f)
                curveTo(9.24f, 7f, 7f, 9.24f, 7f, 12f)
                curveTo(7f, 14.76f, 9.24f, 17f, 12f, 17f)
                curveTo(12.42f, 17f, 12.84f, 16.95f, 13.23f, 16.85f)
                curveTo(13.08f, 17.2f, 13f, 17.59f, 13f, 18f)
                verticalLineTo(20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.11f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.9f, 4f, 4f, 4f)
                moveTo(12f, 9f)
                curveTo(13.66f, 9f, 15f, 10.34f, 15f, 12f)
                curveTo(15f, 13.66f, 13.66f, 15f, 12f, 15f)
                curveTo(10.34f, 15f, 9f, 13.66f, 9f, 12f)
                curveTo(9f, 10.34f, 10.34f, 9f, 12f, 9f)
                moveTo(23f, 18.3f)
                verticalLineTo(21.8f)
                curveTo(23f, 22.4f, 22.4f, 23f, 21.7f, 23f)
                horizontalLineTo(16.2f)
                curveTo(15.6f, 23f, 15f, 22.4f, 15f, 21.7f)
                verticalLineTo(18.2f)
                curveTo(15f, 17.6f, 15.6f, 17f, 16.2f, 17f)
                verticalLineTo(15.5f)
                curveTo(16.2f, 14.1f, 17.6f, 13f, 19f, 13f)
                curveTo(20.4f, 13f, 21.8f, 14.1f, 21.8f, 15.5f)
                verticalLineTo(17f)
                curveTo(22.4f, 17f, 23f, 17.6f, 23f, 18.3f)
                moveTo(20.5f, 15.5f)
                curveTo(20.5f, 14.7f, 19.8f, 14.2f, 19f, 14.2f)
                curveTo(18.2f, 14.2f, 17.5f, 14.7f, 17.5f, 15.5f)
                verticalLineTo(17f)
                horizontalLineTo(20.5f)
                verticalLineTo(15.5f)
                close()
            }
        }.build()

        return _CameraLock!!
    }

@Suppress("ObjectPropertyName")
private var _CameraLock: ImageVector? = null
