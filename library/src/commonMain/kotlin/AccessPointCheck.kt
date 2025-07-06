package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.AccessPointCheck: ImageVector
    get() {
        if (_AccessPointCheck != null) {
            return _AccessPointCheck!!
        }
        _AccessPointCheck = ImageVector.Builder(
            name = "AccessPointCheck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.59f, 14.84f)
                lineTo(21.75f, 16.25f)
                lineTo(17f, 21f)
                lineTo(14.25f, 18f)
                lineTo(15.41f, 16.84f)
                lineTo(17f, 18.43f)
                lineTo(20.59f, 14.84f)
                moveTo(19.07f, 4.93f)
                lineTo(17.66f, 6.34f)
                curveTo(19.11f, 7.78f, 20f, 9.79f, 20f, 12f)
                verticalLineTo(12.34f)
                curveTo(20.68f, 12.59f, 21.33f, 12.96f, 21.88f, 13.43f)
                curveTo(21.95f, 12.96f, 22f, 12.5f, 22f, 12f)
                curveTo(22f, 9.24f, 20.88f, 6.74f, 19.07f, 4.93f)
                moveTo(15.96f, 12.36f)
                curveTo(16.6f, 12.13f, 17.28f, 12f, 18f, 12f)
                curveTo(18f, 10.35f, 17.33f, 8.85f, 16.24f, 7.76f)
                lineTo(14.83f, 9.17f)
                curveTo(15.55f, 9.89f, 16f, 10.89f, 16f, 12f)
                curveTo(16f, 12.12f, 15.97f, 12.24f, 15.96f, 12.36f)
                moveTo(12f, 10f)
                curveTo(10.9f, 10f, 10f, 10.9f, 10f, 12f)
                reflectiveCurveTo(10.9f, 14f, 12f, 14f)
                reflectiveCurveTo(14f, 13.1f, 14f, 12f)
                reflectiveCurveTo(13.1f, 10f, 12f, 10f)
                moveTo(6.34f, 6.34f)
                lineTo(4.93f, 4.93f)
                curveTo(3.12f, 6.74f, 2f, 9.24f, 2f, 12f)
                reflectiveCurveTo(3.12f, 17.26f, 4.93f, 19.07f)
                lineTo(6.34f, 17.66f)
                curveTo(4.89f, 16.22f, 4f, 14.22f, 4f, 12f)
                curveTo(4f, 9.79f, 4.89f, 7.78f, 6.34f, 6.34f)
                moveTo(7.76f, 7.76f)
                curveTo(6.67f, 8.85f, 6f, 10.35f, 6f, 12f)
                reflectiveCurveTo(6.67f, 15.15f, 7.76f, 16.24f)
                lineTo(9.17f, 14.83f)
                curveTo(8.45f, 14.11f, 8f, 13.11f, 8f, 12f)
                reflectiveCurveTo(8.45f, 9.89f, 9.17f, 9.17f)
                lineTo(7.76f, 7.76f)
                close()
            }
        }.build()

        return _AccessPointCheck!!
    }

@Suppress("ObjectPropertyName")
private var _AccessPointCheck: ImageVector? = null
