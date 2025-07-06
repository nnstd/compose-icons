package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraMarker: ImageVector
    get() {
        if (_CameraMarker != null) {
            return _CameraMarker!!
        }
        _CameraMarker = ImageVector.Builder(
            name = "CameraMarker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.5f, 16.8f)
                curveTo(17.8f, 16.8f, 17.3f, 16.2f, 17.3f, 15.6f)
                curveTo(17.3f, 14.9f, 17.9f, 14.4f, 18.5f, 14.4f)
                reflectiveCurveTo(19.7f, 15f, 19.7f, 15.6f)
                curveTo(19.8f, 16.2f, 19.2f, 16.8f, 18.5f, 16.8f)
                moveTo(18.5f, 12f)
                curveTo(16.6f, 12f, 15f, 13.6f, 15f, 15.5f)
                curveTo(15f, 18.1f, 18.5f, 22f, 18.5f, 22f)
                reflectiveCurveTo(22f, 18.1f, 22f, 15.5f)
                curveTo(22f, 13.6f, 20.4f, 12f, 18.5f, 12f)
                moveTo(9f, 2f)
                lineTo(7f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                verticalLineTo(18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(14.5f)
                curveTo(13.9f, 19.1f, 13.4f, 18.1f, 13.1f, 16.9f)
                curveTo(12.8f, 17f, 12.4f, 17f, 12f, 17f)
                curveTo(9.2f, 17f, 7f, 14.8f, 7f, 12f)
                reflectiveCurveTo(9.2f, 7f, 12f, 7f)
                curveTo(14.1f, 7f, 16f, 8.3f, 16.7f, 10.3f)
                curveTo(17.3f, 10.1f, 17.9f, 10f, 18.5f, 10f)
                curveTo(19.8f, 10f, 21f, 10.5f, 22f, 11.3f)
                verticalLineTo(6f)
                curveTo(22f, 4.9f, 21.1f, 4f, 20f, 4f)
                horizontalLineTo(17f)
                lineTo(15f, 2f)
                horizontalLineTo(9f)
                moveTo(11.9f, 9f)
                curveTo(10.3f, 9f, 9f, 10.4f, 9f, 12f)
                curveTo(9f, 13.7f, 10.3f, 15f, 12f, 15f)
                curveTo(12.4f, 15f, 12.7f, 14.9f, 13f, 14.8f)
                curveTo(13.2f, 13.4f, 13.9f, 12.2f, 14.9f, 11.3f)
                curveTo(14.6f, 10f, 13.4f, 9f, 11.9f, 9f)
                curveTo(12f, 9f, 12f, 9f, 11.9f, 9f)
                close()
            }
        }.build()

        return _CameraMarker!!
    }

@Suppress("ObjectPropertyName")
private var _CameraMarker: ImageVector? = null
