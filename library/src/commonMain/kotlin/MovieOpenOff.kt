package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MovieOpenOff: ImageVector
    get() {
        if (_MovieOpenOff != null) {
            return _MovieOpenOff!!
        }
        _MovieOpenOff = ImageVector.Builder(
            name = "MovieOpenOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.2f, 10f)
                horizontalLineTo(22f)
                verticalLineTo(18.8f)
                lineTo(13.2f, 10f)
                moveTo(21.6f, 6.1f)
                lineTo(20.8f, 2.2f)
                lineTo(16.9f, 3f)
                lineTo(19.6f, 6.5f)
                lineTo(21.6f, 6.1f)
                moveTo(11.8f, 8f)
                lineTo(9.1f, 4.5f)
                lineTo(7.9f, 4.7f)
                lineTo(11.3f, 8.1f)
                lineTo(11.8f, 8f)
                moveTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(3.7f, 5.6f)
                lineTo(3.2f, 5.7f)
                curveTo(2.1f, 5.9f, 1.4f, 7f, 1.6f, 8f)
                lineTo(2f, 10f)
                lineTo(7.1f, 9f)
                lineTo(8.1f, 10f)
                horizontalLineTo(2f)
                verticalLineTo(20f)
                curveTo(2f, 21.1f, 2.9f, 22f, 4f, 22f)
                horizontalLineTo(20.1f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.4f)
                lineTo(2.4f, 1.7f)
                moveTo(16.7f, 7.1f)
                lineTo(14f, 3.5f)
                lineTo(12f, 3.9f)
                lineTo(14.8f, 7.4f)
                lineTo(16.7f, 7.1f)
                close()
            }
        }.build()

        return _MovieOpenOff!!
    }

@Suppress("ObjectPropertyName")
private var _MovieOpenOff: ImageVector? = null
