package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SquareRounded: ImageVector
    get() {
        if (_SquareRounded != null) {
            return _SquareRounded!!
        }
        _SquareRounded = ImageVector.Builder(
            name = "SquareRounded",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 3f)
                horizontalLineTo(16f)
                curveTo(18.76f, 3f, 21f, 5.24f, 21f, 8f)
                verticalLineTo(16f)
                curveTo(21f, 18.76f, 18.76f, 21f, 16f, 21f)
                horizontalLineTo(8f)
                curveTo(5.24f, 21f, 3f, 18.76f, 3f, 16f)
                verticalLineTo(8f)
                curveTo(3f, 5.24f, 5.24f, 3f, 8f, 3f)
                close()
            }
        }.build()

        return _SquareRounded!!
    }

@Suppress("ObjectPropertyName")
private var _SquareRounded: ImageVector? = null
