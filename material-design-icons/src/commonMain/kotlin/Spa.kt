package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Spa: ImageVector
    get() {
        if (_Spa != null) {
            return _Spa!!
        }
        _Spa = ImageVector.Builder(
            name = "Spa",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 9.63f)
                curveTo(15.31f, 6.84f, 14.18f, 4.12f, 12.06f, 2f)
                curveTo(9.92f, 4.14f, 8.74f, 6.86f, 8.5f, 9.63f)
                curveTo(9.79f, 10.31f, 10.97f, 11.19f, 12f, 12.26f)
                curveTo(13.03f, 11.2f, 14.21f, 10.32f, 15.5f, 9.63f)
                moveTo(12f, 15.45f)
                curveTo(9.85f, 12.17f, 6.18f, 10f, 2f, 10f)
                curveTo(2f, 20f, 11.32f, 21.89f, 12f, 22f)
                curveTo(12.68f, 21.88f, 22f, 20f, 22f, 10f)
                curveTo(17.82f, 10f, 14.15f, 12.17f, 12f, 15.45f)
                close()
            }
        }.build()

        return _Spa!!
    }

@Suppress("ObjectPropertyName")
private var _Spa: ImageVector? = null
