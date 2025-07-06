package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraLockOpen: ImageVector
    get() {
        if (_CameraLockOpen != null) {
            return _CameraLockOpen!!
        }
        _CameraLockOpen = ImageVector.Builder(
            name = "CameraLockOpen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 12f)
                curveTo(14.6f, 12.6f, 14.4f, 13.3f, 14.3f, 14f)
                curveTo(13.7f, 14.6f, 12.9f, 15f, 12f, 15f)
                curveTo(10.3f, 15f, 9f, 13.7f, 9f, 12f)
                reflectiveCurveTo(10.3f, 9f, 12f, 9f)
                reflectiveCurveTo(15f, 10.3f, 15f, 12f)
                moveTo(13f, 18.2f)
                curveTo(13f, 17.7f, 13.1f, 17.2f, 13.4f, 16.8f)
                curveTo(12.9f, 16.9f, 12.5f, 17f, 12f, 17f)
                curveTo(9.2f, 17f, 7f, 14.8f, 7f, 12f)
                reflectiveCurveTo(9.2f, 7f, 12f, 7f)
                curveTo(14.3f, 7f, 16.1f, 8.5f, 16.8f, 10.6f)
                curveTo(17.5f, 10.3f, 18.2f, 10f, 19f, 10f)
                curveTo(20.1f, 10f, 21.2f, 10.4f, 22f, 11f)
                verticalLineTo(6f)
                curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                horizontalLineTo(17f)
                lineTo(15f, 2f)
                horizontalLineTo(9f)
                lineTo(7f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(13f)
                verticalLineTo(18.2f)
                moveTo(21.8f, 17f)
                horizontalLineTo(17.5f)
                verticalLineTo(14.5f)
                curveTo(17.5f, 13.7f, 18.2f, 13.2f, 19f, 13.2f)
                reflectiveCurveTo(20.5f, 13.7f, 20.5f, 14.5f)
                verticalLineTo(15f)
                horizontalLineTo(21.8f)
                verticalLineTo(14.5f)
                curveTo(21.8f, 13.1f, 20.4f, 12f, 19f, 12f)
                reflectiveCurveTo(16.2f, 13.1f, 16.2f, 14.5f)
                verticalLineTo(17f)
                curveTo(15.6f, 17f, 15f, 17.6f, 15f, 18.2f)
                verticalLineTo(21.7f)
                curveTo(15f, 22.4f, 15.6f, 23f, 16.2f, 23f)
                horizontalLineTo(21.7f)
                curveTo(22.4f, 23f, 23f, 22.4f, 23f, 21.8f)
                verticalLineTo(18.3f)
                curveTo(23f, 17.6f, 22.4f, 17f, 21.8f, 17f)
                close()
            }
        }.build()

        return _CameraLockOpen!!
    }

@Suppress("ObjectPropertyName")
private var _CameraLockOpen: ImageVector? = null
