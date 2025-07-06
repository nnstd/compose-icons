package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EqualBox: ImageVector
    get() {
        if (_EqualBox != null) {
            return _EqualBox!!
        }
        _EqualBox = ImageVector.Builder(
            name = "EqualBox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 16f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(16f)
                horizontalLineTo(17f)
                moveTo(19f, 3f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 21f, 5f)
                verticalLineTo(19f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 19f, 21f)
                horizontalLineTo(5f)
                curveTo(3.89f, 21f, 3f, 20.1f, 3f, 19f)
                verticalLineTo(5f)
                curveTo(3f, 3.89f, 3.89f, 3f, 5f, 3f)
                horizontalLineTo(19f)
                moveTo(17f, 10f)
                verticalLineTo(8f)
                horizontalLineTo(7f)
                verticalLineTo(10f)
                horizontalLineTo(17f)
                close()
            }
        }.build()

        return _EqualBox!!
    }

@Suppress("ObjectPropertyName")
private var _EqualBox: ImageVector? = null
