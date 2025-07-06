package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowRightThin: ImageVector
    get() {
        if (_ArrowRightThin != null) {
            return _ArrowRightThin!!
        }
        _ArrowRightThin = ImageVector.Builder(
            name = "ArrowRightThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 16.94f)
                verticalLineTo(12.94f)
                horizontalLineTo(5.08f)
                lineTo(5.05f, 10.93f)
                horizontalLineTo(14f)
                verticalLineTo(6.94f)
                lineTo(19f, 11.94f)
                close()
            }
        }.build()

        return _ArrowRightThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightThin: ImageVector? = null
