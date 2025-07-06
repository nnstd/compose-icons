package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.MoonWaxingCrescent: ImageVector
    get() {
        if (_MoonWaxingCrescent != null) {
            return _MoonWaxingCrescent!!
        }
        _MoonWaxingCrescent = ImageVector.Builder(
            name = "MoonWaxingCrescent",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                arcTo(9.91f, 9.91f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 2.46f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 9f, 21.54f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 12f, 2f)
                close()
            }
        }.build()

        return _MoonWaxingCrescent!!
    }

@Suppress("ObjectPropertyName")
private var _MoonWaxingCrescent: ImageVector? = null
