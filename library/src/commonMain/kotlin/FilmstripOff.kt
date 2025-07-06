package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FilmstripOff: ImageVector
    get() {
        if (_FilmstripOff != null) {
            return _FilmstripOff!!
        }
        _FilmstripOff = ImageVector.Builder(
            name = "FilmstripOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 4.27f)
                lineTo(2.28f, 3f)
                lineTo(21f, 21.72f)
                lineTo(19.73f, 23f)
                lineTo(16f, 19.27f)
                verticalLineTo(21f)
                horizontalLineTo(8f)
                verticalLineTo(19f)
                horizontalLineTo(6f)
                verticalLineTo(21f)
                horizontalLineTo(4f)
                verticalLineTo(7.27f)
                lineTo(1f, 4.27f)
                moveTo(18f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(16f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                moveTo(18f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(13f)
                horizontalLineTo(18f)
                moveTo(18f, 15f)
                horizontalLineTo(16.82f)
                lineTo(6.82f, 5f)
                horizontalLineTo(8f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(5f)
                horizontalLineTo(18f)
                verticalLineTo(3f)
                horizontalLineTo(20f)
                verticalLineTo(18.18f)
                lineTo(18f, 16.18f)
                verticalLineTo(15f)
                moveTo(8f, 13f)
                verticalLineTo(11.27f)
                lineTo(7.73f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                horizontalLineTo(8f)
                moveTo(8f, 17f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(17f)
                horizontalLineTo(8f)
                moveTo(6f, 3f)
                verticalLineTo(4.18f)
                lineTo(4.82f, 3f)
                horizontalLineTo(6f)
                close()
            }
        }.build()

        return _FilmstripOff!!
    }

@Suppress("ObjectPropertyName")
private var _FilmstripOff: ImageVector? = null
