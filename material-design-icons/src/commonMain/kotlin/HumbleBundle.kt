package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HumbleBundle: ImageVector
    get() {
        if (_HumbleBundle != null) {
            return _HumbleBundle!!
        }
        _HumbleBundle = ImageVector.Builder(
            name = "HumbleBundle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.91f, 18.12f)
                curveTo(14.09f, 18.12f, 18.43f, 2.13f, 18.43f, 2.13f)
                horizontalLineTo(15.53f)
                curveTo(15.53f, 2.13f, 14.34f, 5.89f, 13.55f, 10.07f)
                horizontalLineTo(11.05f)
                curveTo(11.11f, 9.21f, 11.15f, 8.34f, 11.13f, 7.5f)
                curveTo(11f, 0.59f, 7f, 1.87f, 5.18f, 3.45f)
                curveTo(3.47f, 4.95f, 2.03f, 7.8f, 2f, 10f)
                curveTo(2.27f, 10f, 3.35f, 10f, 3.35f, 10f)
                curveTo(3.35f, 10f, 4.25f, 5.88f, 7.07f, 5.88f)
                curveTo(9.89f, 5.88f, 5.54f, 21.87f, 5.54f, 21.87f)
                horizontalLineTo(8.45f)
                curveTo(8.45f, 21.87f, 9.95f, 17.59f, 10.7f, 12.81f)
                lineTo(13.09f, 12.8f)
                curveTo(12.95f, 14.04f, 12.91f, 15.4f, 12.93f, 16.67f)
                curveTo(13.04f, 23.56f, 17.06f, 22.08f, 18.86f, 20.5f)
                curveTo(20.67f, 18.92f, 22f, 15.58f, 22f, 14f)
                horizontalLineTo(20.61f)
                curveTo(20.62f, 14.12f, 19.73f, 18.12f, 16.91f, 18.12f)
                verticalLineTo(18.12f)
                close()
            }
        }.build()

        return _HumbleBundle!!
    }

@Suppress("ObjectPropertyName")
private var _HumbleBundle: ImageVector? = null
