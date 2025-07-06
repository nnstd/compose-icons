package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MoonFirstQuarter: ImageVector
    get() {
        if (_MoonFirstQuarter != null) {
            return _MoonFirstQuarter!!
        }
        _MoonFirstQuarter = ImageVector.Builder(
            name = "MoonFirstQuarter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                verticalLineTo(22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                close()
            }
        }.build()

        return _MoonFirstQuarter!!
    }

@Suppress("ObjectPropertyName")
private var _MoonFirstQuarter: ImageVector? = null
