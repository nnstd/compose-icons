package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldHalfFull: ImageVector
    get() {
        if (_ShieldHalfFull != null) {
            return _ShieldHalfFull!!
        }
        _ShieldHalfFull = ImageVector.Builder(
            name = "ShieldHalfFull",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 11f)
                curveTo(21f, 16.55f, 17.16f, 21.74f, 12f, 23f)
                curveTo(6.84f, 21.74f, 3f, 16.55f, 3f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                lineTo(21f, 5f)
                verticalLineTo(11f)
                moveTo(12f, 21f)
                curveTo(15.75f, 20f, 19f, 15.54f, 19f, 11.22f)
                verticalLineTo(6.3f)
                lineTo(12f, 3.18f)
                verticalLineTo(21f)
                close()
            }
        }.build()

        return _ShieldHalfFull!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldHalfFull: ImageVector? = null
