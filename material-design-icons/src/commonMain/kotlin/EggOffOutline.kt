package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.EggOffOutline: ImageVector
    get() {
        if (_EggOffOutline != null) {
            return _EggOffOutline!!
        }
        _EggOffOutline = ImageVector.Builder(
            name = "EggOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(6.1f, 8f)
                curveTo(5.1f, 10.28f, 4.5f, 12.76f, 4.5f, 14.5f)
                curveTo(4.5f, 18.64f, 7.86f, 22f, 12f, 22f)
                curveTo(14.23f, 22f, 16.22f, 21f, 17.59f, 19.5f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(12f, 20f)
                curveTo(8.97f, 20f, 6.5f, 17.53f, 6.5f, 14.5f)
                curveTo(6.5f, 13.08f, 6.95f, 11.25f, 7.63f, 9.5f)
                lineTo(16.17f, 18.06f)
                curveTo(15.16f, 19.24f, 13.67f, 20f, 12f, 20f)
                moveTo(9.36f, 6.16f)
                lineTo(7.92f, 4.72f)
                curveTo(9.1f, 3.11f, 10.5f, 2f, 12f, 2f)
                curveTo(16.14f, 2f, 19.5f, 10.36f, 19.5f, 14.5f)
                curveTo(19.5f, 15.06f, 19.43f, 15.6f, 19.32f, 16.12f)
                lineTo(17.5f, 14.29f)
                curveTo(17.38f, 10.46f, 14.28f, 4f, 12f, 4f)
                curveTo(11.17f, 4f, 10.22f, 4.87f, 9.36f, 6.16f)
                close()
            }
        }.build()

        return _EggOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _EggOffOutline: ImageVector? = null
