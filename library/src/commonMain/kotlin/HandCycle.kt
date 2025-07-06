package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.HandCycle: ImageVector
    get() {
        if (_HandCycle != null) {
            return _HandCycle!!
        }
        _HandCycle = ImageVector.Builder(
            name = "HandCycle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 13f)
                curveTo(18.18f, 13f, 17.05f, 13.74f, 16.45f, 14.81f)
                lineTo(13.23f, 12.18f)
                lineTo(10.96f, 13f)
                lineTo(9.87f, 11.32f)
                lineTo(11.21f, 11.69f)
                lineTo(13.87f, 9.5f)
                lineTo(12.93f, 8.36f)
                lineTo(10.9f, 10.03f)
                lineTo(7.96f, 9f)
                curveTo(7.96f, 9f, 7.96f, 9f, 7.95f, 9f)
                curveTo(7.54f, 8.85f, 7.08f, 8.89f, 6.69f, 9.14f)
                curveTo(6.04f, 9.56f, 5.83f, 10.39f, 6.16f, 11.07f)
                curveTo(5.95f, 11.03f, 5.73f, 11f, 5.5f, 11f)
                curveTo(3f, 11f, 1f, 13f, 1f, 15.5f)
                reflectiveCurveTo(3f, 20f, 5.5f, 20f)
                reflectiveCurveTo(10f, 18f, 10f, 15.5f)
                curveTo(10f, 15.37f, 9.97f, 15.25f, 9.96f, 15.12f)
                lineTo(13f, 14f)
                lineTo(16f, 16.5f)
                lineTo(16f, 16.5f)
                curveTo(16f, 18.43f, 17.57f, 20f, 19.5f, 20f)
                reflectiveCurveTo(23f, 18.43f, 23f, 16.5f)
                reflectiveCurveTo(21.43f, 13f, 19.5f, 13f)
                moveTo(5.5f, 18.5f)
                curveTo(3.85f, 18.5f, 2.5f, 17.15f, 2.5f, 15.5f)
                reflectiveCurveTo(3.85f, 12.5f, 5.5f, 12.5f)
                reflectiveCurveTo(8.5f, 13.85f, 8.5f, 15.5f)
                reflectiveCurveTo(7.15f, 18.5f, 5.5f, 18.5f)
                moveTo(19.5f, 18.5f)
                curveTo(18.4f, 18.5f, 17.5f, 17.6f, 17.5f, 16.5f)
                reflectiveCurveTo(18.4f, 14.5f, 19.5f, 14.5f)
                reflectiveCurveTo(21.5f, 15.4f, 21.5f, 16.5f)
                reflectiveCurveTo(20.6f, 18.5f, 19.5f, 18.5f)
                moveTo(6.44f, 7.57f)
                curveTo(5.85f, 7f, 5.85f, 6.06f, 6.44f, 5.5f)
                curveTo(7.03f, 4.89f, 7.97f, 4.89f, 8.56f, 5.5f)
                curveTo(9.15f, 6.06f, 9.15f, 7f, 8.56f, 7.57f)
                curveTo(7.97f, 8.15f, 7.03f, 8.15f, 6.44f, 7.57f)
            }
        }.build()

        return _HandCycle!!
    }

@Suppress("ObjectPropertyName")
private var _HandCycle: ImageVector? = null
