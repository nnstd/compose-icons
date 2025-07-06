package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Tree: ImageVector
    get() {
        if (_Tree != null) {
            return _Tree!!
        }
        _Tree = ImageVector.Builder(
            name = "Tree",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 21f)
                verticalLineTo(16.74f)
                curveTo(10.53f, 16.91f, 10.03f, 17f, 9.5f, 17f)
                curveTo(7f, 17f, 5f, 15f, 5f, 12.5f)
                curveTo(5f, 11.23f, 5.5f, 10.09f, 6.36f, 9.27f)
                curveTo(6.13f, 8.73f, 6f, 8.13f, 6f, 7.5f)
                curveTo(6f, 5f, 8f, 3f, 10.5f, 3f)
                curveTo(12.06f, 3f, 13.44f, 3.8f, 14.25f, 5f)
                curveTo(14.33f, 5f, 14.41f, 5f, 14.5f, 5f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 10.5f)
                arcTo(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 14.5f, 16f)
                curveTo(14f, 16f, 13.5f, 15.93f, 13f, 15.79f)
                verticalLineTo(21f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _Tree!!
    }

@Suppress("ObjectPropertyName")
private var _Tree: ImageVector? = null
