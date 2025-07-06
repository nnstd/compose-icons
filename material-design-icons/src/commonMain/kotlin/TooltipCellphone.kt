package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TooltipCellphone: ImageVector
    get() {
        if (_TooltipCellphone != null) {
            return _TooltipCellphone!!
        }
        _TooltipCellphone = ImageVector.Builder(
            name = "TooltipCellphone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 6f)
                horizontalLineTo(15f)
                verticalLineTo(14f)
                horizontalLineTo(9f)
                verticalLineTo(6f)
                moveTo(22f, 4f)
                verticalLineTo(16f)
                curveTo(22f, 17.11f, 21.11f, 18f, 20f, 18f)
                horizontalLineTo(16f)
                lineTo(12f, 22f)
                lineTo(8f, 18f)
                horizontalLineTo(4f)
                curveTo(2.9f, 18f, 2f, 17.11f, 2f, 16f)
                verticalLineTo(4f)
                curveTo(2f, 2.9f, 2.9f, 2f, 4f, 2f)
                horizontalLineTo(20f)
                curveTo(21.11f, 2f, 22f, 2.9f, 22f, 4f)
                moveTo(16f, 5.09f)
                curveTo(16f, 4.5f, 15.5f, 4f, 14.86f, 4f)
                horizontalLineTo(9.14f)
                curveTo(8.5f, 4f, 8f, 4.5f, 8f, 5.09f)
                verticalLineTo(14.91f)
                curveTo(8f, 15.5f, 8.5f, 16f, 9.14f, 16f)
                horizontalLineTo(14.86f)
                curveTo(15.5f, 16f, 16f, 15.5f, 16f, 14.91f)
                verticalLineTo(5.09f)
                close()
            }
        }.build()

        return _TooltipCellphone!!
    }

@Suppress("ObjectPropertyName")
private var _TooltipCellphone: ImageVector? = null
