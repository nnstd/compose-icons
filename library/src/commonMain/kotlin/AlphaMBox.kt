package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AlphaMBox: ImageVector
    get() {
        if (_AlphaMBox != null) {
            return _AlphaMBox!!
        }
        _AlphaMBox = ImageVector.Builder(
            name = "AlphaMBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7f, 9f)
                verticalLineTo(17f)
                horizontalLineTo(9f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(16f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(15f)
                verticalLineTo(17f)
                horizontalLineTo(17f)
                verticalLineTo(9f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 7f)
                horizontalLineTo(9f)
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

        return _AlphaMBox!!
    }

@Suppress("ObjectPropertyName")
private var _AlphaMBox: ImageVector? = null
