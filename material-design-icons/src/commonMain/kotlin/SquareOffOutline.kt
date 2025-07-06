package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SquareOffOutline: ImageVector
    get() {
        if (_SquareOffOutline != null) {
            return _SquareOffOutline!!
        }
        _SquareOffOutline = ImageVector.Builder(
            name = "SquareOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(3f, 4.89f)
                verticalLineTo(21f)
                horizontalLineTo(19.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(5f, 19f)
                verticalLineTo(6.89f)
                lineTo(17.11f, 19f)
                horizontalLineTo(5f)
                moveTo(8.2f, 5f)
                lineTo(6.2f, 3f)
                horizontalLineTo(21f)
                verticalLineTo(17.8f)
                lineTo(19f, 15.8f)
                verticalLineTo(5f)
                horizontalLineTo(8.2f)
                close()
            }
        }.build()

        return _SquareOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SquareOffOutline: ImageVector? = null
