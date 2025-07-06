package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MagnifyMinusOutline: ImageVector
    get() {
        if (_MagnifyMinusOutline != null) {
            return _MagnifyMinusOutline!!
        }
        _MagnifyMinusOutline = ImageVector.Builder(
            name = "MagnifyMinusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 14f)
                horizontalLineTo(14.71f)
                lineTo(14.43f, 13.73f)
                curveTo(15.41f, 12.59f, 16f, 11.11f, 16f, 9.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 3f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3f, 9.5f)
                arcTo(6.5f, 6.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9.5f, 16f)
                curveTo(11.11f, 16f, 12.59f, 15.41f, 13.73f, 14.43f)
                lineTo(14f, 14.71f)
                verticalLineTo(15.5f)
                lineTo(19f, 20.5f)
                lineTo(20.5f, 19f)
                lineTo(15.5f, 14f)
                moveTo(9.5f, 14f)
                curveTo(7f, 14f, 5f, 12f, 5f, 9.5f)
                curveTo(5f, 7f, 7f, 5f, 9.5f, 5f)
                curveTo(12f, 5f, 14f, 7f, 14f, 9.5f)
                curveTo(14f, 12f, 12f, 14f, 9.5f, 14f)
                moveTo(7f, 9f)
                horizontalLineTo(12f)
                verticalLineTo(10f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                close()
            }
        }.build()

        return _MagnifyMinusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _MagnifyMinusOutline: ImageVector? = null
