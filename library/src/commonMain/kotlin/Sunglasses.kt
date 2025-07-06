package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Sunglasses: ImageVector
    get() {
        if (_Sunglasses != null) {
            return _Sunglasses!!
        }
        _Sunglasses = ImageVector.Builder(
            name = "Sunglasses",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 17f)
                horizontalLineTo(4f)
                curveTo(2.38f, 17f, 0.96f, 15.74f, 0.76f, 14.14f)
                lineTo(0.26f, 11.15f)
                curveTo(0.15f, 10.3f, 0.39f, 9.5f, 0.91f, 8.92f)
                curveTo(1.43f, 8.34f, 2.19f, 8f, 3f, 8f)
                horizontalLineTo(9f)
                curveTo(9.83f, 8f, 10.58f, 8.35f, 11.06f, 8.96f)
                curveTo(11.17f, 9.11f, 11.27f, 9.27f, 11.35f, 9.45f)
                curveTo(11.78f, 9.36f, 12.22f, 9.36f, 12.64f, 9.45f)
                curveTo(12.72f, 9.27f, 12.82f, 9.11f, 12.94f, 8.96f)
                curveTo(13.41f, 8.35f, 14.16f, 8f, 15f, 8f)
                horizontalLineTo(21f)
                curveTo(21.81f, 8f, 22.57f, 8.34f, 23.09f, 8.92f)
                curveTo(23.6f, 9.5f, 23.84f, 10.3f, 23.74f, 11.11f)
                lineTo(23.23f, 14.18f)
                curveTo(23.04f, 15.74f, 21.61f, 17f, 20f, 17f)
                horizontalLineTo(17f)
                curveTo(15.44f, 17f, 13.92f, 15.81f, 13.54f, 14.3f)
                lineTo(12.64f, 11.59f)
                curveTo(12.26f, 11.31f, 11.73f, 11.31f, 11.35f, 11.59f)
                lineTo(10.43f, 14.37f)
                curveTo(10.07f, 15.82f, 8.56f, 17f, 7f, 17f)
                close()
            }
        }.build()

        return _Sunglasses!!
    }

@Suppress("ObjectPropertyName")
private var _Sunglasses: ImageVector? = null
