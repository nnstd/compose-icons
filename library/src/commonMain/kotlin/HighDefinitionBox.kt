package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HighDefinitionBox: ImageVector
    get() {
        if (_HighDefinitionBox != null) {
            return _HighDefinitionBox!!
        }
        _HighDefinitionBox = ImageVector.Builder(
            name = "HighDefinitionBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.9f, 3f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 21f)
                horizontalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 21f, 19f)
                verticalLineTo(5f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19f, 3f)
                moveTo(11f, 15f)
                horizontalLineTo(9.5f)
                verticalLineTo(13f)
                horizontalLineTo(7.5f)
                verticalLineTo(15f)
                horizontalLineTo(6f)
                verticalLineTo(9f)
                horizontalLineTo(7.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(15f)
                moveTo(13f, 9f)
                horizontalLineTo(17f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 10f)
                verticalLineTo(14f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17f, 15f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                moveTo(14.5f, 13.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(13.5f)
                close()
            }
        }.build()

        return _HighDefinitionBox!!
    }

@Suppress("ObjectPropertyName")
private var _HighDefinitionBox: ImageVector? = null
