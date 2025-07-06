package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Vanish: ImageVector
    get() {
        if (_Vanish != null) {
            return _Vanish!!
        }
        _Vanish = ImageVector.Builder(
            name = "Vanish",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 13f)
                verticalLineTo(11f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(16f)
                moveTo(14.83f, 7.76f)
                lineTo(17.66f, 4.93f)
                lineTo(19.07f, 6.34f)
                lineTo(16.24f, 9.17f)
                lineTo(14.83f, 7.76f)
                moveTo(11f, 16f)
                horizontalLineTo(13f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                moveTo(11f, 3f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(3f)
                moveTo(4.93f, 17.66f)
                lineTo(7.76f, 14.83f)
                lineTo(9.17f, 16.24f)
                lineTo(6.34f, 19.07f)
                lineTo(4.93f, 17.66f)
                moveTo(4.93f, 6.34f)
                lineTo(6.34f, 4.93f)
                lineTo(9.17f, 7.76f)
                lineTo(7.76f, 9.17f)
                lineTo(4.93f, 6.34f)
                moveTo(8f, 13f)
                horizontalLineTo(3f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(13f)
                moveTo(19.07f, 17.66f)
                lineTo(17.66f, 19.07f)
                lineTo(14.83f, 16.24f)
                lineTo(16.24f, 14.83f)
                lineTo(19.07f, 17.66f)
                close()
            }
        }.build()

        return _Vanish!!
    }

@Suppress("ObjectPropertyName")
private var _Vanish: ImageVector? = null
