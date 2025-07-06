package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowUpDownBold: ImageVector
    get() {
        if (_ArrowUpDownBold != null) {
            return _ArrowUpDownBold!!
        }
        _ArrowUpDownBold = ImageVector.Builder(
            name = "ArrowUpDownBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 8f)
                horizontalLineTo(6f)
                lineTo(12f, 2f)
                lineTo(18f, 8f)
                horizontalLineTo(14f)
                verticalLineTo(16f)
                horizontalLineTo(18f)
                lineTo(12f, 22f)
                lineTo(6f, 16f)
                horizontalLineTo(10f)
                verticalLineTo(8f)
                close()
            }
        }.build()

        return _ArrowUpDownBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpDownBold: ImageVector? = null
