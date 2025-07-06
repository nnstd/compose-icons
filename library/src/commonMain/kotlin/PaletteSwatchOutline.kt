package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PaletteSwatchOutline: ImageVector
    get() {
        if (_PaletteSwatchOutline != null) {
            return _PaletteSwatchOutline!!
        }
        _PaletteSwatchOutline = ImageVector.Builder(
            name = "PaletteSwatchOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.5f, 19.6f)
                lineTo(3.8f, 20.2f)
                verticalLineTo(11.2f)
                lineTo(1.4f, 17f)
                curveTo(1f, 18.1f, 1.5f, 19.2f, 2.5f, 19.6f)
                moveTo(15.2f, 4.8f)
                lineTo(20.2f, 16.8f)
                lineTo(12.9f, 19.8f)
                lineTo(7.9f, 7.9f)
                verticalLineTo(7.8f)
                lineTo(15.2f, 4.8f)
                moveTo(15.3f, 2.8f)
                curveTo(15f, 2.8f, 14.8f, 2.8f, 14.5f, 2.9f)
                lineTo(7.1f, 6f)
                curveTo(6.4f, 6.3f, 5.9f, 7f, 5.9f, 7.8f)
                curveTo(5.9f, 8f, 5.9f, 8.3f, 6f, 8.6f)
                lineTo(11f, 20.5f)
                curveTo(11.3f, 21.3f, 12f, 21.7f, 12.8f, 21.7f)
                curveTo(13.1f, 21.7f, 13.3f, 21.7f, 13.6f, 21.6f)
                lineTo(21f, 18.5f)
                curveTo(22f, 18.1f, 22.5f, 16.9f, 22.1f, 15.9f)
                lineTo(17.1f, 4f)
                curveTo(16.8f, 3.2f, 16f, 2.8f, 15.3f, 2.8f)
                moveTo(10.5f, 9.9f)
                curveTo(9.9f, 9.9f, 9.5f, 9.5f, 9.5f, 8.9f)
                reflectiveCurveTo(9.9f, 7.9f, 10.5f, 7.9f)
                curveTo(11.1f, 7.9f, 11.5f, 8.4f, 11.5f, 8.9f)
                reflectiveCurveTo(11.1f, 9.9f, 10.5f, 9.9f)
                moveTo(5.9f, 19.8f)
                curveTo(5.9f, 20.9f, 6.8f, 21.8f, 7.9f, 21.8f)
                horizontalLineTo(9.3f)
                lineTo(5.9f, 13.5f)
                verticalLineTo(19.8f)
                close()
            }
        }.build()

        return _PaletteSwatchOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PaletteSwatchOutline: ImageVector? = null
