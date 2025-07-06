package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Infinity: ImageVector
    get() {
        if (_Infinity != null) {
            return _Infinity!!
        }
        _Infinity = ImageVector.Builder(
            name = "Infinity",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.6f, 6.62f)
                curveTo(21.58f, 6.62f, 24f, 9f, 24f, 12f)
                curveTo(24f, 14.96f, 21.58f, 17.37f, 18.6f, 17.37f)
                curveTo(17.15f, 17.37f, 15.8f, 16.81f, 14.78f, 15.8f)
                lineTo(12f, 13.34f)
                lineTo(9.17f, 15.85f)
                curveTo(8.2f, 16.82f, 6.84f, 17.38f, 5.4f, 17.38f)
                curveTo(2.42f, 17.38f, 0f, 14.96f, 0f, 12f)
                curveTo(0f, 9.04f, 2.42f, 6.62f, 5.4f, 6.62f)
                curveTo(6.84f, 6.62f, 8.2f, 7.18f, 9.22f, 8.2f)
                lineTo(12f, 10.66f)
                lineTo(14.83f, 8.15f)
                curveTo(15.8f, 7.18f, 17.16f, 6.62f, 18.6f, 6.62f)
                moveTo(7.8f, 14.39f)
                lineTo(10.5f, 12f)
                lineTo(7.84f, 9.65f)
                curveTo(7.16f, 8.97f, 6.31f, 8.62f, 5.4f, 8.62f)
                curveTo(3.53f, 8.62f, 2f, 10.13f, 2f, 12f)
                curveTo(2f, 13.87f, 3.53f, 15.38f, 5.4f, 15.38f)
                curveTo(6.31f, 15.38f, 7.16f, 15.03f, 7.8f, 14.39f)
                moveTo(16.2f, 9.61f)
                lineTo(13.5f, 12f)
                lineTo(16.16f, 14.35f)
                curveTo(16.84f, 15.03f, 17.7f, 15.38f, 18.6f, 15.38f)
                curveTo(20.47f, 15.38f, 22f, 13.87f, 22f, 12f)
                curveTo(22f, 10.13f, 20.47f, 8.62f, 18.6f, 8.62f)
                curveTo(17.69f, 8.62f, 16.84f, 8.97f, 16.2f, 9.61f)
                close()
            }
        }.build()

        return _Infinity!!
    }

@Suppress("ObjectPropertyName")
private var _Infinity: ImageVector? = null
