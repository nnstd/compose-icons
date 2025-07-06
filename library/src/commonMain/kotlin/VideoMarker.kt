package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VideoMarker: ImageVector
    get() {
        if (_VideoMarker != null) {
            return _VideoMarker!!
        }
        _VideoMarker = ImageVector.Builder(
            name = "VideoMarker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.5f, 16.8f)
                curveTo(4.8f, 16.8f, 4.3f, 16.2f, 4.3f, 15.6f)
                curveTo(4.3f, 14.9f, 4.9f, 14.4f, 5.5f, 14.4f)
                reflectiveCurveTo(6.7f, 15f, 6.7f, 15.6f)
                curveTo(6.8f, 16.2f, 6.2f, 16.8f, 5.5f, 16.8f)
                moveTo(5.5f, 12f)
                curveTo(3.6f, 12f, 2f, 13.6f, 2f, 15.5f)
                curveTo(2f, 18.1f, 5.5f, 22f, 5.5f, 22f)
                reflectiveCurveTo(9f, 18.1f, 9f, 15.5f)
                curveTo(9f, 13.6f, 7.4f, 12f, 5.5f, 12f)
                moveTo(4f, 6f)
                curveTo(3.4f, 6f, 3f, 6.4f, 3f, 7f)
                verticalLineTo(10.6f)
                curveTo(3.8f, 10.2f, 4.6f, 10f, 5.5f, 10f)
                curveTo(8.5f, 10f, 11f, 12.5f, 11f, 15.5f)
                curveTo(11f, 16.4f, 10.8f, 17.2f, 10.5f, 18f)
                horizontalLineTo(16f)
                curveTo(16.6f, 18f, 17f, 17.6f, 17f, 17f)
                verticalLineTo(13.5f)
                lineTo(21f, 17.5f)
                verticalLineTo(6.5f)
                lineTo(17f, 10.5f)
                verticalLineTo(7f)
                curveTo(17f, 6.4f, 16.6f, 6f, 16f, 6f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _VideoMarker!!
    }

@Suppress("ObjectPropertyName")
private var _VideoMarker: ImageVector? = null
