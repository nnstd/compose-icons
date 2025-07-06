package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.WaterOffOutline: ImageVector
    get() {
        if (_WaterOffOutline != null) {
            return _WaterOffOutline!!
        }
        _WaterOffOutline = ImageVector.Builder(
            name = "WaterOffOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(7.65f, 9.54f)
                curveTo(6.74f, 11.03f, 6f, 12.65f, 6f, 14.23f)
                curveTo(6f, 17.54f, 8.69f, 20.23f, 12f, 20.23f)
                curveTo(13.74f, 20.23f, 15.3f, 19.5f, 16.4f, 18.29f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(12f, 18.23f)
                curveTo(9.78f, 18.23f, 8f, 16.45f, 8f, 14.23f)
                curveTo(8f, 13.5f, 8.5f, 12.27f, 9.14f, 11.03f)
                lineTo(15f, 16.88f)
                curveTo(14.26f, 17.71f, 13.2f, 18.23f, 12f, 18.23f)
                moveTo(11.14f, 7.94f)
                lineTo(9.71f, 6.5f)
                curveTo(10.57f, 5.38f, 11.25f, 4.61f, 11.25f, 4.61f)
                lineTo(12f, 3.77f)
                lineTo(12.75f, 4.61f)
                curveTo(12.75f, 4.61f, 14.03f, 6.06f, 15.32f, 7.94f)
                reflectiveCurveTo(18f, 12.07f, 18f, 14.23f)
                curveTo(18f, 14.41f, 18f, 14.59f, 17.97f, 14.77f)
                lineTo(15.46f, 12.26f)
                curveTo(15f, 11.23f, 14.37f, 10.07f, 13.68f, 9.07f)
                curveTo(12.84f, 7.85f, 12.44f, 7.42f, 12f, 6.9f)
                curveTo(11.73f, 7.21f, 11.5f, 7.5f, 11.14f, 7.94f)
                close()
            }
        }.build()

        return _WaterOffOutline!!
    }

@Suppress("ObjectPropertyName")
private var _WaterOffOutline: ImageVector? = null
