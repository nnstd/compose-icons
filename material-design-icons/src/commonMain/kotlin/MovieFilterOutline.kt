package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MovieFilterOutline: ImageVector
    get() {
        if (_MovieFilterOutline != null) {
            return _MovieFilterOutline!!
        }
        _MovieFilterOutline = ImageVector.Builder(
            name = "MovieFilterOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 11f)
                lineTo(9.06f, 13.06f)
                lineTo(7f, 14f)
                lineTo(9.06f, 14.94f)
                lineTo(10f, 17f)
                lineTo(10.94f, 14.94f)
                lineTo(13f, 14f)
                lineTo(10.94f, 13.06f)
                moveTo(18f, 4f)
                lineTo(20f, 8f)
                horizontalLineTo(17f)
                lineTo(15f, 4f)
                horizontalLineTo(13f)
                lineTo(15f, 8f)
                horizontalLineTo(12f)
                lineTo(10f, 4f)
                horizontalLineTo(8f)
                lineTo(10f, 8f)
                horizontalLineTo(7f)
                lineTo(5f, 4f)
                horizontalLineTo(4f)
                curveTo(2.91f, 4f, 2f, 4.9f, 2f, 6f)
                lineTo(2f, 18f)
                curveTo(2f, 19.1f, 2.91f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(21.11f, 20f, 22f, 19.1f, 22f, 18f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                moveTo(20f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(6.47f)
                lineTo(5.77f, 10f)
                horizontalLineTo(16f)
                lineTo(15.37f, 11.37f)
                lineTo(14f, 12f)
                lineTo(15.37f, 12.63f)
                lineTo(16f, 14f)
                lineTo(16.63f, 12.63f)
                lineTo(18f, 12f)
                lineTo(16.63f, 11.37f)
                lineTo(16f, 10f)
                horizontalLineTo(20f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _MovieFilterOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MovieFilterOutline: ImageVector? = null
