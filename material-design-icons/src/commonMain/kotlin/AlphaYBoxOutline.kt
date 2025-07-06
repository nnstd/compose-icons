package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaYBoxOutline: ImageVector
    get() {
        if (_AlphaYBoxOutline != null) {
            return _AlphaYBoxOutline!!
        }
        _AlphaYBoxOutline = ImageVector.Builder(
            name = "AlphaYBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7f)
                horizontalLineTo(11f)
                lineTo(12f, 10f)
                lineTo(13f, 7f)
                horizontalLineTo(15f)
                lineTo(13f, 13f)
                verticalLineTo(17f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                lineTo(9f, 7f)
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                moveTo(5f, 5f)
                verticalLineTo(19f)
                horizontalLineTo(19f)
                verticalLineTo(5f)
                horizontalLineTo(5f)
                close()
            }
        }.build()

        return _AlphaYBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaYBoxOutline: ImageVector? = null
