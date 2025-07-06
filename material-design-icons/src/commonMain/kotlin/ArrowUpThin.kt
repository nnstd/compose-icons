package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowUpThin: ImageVector
    get() {
        if (_ArrowUpThin != null) {
            return _ArrowUpThin!!
        }
        _ArrowUpThin = ImageVector.Builder(
            name = "ArrowUpThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.03f, 9.97f)
                horizontalLineTo(11.03f)
                verticalLineTo(18.89f)
                lineTo(13.04f, 18.92f)
                verticalLineTo(9.97f)
                horizontalLineTo(17.03f)
                lineTo(12.03f, 4.97f)
                close()
            }
        }.build()

        return _ArrowUpThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpThin: ImageVector? = null
