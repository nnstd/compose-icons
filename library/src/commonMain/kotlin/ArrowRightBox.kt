package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowRightBox: ImageVector
    get() {
        if (_ArrowRightBox != null) {
            return _ArrowRightBox!!
        }
        _ArrowRightBox = ImageVector.Builder(
            name = "ArrowRightBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 21f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                curveTo(21f, 20.11f, 20.1f, 21f, 19f, 21f)
                horizontalLineTo(5f)
                moveTo(6f, 13f)
                horizontalLineTo(14.5f)
                lineTo(11f, 16.5f)
                lineTo(12.42f, 17.92f)
                lineTo(18.34f, 12f)
                lineTo(12.42f, 6.08f)
                lineTo(11f, 7.5f)
                lineTo(14.5f, 11f)
                horizontalLineTo(6f)
                verticalLineTo(13f)
                close()
            }
        }.build()

        return _ArrowRightBox!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightBox: ImageVector? = null
