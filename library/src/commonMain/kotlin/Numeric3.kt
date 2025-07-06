package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Numeric3: ImageVector
    get() {
        if (_Numeric3 != null) {
            return _Numeric3!!
        }
        _Numeric3 = ImageVector.Builder(
            name = "Numeric3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 15f)
                verticalLineTo(13.5f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 13.5f, 12f)
                arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 10.5f)
                verticalLineTo(9f)
                curveTo(15f, 7.89f, 14.1f, 7f, 13f, 7f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 15f)
            }
        }.build()

        return _Numeric3!!
    }

@Suppress("ObjectPropertyName")
private var _Numeric3: ImageVector? = null
