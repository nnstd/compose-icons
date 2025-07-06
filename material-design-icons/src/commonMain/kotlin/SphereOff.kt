package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SphereOff: ImageVector
    get() {
        if (_SphereOff != null) {
            return _SphereOff!!
        }
        _SphereOff = ImageVector.Builder(
            name = "SphereOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3f)
                lineTo(4.06f, 5.95f)
                curveTo(2.77f, 7.63f, 2f, 9.72f, 2f, 12f)
                curveTo(2f, 17.5f, 6.5f, 22f, 12f, 22f)
                curveTo(14.28f, 22f, 16.37f, 21.23f, 18.05f, 19.94f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(5.5f, 7.39f)
                lineTo(6.58f, 8.47f)
                curveTo(5.87f, 8.62f, 5.18f, 8.8f, 4.57f, 9.05f)
                curveTo(4.81f, 8.45f, 5.13f, 7.9f, 5.5f, 7.39f)
                moveTo(4f, 12f)
                curveTo(4f, 11.23f, 5.76f, 10.56f, 8.33f, 10.22f)
                lineTo(12.11f, 14f)
                lineTo(12f, 14f)
                curveTo(7.58f, 14f, 4f, 13.11f, 4f, 12f)
                moveTo(12f, 20f)
                curveTo(8.63f, 20f, 5.75f, 17.91f, 4.57f, 14.95f)
                curveTo(6.07f, 15.57f, 8.39f, 16f, 12f, 16f)
                curveTo(12.63f, 16f, 13.33f, 16f, 14.05f, 15.94f)
                lineTo(16.63f, 18.5f)
                curveTo(15.32f, 19.45f, 13.73f, 20f, 12f, 20f)
                moveTo(8.19f, 5f)
                lineTo(6.72f, 3.5f)
                curveTo(8.25f, 2.56f, 10.06f, 2f, 12f, 2f)
                curveTo(17.5f, 2f, 22f, 6.5f, 22f, 12f)
                curveTo(22f, 13.94f, 21.44f, 15.75f, 20.5f, 17.28f)
                lineTo(19f, 15.81f)
                curveTo(19.17f, 15.54f, 19.31f, 15.25f, 19.43f, 14.96f)
                curveTo(19.13f, 15.08f, 18.81f, 15.18f, 18.47f, 15.27f)
                lineTo(16.8f, 13.6f)
                curveTo(18.74f, 13.23f, 20f, 12.65f, 20f, 12f)
                curveTo(20f, 11f, 17.06f, 10.17f, 13.23f, 10.03f)
                lineTo(11.21f, 8f)
                curveTo(11.5f, 8f, 11.75f, 8f, 12f, 8f)
                curveTo(15.61f, 8f, 17.93f, 8.43f, 19.43f, 9.05f)
                curveTo(18.25f, 6.09f, 15.37f, 4f, 12f, 4f)
                curveTo(10.61f, 4f, 9.32f, 4.36f, 8.19f, 5f)
                close()
            }
        }.build()

        return _SphereOff!!
    }

@Suppress("ObjectPropertyName")
private var _SphereOff: ImageVector? = null
