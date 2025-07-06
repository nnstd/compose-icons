package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Rake: ImageVector
    get() {
        if (_Rake != null) {
            return _Rake!!
        }
        _Rake = ImageVector.Builder(
            name = "Rake",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.5f, 17.05f)
                lineTo(9.43f, 16f)
                lineTo(22.07f, 3.35f)
                lineTo(20.66f, 1.93f)
                lineTo(8f, 14.58f)
                lineTo(6.95f, 13.5f)
                curveTo(6.17f, 12.73f, 4.9f, 12.73f, 4.12f, 13.5f)
                lineTo(2f, 15.64f)
                lineTo(2.71f, 16.34f)
                lineTo(4.83f, 14.22f)
                lineTo(5.54f, 14.93f)
                lineTo(3.41f, 17.05f)
                lineTo(4.12f, 17.76f)
                lineTo(6.24f, 15.64f)
                lineTo(6.95f, 16.34f)
                lineTo(4.83f, 18.46f)
                lineTo(5.54f, 19.17f)
                lineTo(7.66f, 17.05f)
                lineTo(8.36f, 17.76f)
                lineTo(6.24f, 19.88f)
                lineTo(6.95f, 20.59f)
                lineTo(9.07f, 18.46f)
                lineTo(9.78f, 19.17f)
                lineTo(7.66f, 21.29f)
                lineTo(8.36f, 22f)
                lineTo(10.5f, 19.88f)
                curveTo(11.27f, 19.1f, 11.27f, 17.83f, 10.5f, 17.05f)
                close()
            }
        }.build()

        return _Rake!!
    }

@Suppress("ObjectPropertyName")
private var _Rake: ImageVector? = null
