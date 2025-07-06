package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MathSin: ImageVector
    get() {
        if (_MathSin != null) {
            return _MathSin!!
        }
        _MathSin = ImageVector.Builder(
            name = "MathSin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 9f)
                verticalLineTo(11f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 13f)
                horizontalLineTo(6f)
                verticalLineTo(15f)
                horizontalLineTo(2f)
                verticalLineTo(17f)
                horizontalLineTo(6f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 15f)
                verticalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 6f, 11f)
                horizontalLineTo(4f)
                verticalLineTo(9f)
                horizontalLineTo(8f)
                verticalLineTo(7f)
                horizontalLineTo(4f)
                moveTo(14f, 7f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(9f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                horizontalLineTo(14f)
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

        return _MathSin!!
    }

@Suppress("ObjectPropertyName")
private var _MathSin: ImageVector? = null
