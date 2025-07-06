package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DotsTriangle: ImageVector
    get() {
        if (_DotsTriangle != null) {
            return _DotsTriangle!!
        }
        _DotsTriangle = ImageVector.Builder(
            name = "DotsTriangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 16f)
                curveTo(13.1f, 16f, 14f, 16.9f, 14f, 18f)
                reflectiveCurveTo(13.1f, 20f, 12f, 20f)
                reflectiveCurveTo(10f, 19.1f, 10f, 18f)
                reflectiveCurveTo(10.9f, 16f, 12f, 16f)
                moveTo(15f, 10f)
                curveTo(16.1f, 10f, 17f, 10.9f, 17f, 12f)
                reflectiveCurveTo(16.1f, 14f, 15f, 14f)
                reflectiveCurveTo(13f, 13.1f, 13f, 12f)
                reflectiveCurveTo(13.9f, 10f, 15f, 10f)
                moveTo(6f, 16f)
                curveTo(7.1f, 16f, 8f, 16.9f, 8f, 18f)
                reflectiveCurveTo(7.1f, 20f, 6f, 20f)
                reflectiveCurveTo(4f, 19.1f, 4f, 18f)
                reflectiveCurveTo(4.9f, 16f, 6f, 16f)
                moveTo(9f, 10f)
                curveTo(10.1f, 10f, 11f, 10.9f, 11f, 12f)
                reflectiveCurveTo(10.1f, 14f, 9f, 14f)
                reflectiveCurveTo(7f, 13.1f, 7f, 12f)
                reflectiveCurveTo(7.9f, 10f, 9f, 10f)
                moveTo(12f, 4f)
                curveTo(13.1f, 4f, 14f, 4.9f, 14f, 6f)
                reflectiveCurveTo(13.1f, 8f, 12f, 8f)
                reflectiveCurveTo(10f, 7.1f, 10f, 6f)
                reflectiveCurveTo(10.9f, 4f, 12f, 4f)
                moveTo(18f, 16f)
                curveTo(19.1f, 16f, 20f, 16.9f, 20f, 18f)
                reflectiveCurveTo(19.1f, 20f, 18f, 20f)
                reflectiveCurveTo(16f, 19.1f, 16f, 18f)
                reflectiveCurveTo(16.9f, 16f, 18f, 16f)
            }
        }.build()

        return _DotsTriangle!!
    }

@Suppress("ObjectPropertyName")
private var _DotsTriangle: ImageVector? = null
