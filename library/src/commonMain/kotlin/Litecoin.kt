package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Litecoin: ImageVector
    get() {
        if (_Litecoin != null) {
            return _Litecoin!!
        }
        _Litecoin = ImageVector.Builder(
            name = "Litecoin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.55f, 15.92f)
                lineTo(13.16f, 13.78f)
                lineTo(14.81f, 13.19f)
                lineTo(16.25f, 7.63f)
                lineTo(14.56f, 8.31f)
                lineTo(16.25f, 2f)
                horizontalLineTo(8f)
                lineTo(5.38f, 11.77f)
                lineTo(3.72f, 12.34f)
                lineTo(2.22f, 17.91f)
                lineTo(4f, 17.27f)
                lineTo(2.66f, 22f)
                horizontalLineTo(20.16f)
                lineTo(21.78f, 15.92f)
                horizontalLineTo(12.55f)
                moveTo(19.39f, 21f)
                horizontalLineTo(4f)
                lineTo(5.46f, 15.65f)
                lineTo(3.72f, 16.3f)
                lineTo(4.58f, 13.11f)
                lineTo(6.24f, 12.54f)
                lineTo(8.74f, 3f)
                horizontalLineTo(15f)
                lineTo(13.13f, 10f)
                lineTo(14.83f, 9.3f)
                lineTo(14f, 12.42f)
                lineTo(12.33f, 13f)
                lineTo(11.22f, 16.91f)
                horizontalLineTo(20.5f)
                lineTo(19.39f, 21f)
                close()
            }
        }.build()

        return _Litecoin!!
    }

@Suppress("ObjectPropertyName")
private var _Litecoin: ImageVector? = null
