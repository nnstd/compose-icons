package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TooltipRemoveOutline: ImageVector
    get() {
        if (_TooltipRemoveOutline != null) {
            return _TooltipRemoveOutline!!
        }
        _TooltipRemoveOutline = ImageVector.Builder(
            name = "TooltipRemoveOutline",
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
                moveTo(8.46f, 12.12f)
                lineTo(10.59f, 10f)
                lineTo(8.46f, 7.88f)
                lineTo(9.88f, 6.47f)
                lineTo(12f, 8.59f)
                lineTo(14.12f, 6.47f)
                lineTo(15.54f, 7.88f)
                lineTo(13.41f, 10f)
                lineTo(15.54f, 12.12f)
                lineTo(14.12f, 13.54f)
                lineTo(12f, 11.41f)
                lineTo(9.88f, 13.54f)
                lineTo(8.46f, 12.12f)
                close()
            }
        }.build()

        return _TooltipRemoveOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TooltipRemoveOutline: ImageVector? = null
