package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaHBoxOutline: ImageVector
    get() {
        if (_AlphaHBoxOutline != null) {
            return _AlphaHBoxOutline!!
        }
        _AlphaHBoxOutline = ImageVector.Builder(
            name = "AlphaHBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(13f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
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
                close()
            }
        }.build()

        return _AlphaHBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaHBoxOutline: ImageVector? = null
