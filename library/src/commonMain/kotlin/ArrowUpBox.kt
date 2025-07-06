package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowUpBox: ImageVector
    get() {
        if (_ArrowUpBox != null) {
            return _ArrowUpBox!!
        }
        _ArrowUpBox = ImageVector.Builder(
            name = "ArrowUpBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(19f)
                curveTo(20.11f, 3f, 21f, 3.9f, 21f, 5f)
                verticalLineTo(19f)
                moveTo(13f, 18f)
                verticalLineTo(9.5f)
                lineTo(16.5f, 13f)
                lineTo(17.92f, 11.58f)
                lineTo(12f, 5.66f)
                lineTo(6.08f, 11.58f)
                lineTo(7.5f, 13f)
                lineTo(11f, 9.5f)
                verticalLineTo(18f)
                horizontalLineTo(13f)
                close()
            }
        }.build()

        return _ArrowUpBox!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpBox: ImageVector? = null
