package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaW: ImageVector
    get() {
        if (_AlphaW != null) {
            return _AlphaW!!
        }
        _AlphaW = ImageVector.Builder(
            name = "AlphaW",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 17f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7f, 15f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(8f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(15f)
                verticalLineTo(7f)
                horizontalLineTo(17f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 17f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _AlphaW!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaW: ImageVector? = null
