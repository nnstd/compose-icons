package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TooltipAccount: ImageVector
    get() {
        if (_TooltipAccount != null) {
            return _TooltipAccount!!
        }
        _TooltipAccount = ImageVector.Builder(
            name = "TooltipAccount",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2f, 4f)
                verticalLineTo(16f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 18f)
                horizontalLineTo(8f)
                lineTo(12f, 22f)
                lineTo(16f, 18f)
                horizontalLineTo(20f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 22f, 16f)
                verticalLineTo(4f)
                arcTo(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 20f, 2f)
                moveTo(12f, 4.3f)
                curveTo(13.5f, 4.3f, 14.7f, 5.5f, 14.7f, 7f)
                curveTo(14.7f, 8.5f, 13.5f, 9.7f, 12f, 9.7f)
                curveTo(10.5f, 9.7f, 9.3f, 8.5f, 9.3f, 7f)
                curveTo(9.3f, 5.5f, 10.5f, 4.3f, 12f, 4.3f)
                moveTo(18f, 15f)
                horizontalLineTo(6f)
                verticalLineTo(14.1f)
                curveTo(6f, 12.1f, 10f, 11f, 12f, 11f)
                curveTo(14f, 11f, 18f, 12.1f, 18f, 14.1f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _TooltipAccount!!
    }

@Suppress("ObjectPropertyName")
private var _TooltipAccount: ImageVector? = null
