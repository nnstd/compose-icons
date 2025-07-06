package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlashOff: ImageVector
    get() {
        if (_FlashOff != null) {
            return _FlashOff!!
        }
        _FlashOff = ImageVector.Builder(
            name = "FlashOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 10f)
                horizontalLineTo(13f)
                lineTo(17f, 2f)
                horizontalLineTo(7f)
                verticalLineTo(4.18f)
                lineTo(15.46f, 12.64f)
                moveTo(3.27f, 3f)
                lineTo(2f, 4.27f)
                lineTo(7f, 9.27f)
                verticalLineTo(13f)
                horizontalLineTo(10f)
                verticalLineTo(22f)
                lineTo(13.58f, 15.86f)
                lineTo(17.73f, 20f)
                lineTo(19f, 18.73f)
                lineTo(3.27f, 3f)
                close()
            }
        }.build()

        return _FlashOff!!
    }

@Suppress("ObjectPropertyName")
private var _FlashOff: ImageVector? = null
