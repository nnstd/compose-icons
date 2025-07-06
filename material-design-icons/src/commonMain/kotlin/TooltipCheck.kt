package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TooltipCheck: ImageVector
    get() {
        if (_TooltipCheck != null) {
            return _TooltipCheck!!
        }
        _TooltipCheck = ImageVector.Builder(
            name = "TooltipCheck",
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
                moveTo(10.46f, 14f)
                lineTo(6.96f, 10.5f)
                lineTo(8.37f, 9.08f)
                lineTo(10.46f, 11.17f)
                lineTo(15.64f, 6f)
                lineTo(17.05f, 7.41f)
                lineTo(10.46f, 14f)
                close()
            }
        }.build()

        return _TooltipCheck!!
    }

@Suppress("ObjectPropertyName")
private var _TooltipCheck: ImageVector? = null
