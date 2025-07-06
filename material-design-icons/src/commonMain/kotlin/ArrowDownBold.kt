package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowDownBold: ImageVector
    get() {
        if (_ArrowDownBold != null) {
            return _ArrowDownBold!!
        }
        _ArrowDownBold = ImageVector.Builder(
            name = "ArrowDownBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 4f)
                horizontalLineTo(15f)
                verticalLineTo(12f)
                horizontalLineTo(19.84f)
                lineTo(12f, 19.84f)
                lineTo(4.16f, 12f)
                horizontalLineTo(9f)
                verticalLineTo(4f)
                close()
            }
        }.build()

        return _ArrowDownBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowDownBold: ImageVector? = null
