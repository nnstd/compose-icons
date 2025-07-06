package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.CarLightDimmed: ImageVector
    get() {
        if (_CarLightDimmed != null) {
            return _CarLightDimmed!!
        }
        _CarLightDimmed = ImageVector.Builder(
            name = "CarLightDimmed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 4.8f)
                curveTo(9f, 4.8f, 9f, 19.2f, 13f, 19.2f)
                curveTo(17f, 19.2f, 22f, 16.5f, 22f, 12f)
                curveTo(22f, 7.5f, 17f, 4.8f, 13f, 4.8f)
                moveTo(13.1f, 17.2f)
                curveTo(12.7f, 16.8f, 12f, 15f, 12f, 12f)
                curveTo(12f, 9f, 12.7f, 7.2f, 13.1f, 6.8f)
                curveTo(16f, 6.9f, 20f, 8.7f, 20f, 12f)
                curveTo(20f, 15.3f, 15.9f, 17.1f, 13.1f, 17.2f)
                moveTo(8f, 10.5f)
                curveTo(8f, 11f, 7.9f, 11.5f, 7.9f, 12f)
                curveTo(7.9f, 12.2f, 7.9f, 12.4f, 7.9f, 12.6f)
                lineTo(2.4f, 14f)
                lineTo(1.9f, 12.1f)
                lineTo(8f, 10.5f)
                moveTo(2f, 7f)
                lineTo(9.4f, 5.1f)
                curveTo(9.2f, 5.4f, 9f, 5.8f, 8.9f, 6.3f)
                curveTo(8.8f, 6.6f, 8.7f, 7f, 8.6f, 7.4f)
                lineTo(2.5f, 8.9f)
                lineTo(2f, 7f)
                moveTo(8.2f, 15.5f)
                curveTo(8.3f, 16.2f, 8.5f, 16.9f, 8.7f, 17.4f)
                lineTo(2.4f, 19f)
                lineTo(1.9f, 17.1f)
                lineTo(8.2f, 15.5f)
                close()
            }
        }.build()

        return _CarLightDimmed!!
    }

@Suppress("ObjectPropertyName")
private var _CarLightDimmed: ImageVector? = null
