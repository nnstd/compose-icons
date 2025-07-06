package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MagnifyClose: ImageVector
    get() {
        if (_MagnifyClose != null) {
            return _MagnifyClose!!
        }
        _MagnifyClose = ImageVector.Builder(
            name = "MagnifyClose",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 2f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 9f)
                curveTo(16f, 10.5f, 15.5f, 12f, 14.61f, 13.19f)
                lineTo(15.41f, 14f)
                horizontalLineTo(16f)
                lineTo(22f, 20f)
                lineTo(20f, 22f)
                lineTo(14f, 16f)
                verticalLineTo(15.41f)
                lineTo(13.19f, 14.61f)
                curveTo(12f, 15.5f, 10.5f, 16f, 9f, 16f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 9f)
                arcTo(7f, 7f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 2f)
                moveTo(11.12f, 5.46f)
                lineTo(9f, 7.59f)
                lineTo(6.88f, 5.46f)
                lineTo(5.46f, 6.88f)
                lineTo(7.59f, 9f)
                lineTo(5.46f, 11.12f)
                lineTo(6.88f, 12.54f)
                lineTo(9f, 10.41f)
                lineTo(11.12f, 12.54f)
                lineTo(12.54f, 11.12f)
                lineTo(10.41f, 9f)
                lineTo(12.54f, 6.88f)
                lineTo(11.12f, 5.46f)
                close()
            }
        }.build()

        return _MagnifyClose!!
    }

@Suppress("ObjectPropertyName")
private var _MagnifyClose: ImageVector? = null
