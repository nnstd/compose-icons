package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowUpBoldBox: ImageVector
    get() {
        if (_ArrowUpBoldBox != null) {
            return _ArrowUpBoldBox!!
        }
        _ArrowUpBoldBox = ImageVector.Builder(
            name = "ArrowUpBoldBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                moveTo(12f, 7f)
                lineTo(7f, 12f)
                horizontalLineTo(10f)
                verticalLineTo(16f)
                horizontalLineTo(14f)
                verticalLineTo(12f)
                horizontalLineTo(17f)
                lineTo(12f, 7f)
                close()
            }
        }.build()

        return _ArrowUpBoldBox!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpBoldBox: ImageVector? = null
