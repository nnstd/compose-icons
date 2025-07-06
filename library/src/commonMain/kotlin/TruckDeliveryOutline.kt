package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TruckDeliveryOutline: ImageVector
    get() {
        if (_TruckDeliveryOutline != null) {
            return _TruckDeliveryOutline!!
        }
        _TruckDeliveryOutline = ImageVector.Builder(
            name = "TruckDeliveryOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 18.5f)
                curveTo(18.83f, 18.5f, 19.5f, 17.83f, 19.5f, 17f)
                curveTo(19.5f, 16.17f, 18.83f, 15.5f, 18f, 15.5f)
                curveTo(17.17f, 15.5f, 16.5f, 16.17f, 16.5f, 17f)
                curveTo(16.5f, 17.83f, 17.17f, 18.5f, 18f, 18.5f)
                moveTo(19.5f, 9.5f)
                horizontalLineTo(17f)
                verticalLineTo(12f)
                horizontalLineTo(21.46f)
                lineTo(19.5f, 9.5f)
                moveTo(6f, 18.5f)
                curveTo(6.83f, 18.5f, 7.5f, 17.83f, 7.5f, 17f)
                curveTo(7.5f, 16.17f, 6.83f, 15.5f, 6f, 15.5f)
                curveTo(5.17f, 15.5f, 4.5f, 16.17f, 4.5f, 17f)
                curveTo(4.5f, 17.83f, 5.17f, 18.5f, 6f, 18.5f)
                moveTo(20f, 8f)
                lineTo(23f, 12f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                curveTo(21f, 18.66f, 19.66f, 20f, 18f, 20f)
                curveTo(16.34f, 20f, 15f, 18.66f, 15f, 17f)
                horizontalLineTo(9f)
                curveTo(9f, 18.66f, 7.66f, 20f, 6f, 20f)
                curveTo(4.34f, 20f, 3f, 18.66f, 3f, 17f)
                horizontalLineTo(1f)
                verticalLineTo(6f)
                curveTo(1f, 4.89f, 1.89f, 4f, 3f, 4f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                moveTo(3f, 6f)
                verticalLineTo(15f)
                horizontalLineTo(3.76f)
                curveTo(4.31f, 14.39f, 5.11f, 14f, 6f, 14f)
                curveTo(6.89f, 14f, 7.69f, 14.39f, 8.24f, 15f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                moveTo(10f, 7f)
                lineTo(13.5f, 10.5f)
                lineTo(10f, 14f)
                verticalLineTo(11.5f)
                horizontalLineTo(5f)
                verticalLineTo(9.5f)
                horizontalLineTo(10f)
                verticalLineTo(7f)
                close()
            }
        }.build()

        return _TruckDeliveryOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TruckDeliveryOutline: ImageVector? = null
