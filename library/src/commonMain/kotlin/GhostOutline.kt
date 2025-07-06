package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.GhostOutline: ImageVector
    get() {
        if (_GhostOutline != null) {
            return _GhostOutline!!
        }
        _GhostOutline = ImageVector.Builder(
            name = "GhostOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 2f)
                curveTo(7.03f, 2f, 3f, 6.03f, 3f, 11f)
                verticalLineTo(22f)
                lineTo(6f, 19f)
                lineTo(9f, 22f)
                lineTo(12f, 19f)
                lineTo(15f, 22f)
                lineTo(18f, 19f)
                lineTo(21f, 22f)
                verticalLineTo(11f)
                curveTo(21f, 6.03f, 16.97f, 2f, 12f, 2f)
                moveTo(19f, 17.17f)
                lineTo(18f, 16.17f)
                lineTo(16.59f, 17.59f)
                lineTo(15f, 19.17f)
                lineTo(13.41f, 17.59f)
                lineTo(12f, 16.17f)
                lineTo(10.59f, 17.59f)
                lineTo(9f, 19.17f)
                lineTo(7.41f, 17.59f)
                lineTo(6f, 16.17f)
                lineTo(5f, 17.17f)
                verticalLineTo(11f)
                curveTo(5f, 7.14f, 8.14f, 4f, 12f, 4f)
                reflectiveCurveTo(19f, 7.14f, 19f, 11f)
                verticalLineTo(17.17f)
                moveTo(11f, 10f)
                curveTo(11f, 11.11f, 10.11f, 12f, 9f, 12f)
                reflectiveCurveTo(7f, 11.11f, 7f, 10f)
                reflectiveCurveTo(7.9f, 8f, 9f, 8f)
                reflectiveCurveTo(11f, 8.9f, 11f, 10f)
                moveTo(17f, 10f)
                curveTo(17f, 11.11f, 16.11f, 12f, 15f, 12f)
                reflectiveCurveTo(13f, 11.11f, 13f, 10f)
                reflectiveCurveTo(13.9f, 8f, 15f, 8f)
                reflectiveCurveTo(17f, 8.9f, 17f, 10f)
                close()
            }
        }.build()

        return _GhostOutline!!
    }

@Suppress("ObjectPropertyName")
private var _GhostOutline: ImageVector? = null
