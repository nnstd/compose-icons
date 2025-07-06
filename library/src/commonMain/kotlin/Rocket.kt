package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Rocket: ImageVector
    get() {
        if (_Rocket != null) {
            return _Rocket!!
        }
        _Rocket = ImageVector.Builder(
            name = "Rocket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 22f)
                lineTo(16.14f, 20.45f)
                curveTo(16.84f, 18.92f, 17.34f, 17.34f, 17.65f, 15.73f)
                lineTo(20f, 22f)
                moveTo(7.86f, 20.45f)
                lineTo(4f, 22f)
                lineTo(6.35f, 15.73f)
                curveTo(6.66f, 17.34f, 7.16f, 18.92f, 7.86f, 20.45f)
                moveTo(12f, 2f)
                curveTo(12f, 2f, 17f, 4f, 17f, 12f)
                curveTo(17f, 15.1f, 16.25f, 17.75f, 15.33f, 19.83f)
                curveTo(15f, 20.55f, 14.29f, 21f, 13.5f, 21f)
                horizontalLineTo(10.5f)
                curveTo(9.71f, 21f, 9f, 20.55f, 8.67f, 19.83f)
                curveTo(7.76f, 17.75f, 7f, 15.1f, 7f, 12f)
                curveTo(7f, 4f, 12f, 2f, 12f, 2f)
                moveTo(12f, 12f)
                curveTo(13.1f, 12f, 14f, 11.1f, 14f, 10f)
                curveTo(14f, 8.9f, 13.1f, 8f, 12f, 8f)
                curveTo(10.9f, 8f, 10f, 8.9f, 10f, 10f)
                curveTo(10f, 11.1f, 10.9f, 12f, 12f, 12f)
                close()
            }
        }.build()

        return _Rocket!!
    }

@Suppress("ObjectPropertyName")
private var _Rocket: ImageVector? = null
