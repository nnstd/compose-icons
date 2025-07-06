package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowTopLeftThin: ImageVector
    get() {
        if (_ArrowTopLeftThin != null) {
            return _ArrowTopLeftThin!!
        }
        _ArrowTopLeftThin = ImageVector.Builder(
            name = "ArrowTopLeftThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.07f, 5f)
                lineTo(9.24f, 7.83f)
                lineTo(19f, 17.59f)
                lineTo(17.58f, 19f)
                lineTo(7.82f, 9.25f)
                lineTo(5f, 12.07f)
                verticalLineTo(5f)
                close()
            }
        }.build()

        return _ArrowTopLeftThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTopLeftThin: ImageVector? = null
