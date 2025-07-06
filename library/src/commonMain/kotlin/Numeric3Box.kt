package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Numeric3Box: ImageVector
    get() {
        if (_Numeric3Box != null) {
            return _Numeric3Box!!
        }
        _Numeric3Box = ImageVector.Builder(
            name = "Numeric3Box",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 10.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 13.5f, 12f)
                curveTo(14.34f, 12f, 15f, 12.67f, 15f, 13.5f)
                verticalLineTo(15f)
                curveTo(15f, 16.11f, 14.11f, 17f, 13f, 17f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                curveTo(14.11f, 7f, 15f, 7.89f, 15f, 9f)
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.91f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.1f, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                close()
            }
        }.build()

        return _Numeric3Box!!
    }

@Suppress("ObjectPropertyName")
private var _Numeric3Box: ImageVector? = null
