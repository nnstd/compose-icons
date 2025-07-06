package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaWBox: ImageVector
    get() {
        if (_AlphaWBox != null) {
            return _AlphaWBox!!
        }
        _AlphaWBox = ImageVector.Builder(
            name = "AlphaWBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 17f)
                horizontalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 17f, 15f)
                verticalLineTo(7f)
                horizontalLineTo(15f)
                verticalLineTo(15f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineTo(7f)
                verticalLineTo(15f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 17f)
                moveTo(5f, 3f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 5f, 3f)
                close()
            }
        }.build()

        return _AlphaWBox!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaWBox: ImageVector? = null
