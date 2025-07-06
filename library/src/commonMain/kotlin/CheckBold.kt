package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CheckBold: ImageVector
    get() {
        if (_CheckBold != null) {
            return _CheckBold!!
        }
        _CheckBold = ImageVector.Builder(
            name = "CheckBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 20.42f)
                lineTo(2.79f, 14.21f)
                lineTo(5.62f, 11.38f)
                lineTo(9f, 14.77f)
                lineTo(18.88f, 4.88f)
                lineTo(21.71f, 7.71f)
                lineTo(9f, 20.42f)
                close()
            }
        }.build()

        return _CheckBold!!
    }

@Suppress("ObjectPropertyName")
private var _CheckBold: ImageVector? = null
