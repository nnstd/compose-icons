package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RayStartArrow: ImageVector
    get() {
        if (_RayStartArrow != null) {
            return _RayStartArrow!!
        }
        _RayStartArrow = ImageVector.Builder(
            name = "RayStartArrow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 12f)
                lineTo(19f, 16f)
                verticalLineTo(13f)
                horizontalLineTo(6.83f)
                curveTo(6.42f, 14.17f, 5.31f, 15f, 4f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 9f)
                curveTo(5.31f, 9f, 6.42f, 9.83f, 6.83f, 11f)
                horizontalLineTo(19f)
                verticalLineTo(8f)
                lineTo(23f, 12f)
                close()
            }
        }.build()

        return _RayStartArrow!!
    }

@Suppress("ObjectPropertyName")
private var _RayStartArrow: ImageVector? = null
