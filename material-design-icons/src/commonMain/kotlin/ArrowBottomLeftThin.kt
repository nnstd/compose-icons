package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowBottomLeftThin: ImageVector
    get() {
        if (_ArrowBottomLeftThin != null) {
            return _ArrowBottomLeftThin!!
        }
        _ArrowBottomLeftThin = ImageVector.Builder(
            name = "ArrowBottomLeftThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.07f, 19f)
                lineTo(9.24f, 16.18f)
                lineTo(19f, 6.42f)
                lineTo(17.58f, 5f)
                lineTo(7.82f, 14.76f)
                lineTo(5f, 11.94f)
                verticalLineTo(19f)
                close()
            }
        }.build()

        return _ArrowBottomLeftThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowBottomLeftThin: ImageVector? = null
