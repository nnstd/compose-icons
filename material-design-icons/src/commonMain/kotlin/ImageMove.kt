package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ImageMove: ImageVector
    get() {
        if (_ImageMove != null) {
            return _ImageMove!!
        }
        _ImageMove = ImageVector.Builder(
            name = "ImageMove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 3f)
                horizontalLineTo(19f)
                verticalLineTo(0f)
                lineTo(24f, 5f)
                lineTo(19f, 10f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                moveTo(21f, 11.94f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(12.06f)
                curveTo(12f, 3.33f, 12f, 3.67f, 12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 12f)
                curveTo(20.33f, 12f, 20.67f, 12f, 21f, 11.94f)
                moveTo(19f, 18f)
                lineTo(14.5f, 12f)
                lineTo(11f, 16.5f)
                lineTo(8.5f, 13.5f)
                lineTo(5f, 18f)
                horizontalLineTo(19f)
                close()
            }
        }.build()

        return _ImageMove!!
    }

@Suppress("ObjectPropertyName")
private var _ImageMove: ImageVector? = null
