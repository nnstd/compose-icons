package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Numeric7Box: ImageVector
    get() {
        if (_Numeric7Box != null) {
            return _Numeric7Box!!
        }
        _Numeric7Box = ImageVector.Builder(
            name = "Numeric7Box",
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
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(19f)
                moveTo(11f, 17f)
                lineTo(15f, 9f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                lineTo(9f, 17f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _Numeric7Box!!
    }

@Suppress("ObjectPropertyName")
private var _Numeric7Box: ImageVector? = null
