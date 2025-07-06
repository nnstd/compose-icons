package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Watch: ImageVector
    get() {
        if (_Watch != null) {
            return _Watch!!
        }
        _Watch = ImageVector.Builder(
            name = "Watch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 6f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 18f, 12f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 18f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6f, 12f)
                moveTo(20f, 12f)
                curveTo(20f, 9.45f, 18.81f, 7.19f, 16.95f, 5.73f)
                lineTo(16f, 0f)
                horizontalLineTo(8f)
                lineTo(7.05f, 5.73f)
                curveTo(5.19f, 7.19f, 4f, 9.45f, 4f, 12f)
                curveTo(4f, 14.54f, 5.19f, 16.81f, 7.05f, 18.27f)
                lineTo(8f, 24f)
                horizontalLineTo(16f)
                lineTo(16.95f, 18.27f)
                curveTo(18.81f, 16.81f, 20f, 14.54f, 20f, 12f)
                close()
            }
        }.build()

        return _Watch!!
    }

@Suppress("ObjectPropertyName")
private var _Watch: ImageVector? = null
