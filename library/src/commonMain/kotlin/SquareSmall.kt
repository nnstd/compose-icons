package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SquareSmall: ImageVector
    get() {
        if (_SquareSmall != null) {
            return _SquareSmall!!
        }
        _SquareSmall = ImageVector.Builder(
            name = "SquareSmall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 14f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                verticalLineTo(14f)
                horizontalLineTo(10f)
                close()
            }
        }.build()

        return _SquareSmall!!
    }

@Suppress("ObjectPropertyName")
private var _SquareSmall: ImageVector? = null
