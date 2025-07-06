package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TooltipPlusOutline: ImageVector
    get() {
        if (_TooltipPlusOutline != null) {
            return _TooltipPlusOutline!!
        }
        _TooltipPlusOutline = ImageVector.Builder(
            name = "TooltipPlusOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 2f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 22f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 20f, 18f)
                horizontalLineTo(16f)
                lineTo(12f, 22f)
                lineTo(8f, 18f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2f, 16f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4f, 2f)
                moveTo(4f, 4f)
                verticalLineTo(16f)
                horizontalLineTo(8.83f)
                lineTo(12f, 19.17f)
                lineTo(15.17f, 16f)
                horizontalLineTo(20f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                moveTo(11f, 6f)
                horizontalLineTo(13f)
                verticalLineTo(9f)
                horizontalLineTo(16f)
                verticalLineTo(11f)
                horizontalLineTo(13f)
                verticalLineTo(14f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(8f)
                verticalLineTo(9f)
                horizontalLineTo(11f)
                verticalLineTo(6f)
                close()
            }
        }.build()

        return _TooltipPlusOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TooltipPlusOutline: ImageVector? = null
