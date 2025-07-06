package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SkullScan: ImageVector
    get() {
        if (_SkullScan != null) {
            return _SkullScan!!
        }
        _SkullScan = ImageVector.Builder(
            name = "SkullScan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 0f)
                curveTo(0.9f, 0f, 0f, 0.9f, 0f, 2f)
                verticalLineTo(6f)
                horizontalLineTo(2f)
                verticalLineTo(2f)
                horizontalLineTo(6f)
                verticalLineTo(0f)
                horizontalLineTo(2f)
                moveTo(18f, 0f)
                verticalLineTo(2f)
                horizontalLineTo(22f)
                verticalLineTo(6f)
                horizontalLineTo(24f)
                verticalLineTo(2f)
                curveTo(24f, 0.9f, 23.1f, 0f, 22f, 0f)
                horizontalLineTo(18f)
                moveTo(12f, 3f)
                curveTo(7.6f, 3f, 4f, 6.6f, 4f, 11f)
                curveTo(4f, 13.5f, 5.2f, 15.8f, 7f, 17.2f)
                verticalLineTo(21f)
                horizontalLineTo(9f)
                verticalLineTo(18f)
                horizontalLineTo(11f)
                verticalLineTo(21f)
                horizontalLineTo(13f)
                verticalLineTo(18f)
                horizontalLineTo(15f)
                verticalLineTo(21f)
                horizontalLineTo(17f)
                verticalLineTo(17.2f)
                curveTo(18.8f, 15.7f, 20f, 13.5f, 20f, 11f)
                curveTo(20f, 6.6f, 16.4f, 3f, 12f, 3f)
                moveTo(8f, 14f)
                curveTo(6.9f, 14f, 6f, 13.1f, 6f, 12f)
                reflectiveCurveTo(6.9f, 10f, 8f, 10f)
                reflectiveCurveTo(10f, 10.9f, 10f, 12f)
                reflectiveCurveTo(9.1f, 14f, 8f, 14f)
                moveTo(10.5f, 16f)
                lineTo(12f, 13f)
                lineTo(13.5f, 16f)
                horizontalLineTo(10.5f)
                moveTo(16f, 14f)
                curveTo(14.9f, 14f, 14f, 13.1f, 14f, 12f)
                reflectiveCurveTo(14.9f, 10f, 16f, 10f)
                reflectiveCurveTo(18f, 10.9f, 18f, 12f)
                reflectiveCurveTo(17.1f, 14f, 16f, 14f)
                moveTo(0f, 18f)
                verticalLineTo(22f)
                curveTo(0f, 23.1f, 0.9f, 24f, 2f, 24f)
                horizontalLineTo(6f)
                verticalLineTo(22f)
                horizontalLineTo(2f)
                verticalLineTo(18f)
                horizontalLineTo(0f)
                moveTo(22f, 18f)
                verticalLineTo(22f)
                horizontalLineTo(18f)
                verticalLineTo(24f)
                horizontalLineTo(22f)
                curveTo(23.1f, 24f, 24f, 23.1f, 24f, 22f)
                verticalLineTo(18f)
                horizontalLineTo(22f)
                close()
            }
        }.build()

        return _SkullScan!!
    }

@Suppress("ObjectPropertyName")
private var _SkullScan: ImageVector? = null
