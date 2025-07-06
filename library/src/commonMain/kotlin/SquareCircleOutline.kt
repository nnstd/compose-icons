package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SquareCircleOutline: ImageVector
    get() {
        if (_SquareCircleOutline != null) {
            return _SquareCircleOutline!!
        }
        _SquareCircleOutline = ImageVector.Builder(
            name = "SquareCircleOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                curveTo(18f, 8.69f, 15.31f, 6f, 12f, 6f)
                curveTo(8.69f, 6f, 6f, 8.69f, 6f, 12f)
                curveTo(6f, 15.31f, 8.69f, 18f, 12f, 18f)
                curveTo(15.31f, 18f, 18f, 15.31f, 18f, 12f)
                moveTo(12f, 8f)
                curveTo(14.21f, 8f, 16f, 9.8f, 16f, 12f)
                curveTo(16f, 14.21f, 14.21f, 16f, 12f, 16f)
                curveTo(9.8f, 16f, 8f, 14.21f, 8f, 12f)
                curveTo(8f, 9.8f, 9.8f, 8f, 12f, 8f)
                moveTo(20f, 4f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                moveTo(22f, 2f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _SquareCircleOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SquareCircleOutline: ImageVector? = null
