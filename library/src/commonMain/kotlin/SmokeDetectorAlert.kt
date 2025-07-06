package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SmokeDetectorAlert: ImageVector
    get() {
        if (_SmokeDetectorAlert != null) {
            return _SmokeDetectorAlert!!
        }
        _SmokeDetectorAlert = ImageVector.Builder(
            name = "SmokeDetectorAlert",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 18f)
                curveTo(13.3f, 18f, 16f, 15.3f, 16f, 12f)
                curveTo(16f, 8.7f, 13.3f, 6f, 10f, 6f)
                curveTo(6.7f, 6f, 4f, 8.7f, 4f, 12f)
                curveTo(4f, 15.3f, 6.7f, 18f, 10f, 18f)
                moveTo(17f, 3f)
                curveTo(18.1f, 3f, 19f, 3.9f, 19f, 5f)
                verticalLineTo(19f)
                curveTo(19f, 20.1f, 18.1f, 21f, 17f, 21f)
                horizontalLineTo(3f)
                curveTo(1.9f, 21f, 1f, 20.1f, 1f, 19f)
                verticalLineTo(5f)
                curveTo(1f, 3.9f, 1.9f, 3f, 3f, 3f)
                horizontalLineTo(17f)
                moveTo(6f, 12f)
                curveTo(6f, 9.8f, 7.8f, 8f, 10f, 8f)
                reflectiveCurveTo(14f, 9.8f, 14f, 12f)
                reflectiveCurveTo(12.2f, 16f, 10f, 16f)
                reflectiveCurveTo(6f, 14.2f, 6f, 12f)
                moveTo(23f, 7f)
                horizontalLineTo(21f)
                verticalLineTo(13f)
                horizontalLineTo(23f)
                verticalLineTo(8f)
                moveTo(23f, 15f)
                horizontalLineTo(21f)
                verticalLineTo(17f)
                horizontalLineTo(23f)
                verticalLineTo(15f)
                close()
            }
        }.build()

        return _SmokeDetectorAlert!!
    }

@Suppress("ObjectPropertyName")
private var _SmokeDetectorAlert: ImageVector? = null
