package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowRightBoldBox: ImageVector
    get() {
        if (_ArrowRightBoldBox != null) {
            return _ArrowRightBoldBox!!
        }
        _ArrowRightBoldBox = ImageVector.Builder(
            name = "ArrowRightBoldBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                moveTo(17f, 12f)
                lineTo(12f, 7f)
                verticalLineTo(10f)
                horizontalLineTo(8f)
                verticalLineTo(14f)
                horizontalLineTo(12f)
                verticalLineTo(17f)
                lineTo(17f, 12f)
                close()
            }
        }.build()

        return _ArrowRightBoldBox!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightBoldBox: ImageVector? = null
