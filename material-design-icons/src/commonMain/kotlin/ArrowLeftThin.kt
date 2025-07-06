package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowLeftThin: ImageVector
    get() {
        if (_ArrowLeftThin != null) {
            return _ArrowLeftThin!!
        }
        _ArrowLeftThin = ImageVector.Builder(
            name = "ArrowLeftThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.05f, 16.94f)
                verticalLineTo(12.94f)
                horizontalLineTo(18.97f)
                lineTo(19f, 10.93f)
                horizontalLineTo(10.05f)
                verticalLineTo(6.94f)
                lineTo(5.05f, 11.94f)
                close()
            }
        }.build()

        return _ArrowLeftThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeftThin: ImageVector? = null
