package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowBottomRightThin: ImageVector
    get() {
        if (_ArrowBottomRightThin != null) {
            return _ArrowBottomRightThin!!
        }
        _ArrowBottomRightThin = ImageVector.Builder(
            name = "ArrowBottomRightThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.93f, 19f)
                lineTo(14.76f, 16.18f)
                lineTo(5f, 6.42f)
                lineTo(6.42f, 5f)
                lineTo(16.18f, 14.76f)
                lineTo(19f, 11.94f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _ArrowBottomRightThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBottomRightThin: ImageVector? = null
