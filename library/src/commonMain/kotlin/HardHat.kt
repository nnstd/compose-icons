package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HardHat: ImageVector
    get() {
        if (_HardHat != null) {
            return _HardHat!!
        }
        _HardHat = ImageVector.Builder(
            name = "HardHat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.87f, 12.15f)
                lineTo(9f, 6.46f)
                curveTo(10.95f, 5.84f, 13.05f, 5.84f, 15f, 6.46f)
                lineTo(14.13f, 12.15f)
                curveTo(14.06f, 12.64f, 13.63f, 13f, 13.13f, 13f)
                horizontalLineTo(10.86f)
                curveTo(10.37f, 13f, 9.94f, 12.64f, 9.87f, 12.15f)
                moveTo(22f, 16f)
                verticalLineTo(16f)
                curveTo(22f, 15.21f, 21.53f, 14.5f, 20.8f, 14.17f)
                curveTo(20.32f, 11.86f, 18.96f, 9.83f, 17f, 8.5f)
                lineTo(15.24f, 13.34f)
                curveTo(15.1f, 13.74f, 14.72f, 14f, 14.3f, 14f)
                horizontalLineTo(9.7f)
                curveTo(9.28f, 14f, 8.9f, 13.74f, 8.76f, 13.34f)
                lineTo(7f, 8.5f)
                curveTo(5.04f, 9.83f, 3.68f, 11.86f, 3.2f, 14.16f)
                curveTo(2.47f, 14.5f, 2f, 15.2f, 2f, 16f)
                lineTo(8.45f, 17.84f)
                curveTo(8.81f, 17.94f, 9.18f, 18f, 9.55f, 18f)
                horizontalLineTo(14.43f)
                curveTo(14.8f, 18f, 15.17f, 17.94f, 15.53f, 17.84f)
                lineTo(22f, 16f)
                close()
            }
        }.build()

        return _HardHat!!
    }

@Suppress("ObjectPropertyName")
private var _HardHat: ImageVector? = null
