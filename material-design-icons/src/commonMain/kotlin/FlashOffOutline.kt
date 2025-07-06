package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FlashOffOutline: ImageVector
    get() {
        if (_FlashOffOutline != null) {
            return _FlashOffOutline!!
        }
        _FlashOffOutline = ImageVector.Builder(
            name = "FlashOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 6.19f)
                lineTo(7f, 4.19f)
                verticalLineTo(2f)
                horizontalLineTo(17f)
                lineTo(13.5f, 9f)
                horizontalLineTo(17f)
                lineTo(15.18f, 12.37f)
                lineTo(11.43f, 8.62f)
                lineTo(13.76f, 4f)
                horizontalLineTo(9f)
                verticalLineTo(6.19f)
                moveTo(19f, 18.73f)
                lineTo(17.73f, 20f)
                lineTo(13.41f, 15.68f)
                lineTo(10f, 22f)
                verticalLineTo(14f)
                horizontalLineTo(7f)
                verticalLineTo(9.27f)
                lineTo(2f, 4.27f)
                lineTo(3.27f, 3f)
                lineTo(19f, 18.73f)
                close()
            }
        }.build()

        return _FlashOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _FlashOffOutline: ImageVector? = null
