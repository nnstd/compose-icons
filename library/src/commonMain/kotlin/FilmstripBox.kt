package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FilmstripBox: ImageVector
    get() {
        if (_FilmstripBox != null) {
            return _FilmstripBox!!
        }
        _FilmstripBox = ImageVector.Builder(
            name = "FilmstripBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                curveTo(20.1f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 20.1f, 20.1f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.9f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.9f, 3.9f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                moveTo(7f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(5f)
                verticalLineTo(18f)
                horizontalLineTo(7f)
                moveTo(7f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(13f)
                horizontalLineTo(7f)
                moveTo(7f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                moveTo(19f, 18f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                verticalLineTo(18f)
                horizontalLineTo(19f)
                moveTo(19f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(13f)
                horizontalLineTo(19f)
                moveTo(19f, 8f)
                verticalLineTo(6f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _FilmstripBox!!
    }

@Suppress("ObjectPropertyName")
private var _FilmstripBox: ImageVector? = null
