package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MoonWaningGibbous: ImageVector
    get() {
        if (_MoonWaningGibbous != null) {
            return _MoonWaningGibbous!!
        }
        _MoonWaningGibbous = ImageVector.Builder(
            name = "MoonWaningGibbous",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 12f)
                curveTo(18f, 7.5f, 16.08f, 3.26f, 12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                curveTo(16.08f, 20.74f, 18f, 16.5f, 18f, 12f)
                close()
            }
        }.build()

        return _MoonWaningGibbous!!
    }

@Suppress("ObjectPropertyName")
private var _MoonWaningGibbous: ImageVector? = null
