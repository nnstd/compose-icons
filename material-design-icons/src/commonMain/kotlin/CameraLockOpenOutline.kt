package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraLockOpenOutline: ImageVector
    get() {
        if (_CameraLockOpenOutline != null) {
            return _CameraLockOpenOutline!!
        }
        _CameraLockOpenOutline = ImageVector.Builder(
            name = "CameraLockOpenOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.1f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.9f, 2.9f, 4f, 4f, 4f)
                horizontalLineTo(7.2f)
                lineTo(9f, 2f)
                horizontalLineTo(15f)
                lineTo(16.8f, 4f)
                horizontalLineTo(20f)
                curveTo(21.1f, 4f, 22f, 4.9f, 22f, 6f)
                verticalLineTo(11f)
                curveTo(21.4f, 10.6f, 20.7f, 10.2f, 20f, 10.1f)
                verticalLineTo(6f)
                horizontalLineTo(16f)
                lineTo(14.2f, 4f)
                horizontalLineTo(9.9f)
                lineTo(8f, 6f)
                horizontalLineTo(4f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                moveTo(12f, 7f)
                curveTo(9.2f, 7f, 7f, 9.2f, 7f, 12f)
                reflectiveCurveTo(9.2f, 17f, 12f, 17f)
                curveTo(12.5f, 17f, 12.9f, 16.9f, 13.4f, 16.8f)
                curveTo(13.6f, 16.4f, 13.9f, 16f, 14.2f, 15.8f)
                verticalLineTo(14.6f)
                curveTo(14.2f, 14.4f, 14.2f, 14.2f, 14.3f, 14.1f)
                curveTo(13.7f, 14.7f, 12.9f, 15.1f, 12f, 15.1f)
                curveTo(10.3f, 15.1f, 9f, 13.8f, 9f, 12.1f)
                reflectiveCurveTo(10.3f, 9.1f, 12f, 9.1f)
                reflectiveCurveTo(15f, 10.4f, 15f, 12.1f)
                verticalLineTo(12.2f)
                curveTo(15.4f, 11.6f, 16.1f, 11.1f, 16.8f, 10.7f)
                curveTo(16.1f, 8.5f, 14.3f, 7f, 12f, 7f)
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

        return _CameraLockOpenOutline!!
    }

@Suppress("ObjectPropertyName")
private var _CameraLockOpenOutline: ImageVector? = null
