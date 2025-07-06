package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldOff: ImageVector
    get() {
        if (_ShieldOff != null) {
            return _ShieldOff!!
        }
        _ShieldOff = ImageVector.Builder(
            name = "ShieldOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 4.27f)
                lineTo(2.28f, 3f)
                lineTo(20.5f, 21.22f)
                lineTo(19.23f, 22.5f)
                lineTo(17f, 20.25f)
                curveTo(15.57f, 21.57f, 13.87f, 22.54f, 12f, 23f)
                curveTo(6.84f, 21.74f, 3f, 16.55f, 3f, 11f)
                verticalLineTo(6.27f)
                lineTo(1f, 4.27f)
                moveTo(12f, 1f)
                lineTo(21f, 5f)
                verticalLineTo(11f)
                curveTo(21f, 13.28f, 20.35f, 15.5f, 19.23f, 17.41f)
                lineTo(5.65f, 3.82f)
                lineTo(12f, 1f)
                close()
            }
        }.build()

        return _ShieldOff!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldOff: ImageVector? = null
