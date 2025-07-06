package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MovieFilter: ImageVector
    get() {
        if (_MovieFilter != null) {
            return _MovieFilter!!
        }
        _MovieFilter = ImageVector.Builder(
            name = "MovieFilter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 4f)
                lineTo(20f, 7f)
                horizontalLineTo(17f)
                lineTo(15f, 4f)
                horizontalLineTo(13f)
                lineTo(15f, 7f)
                horizontalLineTo(12f)
                lineTo(10f, 4f)
                horizontalLineTo(8f)
                lineTo(10f, 7f)
                horizontalLineTo(7f)
                lineTo(5f, 4f)
                horizontalLineTo(4f)
                curveTo(2.9f, 4f, 2f, 4.9f, 2f, 6f)
                lineTo(2f, 18f)
                curveTo(2f, 19.1f, 2.9f, 20f, 4f, 20f)
                horizontalLineTo(20f)
                curveTo(21.1f, 20f, 22f, 19.1f, 22f, 18f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                moveTo(11.25f, 15.25f)
                lineTo(10f, 18f)
                lineTo(8.75f, 15.25f)
                lineTo(6f, 14f)
                lineTo(8.75f, 12.75f)
                lineTo(10f, 10f)
                lineTo(11.25f, 12.75f)
                lineTo(14f, 14f)
                lineTo(11.25f, 15.25f)
                moveTo(16.94f, 11.94f)
                lineTo(16f, 14f)
                lineTo(15.06f, 11.94f)
                lineTo(13f, 11f)
                lineTo(15.06f, 10.06f)
                lineTo(16f, 8f)
                lineTo(16.94f, 10.06f)
                lineTo(19f, 11f)
                lineTo(16.94f, 11.94f)
                close()
            }
        }.build()

        return _MovieFilter!!
    }

@Suppress("ObjectPropertyName")
private var _MovieFilter: ImageVector? = null
