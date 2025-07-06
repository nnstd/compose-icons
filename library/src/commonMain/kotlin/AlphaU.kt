package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaU: ImageVector
    get() {
        if (_AlphaU != null) {
            return _AlphaU!!
        }
        _AlphaU = ImageVector.Builder(
            name = "AlphaU",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11f, 17f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 15f)
                verticalLineTo(7f)
                horizontalLineTo(13f)
                verticalLineTo(15f)
                horizontalLineTo(11f)
                verticalLineTo(7f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _AlphaU!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaU: ImageVector? = null
