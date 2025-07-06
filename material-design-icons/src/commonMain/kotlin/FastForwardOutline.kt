package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FastForwardOutline: ImageVector
    get() {
        if (_FastForwardOutline != null) {
            return _FastForwardOutline!!
        }
        _FastForwardOutline = ImageVector.Builder(
            name = "FastForwardOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 9.9f)
                lineTo(18f, 12f)
                lineTo(15f, 14.1f)
                verticalLineTo(9.9f)
                moveTo(6f, 9.9f)
                lineTo(9f, 12f)
                lineTo(6f, 14.1f)
                verticalLineTo(9.9f)
                moveTo(13f, 6f)
                verticalLineTo(18f)
                lineTo(21.5f, 12f)
                lineTo(13f, 6f)
                moveTo(4f, 6f)
                verticalLineTo(18f)
                lineTo(12.5f, 12f)
                lineTo(4f, 6f)
                close()
            }
        }.build()

        return _FastForwardOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FastForwardOutline: ImageVector? = null
