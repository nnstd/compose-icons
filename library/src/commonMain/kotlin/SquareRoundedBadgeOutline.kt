package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SquareRoundedBadgeOutline: ImageVector
    get() {
        if (_SquareRoundedBadgeOutline != null) {
            return _SquareRoundedBadgeOutline!!
        }
        _SquareRoundedBadgeOutline = ImageVector.Builder(
            name = "SquareRoundedBadgeOutline",
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
                moveTo(21f, 16f)
                verticalLineTo(9.79f)
                curveTo(20.5f, 9.93f, 20f, 10f, 19.5f, 10f)
                curveTo(19.33f, 10f, 19.17f, 10f, 19f, 10f)
                verticalLineTo(16f)
                curveTo(19f, 17.66f, 17.66f, 19f, 16f, 19f)
                horizontalLineTo(8f)
                curveTo(6.34f, 19f, 5f, 17.66f, 5f, 16f)
                verticalLineTo(8f)
                curveTo(5f, 6.34f, 6.34f, 5f, 8f, 5f)
                horizontalLineTo(14f)
                curveTo(14f, 4.84f, 14f, 4.67f, 14f, 4.5f)
                curveTo(14f, 4f, 14.07f, 3.5f, 14.21f, 3f)
                horizontalLineTo(8f)
                curveTo(5.24f, 3f, 3f, 5.24f, 3f, 8f)
                verticalLineTo(16f)
                curveTo(3f, 18.76f, 5.24f, 21f, 8f, 21f)
                horizontalLineTo(16f)
                curveTo(18.76f, 21f, 21f, 18.76f, 21f, 16f)
                close()
            }
        }.build()

        return _SquareRoundedBadgeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SquareRoundedBadgeOutline: ImageVector? = null
