package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlagVariantOff: ImageVector
    get() {
        if (_FlagVariantOff != null) {
            return _FlagVariantOff!!
        }
        _FlagVariantOff = ImageVector.Builder(
            name = "FlagVariantOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.8f, 22.7f)
                lineTo(10.2f, 12.1f)
                curveTo(7.8f, 12.4f, 7f, 14f, 7f, 14f)
                verticalLineTo(21f)
                horizontalLineTo(5f)
                verticalLineTo(6.9f)
                lineTo(1.1f, 3f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(20f, 12f)
                verticalLineTo(4f)
                curveTo(20f, 4f, 19f, 6f, 16f, 6f)
                curveTo(14f, 6f, 14f, 4f, 11f, 4f)
                curveTo(9.8f, 4f, 8.7f, 4.3f, 7.8f, 4.6f)
                lineTo(17.1f, 13.9f)
                curveTo(19.2f, 13.5f, 20f, 12f, 20f, 12f)
                close()
            }
        }.build()

        return _FlagVariantOff!!
    }

@Suppress("ObjectPropertyName")
private var _FlagVariantOff: ImageVector? = null
