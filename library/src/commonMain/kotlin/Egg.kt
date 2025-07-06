package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Egg: ImageVector
    get() {
        if (_Egg != null) {
            return _Egg!!
        }
        _Egg = ImageVector.Builder(
            name = "Egg",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 14.5f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                arcTo(7.5f, 7.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.5f, 14.5f)
                curveTo(4.5f, 10.36f, 7.86f, 2f, 12f, 2f)
                curveTo(16.14f, 2f, 19.5f, 10.36f, 19.5f, 14.5f)
                close()
            }
        }.build()

        return _Egg!!
    }

@Suppress("ObjectPropertyName")
private var _Egg: ImageVector? = null
