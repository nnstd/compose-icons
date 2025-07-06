package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowTopRightThin: ImageVector
    get() {
        if (_ArrowTopRightThin != null) {
            return _ArrowTopRightThin!!
        }
        _ArrowTopRightThin = ImageVector.Builder(
            name = "ArrowTopRightThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.93f, 5f)
                lineTo(14.76f, 7.83f)
                lineTo(5f, 17.59f)
                lineTo(6.42f, 19f)
                lineTo(16.18f, 9.25f)
                lineTo(19f, 12.07f)
                verticalLineTo(5f)
                horizontalLineTo(11.93f)
                close()
            }
        }.build()

        return _ArrowTopRightThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowTopRightThin: ImageVector? = null
