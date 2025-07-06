package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.FoodSteak: ImageVector
    get() {
        if (_FoodSteak != null) {
            return _FoodSteak!!
        }
        _FoodSteak = ImageVector.Builder(
            name = "FoodSteak",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.9f, 2f)
                curveTo(8f, 2f, 4.9f, 5.4f, 5f, 9.3f)
                curveTo(5.1f, 11.9f, 6.6f, 14.1f, 8.7f, 15.2f)
                curveTo(10.1f, 15.9f, 11f, 17.3f, 11f, 18.8f)
                verticalLineTo(19f)
                curveTo(11f, 20.7f, 12.3f, 22f, 14f, 22f)
                curveTo(18f, 22f, 19f, 17f, 19f, 9f)
                curveTo(19f, 9f, 19f, 2f, 11.9f, 2f)
                moveTo(14f, 20f)
                curveTo(13.4f, 20f, 13f, 19.6f, 13f, 19f)
                verticalLineTo(18.8f)
                curveTo(13f, 16.6f, 11.7f, 14.5f, 9.7f, 13.4f)
                curveTo(8.1f, 12.6f, 7.1f, 11f, 7f, 9.2f)
                curveTo(7f, 7.9f, 7.5f, 6.5f, 8.4f, 5.5f)
                curveTo(9.3f, 4.5f, 10.6f, 4f, 11.8f, 4f)
                curveTo(16.7f, 4f, 17f, 8.2f, 17f, 9f)
                curveTo(17f, 18.9f, 15.3f, 20f, 14f, 20f)
                moveTo(15.8f, 7.6f)
                lineTo(8.3f, 10.3f)
                curveTo(8.1f, 10f, 8f, 9.6f, 8f, 9.1f)
                curveTo(8f, 8.4f, 8.2f, 7.8f, 8.5f, 7.1f)
                lineTo(13.7f, 5.2f)
                curveTo(14.9f, 5.8f, 15.5f, 6.7f, 15.8f, 7.6f)
                moveTo(12.9f, 15.1f)
                lineTo(15.7f, 14.1f)
                curveTo(15.6f, 15.6f, 15.3f, 16.7f, 15.1f, 17.4f)
                lineTo(13.8f, 17.9f)
                curveTo(13.8f, 16.9f, 13.5f, 16f, 12.9f, 15.1f)
                moveTo(16f, 9.2f)
                curveTo(16f, 10.4f, 16f, 11.5f, 15.9f, 12.4f)
                lineTo(11.9f, 13.9f)
                curveTo(11.4f, 13.4f, 10.8f, 12.9f, 10.1f, 12.6f)
                curveTo(9.7f, 12.4f, 9.3f, 12.1f, 9f, 11.8f)
                lineTo(16f, 9.2f)
                close()
            }
        }.build()

        return _FoodSteak!!
    }

@Suppress("ObjectPropertyName")
private var _FoodSteak: ImageVector? = null
