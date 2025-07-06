package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SpaOutline: ImageVector
    get() {
        if (_SpaOutline != null) {
            return _SpaOutline!!
        }
        _SpaOutline = ImageVector.Builder(
            name = "SpaOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.5f, 9.63f)
                curveTo(14.21f, 10.32f, 13.03f, 11.2f, 12f, 12.26f)
                curveTo(10.97f, 11.19f, 9.79f, 10.31f, 8.5f, 9.63f)
                curveTo(8.74f, 6.86f, 9.92f, 4.14f, 12.06f, 2f)
                curveTo(14.18f, 4.12f, 15.31f, 6.84f, 15.5f, 9.63f)
                moveTo(12f, 15.45f)
                curveTo(14.15f, 12.17f, 17.82f, 10f, 22f, 10f)
                curveTo(22f, 20f, 12.68f, 21.88f, 12f, 22f)
                curveTo(11.32f, 21.89f, 2f, 20f, 2f, 10f)
                curveTo(6.18f, 10f, 9.85f, 12.17f, 12f, 15.45f)
                moveTo(12.05f, 5.19f)
                curveTo(11.39f, 6.23f, 10.93f, 7.38f, 10.68f, 8.58f)
                lineTo(12f, 9.55f)
                lineTo(13.35f, 8.57f)
                curveTo(13.12f, 7.37f, 12.68f, 6.22f, 12.05f, 5.19f)
                moveTo(12f, 19.97f)
                curveTo(12f, 19.97f, 18f, 19f, 19.74f, 12.25f)
                curveTo(14f, 14f, 12f, 19.1f, 12f, 19.1f)
                curveTo(12f, 19.1f, 9f, 13f, 4.26f, 12.26f)
                curveTo(6f, 19f, 12f, 19.97f, 12f, 19.97f)
                close()
            }
        }.build()

        return _SpaOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SpaOutline: ImageVector? = null
