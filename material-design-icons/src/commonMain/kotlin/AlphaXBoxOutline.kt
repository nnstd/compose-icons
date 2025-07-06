package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaXBoxOutline: ImageVector
    get() {
        if (_AlphaXBoxOutline != null) {
            return _AlphaXBoxOutline!!
        }
        _AlphaXBoxOutline = ImageVector.Builder(
            name = "AlphaXBoxOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7f)
                horizontalLineTo(11f)
                lineTo(12f, 9.5f)
                lineTo(13f, 7f)
                horizontalLineTo(15f)
                lineTo(13f, 12f)
                lineTo(15f, 17f)
                horizontalLineTo(13f)
                lineTo(12f, 14.5f)
                lineTo(11f, 17f)
                horizontalLineTo(9f)
                lineTo(11f, 12f)
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

        return _AlphaXBoxOutline!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaXBoxOutline: ImageVector? = null
