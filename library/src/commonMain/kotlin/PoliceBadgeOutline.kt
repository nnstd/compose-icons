package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.PoliceBadgeOutline: ImageVector
    get() {
        if (_PoliceBadgeOutline != null) {
            return _PoliceBadgeOutline!!
        }
        _PoliceBadgeOutline = ImageVector.Builder(
            name = "PoliceBadgeOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4.21f)
                curveTo(13.24f, 4.72f, 14.65f, 5f, 16f, 5f)
                curveTo(17.05f, 5f, 18.1f, 4.84f, 19.08f, 4.54f)
                curveTo(18.5f, 5.5f, 18f, 6.71f, 18f, 8f)
                curveTo(18f, 9.32f, 18.54f, 10.93f, 19.1f, 12.63f)
                curveTo(19.5f, 13.83f, 20f, 15.33f, 20f, 16f)
                curveTo(20f, 17.03f, 16.47f, 19f, 12f, 19.96f)
                curveTo(7.54f, 19f, 4f, 17.03f, 4f, 16f)
                curveTo(4f, 15.33f, 4.5f, 13.83f, 4.9f, 12.63f)
                curveTo(5.46f, 10.93f, 6f, 9.32f, 6f, 8f)
                curveTo(6f, 6.71f, 5.5f, 5.5f, 4.92f, 4.54f)
                curveTo(5.9f, 4.84f, 6.96f, 5f, 8f, 5f)
                curveTo(9.35f, 5f, 10.76f, 4.72f, 12f, 4.21f)
                moveTo(20f, 2f)
                curveTo(18.85f, 2.64f, 17.4f, 3f, 16f, 3f)
                curveTo(14.6f, 3f, 13.14f, 2.63f, 12f, 2f)
                curveTo(10.86f, 2.63f, 9.4f, 3f, 8f, 3f)
                curveTo(6.6f, 3f, 5.15f, 2.64f, 4f, 2f)
                lineTo(2f, 4f)
                curveTo(2f, 4f, 4f, 6f, 4f, 8f)
                reflectiveCurveTo(2f, 14f, 2f, 16f)
                curveTo(2f, 20f, 12f, 22f, 12f, 22f)
                reflectiveCurveTo(22f, 20f, 22f, 16f)
                curveTo(22f, 14f, 20f, 10f, 20f, 8f)
                reflectiveCurveTo(22f, 4f, 22f, 4f)
                lineTo(20f, 2f)
                moveTo(15.05f, 16.45f)
                lineTo(11.97f, 14.59f)
                lineTo(8.9f, 16.45f)
                lineTo(9.72f, 12.95f)
                lineTo(7f, 10.61f)
                lineTo(10.58f, 10.3f)
                lineTo(11.97f, 7f)
                lineTo(13.37f, 10.29f)
                lineTo(16.95f, 10.6f)
                lineTo(14.23f, 12.94f)
                lineTo(15.05f, 16.45f)
            }
        }.build()

        return _PoliceBadgeOutline!!
    }

@Suppress("ObjectPropertyName")
private var _PoliceBadgeOutline: ImageVector? = null
