package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlagVariantOffOutline: ImageVector
    get() {
        if (_FlagVariantOffOutline != null) {
            return _FlagVariantOffOutline!!
        }
        _FlagVariantOffOutline = ImageVector.Builder(
            name = "FlagVariantOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3f)
                lineTo(5f, 6.9f)
                verticalLineTo(21f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                curveTo(7f, 14f, 7.8f, 12.4f, 10.2f, 12.1f)
                lineTo(20.9f, 22.8f)
                lineTo(22.1f, 21.5f)
                moveTo(7f, 11.5f)
                verticalLineTo(8.9f)
                lineTo(8.7f, 10.6f)
                curveTo(7.7f, 11f, 7f, 11.5f, 7f, 11.5f)
                moveTo(9.4f, 6.2f)
                lineTo(7.8f, 4.6f)
                curveTo(8.7f, 4.3f, 9.8f, 4f, 11f, 4f)
                curveTo(14f, 4f, 14f, 6f, 16f, 6f)
                curveTo(19f, 6f, 20f, 4f, 20f, 4f)
                verticalLineTo(12f)
                curveTo(20f, 12f, 19.2f, 13.5f, 17.1f, 13.9f)
                lineTo(15f, 11.8f)
                curveTo(15.3f, 11.9f, 15.6f, 12f, 16f, 12f)
                curveTo(18f, 12f, 18f, 11f, 18f, 11f)
                verticalLineTo(7.5f)
                curveTo(18f, 7.5f, 17f, 8f, 16f, 8f)
                curveTo(14f, 8f, 13f, 6f, 11f, 6f)
                curveTo(10.5f, 6f, 9.9f, 6.1f, 9.4f, 6.2f)
                close()
            }
        }.build()

        return _FlagVariantOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FlagVariantOffOutline: ImageVector? = null
