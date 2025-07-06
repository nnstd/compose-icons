package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Shovel: ImageVector
    get() {
        if (_Shovel != null) {
            return _Shovel!!
        }
        _Shovel = ImageVector.Builder(
            name = "Shovel",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.1f, 1.81f)
                lineTo(12.27f, 4.64f)
                curveTo(11.5f, 5.42f, 11.5f, 6.69f, 12.27f, 7.47f)
                lineTo(13.68f, 8.88f)
                lineTo(9.13f, 13.43f)
                lineTo(6.31f, 10.6f)
                lineTo(4.89f, 12f)
                curveTo(-0.06f, 17f, 3.5f, 20.5f, 3.5f, 20.5f)
                curveTo(3.5f, 20.5f, 7f, 24f, 12f, 19.09f)
                lineTo(13.41f, 17.68f)
                lineTo(10.61f, 14.88f)
                lineTo(15.15f, 10.34f)
                lineTo(16.54f, 11.73f)
                curveTo(17.32f, 12.5f, 18.59f, 12.5f, 19.37f, 11.73f)
                lineTo(22.2f, 8.9f)
                lineTo(15.1f, 1.81f)
                moveTo(17.93f, 10.28f)
                lineTo(16.55f, 8.9f)
                lineTo(15.11f, 7.46f)
                lineTo(13.71f, 6.06f)
                lineTo(15.12f, 4.65f)
                lineTo(19.35f, 8.88f)
                lineTo(17.93f, 10.28f)
                close()
            }
        }.build()

        return _Shovel!!
    }

@Suppress("ObjectPropertyName")
private var _Shovel: ImageVector? = null
