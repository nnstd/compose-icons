package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Numeric7Circle: ImageVector
    get() {
        if (_Numeric7Circle != null) {
            return _Numeric7Circle!!
        }
        _Numeric7Circle = ImageVector.Builder(
            name = "Numeric7Circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 17f)
                lineTo(15f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                lineTo(9f, 17f)
                horizontalLineTo(11f)
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                close()
            }
        }.build()

        return _Numeric7Circle!!
    }

@Suppress("ObjectPropertyName")
private var _Numeric7Circle: ImageVector? = null
