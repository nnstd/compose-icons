package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.RocketOutline: ImageVector
    get() {
        if (_RocketOutline != null) {
            return _RocketOutline!!
        }
        _RocketOutline = ImageVector.Builder(
            name = "RocketOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(12f, 2f, 7f, 4f, 7f, 12f)
                curveTo(7f, 15.1f, 7.76f, 17.75f, 8.67f, 19.83f)
                curveTo(9f, 20.55f, 9.71f, 21f, 10.5f, 21f)
                horizontalLineTo(13.5f)
                curveTo(14.29f, 21f, 15f, 20.55f, 15.33f, 19.83f)
                curveTo(16.25f, 17.75f, 17f, 15.1f, 17f, 12f)
                curveTo(17f, 4f, 12f, 2f, 12f, 2f)
                moveTo(13.5f, 19f)
                horizontalLineTo(10.5f)
                curveTo(9.5f, 16.76f, 9f, 14.41f, 9f, 12f)
                curveTo(9f, 7.36f, 10.9f, 5.2f, 12f, 4.33f)
                curveTo(13.1f, 5.2f, 15f, 7.36f, 15f, 12f)
                curveTo(15f, 14.41f, 14.5f, 16.76f, 13.5f, 19f)
                moveTo(20f, 22f)
                lineTo(16.14f, 20.45f)
                curveTo(16.84f, 18.92f, 17.34f, 17.34f, 17.65f, 15.73f)
                moveTo(7.86f, 20.45f)
                lineTo(4f, 22f)
                lineTo(6.35f, 15.73f)
                curveTo(6.66f, 17.34f, 7.16f, 18.92f, 7.86f, 20.45f)
                moveTo(12f, 12f)
                curveTo(10.9f, 12f, 10f, 11.1f, 10f, 10f)
                curveTo(10f, 8.9f, 10.9f, 8f, 12f, 8f)
                curveTo(13.1f, 8f, 14f, 8.9f, 14f, 10f)
                curveTo(14f, 11.1f, 13.1f, 12f, 12f, 12f)
                close()
            }
        }.build()

        return _RocketOutline!!
    }

@Suppress("ObjectPropertyName")
private var _RocketOutline: ImageVector? = null
