package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.Ocarina: ImageVector
    get() {
        if (_Ocarina != null) {
            return _Ocarina!!
        }
        _Ocarina = ImageVector.Builder(
            name = "Ocarina",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 12f)
                curveTo(16.8f, 10.4f, 13.4f, 9.7f, 10.8f, 9.3f)
                lineTo(9.7f, 5.9f)
                curveTo(9.3f, 4.8f, 7.7f, 4.8f, 7.3f, 5.9f)
                lineTo(6.3f, 9f)
                curveTo(3.9f, 9.4f, 2f, 11.5f, 2f, 14f)
                curveTo(2f, 16.8f, 4.2f, 19f, 7f, 19f)
                curveTo(7f, 19f, 14f, 19f, 20f, 16f)
                curveTo(20f, 16f, 22f, 15f, 22f, 14f)
                curveTo(22f, 13f, 20f, 12f, 20f, 12f)
                moveTo(5f, 14f)
                curveTo(4.4f, 14f, 4f, 13.6f, 4f, 13f)
                curveTo(4f, 12.4f, 4.4f, 12f, 5f, 12f)
                curveTo(5.6f, 12f, 6f, 12.4f, 6f, 13f)
                curveTo(6f, 13.5f, 5.6f, 14f, 5f, 14f)
                moveTo(7f, 17f)
                curveTo(6.4f, 17f, 6f, 16.6f, 6f, 16f)
                curveTo(6f, 15.4f, 6.4f, 15f, 7f, 15f)
                curveTo(7.6f, 15f, 8f, 15.4f, 8f, 16f)
                curveTo(8f, 16.5f, 7.6f, 17f, 7f, 17f)
                moveTo(9f, 14f)
                curveTo(8.4f, 14f, 8f, 13.6f, 8f, 13f)
                curveTo(8f, 12.4f, 8.4f, 12f, 9f, 12f)
                curveTo(9.6f, 12f, 10f, 12.4f, 10f, 13f)
                curveTo(10f, 13.5f, 9.6f, 14f, 9f, 14f)
                moveTo(11f, 17f)
                curveTo(10.4f, 17f, 10f, 16.6f, 10f, 16f)
                curveTo(10f, 15.4f, 10.4f, 15f, 11f, 15f)
                curveTo(11.6f, 15f, 12f, 15.4f, 12f, 16f)
                curveTo(12f, 16.5f, 11.6f, 17f, 11f, 17f)
                moveTo(16f, 14f)
                curveTo(15.4f, 14f, 15f, 13.6f, 15f, 13f)
                curveTo(15f, 12.4f, 15.4f, 12f, 16f, 12f)
                curveTo(16.6f, 12f, 17f, 12.4f, 17f, 13f)
                curveTo(17f, 13.5f, 16.6f, 14f, 16f, 14f)
                moveTo(19f, 15f)
                curveTo(18.4f, 15f, 18f, 14.6f, 18f, 14f)
                curveTo(18f, 13.4f, 18.4f, 13f, 19f, 13f)
                curveTo(19.6f, 13f, 20f, 13.4f, 20f, 14f)
                curveTo(20f, 14.5f, 19.6f, 15f, 19f, 15f)
                close()
            }
        }.build()

        return _Ocarina!!
    }

@Suppress("ObjectPropertyName")
private var _Ocarina: ImageVector? = null
