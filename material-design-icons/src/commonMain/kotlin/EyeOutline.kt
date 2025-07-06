package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EyeOutline: ImageVector
    get() {
        if (_EyeOutline != null) {
            return _EyeOutline!!
        }
        _EyeOutline = ImageVector.Builder(
            name = "EyeOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 9f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 9f)
                moveTo(12f, 4.5f)
                curveTo(17f, 4.5f, 21.27f, 7.61f, 23f, 12f)
                curveTo(21.27f, 16.39f, 17f, 19.5f, 12f, 19.5f)
                curveTo(7f, 19.5f, 2.73f, 16.39f, 1f, 12f)
                curveTo(2.73f, 7.61f, 7f, 4.5f, 12f, 4.5f)
                moveTo(3.18f, 12f)
                curveTo(4.83f, 15.36f, 8.24f, 17.5f, 12f, 17.5f)
                curveTo(15.76f, 17.5f, 19.17f, 15.36f, 20.82f, 12f)
                curveTo(19.17f, 8.64f, 15.76f, 6.5f, 12f, 6.5f)
                curveTo(8.24f, 6.5f, 4.83f, 8.64f, 3.18f, 12f)
                close()
            }
        }.build()

        return _EyeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EyeOutline: ImageVector? = null
