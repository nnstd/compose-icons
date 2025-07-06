package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DotsHexagon: ImageVector
    get() {
        if (_DotsHexagon != null) {
            return _DotsHexagon!!
        }
        _DotsHexagon = ImageVector.Builder(
            name = "DotsHexagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 12f)
                curveTo(16f, 10.9f, 16.9f, 10f, 18f, 10f)
                reflectiveCurveTo(20f, 10.9f, 20f, 12f)
                reflectiveCurveTo(19.1f, 14f, 18f, 14f)
                reflectiveCurveTo(16f, 13.1f, 16f, 12f)
                moveTo(10f, 12f)
                curveTo(10f, 10.9f, 10.9f, 10f, 12f, 10f)
                reflectiveCurveTo(14f, 10.9f, 14f, 12f)
                reflectiveCurveTo(13.1f, 14f, 12f, 14f)
                reflectiveCurveTo(10f, 13.1f, 10f, 12f)
                moveTo(4f, 12f)
                curveTo(4f, 10.9f, 4.9f, 10f, 6f, 10f)
                reflectiveCurveTo(8f, 10.9f, 8f, 12f)
                reflectiveCurveTo(7.1f, 14f, 6f, 14f)
                reflectiveCurveTo(4f, 13.1f, 4f, 12f)
                moveTo(13f, 18f)
                curveTo(13f, 16.9f, 13.9f, 16f, 15f, 16f)
                reflectiveCurveTo(17f, 16.9f, 17f, 18f)
                reflectiveCurveTo(16.1f, 20f, 15f, 20f)
                reflectiveCurveTo(13f, 19.1f, 13f, 18f)
                moveTo(7f, 18f)
                curveTo(7f, 16.9f, 7.9f, 16f, 9f, 16f)
                reflectiveCurveTo(11f, 16.9f, 11f, 18f)
                reflectiveCurveTo(10.1f, 20f, 9f, 20f)
                reflectiveCurveTo(7f, 19.1f, 7f, 18f)
                moveTo(13f, 6f)
                curveTo(13f, 4.9f, 13.9f, 4f, 15f, 4f)
                reflectiveCurveTo(17f, 4.9f, 17f, 6f)
                reflectiveCurveTo(16.1f, 8f, 15f, 8f)
                reflectiveCurveTo(13f, 7.1f, 13f, 6f)
                moveTo(7f, 6f)
                curveTo(7f, 4.9f, 7.9f, 4f, 9f, 4f)
                reflectiveCurveTo(11f, 4.9f, 11f, 6f)
                reflectiveCurveTo(10.1f, 8f, 9f, 8f)
                reflectiveCurveTo(7f, 7.1f, 7f, 6f)
            }
        }.build()

        return _DotsHexagon!!
    }

@Suppress("ObjectPropertyName")
private var _DotsHexagon: ImageVector? = null
