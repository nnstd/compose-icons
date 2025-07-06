package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Water: ImageVector
    get() {
        if (_Water != null) {
            return _Water!!
        }
        _Water = ImageVector.Builder(
            name = "Water",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 14f)
                curveTo(6f, 10f, 12f, 3.25f, 12f, 3.25f)
                curveTo(12f, 3.25f, 18f, 10f, 18f, 14f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 20f)
                close()
            }
        }.build()

        return _Water!!
    }

@Suppress("ObjectPropertyName")
private var _Water: ImageVector? = null
