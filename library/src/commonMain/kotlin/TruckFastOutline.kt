package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.TruckFastOutline: ImageVector
    get() {
        if (_TruckFastOutline != null) {
            return _TruckFastOutline!!
        }
        _TruckFastOutline = ImageVector.Builder(
            name = "TruckFastOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.75f, 7.5f)
                horizontalLineTo(10.5f)
                lineTo(11.25f, 9f)
                horizontalLineTo(1.5f)
                lineTo(0.75f, 7.5f)
                moveTo(1.75f, 10.5f)
                horizontalLineTo(11.5f)
                lineTo(12.25f, 12f)
                horizontalLineTo(2.5f)
                lineTo(1.75f, 10.5f)
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
                moveTo(8f, 18.5f)
                curveTo(8.83f, 18.5f, 9.5f, 17.83f, 9.5f, 17f)
                curveTo(9.5f, 16.17f, 8.83f, 15.5f, 8f, 15.5f)
                curveTo(7.17f, 15.5f, 6.5f, 16.17f, 6.5f, 17f)
                curveTo(6.5f, 17.83f, 7.17f, 18.5f, 8f, 18.5f)
                moveTo(20f, 8f)
                lineTo(23f, 12f)
                verticalLineTo(17f)
                horizontalLineTo(21f)
                curveTo(21f, 18.66f, 19.66f, 20f, 18f, 20f)
                curveTo(16.34f, 20f, 15f, 18.66f, 15f, 17f)
                horizontalLineTo(11f)
                curveTo(11f, 18.66f, 9.65f, 20f, 8f, 20f)
                curveTo(6.34f, 20f, 5f, 18.66f, 5f, 17f)
                horizontalLineTo(3f)
                verticalLineTo(13.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(5f)
                verticalLineTo(15f)
                horizontalLineTo(5.76f)
                curveTo(6.31f, 14.39f, 7.11f, 14f, 8f, 14f)
                curveTo(8.89f, 14f, 9.69f, 14.39f, 10.24f, 15f)
                horizontalLineTo(15f)
                verticalLineTo(6f)
                horizontalLineTo(3f)
                verticalLineTo(6f)
                curveTo(3f, 4.89f, 3.89f, 4f, 5f, 4f)
                horizontalLineTo(17f)
                verticalLineTo(8f)
                horizontalLineTo(20f)
                close()
            }
        }.build()

        return _TruckFastOutline!!
    }

@Suppress("ObjectPropertyName")
private var _TruckFastOutline: ImageVector? = null
