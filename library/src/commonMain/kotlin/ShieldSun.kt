package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.ShieldSun: ImageVector
    get() {
        if (_ShieldSun != null) {
            return _ShieldSun!!
        }
        _ShieldSun = ImageVector.Builder(
            name = "ShieldSun",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                lineTo(3f, 5f)
                verticalLineTo(11f)
                curveTo(3f, 16.55f, 6.84f, 21.74f, 12f, 23f)
                curveTo(17.16f, 21.74f, 21f, 16.55f, 21f, 11f)
                verticalLineTo(5f)
                lineTo(12f, 1f)
                moveTo(12f, 8.89f)
                curveTo(13.6f, 8.89f, 14.89f, 10.18f, 14.89f, 11.78f)
                reflectiveCurveTo(13.6f, 14.67f, 12f, 14.67f)
                reflectiveCurveTo(9.11f, 13.37f, 9.11f, 11.78f)
                reflectiveCurveTo(10.41f, 8.89f, 12f, 8.89f)
                moveTo(12f, 6f)
                lineTo(13.38f, 8f)
                curveTo(12.96f, 7.82f, 12.5f, 7.73f, 12f, 7.73f)
                reflectiveCurveTo(11.05f, 7.82f, 10.62f, 8f)
                lineTo(12f, 6f)
                moveTo(7f, 8.89f)
                lineTo(9.4f, 8.69f)
                curveTo(9.06f, 9f, 8.74f, 9.34f, 8.5f, 9.76f)
                curveTo(8.25f, 10.18f, 8.1f, 10.62f, 8f, 11.08f)
                lineTo(7f, 8.89f)
                moveTo(7f, 14.67f)
                lineTo(8.03f, 12.5f)
                curveTo(8.11f, 12.93f, 8.27f, 13.38f, 8.5f, 13.8f)
                curveTo(8.75f, 14.23f, 9.06f, 14.59f, 9.4f, 14.88f)
                lineTo(7f, 14.67f)
                moveTo(17f, 8.89f)
                lineTo(16f, 11.08f)
                curveTo(15.9f, 10.62f, 15.74f, 10.18f, 15.5f, 9.76f)
                curveTo(15.26f, 9.34f, 14.95f, 9f, 14.6f, 8.68f)
                lineTo(17f, 8.89f)
                moveTo(17f, 14.67f)
                lineTo(14.6f, 14.87f)
                curveTo(14.94f, 14.58f, 15.25f, 14.22f, 15.5f, 13.8f)
                curveTo(15.74f, 13.38f, 15.89f, 12.93f, 15.97f, 12.5f)
                lineTo(17f, 14.67f)
                moveTo(12f, 17.55f)
                lineTo(10.61f, 15.57f)
                curveTo(11.04f, 15.72f, 11.5f, 15.82f, 12f, 15.82f)
                curveTo(12.5f, 15.82f, 12.95f, 15.72f, 13.37f, 15.57f)
                lineTo(12f, 17.55f)
                close()
            }
        }.build()

        return _ShieldSun!!
    }

@Suppress("ObjectPropertyName")
private var _ShieldSun: ImageVector? = null
