package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FastForward: ImageVector
    get() {
        if (_FastForward != null) {
            return _FastForward!!
        }
        _FastForward = ImageVector.Builder(
            name = "FastForward",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 6f)
                verticalLineTo(18f)
                lineTo(21.5f, 12f)
                moveTo(4f, 18f)
                lineTo(12.5f, 12f)
                lineTo(4f, 6f)
                verticalLineTo(18f)
                close()
            }
        }.build()

        return _FastForward!!
    }

@Suppress("ObjectPropertyName")
private var _FastForward: ImageVector? = null
