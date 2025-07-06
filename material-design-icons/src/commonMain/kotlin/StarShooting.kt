package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.StarShooting: ImageVector
    get() {
        if (_StarShooting != null) {
            return _StarShooting!!
        }
        _StarShooting = ImageVector.Builder(
            name = "StarShooting",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.09f, 11.77f)
                lineTo(19.56f, 18.1f)
                lineTo(14f, 14.74f)
                lineTo(8.44f, 18.1f)
                lineTo(9.9f, 11.77f)
                lineTo(5f, 7.5f)
                lineTo(11.47f, 6.96f)
                lineTo(14f, 1f)
                lineTo(16.53f, 6.96f)
                lineTo(23f, 7.5f)
                lineTo(18.09f, 11.77f)
                moveTo(2f, 12.43f)
                curveTo(2.19f, 12.43f, 2.38f, 12.37f, 2.55f, 12.26f)
                lineTo(5.75f, 10.15f)
                lineTo(4.18f, 8.79f)
                lineTo(1.45f, 10.59f)
                curveTo(0.989f, 10.89f, 0.861f, 11.5f, 1.16f, 12f)
                curveTo(1.36f, 12.27f, 1.68f, 12.43f, 2f, 12.43f)
                moveTo(1.16f, 21.55f)
                curveTo(1.36f, 21.84f, 1.68f, 22f, 2f, 22f)
                curveTo(2.19f, 22f, 2.38f, 21.95f, 2.55f, 21.84f)
                lineTo(6.66f, 19.13f)
                lineTo(7f, 17.76f)
                lineTo(7.31f, 16.31f)
                lineTo(1.45f, 20.16f)
                curveTo(0.989f, 20.47f, 0.861f, 21.09f, 1.16f, 21.55f)
                moveTo(1.45f, 15.38f)
                curveTo(0.989f, 15.68f, 0.861f, 16.3f, 1.16f, 16.76f)
                curveTo(1.36f, 17.06f, 1.68f, 17.21f, 2f, 17.21f)
                curveTo(2.19f, 17.21f, 2.38f, 17.16f, 2.55f, 17.05f)
                lineTo(7.97f, 13.5f)
                lineTo(8.24f, 12.31f)
                lineTo(7.32f, 11.5f)
                lineTo(1.45f, 15.38f)
                close()
            }
        }.build()

        return _StarShooting!!
    }

@Suppress("ObjectPropertyName")
private var _StarShooting: ImageVector? = null
