package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ArrowRightBold: ImageVector
    get() {
        if (_ArrowRightBold != null) {
            return _ArrowRightBold!!
        }
        _ArrowRightBold = ImageVector.Builder(
            name = "ArrowRightBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 15f)
                verticalLineTo(9f)
                horizontalLineTo(12f)
                verticalLineTo(4.16f)
                lineTo(19.84f, 12f)
                lineTo(12f, 19.84f)
                verticalLineTo(15f)
                horizontalLineTo(4f)
                close()
            }
        }.build()

        return _ArrowRightBold!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowRightBold: ImageVector? = null
