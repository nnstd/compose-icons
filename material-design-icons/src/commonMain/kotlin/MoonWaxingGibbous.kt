package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MoonWaxingGibbous: ImageVector
    get() {
        if (_MoonWaxingGibbous != null) {
            return _MoonWaxingGibbous!!
        }
        _MoonWaxingGibbous = ImageVector.Builder(
            name = "MoonWaxingGibbous",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 12f)
                curveTo(6f, 7.5f, 7.93f, 3.26f, 12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 22f)
                curveTo(7.93f, 20.74f, 6f, 16.5f, 6f, 12f)
                close()
            }
        }.build()

        return _MoonWaxingGibbous!!
    }

@Suppress("ObjectPropertyName")
private var _MoonWaxingGibbous: ImageVector? = null
