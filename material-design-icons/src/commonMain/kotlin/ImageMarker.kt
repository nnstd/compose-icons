package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageMarker: ImageVector
    get() {
        if (_ImageMarker != null) {
            return _ImageMarker!!
        }
        _ImageMarker = ImageVector.Builder(
            name = "ImageMarker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.55f, 18f)
                curveTo(13.97f, 19.08f, 14.59f, 20.12f, 15.19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.11f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.1f, 3f, 21f, 3.89f, 21f, 5f)
                verticalLineTo(10.63f)
                curveTo(20.25f, 10.23f, 19.39f, 10f, 18.5f, 10f)
                curveTo(16.29f, 10f, 14.33f, 11.39f, 13.47f, 13.33f)
                lineTo(11f, 16.5f)
                lineTo(8.5f, 13.5f)
                lineTo(5f, 18f)
                horizontalLineTo(13.55f)
                moveTo(22f, 15.5f)
                curveTo(22f, 18.1f, 18.5f, 22f, 18.5f, 22f)
                reflectiveCurveTo(15f, 18.1f, 15f, 15.5f)
                curveTo(15f, 13.6f, 16.6f, 12f, 18.5f, 12f)
                reflectiveCurveTo(22f, 13.6f, 22f, 15.5f)
                moveTo(19.7f, 15.6f)
                curveTo(19.7f, 15f, 19.1f, 14.4f, 18.5f, 14.4f)
                reflectiveCurveTo(17.3f, 14.9f, 17.3f, 15.6f)
                curveTo(17.3f, 16.2f, 17.8f, 16.8f, 18.5f, 16.8f)
                reflectiveCurveTo(19.8f, 16.2f, 19.7f, 15.6f)
                close()
            }
        }.build()

        return _ImageMarker!!
    }

@Suppress("ObjectPropertyName")
private var _ImageMarker: ImageVector? = null
