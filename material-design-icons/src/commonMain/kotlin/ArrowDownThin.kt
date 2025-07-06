package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowDownThin: ImageVector
    get() {
        if (_ArrowDownThin != null) {
            return _ArrowDownThin!!
        }
        _ArrowDownThin = ImageVector.Builder(
            name = "ArrowDownThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.03f, 13.92f)
                horizontalLineTo(11.03f)
                verticalLineTo(5f)
                lineTo(13.04f, 4.97f)
                verticalLineTo(13.92f)
                horizontalLineTo(17.03f)
                lineTo(12.03f, 18.92f)
                close()
            }
        }.build()

        return _ArrowDownThin!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownThin: ImageVector? = null
