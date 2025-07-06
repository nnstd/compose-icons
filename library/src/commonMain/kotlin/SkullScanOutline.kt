package org.nnstd.compose.icons.mdi

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialDesignIcons.SkullScanOutline: ImageVector
    get() {
        if (_SkullScanOutline != null) {
            return _SkullScanOutline!!
        }
        _SkullScanOutline = ImageVector.Builder(
            name = "SkullScanOutline",
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
                moveTo(9.5f, 13f)
                curveTo(8.7f, 13f, 8f, 12.3f, 8f, 11.5f)
                reflectiveCurveTo(8.7f, 10f, 9.5f, 10f)
                reflectiveCurveTo(11f, 10.7f, 11f, 11.5f)
                reflectiveCurveTo(10.3f, 13f, 9.5f, 13f)
                moveTo(11f, 15f)
                lineTo(12f, 13f)
                lineTo(13f, 15f)
                horizontalLineTo(11f)
                moveTo(14.5f, 13f)
                curveTo(13.7f, 13f, 13f, 12.3f, 13f, 11.5f)
                reflectiveCurveTo(13.7f, 10f, 14.5f, 10f)
                reflectiveCurveTo(16f, 10.7f, 16f, 11.5f)
                reflectiveCurveTo(15.3f, 13f, 14.5f, 13f)
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
                moveTo(12f, 3f)
                curveTo(7.6f, 3f, 4f, 6.6f, 4f, 11f)
                curveTo(4f, 13f, 4.8f, 14.9f, 6f, 16.3f)
                verticalLineTo(21f)
                horizontalLineTo(18f)
                verticalLineTo(16.3f)
                curveTo(19.2f, 14.9f, 20f, 13.1f, 20f, 11f)
                curveTo(20f, 6.6f, 16.4f, 3f, 12f, 3f)
                moveTo(16f, 15.4f)
                verticalLineTo(19f)
                horizontalLineTo(14f)
                verticalLineTo(17f)
                horizontalLineTo(13f)
                verticalLineTo(19f)
                horizontalLineTo(11f)
                verticalLineTo(17f)
                horizontalLineTo(10f)
                verticalLineTo(19f)
                horizontalLineTo(8f)
                verticalLineTo(15.4f)
                curveTo(6.8f, 14.3f, 6f, 12.7f, 6f, 11f)
                curveTo(6f, 7.7f, 8.7f, 5f, 12f, 5f)
                reflectiveCurveTo(18f, 7.7f, 18f, 11f)
                curveTo(18f, 12.8f, 17.2f, 14.3f, 16f, 15.4f)
                close()
            }
        }.build()

        return _SkullScanOutline!!
    }

@Suppress("ObjectPropertyName")
private var _SkullScanOutline: ImageVector? = null
