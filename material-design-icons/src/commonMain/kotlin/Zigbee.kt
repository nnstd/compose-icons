package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Zigbee: ImageVector
    get() {
        if (_Zigbee != null) {
            return _Zigbee!!
        }
        _Zigbee = ImageVector.Builder(
            name = "Zigbee",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.06f, 6.15f)
                curveTo(3.97f, 6.17f, 3.88f, 6.22f, 3.8f, 6.28f)
                curveTo(2.66f, 7.9f, 2f, 9.87f, 2f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 22f)
                curveTo(15f, 22f, 17.68f, 20.68f, 19.5f, 18.6f)
                lineTo(17f, 18.85f)
                curveTo(14.25f, 19.15f, 11.45f, 19.19f, 8.66f, 18.96f)
                curveTo(7.95f, 18.94f, 7.24f, 18.76f, 6.59f, 18.45f)
                curveTo(5.73f, 18.06f, 5.15f, 17.23f, 5.07f, 16.29f)
                curveTo(5.06f, 16.13f, 5.12f, 16f, 5.23f, 15.87f)
                lineTo(7.42f, 13.6f)
                lineTo(15.03f, 5.7f)
                verticalLineTo(5.6f)
                horizontalLineTo(10.84f)
                curveTo(8.57f, 5.64f, 6.31f, 5.82f, 4.06f, 6.15f)
                moveTo(20.17f, 17.5f)
                curveTo(20.26f, 17.47f, 20.35f, 17.44f, 20.43f, 17.39f)
                curveTo(21.42f, 15.83f, 22f, 14f, 22f, 12f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                curveTo(9.22f, 2f, 6.7f, 3.13f, 4.89f, 4.97f)
                horizontalLineTo(5.17f)
                curveTo(8.28f, 4.57f, 11.43f, 4.47f, 14.56f, 4.65f)
                curveTo(15.5f, 4.64f, 16.45f, 4.82f, 17.33f, 5.17f)
                curveTo(18.25f, 5.53f, 18.89f, 6.38f, 19f, 7.37f)
                curveTo(19f, 7.53f, 18.93f, 7.7f, 18.82f, 7.82f)
                lineTo(9.71f, 17.19f)
                lineTo(9f, 17.95f)
                verticalLineTo(18.06f)
                horizontalLineTo(13.14f)
                curveTo(15.5f, 18f, 17.84f, 17.81f, 20.17f, 17.5f)
                close()
            }
        }.build()

        return _Zigbee!!
    }

@Suppress("ObjectPropertyName")
private var _Zigbee: ImageVector? = null
