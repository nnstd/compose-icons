package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TooltipCheckOutline: ImageVector
    get() {
        if (_TooltipCheckOutline != null) {
            return _TooltipCheckOutline!!
        }
        _TooltipCheckOutline = ImageVector.Builder(
            name = "TooltipCheckOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveTo(2.9f, 2f, 2f, 2.9f, 2f, 4f)
                verticalLineTo(16f)
                curveTo(2f, 17.11f, 2.9f, 18f, 4f, 18f)
                horizontalLineTo(8f)
                lineTo(12f, 22f)
                lineTo(16f, 18f)
                horizontalLineTo(20f)
                curveTo(21.11f, 18f, 22f, 17.11f, 22f, 16f)
                verticalLineTo(4f)
                curveTo(22f, 2.9f, 21.11f, 2f, 20f, 2f)
                moveTo(20f, 16f)
                horizontalLineTo(15.17f)
                lineTo(12f, 19.17f)
                lineTo(8.83f, 16f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineTo(20f)
                verticalLineTo(16f)
                moveTo(10.75f, 13.71f)
                lineTo(7.25f, 10.21f)
                lineTo(8.66f, 8.79f)
                lineTo(10.75f, 10.88f)
                lineTo(15.34f, 6.3f)
                lineTo(16.75f, 7.71f)
                lineTo(10.75f, 13.71f)
                close()
            }
        }.build()

        return _TooltipCheckOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TooltipCheckOutline: ImageVector? = null
