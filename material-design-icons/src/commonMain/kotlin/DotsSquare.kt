package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DotsSquare: ImageVector
    get() {
        if (_DotsSquare != null) {
            return _DotsSquare!!
        }
        _DotsSquare = ImageVector.Builder(
            name = "DotsSquare",
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
                moveTo(12f, 4f)
                curveTo(13.1f, 4f, 14f, 4.9f, 14f, 6f)
                reflectiveCurveTo(13.1f, 8f, 12f, 8f)
                reflectiveCurveTo(10f, 7.1f, 10f, 6f)
                reflectiveCurveTo(10.9f, 4f, 12f, 4f)
                moveTo(6f, 16f)
                curveTo(7.1f, 16f, 8f, 16.9f, 8f, 18f)
                reflectiveCurveTo(7.1f, 20f, 6f, 20f)
                reflectiveCurveTo(4f, 19.1f, 4f, 18f)
                reflectiveCurveTo(4.9f, 16f, 6f, 16f)
                moveTo(6f, 10f)
                curveTo(7.1f, 10f, 8f, 10.9f, 8f, 12f)
                reflectiveCurveTo(7.1f, 14f, 6f, 14f)
                reflectiveCurveTo(4f, 13.1f, 4f, 12f)
                reflectiveCurveTo(4.9f, 10f, 6f, 10f)
                moveTo(6f, 4f)
                curveTo(7.1f, 4f, 8f, 4.9f, 8f, 6f)
                reflectiveCurveTo(7.1f, 8f, 6f, 8f)
                reflectiveCurveTo(4f, 7.1f, 4f, 6f)
                reflectiveCurveTo(4.9f, 4f, 6f, 4f)
                moveTo(18f, 16f)
                curveTo(19.1f, 16f, 20f, 16.9f, 20f, 18f)
                reflectiveCurveTo(19.1f, 20f, 18f, 20f)
                reflectiveCurveTo(16f, 19.1f, 16f, 18f)
                reflectiveCurveTo(16.9f, 16f, 18f, 16f)
                moveTo(18f, 10f)
                curveTo(19.1f, 10f, 20f, 10.9f, 20f, 12f)
                reflectiveCurveTo(19.1f, 14f, 18f, 14f)
                reflectiveCurveTo(16f, 13.1f, 16f, 12f)
                reflectiveCurveTo(16.9f, 10f, 18f, 10f)
                moveTo(18f, 4f)
                curveTo(19.1f, 4f, 20f, 4.9f, 20f, 6f)
                reflectiveCurveTo(19.1f, 8f, 18f, 8f)
                reflectiveCurveTo(16f, 7.1f, 16f, 6f)
                reflectiveCurveTo(16.9f, 4f, 18f, 4f)
                close()
            }
        }.build()

        return _DotsSquare!!
    }

@Suppress("ObjectPropertyName")
private var _DotsSquare: ImageVector? = null
