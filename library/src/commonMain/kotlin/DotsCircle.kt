package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.DotsCircle: ImageVector
    get() {
        if (_DotsCircle != null) {
            return _DotsCircle!!
        }
        _DotsCircle = ImageVector.Builder(
            name = "DotsCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 19f)
                curveTo(13.1f, 19f, 14f, 19.9f, 14f, 21f)
                reflectiveCurveTo(13.1f, 23f, 12f, 23f)
                reflectiveCurveTo(10f, 22.1f, 10f, 21f)
                reflectiveCurveTo(10.9f, 19f, 12f, 19f)
                moveTo(12f, 1f)
                curveTo(13.1f, 1f, 14f, 1.9f, 14f, 3f)
                reflectiveCurveTo(13.1f, 5f, 12f, 5f)
                reflectiveCurveTo(10f, 4.1f, 10f, 3f)
                reflectiveCurveTo(10.9f, 1f, 12f, 1f)
                moveTo(6f, 16f)
                curveTo(7.1f, 16f, 8f, 16.9f, 8f, 18f)
                reflectiveCurveTo(7.1f, 20f, 6f, 20f)
                reflectiveCurveTo(4f, 19.1f, 4f, 18f)
                reflectiveCurveTo(4.9f, 16f, 6f, 16f)
                moveTo(3f, 10f)
                curveTo(4.1f, 10f, 5f, 10.9f, 5f, 12f)
                reflectiveCurveTo(4.1f, 14f, 3f, 14f)
                reflectiveCurveTo(1f, 13.1f, 1f, 12f)
                reflectiveCurveTo(1.9f, 10f, 3f, 10f)
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
                moveTo(21f, 10f)
                curveTo(22.1f, 10f, 23f, 10.9f, 23f, 12f)
                reflectiveCurveTo(22.1f, 14f, 21f, 14f)
                reflectiveCurveTo(19f, 13.1f, 19f, 12f)
                reflectiveCurveTo(19.9f, 10f, 21f, 10f)
                moveTo(18f, 4f)
                curveTo(19.1f, 4f, 20f, 4.9f, 20f, 6f)
                reflectiveCurveTo(19.1f, 8f, 18f, 8f)
                reflectiveCurveTo(16f, 7.1f, 16f, 6f)
                reflectiveCurveTo(16.9f, 4f, 18f, 4f)
                close()
            }
        }.build()

        return _DotsCircle!!
    }

@Suppress("ObjectPropertyName")
private var _DotsCircle: ImageVector? = null
