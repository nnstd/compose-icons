package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TowTruck: ImageVector
    get() {
        if (_TowTruck != null) {
            return _TowTruck!!
        }
        _TowTruck = ImageVector.Builder(
            name = "TowTruck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 10f)
                horizontalLineTo(20.39f)
                lineTo(17.06f, 6f)
                horizontalLineTo(15f)
                verticalLineTo(10f)
                moveTo(17.5f, 18.5f)
                curveTo(17.89f, 18.5f, 18.24f, 18.37f, 18.54f, 18.07f)
                curveTo(18.84f, 17.77f, 19f, 17.42f, 19f, 17f)
                curveTo(19f, 16.61f, 18.84f, 16.26f, 18.54f, 15.96f)
                curveTo(18.24f, 15.66f, 17.89f, 15.5f, 17.5f, 15.5f)
                curveTo(17.08f, 15.5f, 16.73f, 15.66f, 16.43f, 15.96f)
                curveTo(16.13f, 16.26f, 16f, 16.61f, 16f, 17f)
                curveTo(16f, 17.42f, 16.13f, 17.77f, 16.43f, 18.07f)
                curveTo(16.73f, 18.37f, 17.08f, 18.5f, 17.5f, 18.5f)
                moveTo(6f, 18.5f)
                curveTo(6.44f, 18.5f, 6.8f, 18.37f, 7.08f, 18.07f)
                curveTo(7.36f, 17.77f, 7.5f, 17.42f, 7.5f, 17f)
                curveTo(7.5f, 16.61f, 7.36f, 16.26f, 7.08f, 15.96f)
                curveTo(6.8f, 15.66f, 6.44f, 15.5f, 6f, 15.5f)
                curveTo(5.56f, 15.5f, 5.2f, 15.66f, 4.92f, 15.96f)
                curveTo(4.64f, 16.26f, 4.5f, 16.61f, 4.5f, 17f)
                curveTo(4.5f, 17.42f, 4.64f, 17.77f, 4.92f, 18.07f)
                curveTo(5.2f, 18.37f, 5.56f, 18.5f, 6f, 18.5f)
                moveTo(18f, 4f)
                lineTo(23f, 10f)
                verticalLineTo(17f)
                horizontalLineTo(20.5f)
                curveTo(20.5f, 17.83f, 20.19f, 18.53f, 19.59f, 19.13f)
                curveTo(19f, 19.72f, 18.3f, 20f, 17.5f, 20f)
                curveTo(16.67f, 20f, 15.97f, 19.72f, 15.38f, 19.13f)
                curveTo(14.78f, 18.53f, 14.5f, 17.83f, 14.5f, 17f)
                horizontalLineTo(9f)
                curveTo(9f, 17.83f, 8.7f, 18.53f, 8.11f, 19.13f)
                curveTo(7.5f, 19.72f, 6.81f, 20f, 6f, 20f)
                curveTo(5.19f, 20f, 4.5f, 19.72f, 3.89f, 19.13f)
                curveTo(3.3f, 18.53f, 3f, 17.83f, 3f, 17f)
                horizontalLineTo(1f)
                verticalLineTo(13f)
                horizontalLineTo(9.19f)
                lineTo(3f, 8.11f)
                verticalLineTo(11f)
                horizontalLineTo(1f)
                verticalLineTo(5f)
                horizontalLineTo(2f)
                lineTo(13f, 11.06f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                close()
            }
        }.build()

        return _TowTruck!!
    }

@Suppress("ObjectPropertyName")
private var _TowTruck: ImageVector? = null
