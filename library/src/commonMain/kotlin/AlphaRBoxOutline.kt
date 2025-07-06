package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaRBoxOutline: ImageVector
    get() {
        if (_AlphaRBoxOutline != null) {
            return _AlphaRBoxOutline!!
        }
        _AlphaRBoxOutline = ImageVector.Builder(
            name = "AlphaRBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7f)
                horizontalLineTo(13f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 9f)
                verticalLineTo(11f)
                curveTo(15f, 11.84f, 14.5f, 12.55f, 13.76f, 12.85f)
                lineTo(15f, 17f)
                horizontalLineTo(13f)
                lineTo(11.8f, 13f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                moveTo(11f, 9f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
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

        return _AlphaRBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaRBoxOutline: ImageVector? = null
