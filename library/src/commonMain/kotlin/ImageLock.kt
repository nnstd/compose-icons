package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageLock: ImageVector
    get() {
        if (_ImageLock != null) {
            return _ImageLock!!
        }
        _ImageLock = ImageVector.Builder(
            name = "ImageLock",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.8f, 16f)
                verticalLineTo(14.5f)
                curveTo(21.8f, 13.1f, 20.4f, 12f, 19f, 12f)
                reflectiveCurveTo(16.2f, 13.1f, 16.2f, 14.5f)
                verticalLineTo(16f)
                curveTo(15.6f, 16f, 15f, 16.6f, 15f, 17.2f)
                verticalLineTo(20.7f)
                curveTo(15f, 21.4f, 15.6f, 22f, 16.2f, 22f)
                horizontalLineTo(21.7f)
                curveTo(22.4f, 22f, 23f, 21.4f, 23f, 20.8f)
                verticalLineTo(17.3f)
                curveTo(23f, 16.6f, 22.4f, 16f, 21.8f, 16f)
                moveTo(20.5f, 16f)
                horizontalLineTo(17.5f)
                verticalLineTo(14.5f)
                curveTo(17.5f, 13.7f, 18.2f, 13.2f, 19f, 13.2f)
                reflectiveCurveTo(20.5f, 13.7f, 20.5f, 14.5f)
                verticalLineTo(16f)
                moveTo(5f, 3f)
                curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.11f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(13.03f)
                curveTo(13f, 20.9f, 13f, 20.8f, 13f, 20.7f)
                verticalLineTo(18f)
                horizontalLineTo(5f)
                lineTo(8.5f, 13.5f)
                lineTo(11f, 16.5f)
                lineTo(14.5f, 12f)
                lineTo(14.77f, 12.37f)
                curveTo(15.61f, 10.89f, 17.27f, 10f, 19f, 10f)
                curveTo(19.69f, 10f, 20.37f, 10.16f, 21f, 10.42f)
                verticalLineTo(5f)
                curveTo(21f, 3.89f, 20.1f, 3f, 19f, 3f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _ImageLock!!
    }

@Suppress("ObjectPropertyName")
private var _ImageLock: ImageVector? = null
