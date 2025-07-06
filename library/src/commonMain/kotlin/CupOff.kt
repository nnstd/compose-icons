package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CupOff: ImageVector
    get() {
        if (_CupOff != null) {
            return _CupOff!!
        }
        _CupOff = ImageVector.Builder(
            name = "CupOff",
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
                lineTo(18.27f, 21.54f)
                curveTo(17.93f, 21.83f, 17.5f, 22f, 17f, 22f)
                horizontalLineTo(7f)
                curveTo(5.97f, 22f, 5.13f, 21.23f, 5f, 20.23f)
                lineTo(3.53f, 6.8f)
                lineTo(1f, 4.27f)
                moveTo(18.32f, 8f)
                lineTo(18.77f, 4f)
                horizontalLineTo(5.82f)
                lineTo(3.82f, 2f)
                horizontalLineTo(21f)
                lineTo(19.29f, 17.47f)
                lineTo(9.82f, 8f)
                horizontalLineTo(18.32f)
                close()
            }
        }.build()

        return _CupOff!!
    }

@Suppress("ObjectPropertyName")
private var _CupOff: ImageVector? = null
