package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldHalf: ImageVector
    get() {
        if (_ShieldHalf != null) {
            return _ShieldHalf!!
        }
        _ShieldHalf = ImageVector.Builder(
            name = "ShieldHalf",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                lineTo(3f, 5f)
                verticalLineTo(11f)
                curveTo(3f, 16.5f, 6.8f, 21.7f, 12f, 23f)
                verticalLineTo(1f)
                close()
            }
        }.build()

        return _ShieldHalf!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldHalf: ImageVector? = null
