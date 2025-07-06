package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowLeftBox: ImageVector
    get() {
        if (_ArrowLeftBox != null) {
            return _ArrowLeftBox!!
        }
        _ArrowLeftBox = ImageVector.Builder(
            name = "ArrowLeftBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.89f, 3.9f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                moveTo(18f, 11f)
                horizontalLineTo(9.5f)
                lineTo(13f, 7.5f)
                lineTo(11.58f, 6.08f)
                lineTo(5.66f, 12f)
                lineTo(11.58f, 17.92f)
                lineTo(13f, 16.5f)
                lineTo(9.5f, 13f)
                horizontalLineTo(18f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _ArrowLeftBox!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeftBox: ImageVector? = null
