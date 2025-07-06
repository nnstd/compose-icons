package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TooltipEdit: ImageVector
    get() {
        if (_TooltipEdit != null) {
            return _TooltipEdit!!
        }
        _TooltipEdit = ImageVector.Builder(
            name = "TooltipEdit",
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
                moveTo(9.08f, 15f)
                horizontalLineTo(7f)
                verticalLineTo(12.91f)
                lineTo(13.17f, 6.72f)
                lineTo(15.24f, 8.8f)
                lineTo(9.08f, 15f)
                moveTo(16.84f, 7.2f)
                lineTo(15.83f, 8.21f)
                lineTo(13.76f, 6.18f)
                lineTo(14.77f, 5.16f)
                curveTo(14.97f, 4.95f, 15.31f, 4.94f, 15.55f, 5.16f)
                lineTo(16.84f, 6.41f)
                curveTo(17.05f, 6.62f, 17.06f, 6.96f, 16.84f, 7.2f)
                close()
            }
        }.build()

        return _TooltipEdit!!
    }

@Suppress("ObjectPropertyName")
private var _TooltipEdit: ImageVector? = null
