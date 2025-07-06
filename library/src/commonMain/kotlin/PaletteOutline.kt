package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PaletteOutline: ImageVector
    get() {
        if (_PaletteOutline != null) {
            return _PaletteOutline!!
        }
        _PaletteOutline = ImageVector.Builder(
            name = "PaletteOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 22f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 2f)
                curveTo(17.5f, 2f, 22f, 6f, 22f, 11f)
                arcTo(6f, 6f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 17f)
                horizontalLineTo(14.2f)
                curveTo(13.9f, 17f, 13.7f, 17.2f, 13.7f, 17.5f)
                curveTo(13.7f, 17.6f, 13.8f, 17.7f, 13.8f, 17.8f)
                curveTo(14.2f, 18.3f, 14.4f, 18.9f, 14.4f, 19.5f)
                curveTo(14.5f, 20.9f, 13.4f, 22f, 12f, 22f)
                moveTo(12f, 4f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 12f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 20f)
                curveTo(12.3f, 20f, 12.5f, 19.8f, 12.5f, 19.5f)
                curveTo(12.5f, 19.3f, 12.4f, 19.2f, 12.4f, 19.1f)
                curveTo(12f, 18.6f, 11.8f, 18.1f, 11.8f, 17.5f)
                curveTo(11.8f, 16.1f, 12.9f, 15f, 14.3f, 15f)
                horizontalLineTo(16f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 11f)
                curveTo(20f, 7.1f, 16.4f, 4f, 12f, 4f)
                moveTo(6.5f, 10f)
                curveTo(7.3f, 10f, 8f, 10.7f, 8f, 11.5f)
                curveTo(8f, 12.3f, 7.3f, 13f, 6.5f, 13f)
                curveTo(5.7f, 13f, 5f, 12.3f, 5f, 11.5f)
                curveTo(5f, 10.7f, 5.7f, 10f, 6.5f, 10f)
                moveTo(9.5f, 6f)
                curveTo(10.3f, 6f, 11f, 6.7f, 11f, 7.5f)
                curveTo(11f, 8.3f, 10.3f, 9f, 9.5f, 9f)
                curveTo(8.7f, 9f, 8f, 8.3f, 8f, 7.5f)
                curveTo(8f, 6.7f, 8.7f, 6f, 9.5f, 6f)
                moveTo(14.5f, 6f)
                curveTo(15.3f, 6f, 16f, 6.7f, 16f, 7.5f)
                curveTo(16f, 8.3f, 15.3f, 9f, 14.5f, 9f)
                curveTo(13.7f, 9f, 13f, 8.3f, 13f, 7.5f)
                curveTo(13f, 6.7f, 13.7f, 6f, 14.5f, 6f)
                moveTo(17.5f, 10f)
                curveTo(18.3f, 10f, 19f, 10.7f, 19f, 11.5f)
                curveTo(19f, 12.3f, 18.3f, 13f, 17.5f, 13f)
                curveTo(16.7f, 13f, 16f, 12.3f, 16f, 11.5f)
                curveTo(16f, 10.7f, 16.7f, 10f, 17.5f, 10f)
                close()
            }
        }.build()

        return _PaletteOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PaletteOutline: ImageVector? = null
