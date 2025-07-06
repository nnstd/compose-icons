package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SquareOff: ImageVector
    get() {
        if (_SquareOff != null) {
            return _SquareOff!!
        }
        _SquareOff = ImageVector.Builder(
            name = "SquareOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(19.11f, 21f)
                horizontalLineTo(3f)
                verticalLineTo(4.89f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(21f, 3f)
                horizontalLineTo(6.2f)
                lineTo(21f, 17.8f)
                verticalLineTo(3f)
                close()
            }
        }.build()

        return _SquareOff!!
    }

@Suppress("ObjectPropertyName")
private var _SquareOff: ImageVector? = null
