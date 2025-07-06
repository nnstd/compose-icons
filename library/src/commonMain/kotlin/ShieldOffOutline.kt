package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldOffOutline: ImageVector
    get() {
        if (_ShieldOffOutline != null) {
            return _ShieldOffOutline!!
        }
        _ShieldOffOutline = ImageVector.Builder(
            name = "ShieldOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 4.27f)
                lineTo(3f, 6.27f)
                verticalLineTo(11f)
                curveTo(3f, 16.55f, 6.84f, 21.74f, 12f, 23f)
                curveTo(13.87f, 22.54f, 15.57f, 21.56f, 16.97f, 20.24f)
                lineTo(19.23f, 22.5f)
                lineTo(20.5f, 21.22f)
                lineTo(2.28f, 3f)
                lineTo(1f, 4.27f)
                moveTo(12f, 21f)
                curveTo(8.25f, 20f, 5f, 15.54f, 5f, 11.22f)
                verticalLineTo(8.27f)
                lineTo(15.59f, 18.86f)
                curveTo(14.53f, 19.89f, 13.3f, 20.65f, 12f, 21f)
                moveTo(21f, 5f)
                verticalLineTo(11f)
                curveTo(21f, 13.28f, 20.35f, 15.5f, 19.23f, 17.4f)
                lineTo(17.77f, 15.95f)
                curveTo(18.54f, 14.5f, 19f, 12.84f, 19f, 11.22f)
                verticalLineTo(6.3f)
                lineTo(12f, 3.18f)
                lineTo(7.16f, 5.34f)
                lineTo(5.65f, 3.82f)
                lineTo(12f, 1f)
                lineTo(21f, 5f)
                close()
            }
        }.build()

        return _ShieldOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldOffOutline: ImageVector? = null
