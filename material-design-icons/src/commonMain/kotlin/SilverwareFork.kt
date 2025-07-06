package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SilverwareFork: ImageVector
    get() {
        if (_SilverwareFork != null) {
            return _SilverwareFork!!
        }
        _SilverwareFork = ImageVector.Builder(
            name = "SilverwareFork",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.12f, 21.29f)
                lineTo(3.71f, 19.88f)
                lineTo(13.36f, 10.22f)
                lineTo(13.16f, 10f)
                curveTo(12.38f, 9.23f, 12.38f, 7.97f, 13.16f, 7.19f)
                lineTo(17.5f, 2.82f)
                lineTo(18.43f, 3.74f)
                lineTo(15.19f, 7f)
                lineTo(16.15f, 7.94f)
                lineTo(19.39f, 4.69f)
                lineTo(20.31f, 5.61f)
                lineTo(17.06f, 8.85f)
                lineTo(18f, 9.81f)
                lineTo(21.26f, 6.56f)
                lineTo(22.18f, 7.5f)
                lineTo(17.81f, 11.84f)
                curveTo(17.03f, 12.62f, 15.77f, 12.62f, 15f, 11.84f)
                lineTo(14.78f, 11.64f)
                lineTo(5.12f, 21.29f)
                close()
            }
        }.build()

        return _SilverwareFork!!
    }

@Suppress("ObjectPropertyName")
private var _SilverwareFork: ImageVector? = null
