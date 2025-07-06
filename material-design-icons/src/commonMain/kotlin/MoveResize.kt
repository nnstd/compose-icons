package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MoveResize: ImageVector
    get() {
        if (_MoveResize != null) {
            return _MoveResize!!
        }
        _MoveResize = ImageVector.Builder(
            name = "MoveResize",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 1f)
                verticalLineTo(2f)
                horizontalLineTo(10f)
                verticalLineTo(5f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                horizontalLineTo(11f)
                verticalLineTo(2f)
                horizontalLineTo(12f)
                verticalLineTo(1f)
                moveTo(9f, 7f)
                curveTo(7.89f, 7f, 7f, 7.89f, 7f, 9f)
                verticalLineTo(21f)
                curveTo(7f, 22.11f, 7.89f, 23f, 9f, 23f)
                horizontalLineTo(21f)
                curveTo(22.11f, 23f, 23f, 22.11f, 23f, 21f)
                verticalLineTo(9f)
                curveTo(23f, 7.89f, 22.11f, 7f, 21f, 7f)
                moveTo(1f, 9f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(12f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                horizontalLineTo(2f)
                verticalLineTo(9f)
                moveTo(9f, 9f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                moveTo(14f, 10f)
                verticalLineTo(11f)
                horizontalLineTo(15f)
                verticalLineTo(16f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(10f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(20f)
                horizontalLineTo(17f)
                verticalLineTo(19f)
                horizontalLineTo(16f)
                verticalLineTo(17f)
                horizontalLineTo(19f)
                verticalLineTo(18f)
                horizontalLineTo(20f)
                verticalLineTo(15f)
                horizontalLineTo(19f)
                verticalLineTo(16f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(17f)
                verticalLineTo(10f)
            }
        }.build()

        return _MoveResize!!
    }

@Suppress("ObjectPropertyName")
private var _MoveResize: ImageVector? = null
