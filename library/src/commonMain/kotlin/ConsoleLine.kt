package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ConsoleLine: ImageVector
    get() {
        if (_ConsoleLine != null) {
            return _ConsoleLine!!
        }
        _ConsoleLine = ImageVector.Builder(
            name = "ConsoleLine",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 19f)
                verticalLineTo(16f)
                horizontalLineTo(21f)
                verticalLineTo(19f)
                horizontalLineTo(13f)
                moveTo(8.5f, 13f)
                lineTo(2.47f, 7f)
                horizontalLineTo(6.71f)
                lineTo(11.67f, 11.95f)
                curveTo(12.25f, 12.54f, 12.25f, 13.5f, 11.67f, 14.07f)
                lineTo(6.74f, 19f)
                horizontalLineTo(2.5f)
                lineTo(8.5f, 13f)
                close()
            }
        }.build()

        return _ConsoleLine!!
    }

@Suppress("ObjectPropertyName")
private var _ConsoleLine: ImageVector? = null
