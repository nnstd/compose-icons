package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Axe: ImageVector
    get() {
        if (_Axe != null) {
            return _Axe!!
        }
        _Axe = ImageVector.Builder(
            name = "Axe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                lineTo(22f, 8f)
                curveTo(22f, 12f, 20f, 14f, 16f, 15f)
                lineTo(13f, 10f)
                lineTo(9f, 6f)
                lineTo(12f, 2f)
                moveTo(4.11f, 19.84f)
                lineTo(2.12f, 18.33f)
                lineTo(9.19f, 9f)
                lineTo(11f, 10.81f)
                lineTo(4.11f, 19.84f)
                close()
            }
        }.build()

        return _Axe!!
    }

@Suppress("ObjectPropertyName")
private var _Axe: ImageVector? = null
