package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MoonWaningCrescent: ImageVector
    get() {
        if (_MoonWaningCrescent != null) {
            return _MoonWaningCrescent!!
        }
        _MoonWaningCrescent = ImageVector.Builder(
            name = "MoonWaningCrescent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 15f, 21.54f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 15f, 2.46f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 12f)
                close()
            }
        }.build()

        return _MoonWaningCrescent!!
    }

@Suppress("ObjectPropertyName")
private var _MoonWaningCrescent: ImageVector? = null
