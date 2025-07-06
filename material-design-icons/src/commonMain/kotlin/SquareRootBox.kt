package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SquareRootBox: ImageVector
    get() {
        if (_SquareRootBox != null) {
            return _SquareRootBox!!
        }
        _SquareRootBox = ImageVector.Builder(
            name = "SquareRootBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 3f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                horizontalLineTo(5f)
                moveTo(11.24f, 6f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                horizontalLineTo(12.76f)
                lineTo(10f, 18f)
                horizontalLineTo(8f)
                lineTo(6.25f, 12f)
                horizontalLineTo(5f)
                verticalLineTo(10f)
                horizontalLineTo(7.75f)
                lineTo(9f, 14.28f)
                lineTo(11.24f, 6f)
                verticalLineTo(6f)
                moveTo(14f, 10.59f)
                lineTo(15.79f, 12.38f)
                lineTo(17.59f, 10.59f)
                lineTo(19f, 12f)
                lineTo(17.21f, 13.79f)
                lineTo(19f, 15.59f)
                lineTo(17.59f, 17f)
                lineTo(15.79f, 15.21f)
                lineTo(14f, 17f)
                lineTo(12.59f, 15.59f)
                lineTo(14.38f, 13.79f)
                lineTo(12.59f, 12f)
                lineTo(14f, 10.59f)
                close()
            }
        }.build()

        return _SquareRootBox!!
    }

@Suppress("ObjectPropertyName")
private var _SquareRootBox: ImageVector? = null
