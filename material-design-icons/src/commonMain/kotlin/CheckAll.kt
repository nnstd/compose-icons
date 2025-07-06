package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CheckAll: ImageVector
    get() {
        if (_CheckAll != null) {
            return _CheckAll!!
        }
        _CheckAll = ImageVector.Builder(
            name = "CheckAll",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.41f, 13.41f)
                lineTo(6f, 19f)
                lineTo(7.41f, 17.58f)
                lineTo(1.83f, 12f)
                moveTo(22.24f, 5.58f)
                lineTo(11.66f, 16.17f)
                lineTo(7.5f, 12f)
                lineTo(6.07f, 13.41f)
                lineTo(11.66f, 19f)
                lineTo(23.66f, 7f)
                moveTo(18f, 7f)
                lineTo(16.59f, 5.58f)
                lineTo(10.24f, 11.93f)
                lineTo(11.66f, 13.34f)
                lineTo(18f, 7f)
                close()
            }
        }.build()

        return _CheckAll!!
    }

@Suppress("ObjectPropertyName")
private var _CheckAll: ImageVector? = null
