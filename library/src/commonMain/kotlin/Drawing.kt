package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Drawing: ImageVector
    get() {
        if (_Drawing != null) {
            return _Drawing!!
        }
        _Drawing = ImageVector.Builder(
            name = "Drawing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.5f, 3f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14f, 8.5f)
                curveTo(14f, 9.83f, 13.53f, 11.05f, 12.74f, 12f)
                horizontalLineTo(21f)
                verticalLineTo(21f)
                horizontalLineTo(12f)
                verticalLineTo(12.74f)
                curveTo(11.05f, 13.53f, 9.83f, 14f, 8.5f, 14f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 8.5f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.5f, 3f)
                close()
            }
        }.build()

        return _Drawing!!
    }

@Suppress("ObjectPropertyName")
private var _Drawing: ImageVector? = null
