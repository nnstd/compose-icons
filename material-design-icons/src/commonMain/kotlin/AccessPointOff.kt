package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccessPointOff: ImageVector
    get() {
        if (_AccessPointOff != null) {
            return _AccessPointOff!!
        }
        _AccessPointOff = ImageVector.Builder(
            name = "AccessPointOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.84f, 22.73f)
                lineTo(12.1f, 14f)
                curveTo(12.06f, 14f, 12.03f, 14f, 12f, 14f)
                curveTo(10.9f, 14f, 10f, 13.11f, 10f, 12f)
                curveTo(10f, 11.97f, 10f, 11.94f, 10f, 11.9f)
                lineTo(8.4f, 10.29f)
                curveTo(8.15f, 10.81f, 8f, 11.38f, 8f, 12f)
                curveTo(8f, 13.11f, 8.45f, 14.11f, 9.17f, 14.83f)
                lineTo(7.76f, 16.24f)
                curveTo(6.67f, 15.15f, 6f, 13.65f, 6f, 12f)
                curveTo(6f, 10.83f, 6.34f, 9.74f, 6.93f, 8.82f)
                lineTo(5.5f, 7.37f)
                curveTo(4.55f, 8.67f, 4f, 10.27f, 4f, 12f)
                curveTo(4f, 14.22f, 4.89f, 16.22f, 6.34f, 17.66f)
                lineTo(4.93f, 19.07f)
                curveTo(3.12f, 17.26f, 2f, 14.76f, 2f, 12f)
                curveTo(2f, 9.72f, 2.77f, 7.63f, 4.06f, 5.95f)
                lineTo(1.11f, 3f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                moveTo(15.93f, 12.73f)
                lineTo(17.53f, 14.33f)
                curveTo(17.83f, 13.61f, 18f, 12.83f, 18f, 12f)
                curveTo(18f, 10.35f, 17.33f, 8.85f, 16.24f, 7.76f)
                lineTo(14.83f, 9.17f)
                curveTo(15.55f, 9.89f, 16f, 10.89f, 16f, 12f)
                curveTo(16f, 12.25f, 15.97f, 12.5f, 15.93f, 12.73f)
                moveTo(19.03f, 15.83f)
                lineTo(20.5f, 17.28f)
                curveTo(21.44f, 15.75f, 22f, 13.94f, 22f, 12f)
                curveTo(22f, 9.24f, 20.88f, 6.74f, 19.07f, 4.93f)
                lineTo(17.66f, 6.34f)
                curveTo(19.11f, 7.78f, 20f, 9.79f, 20f, 12f)
                curveTo(20f, 13.39f, 19.65f, 14.7f, 19.03f, 15.83f)
                close()
            }
        }.build()

        return _AccessPointOff!!
    }

@Suppress("ObjectPropertyName")
private var _AccessPointOff: ImageVector? = null
