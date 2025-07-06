package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RayStart: ImageVector
    get() {
        if (_RayStart != null) {
            return _RayStart!!
        }
        _RayStart = ImageVector.Builder(
            name = "RayStart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 9f)
                curveTo(5.31f, 9f, 6.42f, 9.83f, 6.83f, 11f)
                horizontalLineTo(22f)
                verticalLineTo(13f)
                horizontalLineTo(6.83f)
                curveTo(6.42f, 14.17f, 5.31f, 15f, 4f, 15f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1f, 12f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 9f)
                close()
            }
        }.build()

        return _RayStart!!
    }

@Suppress("ObjectPropertyName")
private var _RayStart: ImageVector? = null
