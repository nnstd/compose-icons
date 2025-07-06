package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MoviePlayOutline: ImageVector
    get() {
        if (_MoviePlayOutline != null) {
            return _MoviePlayOutline!!
        }
        _MoviePlayOutline = ImageVector.Builder(
            name = "MoviePlayOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 4f)
                verticalLineTo(13.81f)
                curveTo(21.39f, 13.46f, 20.72f, 13.22f, 20f, 13.09f)
                verticalLineTo(10f)
                horizontalLineTo(5.76f)
                lineTo(4f, 6.47f)
                verticalLineTo(18f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 18.33f, 13f, 18.66f, 13f, 19f)
                curveTo(13f, 19.34f, 13.04f, 19.67f, 13.09f, 20f)
                horizontalLineTo(4f)
                curveTo(2.9f, 20f, 2f, 19.11f, 2f, 18f)
                verticalLineTo(6f)
                curveTo(2f, 4.89f, 2.9f, 4f, 4f, 4f)
                horizontalLineTo(5f)
                lineTo(7f, 8f)
                horizontalLineTo(10f)
                lineTo(8f, 4f)
                horizontalLineTo(10f)
                lineTo(12f, 8f)
                horizontalLineTo(15f)
                lineTo(13f, 4f)
                horizontalLineTo(15f)
                lineTo(17f, 8f)
                horizontalLineTo(20f)
                lineTo(18f, 4f)
                horizontalLineTo(22f)
                moveTo(17f, 22f)
                lineTo(22f, 19f)
                lineTo(17f, 16f)
                verticalLineTo(22f)
                close()
            }
        }.build()

        return _MoviePlayOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MoviePlayOutline: ImageVector? = null
