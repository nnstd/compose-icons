package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaA: ImageVector
    get() {
        if (_AlphaA != null) {
            return _AlphaA!!
        }
        _AlphaA = ImageVector.Builder(
            name = "AlphaA",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
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
                close()
            }
        }.build()

        return _AlphaA!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaA: ImageVector? = null
