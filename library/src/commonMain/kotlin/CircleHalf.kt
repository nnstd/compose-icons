package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CircleHalf: ImageVector
    get() {
        if (_CircleHalf != null) {
            return _CircleHalf!!
        }
        _CircleHalf = ImageVector.Builder(
            name = "CircleHalf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                verticalLineTo(2f)
                close()
            }
        }.build()

        return _CircleHalf!!
    }

@Suppress("ObjectPropertyName")
private var _CircleHalf: ImageVector? = null
