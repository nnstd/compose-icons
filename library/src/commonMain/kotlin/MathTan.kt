package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MathTan: ImageVector
    get() {
        if (_MathTan != null) {
            return _MathTan!!
        }
        _MathTan = ImageVector.Builder(
            name = "MathTan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(4f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(2f)
                moveTo(11f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 9f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(17f)
                horizontalLineTo(15f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13f, 7f)
                horizontalLineTo(11f)
                moveTo(11f, 9f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                moveTo(16f, 7f)
                verticalLineTo(17f)
                horizontalLineTo(18f)
                verticalLineTo(12f)
                lineTo(20f, 17f)
                horizontalLineTo(22f)
                verticalLineTo(7f)
                horizontalLineTo(20f)
                verticalLineTo(12f)
                lineTo(18f, 7f)
                horizontalLineTo(16f)
                close()
            }
        }.build()

        return _MathTan!!
    }

@Suppress("ObjectPropertyName")
private var _MathTan: ImageVector? = null
