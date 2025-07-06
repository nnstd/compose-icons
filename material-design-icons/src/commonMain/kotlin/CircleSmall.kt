package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CircleSmall: ImageVector
    get() {
        if (_CircleSmall != null) {
            return _CircleSmall!!
        }
        _CircleSmall = ImageVector.Builder(
            name = "CircleSmall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 10f, 12f)
                curveTo(10f, 13.11f, 10.9f, 14f, 12f, 14f)
                curveTo(13.11f, 14f, 14f, 13.11f, 14f, 12f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 10f)
                close()
            }
        }.build()

        return _CircleSmall!!
    }

@Suppress("ObjectPropertyName")
private var _CircleSmall: ImageVector? = null
