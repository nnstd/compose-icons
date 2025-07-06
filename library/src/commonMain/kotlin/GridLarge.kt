package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GridLarge: ImageVector
    get() {
        if (_GridLarge != null) {
            return _GridLarge!!
        }
        _GridLarge = ImageVector.Builder(
            name = "GridLarge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4f)
                verticalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 22f)
                horizontalLineTo(4f)
                curveTo(2.92f, 22f, 2f, 21.1f, 2f, 20f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 2f)
                moveTo(4f, 4f)
                verticalLineTo(11f)
                horizontalLineTo(11f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                moveTo(4f, 20f)
                horizontalLineTo(11f)
                verticalLineTo(13f)
                horizontalLineTo(4f)
                verticalLineTo(20f)
                moveTo(20f, 20f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(20f)
                horizontalLineTo(20f)
                moveTo(20f, 4f)
                horizontalLineTo(13f)
                verticalLineTo(11f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _GridLarge!!
    }

@Suppress("ObjectPropertyName")
private var _GridLarge: ImageVector? = null
