package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PaletteSwatchVariant: ImageVector
    get() {
        if (_PaletteSwatchVariant != null) {
            return _PaletteSwatchVariant!!
        }
        _PaletteSwatchVariant = ImageVector.Builder(
            name = "PaletteSwatchVariant",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 14f)
                horizontalLineTo(6f)
                curveTo(3.8f, 14f, 2f, 15.8f, 2f, 18f)
                reflectiveCurveTo(3.8f, 22f, 6f, 22f)
                horizontalLineTo(20f)
                curveTo(21.1f, 22f, 22f, 21.1f, 22f, 20f)
                verticalLineTo(16f)
                curveTo(22f, 14.9f, 21.1f, 14f, 20f, 14f)
                moveTo(6f, 20f)
                curveTo(4.9f, 20f, 4f, 19.1f, 4f, 18f)
                reflectiveCurveTo(4.9f, 16f, 6f, 16f)
                reflectiveCurveTo(8f, 16.9f, 8f, 18f)
                reflectiveCurveTo(7.1f, 20f, 6f, 20f)
                moveTo(6.3f, 12f)
                lineTo(13f, 5.3f)
                curveTo(13.8f, 4.5f, 15f, 4.5f, 15.8f, 5.3f)
                lineTo(18.6f, 8.1f)
                curveTo(19.4f, 8.9f, 19.4f, 10.1f, 18.6f, 10.9f)
                lineTo(17.7f, 12f)
                horizontalLineTo(6.3f)
                moveTo(2f, 13.5f)
                verticalLineTo(4f)
                curveTo(2f, 2.9f, 2.9f, 2f, 4f, 2f)
                horizontalLineTo(8f)
                curveTo(9.1f, 2f, 10f, 2.9f, 10f, 4f)
                verticalLineTo(5.5f)
                lineTo(2f, 13.5f)
                close()
            }
        }.build()

        return _PaletteSwatchVariant!!
    }

@Suppress("ObjectPropertyName")
private var _PaletteSwatchVariant: ImageVector? = null
