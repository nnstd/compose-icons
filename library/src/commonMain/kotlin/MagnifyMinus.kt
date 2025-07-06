package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MagnifyMinus: ImageVector
    get() {
        if (_MagnifyMinus != null) {
            return _MagnifyMinus!!
        }
        _MagnifyMinus = ImageVector.Builder(
            name = "MagnifyMinus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 2f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 9f)
                curveTo(16f, 10.57f, 15.5f, 12f, 14.61f, 13.19f)
                lineTo(15.41f, 14f)
                horizontalLineTo(16f)
                lineTo(22f, 20f)
                lineTo(20f, 22f)
                lineTo(14f, 16f)
                verticalLineTo(15.41f)
                lineTo(13.19f, 14.61f)
                curveTo(12f, 15.5f, 10.57f, 16f, 9f, 16f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 9f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 2f)
                moveTo(5f, 8f)
                verticalLineTo(10f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _MagnifyMinus!!
    }

@Suppress("ObjectPropertyName")
private var _MagnifyMinus: ImageVector? = null
