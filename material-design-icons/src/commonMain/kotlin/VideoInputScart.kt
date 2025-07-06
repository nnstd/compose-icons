package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.VideoInputScart: ImageVector
    get() {
        if (_VideoInputScart != null) {
            return _VideoInputScart!!
        }
        _VideoInputScart = ImageVector.Builder(
            name = "VideoInputScart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.6f, 2.2f)
                lineTo(17.3f, 2.4f)
                lineTo(13.8f, 4.4f)
                lineTo(13.3f, 3.5f)
                lineTo(2f, 10f)
                verticalLineTo(17f)
                horizontalLineTo(3f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.9f, 21f, 5f, 21f)
                horizontalLineTo(15f)
                curveTo(16.1f, 21f, 17f, 20.1f, 17f, 19f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
                lineTo(16.8f, 9.6f)
                lineTo(20.3f, 7.6f)
                lineTo(22.1f, 4.8f)
                lineTo(20.6f, 2.2f)
                moveTo(15f, 17f)
                verticalLineTo(19f)
                horizontalLineTo(5f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                close()
            }
        }.build()

        return _VideoInputScart!!
    }

@Suppress("ObjectPropertyName")
private var _VideoInputScart: ImageVector? = null
