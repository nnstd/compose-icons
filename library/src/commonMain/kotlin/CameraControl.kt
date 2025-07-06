package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CameraControl: ImageVector
    get() {
        if (_CameraControl != null) {
            return _CameraControl!!
        }
        _CameraControl = ImageVector.Builder(
            name = "CameraControl",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 12f)
                curveTo(9f, 11.19f, 9.3f, 10.5f, 9.89f, 9.89f)
                curveTo(10.5f, 9.3f, 11.19f, 9f, 12f, 9f)
                curveTo(12.81f, 9f, 13.5f, 9.3f, 14.11f, 9.89f)
                curveTo(14.7f, 10.5f, 15f, 11.19f, 15f, 12f)
                curveTo(15f, 12.81f, 14.7f, 13.5f, 14.11f, 14.11f)
                curveTo(13.5f, 14.7f, 12.81f, 15f, 12f, 15f)
                curveTo(11.19f, 15f, 10.5f, 14.7f, 9.89f, 14.11f)
                curveTo(9.3f, 13.5f, 9f, 12.81f, 9f, 12f)
                moveTo(5.53f, 8.44f)
                lineTo(7.31f, 10.22f)
                lineTo(5.53f, 12f)
                lineTo(7.31f, 13.78f)
                lineTo(5.53f, 15.56f)
                lineTo(2f, 12f)
                lineTo(5.53f, 8.44f)
                moveTo(8.44f, 18.47f)
                lineTo(10.22f, 16.69f)
                lineTo(12f, 18.47f)
                lineTo(13.78f, 16.69f)
                lineTo(15.56f, 18.47f)
                lineTo(12f, 22f)
                lineTo(8.44f, 18.47f)
                moveTo(18.47f, 15.56f)
                lineTo(16.69f, 13.78f)
                lineTo(18.47f, 12f)
                lineTo(16.69f, 10.22f)
                lineTo(18.47f, 8.44f)
                lineTo(22f, 12f)
                lineTo(18.47f, 15.56f)
                moveTo(15.56f, 5.53f)
                lineTo(13.78f, 7.31f)
                lineTo(12f, 5.53f)
                lineTo(10.22f, 7.31f)
                lineTo(8.44f, 5.53f)
                lineTo(12f, 2f)
                lineTo(15.56f, 5.53f)
                close()
            }
        }.build()

        return _CameraControl!!
    }

@Suppress("ObjectPropertyName")
private var _CameraControl: ImageVector? = null
