package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SquareRoundedBadge: ImageVector
    get() {
        if (_SquareRoundedBadge != null) {
            return _SquareRoundedBadge!!
        }
        _SquareRoundedBadge = ImageVector.Builder(
            name = "SquareRoundedBadge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 8f)
                curveTo(21.43f, 8f, 23f, 6.43f, 23f, 4.5f)
                curveTo(23f, 2.57f, 21.43f, 1f, 19.5f, 1f)
                curveTo(17.57f, 1f, 16f, 2.57f, 16f, 4.5f)
                curveTo(16f, 6.43f, 17.57f, 8f, 19.5f, 8f)
                moveTo(19.5f, 10f)
                curveTo(20f, 10f, 20.5f, 9.93f, 21f, 9.79f)
                verticalLineTo(16f)
                curveTo(21f, 18.76f, 18.76f, 21f, 16f, 21f)
                horizontalLineTo(8f)
                curveTo(5.24f, 21f, 3f, 18.76f, 3f, 16f)
                verticalLineTo(8f)
                curveTo(3f, 5.24f, 5.24f, 3f, 8f, 3f)
                horizontalLineTo(14.21f)
                curveTo(14.07f, 3.5f, 14f, 4f, 14f, 4.5f)
                curveTo(14f, 7.54f, 16.46f, 10f, 19.5f, 10f)
                close()
            }
        }.build()

        return _SquareRoundedBadge!!
    }

@Suppress("ObjectPropertyName")
private var _SquareRoundedBadge: ImageVector? = null
