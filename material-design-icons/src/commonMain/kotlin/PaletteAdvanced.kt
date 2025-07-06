package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PaletteAdvanced: ImageVector
    get() {
        if (_PaletteAdvanced != null) {
            return _PaletteAdvanced!!
        }
        _PaletteAdvanced = ImageVector.Builder(
            name = "PaletteAdvanced",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 22f)
                horizontalLineTo(10f)
                verticalLineTo(20f)
                horizontalLineTo(22f)
                verticalLineTo(22f)
                moveTo(2f, 22f)
                verticalLineTo(20f)
                horizontalLineTo(9f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                moveTo(18f, 18f)
                verticalLineTo(10f)
                horizontalLineTo(22f)
                verticalLineTo(18f)
                horizontalLineTo(18f)
                moveTo(18f, 3f)
                horizontalLineTo(22f)
                verticalLineTo(9f)
                horizontalLineTo(18f)
                verticalLineTo(3f)
                moveTo(2f, 18f)
                verticalLineTo(3f)
                horizontalLineTo(16f)
                verticalLineTo(18f)
                horizontalLineTo(2f)
                moveTo(9f, 14.56f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 11.56f)
                curveTo(12f, 9.56f, 9f, 6.19f, 9f, 6.19f)
                curveTo(9f, 6.19f, 6f, 9.56f, 6f, 11.56f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 9f, 14.56f)
                close()
            }
        }.build()

        return _PaletteAdvanced!!
    }

@Suppress("ObjectPropertyName")
private var _PaletteAdvanced: ImageVector? = null
