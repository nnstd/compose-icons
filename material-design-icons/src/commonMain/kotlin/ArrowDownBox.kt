package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowDownBox: ImageVector
    get() {
        if (_ArrowDownBox != null) {
            return _ArrowDownBox!!
        }
        _ArrowDownBox = ImageVector.Builder(
            name = "ArrowDownBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.89f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                moveTo(11f, 6f)
                verticalLineTo(14.5f)
                lineTo(7.5f, 11f)
                lineTo(6.08f, 12.42f)
                lineTo(12f, 18.34f)
                lineTo(17.92f, 12.42f)
                lineTo(16.5f, 11f)
                lineTo(13f, 14.5f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _ArrowDownBox!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownBox: ImageVector? = null
