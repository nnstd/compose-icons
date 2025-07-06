package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShareOff: ImageVector
    get() {
        if (_ShareOff != null) {
            return _ShareOff!!
        }
        _ShareOff = ImageVector.Builder(
            name = "ShareOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.8f, 22.7f)
                lineTo(15.6f, 17.5f)
                lineTo(14f, 19f)
                verticalLineTo(15.9f)
                lineTo(13.1f, 14.9f)
                curveTo(8.6f, 15.2f, 5.4f, 16.8f, 3f, 20.1f)
                curveTo(3.58f, 16.31f, 5.72f, 12.94f, 8.9f, 10.8f)
                lineTo(1.1f, 3f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.5f)
                moveTo(18.1f, 14.9f)
                lineTo(21f, 12f)
                lineTo(14f, 5f)
                verticalLineTo(9f)
                lineTo(12.5f, 9.3f)
            }
        }.build()

        return _ShareOff!!
    }

@Suppress("ObjectPropertyName")
private var _ShareOff: ImageVector? = null
