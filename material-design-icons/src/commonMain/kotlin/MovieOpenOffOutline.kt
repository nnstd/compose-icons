package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MovieOpenOffOutline: ImageVector
    get() {
        if (_MovieOpenOffOutline != null) {
            return _MovieOpenOffOutline!!
        }
        _MovieOpenOffOutline = ImageVector.Builder(
            name = "MovieOpenOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.7f, 6.5f)
                lineTo(16.9f, 3f)
                lineTo(20.8f, 2.2f)
                lineTo(21.6f, 6.1f)
                lineTo(19.7f, 6.5f)
                moveTo(22.1f, 21.5f)
                lineTo(20.8f, 22.8f)
                lineTo(20.1f, 22f)
                horizontalLineTo(4f)
                curveTo(2.9f, 22f, 2f, 21.1f, 2f, 20f)
                verticalLineTo(10f)
                horizontalLineTo(8.1f)
                lineTo(7.1f, 9f)
                lineTo(2f, 10f)
                lineTo(1.6f, 8f)
                curveTo(1.4f, 7f, 2.1f, 5.9f, 3.2f, 5.7f)
                lineTo(3.7f, 5.6f)
                lineTo(1.1f, 3f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.5f)
                moveTo(18.1f, 20f)
                lineTo(10.1f, 12f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(18.1f)
                moveTo(22f, 18.8f)
                verticalLineTo(10f)
                horizontalLineTo(13.2f)
                lineTo(15.2f, 12f)
                horizontalLineTo(20f)
                verticalLineTo(16.8f)
                lineTo(22f, 18.8f)
                moveTo(16.7f, 7.1f)
                lineTo(14f, 3.5f)
                lineTo(12f, 3.9f)
                lineTo(14.8f, 7.4f)
                lineTo(16.7f, 7.1f)
                moveTo(11.8f, 8f)
                lineTo(9.1f, 4.5f)
                lineTo(7.9f, 4.7f)
                lineTo(11.3f, 8.1f)
                lineTo(11.8f, 8f)
                close()
            }
        }.build()

        return _MovieOpenOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MovieOpenOffOutline: ImageVector? = null
