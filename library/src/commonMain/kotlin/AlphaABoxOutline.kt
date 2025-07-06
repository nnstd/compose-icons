package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaABoxOutline: ImageVector
    get() {
        if (_AlphaABoxOutline != null) {
            return _AlphaABoxOutline!!
        }
        _AlphaABoxOutline = ImageVector.Builder(
            name = "AlphaABoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3f, 5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.89f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                moveTo(5f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                moveTo(11f, 7f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 9f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11f, 7f)
                moveTo(11f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _AlphaABoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaABoxOutline: ImageVector? = null
