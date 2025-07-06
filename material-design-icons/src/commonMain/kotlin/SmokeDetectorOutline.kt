package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SmokeDetectorOutline: ImageVector
    get() {
        if (_SmokeDetectorOutline != null) {
            return _SmokeDetectorOutline!!
        }
        _SmokeDetectorOutline = ImageVector.Builder(
            name = "SmokeDetectorOutline",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveTo(3.89f, 3f, 3f, 3.89f, 3f, 5f)
                verticalLineTo(19f)
                curveTo(3f, 20.1f, 3.89f, 21f, 5f, 21f)
                horizontalLineTo(19f)
                curveTo(20.11f, 21f, 21f, 20.11f, 21f, 19f)
                verticalLineTo(5f)
                curveTo(21f, 3.9f, 20.11f, 3f, 19f, 3f)
                moveTo(19f, 19f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineTo(19f)
                verticalLineTo(19f)
                moveTo(12f, 18f)
                curveTo(15.31f, 18f, 18f, 15.31f, 18f, 12f)
                curveTo(18f, 8.68f, 15.31f, 6f, 12f, 6f)
                curveTo(8.68f, 6f, 6f, 8.68f, 6f, 12f)
                curveTo(6f, 15.31f, 8.69f, 18f, 12f, 18f)
                moveTo(12f, 8f)
                curveTo(14.21f, 8f, 16f, 9.79f, 16f, 12f)
                reflectiveCurveTo(14.21f, 16f, 12f, 16f)
                reflectiveCurveTo(8f, 14.21f, 8f, 12f)
                reflectiveCurveTo(9.79f, 8f, 12f, 8f)
                close()
            }
        }.build()

        return _SmokeDetectorOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SmokeDetectorOutline: ImageVector? = null
